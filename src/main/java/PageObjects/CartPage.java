package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CartPage extends BasePage {

	public CartPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By checkout = By.id("checkout");

	public WebElement getCheckout() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkout);
	}
}
