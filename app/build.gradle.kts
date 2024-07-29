plugins {
//    id("com.android.application")
    alias(libs.plugins.android.application)
//    id("org.jetbrains.kotlin.android")
    alias(libs.plugins.jetbrains.kotlin)
//    id("com.huawei.agconnect")

}

android {
    namespace = "com.example.bestpro"
    compileSdk = Integer.parseInt(libs.versions.compileSdk.get())

    defaultConfig {
        applicationId = libs.versions.applicationId.get()
        minSdk = Integer.parseInt(libs.versions.minSdk.get())
        targetSdk = Integer.parseInt(libs.versions.targetSdk.get())
        versionCode = Integer.parseInt(libs.versions.versionCode.get())
        versionName = libs.versions.versionName.get()
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.bundles.appcompatBundles)
    implementation(libs.bundles.widgetBundles)
    implementation(project(mapOf("path" to ":base")))
    implementation("com.huawei.agconnect:agconnect-core:1.7.3.302")
    implementation("com.huawei.hms:push:6.11.0.300")
    implementation("com.huawei.hms:hmscoreinstaller:6.7.0.300")

}