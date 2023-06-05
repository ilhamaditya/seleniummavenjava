# seleniummavenjava

Selenium Maven Java is a sample project for implementing Selenium with Maven using Java language
This repository serves as a starting point for individuals who want to integrate Selenium with Maven and Java.

Installation Clone the repository using git clone https://github.com/ilhamaditya/seleniummavenjava.git 
Install the latest version of Java Development Kit (JDK) 
Install Maven on your local machine Running the tests

Fork the repository Create a new branch (git checkout -b feature/your_feature) 
Make your changes and commit them (git commit -am "Add your message here") 
Push your changes to the branch (git push origin feature/your_feature) Submit a pull request

# How To Run the Test
1. Navigate to the testng.xml file
2. Right click 
3. Navigate to Run As > TestNG Tests

OR

1. Navigate to the EndToEndTest.jave file
2. Right click 
3. Navigate to Run As > TestNG Suite

# Folder Structure

- src/main/java: contains the main Java source code
	- Base
		- BasePage.java
			- Specifying configuration properties
			- Get the base url=https://www.saucedemo.com/
			- Contains screenshots of methods that can use other classes
				- Contains timestamp format for screenshots
		- Hooks.java
			- The basis for any ongoing automation defines
				- before running will start calling the driver
				- after the test will execute the close driver
		- WebDriverInstance.java
			- The webdriver base as driver will be used by other test classes
	- drivers
		- chromedriver
			- separate executable that Selenium WebDriver uses to control Chrome
	- Page Objects
		- CartPage.java
			- Contains object elements on the Cart page
		- CheckoutCompletePage.java
			- Contains object elements on the Checkout Complete page
		- CheckoutStepOnePage.java
			- Contains object elements on the Checkout Step One page
		- CheckoutStepTwoPage.java
			- Contains object elements on the Checkout Step Two page
		- InventoryItemPage.java
			- Contains object elements on the Inventory Item page
		- InventoryPage.java
			- Contains object elements on the Inventory page
		- LoginPage.java
			- Contains object elements on the Login page
	- resources
		- Listeners.java
			- Contains ITestResult object captures test case that failed
		- config.properties
			- External data, configurable property values that can be used in scripts
- src/test/java: contains the test Java source code specifically for
	- saucedemo.mavenproject
		- BuyProductTest.java
			- Test script feature for Buy Product Flow
		- DetailsProductPriceTest.java
			- Test script feature to assert product name and product price flow
		- EndToEndTest.java
			- Test script feature to from Login - Sorting - Add To Cart - Checkout - Finish Order
		- LoginTest.java
			- Test script feature to Login Flow
		- SortProductsTest.java
			- Test script feature for Sorting Flow
- JRE System Library
	- class libraries Java
- Maven Dependencies
	- dependencies are collectively specified in the pom
- target
	- screenshots
		- generated for snapshots triggered by script dependencies
- pom.xml
	- contains configuration maven to build project dependencies
- README.md
	- plain text information related to the project
- testng.xml
	- contains Test configuration and this XML file can be used to run and organize our test



