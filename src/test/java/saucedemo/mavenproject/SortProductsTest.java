package saucedemo.mavenproject;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.InventoryPage;
import base.Hooks;

@Listeners(resources.Listeners.class)

public class SortProductsTest extends Hooks {

	public SortProductsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void sortProducts() throws IOException, InterruptedException {
		LoginTest login = new LoginTest();

		login.login();

		InventoryPage inventoryPage = new InventoryPage();

		inventoryPage.getProductSorting().click();

		
		WebElement activeSorting = inventoryPage.driver.findElement(By.cssSelector("span.active_option"));
		String textSorting = activeSorting.getText();
		System.out.println("text Sorting: " + textSorting);
		Assert.assertEquals("Price (high to low)", textSorting);

		Thread.sleep(3000);

	}

}
