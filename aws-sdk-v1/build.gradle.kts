plugins {
    id("io.micronaut.build.internal.module")
}

dependencies {
    api(platform(libs.boms.aws.java.sdk.v1))
    api(libs.managed.aws.java.sdk.core)

    api(project(":aws-common"))

    runtimeOnly(libs.jcl.over.slf4j)

    testImplementation(mn.micronaut.http.server.netty)
}
