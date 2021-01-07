includeBuild("build-ui-tests")
include(":app")

sourceControl {
  gitRepository(file("./repo-ui-tests").toURI()) {
    producesModule("repro.sample.internal:ui-tests")
    plugins {
      // this is gotten from the included build "build-ui-tests"  and is needed to
      // define build logic for a dependency that isnt normally built with gradle
      id("repro-ui-tests")
    }
  }
}

