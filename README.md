# Credible Selenium tests by dsobko

This project contains BDD scenario to test basic flow of credible.com site

## Getting Started

Project is built on next technologies and frameworks:

* Kotlin (You can also retrieve Java version reverting commit bb45de1)
* Spring Boot - DI framework
* Gradle - Dependency Management
* Selenide - Selenium library extension
* Cucumber - BDD framework
* Feat-assert - Assertions framework

## Prerequisites

1. To successfully run project you need Java 8 installed on your machine.
2. Chrome driver also should be installed on machine. Can be get from: [Chrome driver Download page](https://sites.google.com/a/chromium.org/chromedriver/downloads)

3. Before running test you should change *application.yml* file (credible.test\src\test\resources\application.yml) and change *chromedriver.path* property with valid path from step 2
4. Also you can change Credible host, and some other test properties in application.yml file

## Running tests

To run test please execute next command from project root directory (e.g. credible.test)

on Linux env:

```
./gradlew clean test
```

on Windows env:

```
gradlew clean test
```

This will run all features files available

## Test report

Report is generated automatically and you can find it after successfully run in

```
credible.test/build/cucumber-report/feature-overview.html
```

## Authors

**Dmitriy Sobko**