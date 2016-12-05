# Stephen's Half Assed Skeleton App
This application is basically a collection of snippets for me to refer back to at a later date. As far as I know 
it compiles and works as advertised. Use at your own peril

## Inclusions
This project includes
* Angular 2 and webpack compilation of Typescript
* Cucumber tests
* Selenium

## Prerequisites
You will need
* node and npm
* Typings
* Typescript
* JDK 8
* Chrome driver for Selenium (this one uses the one from the Ubuntu repo)

## Compiling
Navigate to the project folder. Run `typings install`, followed by `./gradlew build`.

## Building a Docker image
If you are a member of your machine's `docker` group, you can use gradle to create
a Docker image. Simply navigate to your project folder, and run `./gradlew buildDocker`