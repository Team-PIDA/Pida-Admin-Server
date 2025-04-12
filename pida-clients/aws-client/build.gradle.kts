dependencies {
    compileOnly(libs.spring.boot.starter.web)

    implementation(libs.bundles.aws.client)
    implementation(project(":pida-admin:domain"))

    testImplementation(libs.spring.boot.starter.web)

    // AWS
    implementation(libs.aws.sdk.s3)
}
