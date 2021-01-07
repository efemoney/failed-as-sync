buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:4.2.0-beta03")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")
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