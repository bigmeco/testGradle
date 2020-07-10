plugins {
    id("base")
}




tasks.create<Copy>("copy") {

    description = "Copies sources to the dest directory"
    group = "Custom"

    from("src")
    into("C:\\Users\\Nikolay\\Desktop")

}
tasks.create<Zip>("zip") {
    description = "Archives sources in a zip file"
    group = "Archive"

    from("src")
    archiveFileName.set("basic-demo-1.0.zip")
}