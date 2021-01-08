buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    // import/sync worked previously using AGP 4.1.1, alternate commenting each versions to check
    // classpath("com.android.tools.build:gradle:4.1.1")
    classpath("com.android.tools.build:gradle:4.2.0-beta03")

    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")
    classpath("org.eclipse.jgit:org.eclipse.jgit:5.10.0.202012080955-r")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

tasks.register<Delete>("clean") {
  delete(buildDir)
}