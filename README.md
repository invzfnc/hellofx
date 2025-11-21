# HelloFX
This repository contains code written following this [tutorial series](https://www.youtube.com/playlist?list=PLZPZq0r_RZOM-8vJA3NQFZB7JroDcMwev).

## File structure
- Ideally, each (numbered) commit represents one video/topic. For example `1. Stages` and `2. Scenes`. 
- Each topic is placed as a module (`com.example.project.module`) like `com.example.hellofx.stages` and `com.example.hellofx.scenes`.

## Setting up JavaFX
1. Download JavaFX SDK from https://openjfx.io/index.html
2. Within IntelliJ: File > Project Structure > Libraries > + > Java > Locate `java-sdk\lib` > OK > Apply
3. Setup run task: Run > Edit Configurations > Application, set App.java (or whatever name) as entry point

## Issues and solutions
These are issues I faced when setting up JavaFX and IntelliJ. I'll include the solutions here for future reference.

### Maven Error
```
Maven Error: Maven Project Configuration for Module isn't available`
```
Locate `pom.xml`, right click, "Add as Maven Project".

### -source 8
```
java: modules are not supported in -source 8`
```
Problems tab on the left > right click on error > show quick fix > apply change

### Class file has wrong version
```
java: cannot access javafx.application.Application
  bad class file: /javafx-sdk-25.0.1/lib/javafx.graphics.jar!/javafx/application/Application.class
    class file has wrong version 67.0, should be 65.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
```
Update JDK to latest version. Setup IntelliJ to use latest JDK.

### JavaFX runtime components are missing
```
Error: JavaFX runtime components are missing
```
Separate `main` and `start` declarations into separate classes. [source](https://old.reddit.com/r/JavaFX/wiki/common-problems#wiki_how_do_i_fix_.27error.3A_javafx_runtime_components_are_missing.27.3F)

Additionally, edit Run/Debug Configurations and set `App.java` as entry point for easier testing process.