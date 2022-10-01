import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementation(dependency: String) {
    add("implementation", dependency)
}

fun DependencyHandler.testImplementation(dependency: String) {
    add("testImplementation", dependency)
}

fun DependencyHandler.androidTestImplementation(dependency: String) {
    add("androidTestImplementation", dependency)
}

fun DependencyHandler.annotationProcessor(dependency: String) {
    add("annotationProcessor", dependency)
}

fun DependencyHandler.kapt(dependency: String) {
    add("kapt", dependency)
}
fun DependencyHandler.platform(dependency: String) {
    add("platform", dependency)
}
fun DependencyHandler.implementation(dependency: Dependency) {
    add("implementation", dependency)
}