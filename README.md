# Base Android Project Template

![Pre Merge Checks](https://github.com/pepe-romeros/base-project/workflows/Pre%20Merge%20Checks/badge.svg)  ![License](https://img.shields.io/github/license/pepe-romeros/base-project.svg) ![Language](https://img.shields.io/github/languages/top/pepe-romeros/base-project?color=blue&logo=kotlin)

Android Studio Project template that lets you be up and running in a **few seconds**.

This template is focused on delivering a project with **Android Architecture Components**, several **third-party libraries**, **static analysis** and **continuous integration** already in place.

## How to use
Just click on button to create a new repo starting from this template.

[![Get it here](https://img.shields.io/badge/-Get%20it%20here-brightgreen)](https://github.com/pepe-romeros/base-project/generate)

Once created, clone the repository to your local environment:
- Using a terminal: ```$ git clone https://github.com/{your-user-name}/base-project.git ``` or
- From Android Studio: New Project -> From Version control and provide your repo's URL.

Update your application id in the following places:
- App Coordinates file ([here](buildSrc/src/main/java/Coordinates.kt))
- AndroidManifest file ([here](app/src/main/AndroidManifest.xml))

**Finally, start adding your app's features!**

## Template's Elements
- 100% Kotlin-only template.
- 100% Gradle Kotlin DSL setup.
- Dependency versions managed via `buildSrc`.
- Sample Espresso, Instrumentation & JUnit tests.
- CI Setup with GitHub Actions.
- CD Setup with Fastlane
- Kotlin Static Analysis via `ktlint` and `detekt`.
- Publishing Ready.
- Issues Template (bug report + feature request)
- Pull Request Template.

## Gradle Setup
Dependencies are centralized inside the [Dependencies.kt](buildSrc/src/main/java/Dependencies.kt) file in the `buildSrc` folder. This provides convenient auto-completion when writing your gradle files.

The included dependencies are:
- AndroidX AppCompat
- AndroidX ConstraintLayout
- AndroidX Kotlin Core
- 

## Static Analysis
This template is using [**ktlint**](https://github.com/pinterest/ktlint) with the [ktlint-gradle](https://github.com/jlleitschuh/ktlint-gradle) plugin to format your code. The project is also using, [**detekt**](https://github.com/arturbosch/detekt), which is a static code analyzer aiming to find issues as we implement our app.  It is currently working with the configuration stored in the [detekt.yml](config/detekt/detekt.yml) file.
### To set them up/utilize them:
- Run the `ktlintFormat` gradle task To reformat all the source code as well as the buildscript.
- To analyze the source code using detekt, with the `detektGenerateConfig` task

## CI
This template is using [**GitHub Actions**](https://github.com/pepe-romeros/base-project/actions) as CI. You don't need to setup any external service and you should have a running CI once you start using this template.

There are currently the following workflows available:
- [Validate Gradle Wrapper](.github/workflows/gradle-wrapper-validation.yml) - Will check that the gradle wrapper has a valid checksum
- [Pre Merge Checks](.github/workflows/pre-merge.yaml) - Will run the `build`, `check` and `publishToMavenLocal` tasks. 

## Publishing
The template is configured to use Fastlane to automate the deployment of our App to the Alpha, Beta and Play Store channels.

## Publishing as a Library
The template is setup to be **ready to publish** a library/artifact on a Maven Repository. If you're using JitPack, you don't need any further configuration and you can just configure the repo on JitPack. If you're using another repository (MavenCentral/JCenter/etc.), you need to specify the publishing coordinates.

## Acknowledgements
This template was modified and inspired from Nicola Corti's [blog post](https://ncorti.com/blog/my-android-project-template) template available ([here](https://github.com/cortinico/kotlin-android-template)).
