includeBuild("build-ui-tests")
include(":app")

sourceControl {
  gitRepository(file("./repo-ui-tests").toURI()) {
    producesModule("repro.sample.internal:ui-tests")
    plugins {
      // this plugin is defined in the included build "build-ui-tests" and contains logic to
      // define a build for the git repository, which doesn't contain build logic itself.
      id("repro-ui-tests")
    }
  }
}

