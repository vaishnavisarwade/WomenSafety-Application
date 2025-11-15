plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.india.womansafety_2024"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.india.womansafety_2024"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation("com.google.firebase:firebase-database")

    //Google Map
    implementation ("com.google.android.gms:play-services-maps:18.1.0")


    //todo: for device size compatibility
    implementation ("com.intuit.sdp:sdp-android:1.0.6")
    implementation ("com.squareup.retrofit2:retrofit:2.3.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.3.0")

    implementation ("com.karumi:dexter:6.2.2")

    implementation ("com.google.android.gms:play-services-location:21.0.1")
    //Dependencies for Firebase
    implementation ("com.google.firebase:firebase-auth")
   // implementation ("com.google.firebase:firebase-messaging")
    implementation ("com.google.firebase:firebase-messaging:23.4.1")

}

//womensafety2024@gmail.com   -- Women@2024