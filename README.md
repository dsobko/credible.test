# Credible Selenium tests by dsobko

This project contains BDD scenario to test basic flow of credible.com site

## Getting Started

Project is built on next technologies and frameworks:

* Java
* Spring Boot - DI framework
* Gradle - Dependency Management
* Selenide - Selenium library extension
* Cucumber - BDD framework
* Feat-assert - Assertions framework

## Prerequisites

To successfully run project you need Java 8 installed on your machine.
And also Chrome driver, that can be get from: [Chrome driver Download page](https://sites.google.com/a/chromium.org/chromedriver/downloads)

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

## Test report

Report is generated automatically and you can find it after successfully run in

```
credible.test/build/cucumber-report/feature-overview.html
```

## Authors

**Dmitriy Sobko**