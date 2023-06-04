package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CheckoutStepTwoPage extends BasePage {
	
	public WebDriver driver;

	By btnfinish = By.id("finish");
	By labelItemName = By.cssSelector(".inventory_item_name");
	By labelItemPrice = By.cssSelector(".inventory_item_price");

	public CheckoutStepTwoPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebElement getBtnFinish() throws IOException {
		this.driver = getDriver();
		return driver.findElement(btnfinish);
	}
	
	public WebElement getLabelItemName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(labelItemName);
	}
	
	public WebElement getLabelItemPrice() throws IOException {
		this.driver = getDriver();
		return driver.findElement(labelItemPrice);
	}

}
