
# **Jawwy TV Test Suite**

This is a test suite for Jawwy TV, a streaming service that offers a variety of TV shows, movies, and sports. The test suite is written in Java using the Selenium, TestNG, Maven, WebDriver Manager, and Allure Report frameworks.

## Features

Supports both Arabic and English versions of Jawwy TV.
Tests the different types of packages offered by Jawwy TV, as well as their prices and currencies.


### Getting Started

To get started with the test suite, you will need to install the following:

* Java 8 or later
* Maven
* Selenium
* TestNG
* WebDriver Manager
* Allure Report

Once you have installed the required dependencies, you can clone the test suite repository from GitHub:

_Code snippet:_

`git clone https://github.com/moaidmoatasem/jawwySubscribe.git
`


Then, install the required dependencies:

_Code snippet:_

**`mvn install`**


After getting everything in place ... Finally, Now you are ready to run the test suite:

_Code snippet:_

**`mvn clean test`**


The test suite will run all the tests and generate an Allure report in the target/allure-results directory.

Opening the Allure Report

You can open the Allure report in a web browser by navigating to the target/allure-results directory and opening the index.html file.

#### The following Allure commands are available:

1. `allure serve` - This command will start a local server that will serve the Allure report. The report can be accessed at http://localhost:8080/. 
2. `allure generate` - This command will generate an Allure report from the test results. The report will be generated in the target/allure-results directory.
3. `allure open` - This command will open the Allure report in a web browser. The report will be opened in the default web browser.
4. `allure report` - This command will generate a static HTML report from the Allure report. The report will be generated in the target/allure-report directory.


##### Additional Notes:

* The test suite requires Java 8 or later. 
* The test suite uses the Selenium WebDriver to interact with Jawwy TV. 
* The test suite uses the Allure Report framework to generate reports.

##### Running Evidence:

https://user-images.githubusercontent.com/47253204/236695219-1cce7c59-00df-43dd-b04f-8a92e372c3cb.mp4
![Screenshot 2023-05-07 222931](https://user-images.githubusercontent.com/47253204/236698729-236c494b-21c1-4be5-899f-c9e57d4dad0c.png)

Thank you.
