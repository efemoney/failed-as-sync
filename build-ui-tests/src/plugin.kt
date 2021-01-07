import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.api.plugins.BasePlugin
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.register

class ReproUiTestsPlugin : Plugin<Settings> {

  override fun apply(settings: Settings) {
    settings.rootProject.name = "ui-tests"
    settings.gradle.rootProject {
      group = "repro.sample.internal"
      version = "SNAPSHOT"

      pluginManager.apply(BasePlugin::class)

      val assetsJar = tasks.register<Jar>("assetsJar") {
        destinationDirectory.set(layout.buildDirectory)
        includeEmptyDirs = false
        isReproducibleFileOrder = true
        isPreserveFileTimestamps = false

        with(copySpec {
          from(layout.projectDirectory)
          include("should-be-included-in-assets.txt")
          into("assets")
        })
      }

      artifacts.add("default", assetsJar)
    }
  }
}