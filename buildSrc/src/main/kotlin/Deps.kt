object Versions {
    const val AGP = "7.4.1"
    const val kotlin = "1.7.21"
    const val androidCore = "1.7.0"
    const val appCompat = "1.6.1"
    const val material = "1.8.0"
    const val constraint = "2.1.4"
    const val junit = "4.13.2"
    const val extJunit = "1.1.5"
    const val espresso = "3.5.1"
    const val fragment = "1.5.5"
    const val hilt = "2.44.2"
    const val navigation = "2.5.2"
    const val room = "2.5.0"
    const val lifecycle = "2.5.1"
    const val coroutines = "1.6.4"
    const val viewBindingDelegate = "1.5.8"
}

object Deps {
    object UI {
        const val androidCore = "androidx.core:core-ktx:${Versions.androidCore}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
        const val junit = "junit:junit:${Versions.junit}"
        const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    }

    object Room {
        const val room = "androidx.room:room-ktx:${Versions.room}"
        const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
    }

    object NavComponent {
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object DaggerHilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val compiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object Coroutines {
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object Lifecycle {
        const val lifecycle = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    }

    object ViewBindingDelegate {
        const val viewBindingDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.viewBindingDelegate}"
    }
}


    object Plugin {
        object AGP {
            const val application = "com.android.application"
            const val library = "com.android.library"
        }

        object Kotlin {
            const val android = "org.jetbrains.kotlin.android"
            const val kapt = "kotlin-kapt"
            const val jvm = "org.jetbrains.kotlin.jvm"
        }

        object DaggerHilt {
            const val hilt = "com.google.dagger.hilt.android"
        }

        object Java {
            const val library = "java-library"
        }
    }