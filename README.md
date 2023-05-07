Jawwy TV Test Suite
This is a test suite for Jawwy TV, a streaming service that offers a variety of TV shows, movies, and sports. The test suite is written in Java using the Selenium, TestNG, Maven, WebDriver Manager, and Allure Report frameworks.

Features

Supports both Arabic and English versions of Jawwy TV.
Tests the different types of packages offered by Jawwy TV, as well as their prices and currencies.
Getting Started

To get started with the test suite, you will need to install the following:

Java 8 or later
Maven
Selenium
TestNG
WebDriver Manager
Allure Report
Once you have installed the required dependencies, you can clone the test suite repository from GitHub:

Code snippet
git clone https://github.com/moaidmoatasem/jawwySubscribe.git
Use code with caution. Learn more
Then, install the required dependencies:

Code snippet
mvn install
Use code with caution. Learn more
Finally, run the test suite:

Code snippet
mvn clean test
Use code with caution. Learn more
The test suite will run all of the tests and generate an Allure report in the target/allure-results directory.

Opening the Allure Report

You can open the Allure report in a web browser by navigating to the target/allure-results directory and opening the index.html file.

Allure Commands

The following Allure commands are available:

allure serve - This command will start a local server that will serve the Allure report. The report can be accessed at http://localhost:8080/.
allure generate - This command will generate an Allure report from the test results. The report will be generated in the target/allure-results directory.
allure open - This command will open the Allure report in a web browser. The report will be opened in the default web browser.
allure report - This command will generate a static HTML report from the Allure report. The report will be generated in the target/allure-report directory.
allure help - This command will display a list of all available Allure commands.
Additional Notes

The test suite requires Java 8 or later.
The test suite uses the Selenium WebDriver to interact with Jawwy TV.
The test suite uses the Allure Report framework to generate reports.
Contributing

If you would like to contribute to the test suite, please feel free to fork the repository and submit a pull request.

Thank you for using the Jawwy TV Test Suite!
