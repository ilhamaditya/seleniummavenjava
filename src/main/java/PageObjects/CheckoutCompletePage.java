package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CheckoutCompletePage extends BasePage {

	public CheckoutCompletePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By btnBackHome = By.id("back-to-products");

	public WebElement getBtnBackHome() throws IOException {
		this.driver = getDriver();
		return driver.findElement(btnBackHome);
	}

}
