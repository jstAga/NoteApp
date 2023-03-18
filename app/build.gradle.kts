plugins {
    id(Plugin.AGP.application)
    id(Plugin.Kotlin.android)
    id(Plugin.Kotlin.kapt)
    id(Plugin.DaggerHilt.hilt)
}

android {
    namespace = "com.example.noteapp"
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.example.noteapp"
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = AndroidConfig.versionCode
        versionName = AndroidConfig.versionName

        testInstrumentationRunner = AndroidConfig.androidTestInstrumentation
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_9
        targetCompatibility = JavaVersion.VERSION_1_9
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding =  true
    }
}

dependencies {

    implementation(Deps.UI.androidCore)
    implementation(Deps.UI.appcompat)
    implementation(Deps.UI.material)
    implementation(Deps.UI.constraint)
    testImplementation(Deps.UI.junit)
    androidTestImplementation(Deps.UI.extJunit)
    androidTestImplementation(Deps.UI.espresso)
    implementation(Deps.UI.fragment)

    //room
    implementation(Deps.Room.room)
    implementation(Deps.Room.roomRuntime)
    kapt(Deps.Room.compiler)

    //nav component
    implementation(Deps.NavComponent.fragment)
    implementation(Deps.NavComponent.ui)

    //hilt
    implementation(Deps.DaggerHilt.hilt)
    kapt(Deps.DaggerHilt.compiler)

    //coroutines
    implementation(Deps.Coroutines.android)

    //lifecycle
    implementation(Deps.Lifecycle.lifecycle)

    //view Binding property delegate (reflection-free flavor)
    implementation(Deps.ViewBindingDelegate.viewBindingDelegate)
}