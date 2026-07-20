# ShopCheckQA — E-Commerce Test Automation Framework

ShopCheckQA is a Java-based QA automation framework designed to test critical workflows in an e-commerce application. It uses Selenium WebDriver, TestNG, Maven, and the Page Object Model to create reusable, maintainable, and readable automated tests.

The project focuses on practical QA engineering concepts such as test organization, browser setup, reusable page objects, assertions, regression testing, and failure investigation.

## Features

- Automated browser testing with Selenium WebDriver
- Test execution and assertions with TestNG
- Page Object Model for reusable page interactions
- Centralized browser setup and teardown
- Maven-based dependency management and test execution
- Test coverage for common e-commerce workflows
- Structure for reusable utilities and test data
- Support for regression and functional testing

## Test Scenarios

The framework is designed to cover workflows such as:

- Opening and navigating the application
- Searching and browsing for products
- Viewing product information
- Adding and removing products from the cart
- Updating cart quantities
- Validating cart totals and displayed information
- Completing or validating checkout workflows
- Handling invalid inputs and negative test cases

## Technology Stack

- **Java** — Test implementation
- **Selenium WebDriver** — Browser automation
- **TestNG** — Test execution, assertions, and configuration
- **Maven** — Dependency management and build automation
- **Page Object Model** — Test architecture
- **Git and GitHub** — Version control

## Project Structure

```text
shopcheck-qa-framework/
├── src/
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── BaseTest.java
│       │   ├── pages/
│       │   │   └── Page object classes
│       │   ├── tests/
│       │   │   └── Automated test classes
│       │   └── utils/
│       │       └── Reusable test utilities
│       └── resources/
│           └── Test configuration and data
├── pom.xml
├── testng.xml
└── README.md
```

## Architecture

ShopCheckQA follows the Page Object Model.

Page classes contain locators and reusable browser interactions, while test classes contain test scenarios and assertions. Shared browser configuration is handled by the base test layer, reducing duplicated setup and teardown logic across the test suite.

This separation makes the framework easier to maintain when application elements or workflows change.

## Prerequisites

Install the following before running the project:

- Java Development Kit 17 or later
- Apache Maven
- Google Chrome
- Git

Verify the installations:

```bash
java --version
mvn --version
git --version
```

## Getting Started

Clone the repository:

```bash
git clone https://github.com/manojravi04/ShopCheck-QA-Framework.git
cd ShopCheck-QA-Framework
```

Install dependencies:

```bash
mvn clean install -DskipTests
```

Run the complete test suite:

```bash
mvn clean test
```

Run tests through the TestNG suite:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

## Running an Individual Test

An individual TestNG test class can be run through an IDE or with Maven:

```bash
mvn -Dtest=TestClassName test
```

Replace `TestClassName` with the name of the test class.

## Test Design Principles

The framework follows several maintainability practices:

- Keep browser interactions inside page object classes
- Keep assertions and test intent inside test classes
- Avoid duplicating locators and setup logic
- Give tests descriptive names based on expected behaviour
- Keep tests independent whenever possible
- Include both positive and negative scenarios
- Use clear assertions that explain why a test failed

## Test Results

After running the Maven test suite, execution results are generated under:

```text
target/surefire-reports/
```

These reports contain test results, failures, and execution details that can be used when investigating failed tests.

## Current Status

ShopCheckQA is under active development. The current focus is establishing the core automation architecture and expanding coverage for essential e-commerce workflows.

## Planned Improvements

- Expand product search, cart, and checkout coverage
- Add screenshots when tests fail
- Add richer HTML test reporting
- Introduce data-driven and parameterized testing
- Add cross-browser execution
- Add API test coverage
- Run the test suite through GitHub Actions
- Add parallel test execution
- Improve configuration for local and CI environments

## Skills Demonstrated

- UI test automation
- Functional and regression testing
- Selenium WebDriver
- TestNG
- Java
- Maven
- Page Object Model
- Test-case design
- Debugging and failure analysis
- Git-based development

## Author

**Manoj Ravichandran**

- [GitHub](https://github.com/manojravi04)
- [LinkedIn](https://www.linkedin.com/in/manoj-ravichandran-8b53b02b2/)
