# Contributing guide

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
