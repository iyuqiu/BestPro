
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenCentral()
        maven {
            url=uri("https://developer.huawei.com/repo/")
        }
    }

//    dependencies {
//        classpath "com.huawei.agconnect:agcp:1.6.0.300"
//    }
}


plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin) apply false
    alias(libs.plugins.android.library) apply false

}