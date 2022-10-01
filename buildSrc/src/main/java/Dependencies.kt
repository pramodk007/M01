import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.JavaVersion

object Config {
    const val minSdkVersion = 23
    const val compileSdkVersion = 33
    const val targetSdkVersion = 33
    const val versionCode = 1
    const val versionName = "1.0"
    val javaVersion = JavaVersion.VERSION_11
    const val buildTools = "30.0.3"
    const val isMultiDexEnabled = true
    const val applicationId = "com.example.movieexpv1"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

fun DependencyHandler.androidX() {
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.fragment:fragment-ktx:1.5.3")
    implementation("androidx.activity:activity-ktx:1.3.1")
    implementation("androidx.preference:preference-ktx:1.2.0")
    implementation("androidx.vectordrawable:vectordrawable:1.1.0")
    implementation("androidx.navigation:navigation-runtime-ktx:2.5.2")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.2")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-process:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-common-java8:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-service:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.work:work-runtime-ktx:2.7.1")
    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
    implementation("androidx.transition:transition-ktx:1.4.1")

}

fun DependencyHandler.coroutines(){
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.0")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.4")
    implementation ("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")
}

fun DependencyHandler.daggerHilt(){
    implementation ("com.google.dagger:hilt-android:2.44")
    kapt ("com.google.dagger:hilt-android-compiler:2.44")
    implementation("androidx.hilt:hilt-work:1.0.0")
    implementation ("androidx.hilt:hilt-navigation-fragment:1.0.0")
}

fun DependencyHandler.glide() {
    implementation("com.github.bumptech.glide:glide:4.13.0")
    kapt("com.github.bumptech.glide:compiler:4.13.0")
    implementation ("jp.wasabeef:glide-transformations:4.3.0")
    // If you want to use the GPU Filters
    implementation ("jp.co.cyberagent.android:gpuimage:2.1.0")
}

fun DependencyHandler.gson() {
    implementation("com.google.code.gson:gson:+")
}

fun DependencyHandler.materialDesign() {
    implementation("com.google.android.material:material:1.5.0")
}

fun DependencyHandler.NavGraph(){
    val nav_version = "2.4.2"
    implementation ("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation ("androidx.navigation:navigation-ui-ktx:$nav_version")
}

fun DependencyHandler.okHttp() {
    implementation("com.squareup.okhttp3:okhttp:+")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")
}
fun DependencyHandler.paging(){
    implementation("androidx.paging:paging-runtime:3.1.0-beta01")
}

fun DependencyHandler.retrofit() {
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation ("com.squareup.retrofit2:adapter-rxjava2:2.9.0")
}

fun DependencyHandler.moshi(){
    implementation ("com.squareup.moshi:moshi:1.13.0")
    implementation ("com.squareup.moshi:moshi-kotlin:1.13.0")
}

fun DependencyHandler.room(){
    implementation("androidx.room:room-runtime:2.4.3")
    kapt("androidx.room:room-compiler:2.4.3")
    implementation("androidx.room:room-rxjava3:2.4.3")
    implementation("androidx.room:room-ktx:2.4.3")
    implementation("androidx.room:room-paging:2.4.3")
    testImplementation("androidx.room:room-testing:2.4.3")
}

fun DependencyHandler.initializer(){
    implementation ("androidx.startup:startup-runtime:1.1.1")
}

fun DependencyHandler.timber(){
    implementation ("com.jakewharton.timber:timber:5.0.1")
}

fun DependencyHandler.logger(){
    implementation ("com.orhanobut:logger:2.2.0")
}

fun DependencyHandler.testUnit (){
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("android.arch.core:core-testing:1.1.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test:runner:1.4.0")
    androidTestImplementation("androidx.test:rules:1.4.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    testImplementation("org.mockito:mockito-core:4.3.1")
    testImplementation("org.mockito:mockito-inline:4.3.1")
    testImplementation("org.mockito:mockito-android:4.3.1")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
}

fun DependencyHandler.googleAccompanist(){
    implementation("com.google.accompanist:accompanist-navigation-animation:0.26.4-beta")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.26.4-beta")
    implementation("com.google.accompanist:accompanist-swiperefresh:0.26.4-beta")
    implementation("com.google.accompanist:accompanist-permissions:0.26.4-beta")
    implementation("com.google.accompanist:accompanist-flowlayout:0.26.4-beta")
    implementation ("com.google.accompanist:accompanist-pager:0.13.0")
    implementation ("com.google.accompanist:accompanist-pager-indicators:0.13.0")
}

fun DependencyHandler.workManager(){
    implementation("androidx.work:work-runtime-ktx:2.8.0-alpha04")
}

fun DependencyHandler.googlePlayService(){
    implementation("com.google.android.gms:play-services-location:20.0.0")
    implementation("com.google.android.gms:play-services-maps:18.1.0")
    implementation("com.google.android.libraries.places:places:2.6.0")
    implementation("com.google.maps.android:maps-compose:2.7.2")
}

fun DependencyHandler.lottie(){
    implementation("com.airbnb.android:lottie-compose:5.2.0")
}

fun DependencyHandler.dataStore(){
    implementation("androidx.datastore:datastore-preferences:1.0.0")
}