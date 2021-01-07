plugins {
  `kotlin-dsl-base`
  `java-gradle-plugin`
}

repositories {
  google()
  jcenter()
}

sourceSets.main.get().java.srcDir("src")

gradlePlugin.plugins.create("plugin") {
  id = "repro-ui-tests"
  implementationClass = "ReproUiTestsPlugin"
}
