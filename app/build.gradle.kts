plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Sdk.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(Sdk.MIN_SDK_VERSION)
        targetSdkVersion(Sdk.TARGET_SDK_VERSION)

        applicationId = AppCoordinates.APP_ID
        versionCode = AppCoordinates.APP_VERSION_CODE
        versionName = AppCoordinates.APP_VERSION_NAME

        testInstrumentationRunner = InstrumentationRunner.ANDROIDX_RUNNER
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
    }
}

dependencies {
    implementation(kotlin(Versions.KT_STDLIB))

    // AndroidX + Kotlin Extensions + Compat libs
    implementation(SupportLibs.ANDROIDX_APPCOMPAT)
    implementation(SupportLibs.ANDROIDX_CONSTRAINT_LAYOUT)
    implementation(SupportLibs.ANDROIDX_RECYCLER_VIEW)
    implementation(SupportLibs.ANDROIDX_CARD_VIEW)
    implementation(SupportLibs.ANDROIDX_CORE_KTX)
    implementation(SupportLibs.ANDROIDX_VIEWMODEL_LIVEDATA)
    implementation(SupportLibs.ANDROIDX_ROOM_RUNTIME)
    annotationProcessor(SupportLibs.ANDROIDX_ROOM_COMPILER)
    implementation(SupportLibs.ANDROIDX_ROOM_KTX)

    // Kotlin
    implementation(KotlinLibs.KTX_COROUTINES_ANDROID)

    // Image loading
    implementation(HelperLibs.IMAGE_LOADING_GLIDE)
    kapt(HelperLibs.IMAGE_COMPILER_GLIDE)
    kapt(HelperLibs.IMAGE_PLUGIN_GLIDE)

    // Unit testing
    testImplementation(TestingLib.JUNIT)
    testImplementation(TestingLib.ROOM_TESTING)

    // Instrumented testing
    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_RUNNER)
    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_EXT_JUNIT)
    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_RULES)
    androidTestImplementation(AndroidTestingLib.ESPRESSO_CORE)

}