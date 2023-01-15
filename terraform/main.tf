terraform {
  cloud {
    organization = "lpStoyanov1"

    workspaces {
      name = "example-workspace"
    }
  }
}