package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class InventoryItemPage extends BasePage {
	public InventoryItemPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;
	
	By addToCart = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By shoppingCartIcon = By.cssSelector(".shopping_cart_link");
	
	public WebElement getAddToCart() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addToCart);
	}
	
	public WebElement getShoppingCartIcon() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shoppingCartIcon);
	}
}
