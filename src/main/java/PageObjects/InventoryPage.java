package PageObjects;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;
import org.openqa.selenium.WebElement;

public class InventoryPage extends BasePage{
	
	public WebDriver driver;
	
	By productSorting = By.cssSelector(".product_sort_container > option[value='hilo']");
	By productOnListing = By.cssSelector(".inventory_list  .inventory_item:nth-of-type(1) .inventory_item_name");
	By labelInventoryName = By.cssSelector(".inventory_details_name.large_size");
	By labelInventoryPrice = By.cssSelector(".inventory_details_price");
	
	public InventoryPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getProductSorting() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productSorting);
	}
	
	public WebElement getproductOnListing() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productOnListing);
		
	}
	
	public WebElement getLabelInventoryName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(labelInventoryName);
	}
	
	public WebElement getLabelInventoryPrice() throws IOException {
		this.driver = getDriver();
		return driver.findElement(labelInventoryPrice);
	}
}
