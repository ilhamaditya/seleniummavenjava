package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CheckoutStepOnePage extends BasePage {

	public CheckoutStepOnePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By zipPostalCode = By.id("postal-code");
	By btnContinue = By.id("continue");

	public WebElement getFirstName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(firstName);
	}

	public WebElement getLastName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(lastName);
	}
	
	public WebElement getZipPostalCode() throws IOException {
		this.driver = getDriver();
		return driver.findElement(zipPostalCode);
	}
	
	public WebElement getContinue() throws IOException {
		this.driver = getDriver();
		return driver.findElement(btnContinue);
	}

}
