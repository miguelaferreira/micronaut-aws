plugins {
    id("io.micronaut.build.internal.module")
}

dependencies {
    api(project(":aws-sdk-v1"))
    implementation("com.amazonaws:aws-java-sdk-lambda")
    implementation(libs.projectreactor)
    api(mn.micronaut.function.client)

    testAnnotationProcessor(mn.micronaut.inject.java)
    testImplementation(mn.micronaut.inject.java)
    testImplementation(mn.micronaut.http.server.netty)
    testImplementation(mn.micronaut.function.web)
    testImplementation(mn.micronaut.function.groovy)
    testImplementation(mn.micronaut.runtime.groovy)
}
