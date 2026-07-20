# ShopCheckQA — E-Commerce Test Automation Framework

ShopCheckQA is a Java-based QA automation framework designed to test critical
workflows in an e-commerce application. It uses Selenium WebDriver, TestNG,
Maven, and the Page Object Model to create reusable, maintainable, and
readable automated tests.

The project focuses on practical QA engineering concepts such as test
organization, browser setup, reusable page objects, assertions, regression
testing, and failure investigation.

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
