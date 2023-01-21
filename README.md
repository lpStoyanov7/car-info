# Car-info

This is a simple java application meant to illustrate the CI/CD pipeline.

The initial idea is to have a car catalog which can show you as much information
about a particular car as it can. Name of manufacturer, different engine
options, different models and so on.

The first phase of the application is really simple. We only have the
possibility to show the available engines. Url here:

Currently we have new features being developed. We can now select to display
more info about particular engine (for the purpose of the demo we are not really
showing more information but rather we show that this version supports the new
functionality to show info only for one engine by id).

[Dev url](http://a437dc73cfbc942a08cda5681087b4d1-1703980411.eu-west-1.elb.amazonaws.com/api/v1/engines/2)

## Prerequisites

The application requires existing infrastructure in AWS with Kubernetes already
installed on it (
EKS). It also uses Docker Hub as a container registry for the docker images. It
also supports sending notifications about the status of the job in MS Teams. To
set up the project you need the following secrets:

- `AWS_ACCESS_KEY_ID`
- `AWS_SECRET_ACCESS_KEY`
- `DOCKER_NAMESPACE`
- `DOCKER_PASSWORD`
- `DOCKER_REPOSITORY`
- `DOCKER_USERNAME`
- `MSTEAMS_WEBHOOK`

The secrets' keys are quite self explanatory. It is also required that you have
the following namespaces in kubernetes:

- `dev`
- `prd`

You must also have at least 2 nodes on that cluster. One node is only for the
production part of the application and the other one can have the dev and
staging environment. Both nodes should have different labels. Use the following:

- environment=dev (for dev and staging)
- environment=prd (for prd)

## Branching strategy

In this example we are using the feature based flow. We have 3 environments on 3
different protected branches:

- development (dev) - `develop`
- staging (qas) - `staging`
- production (prd) - `main`

Push to the branch is only allowed after successful pull request with at least 1
approval. Only the owner of the repository has rights to override those rules
and push directly to those branches if it is needed.

`staging` and `main` usually have the production version of the application.

A new feature is always started from the `develop` branch and it usually is the
latest but not the most stable version.

When the new version of the application is ready the `develop` is merged
into `staging` branch.

When the `staging` is properly tested we can proceed with actual release
or `staging` merged in `main`.

Bugs on the current version are tested and fixed on `staging`. When properly
tested again `staging`
is merged in `main`. After that `staging` is also merged into `develop`.

## CI/CD pipeline

When a push against one of the 3 main branches (*check Branching strategy*) is
made it triggers the main workflow. We can separate the different jobs in 5
logical categories (not really in sequential order):

- Test phase
- Building phase
- Preparation to deploy
- Deploy
- Notification to MS Teams channel

When a pull request is created only the test phase is executed.

### Test phase

We have the following verifications in the test phase:

- Checking code style (check if the rules descibed in `.editorconfig` are
  followed)
- Check mark down files
- Check if there are new sql files. If so then a new job checks if the database
  changes can be successfully applied.
- Running unit tests and display result directly in Git (using Test Report
  action)
- SonnarCloud integration
- Snyk integration
- Scan docker image for vulnerabilities

### Building phase

The building phase is logically separated from the test phase however it runs in
parallel with them. This usually may not be very cost-effective because the
building phase will always be running even if some tests are failing. On the
other hand it is much faster for successful builds because the building doesn't
need to wait for all the tests to pass.

### Deploy preparation

This job consists of 2 steps:

- Building docker image and push it to the docker registry
- Deploy preparation - preparing specific variables for the deployment (which
  node to choose, how many replicas, which docker image).

### Deployment

It is the actual deploy to Amazon EKS.

### Notification

This job runs always. It sends notification about which jobs are successful and
which not. As overall status it checks if there is a failed job. This status is
chosen based on the particular workflow where we can have successful status when
some jobs are skipped (by design).
