object Sdk {
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 29
    const val COMPILE_SDK_VERSION = 29
}

object Versions {
    const val ANDROIDX_TEST_EXT = "1.1.1"
    const val ANDROIDX_TEST = "1.2.0"
    const val APPCOMPAT = "1.1.0"
    const val CONSTRAINT_LAYOUT = "1.1.3"
    const val RECYCLER_VIEW = "1.1.0"
    const val CARD_VIEW = "1.0.0"
    const val CORE_KTX = "1.2.0"
    const val COROUTINES = "1.3.5"
    const val VIEWMODEL_LIVEDATA = "2.2.0"
    const val ROOM = "2.2.5"
    const val ESPRESSO_CORE = "3.2.0"
    const val JUNIT = "4.13"
    const val KTLINT = "0.37.2"
    const val KT_STDLIB = "stdlib-jdk7"
    const val GLIDE = "4.11.0"
}

object BuildPluginsVersion {
    const val AGP = "4.0.0"
    const val DETEKT = "1.9.1"
    const val KOTLIN = "1.3.72"
    const val KTLINT = "9.2.1"
    const val VERSIONS_PLUGIN = "0.28.0"
}

object SupportLibs {
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "com.android.support.constraint:constraint-layout:${Versions.CONSTRAINT_LAYOUT}"
    const val ANDROIDX_RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLER_VIEW}"
    const val ANDROIDX_CARD_VIEW = "androidx.cardview:cardview:${Versions.CARD_VIEW}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val ANDROIDX_VIEWMODEL_LIVEDATA = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.VIEWMODEL_LIVEDATA}"
    const val ANDROIDX_ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ANDROIDX_ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ANDROIDX_ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
}

object HelperLibs {
    const val IMAGE_LOADING_GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
    const val IMAGE_COMPILER_GLIDE = "com.github.bumptech.glide:compiler:${Versions.GLIDE}"
    const val IMAGE_PLUGIN_GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
}

object KotlinLibs {
    const val KTX_COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
}

object TestingLib {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val ROOM_TESTING = "androidx.room:room-testing:${Versions.ROOM}"
}

object InstrumentationRunner {
    const val ANDROIDX_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
}

object AndroidTestingLib {
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}
