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

public class DetailsProductPriceTest extends Hooks{

	public DetailsProductPriceTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void detailsProductPrice() throws IOException, InterruptedException {
		SortProductsTest sortProduct = new SortProductsTest();
		sortProduct.sortProducts();
		
		InventoryPage inventoryPage = new InventoryPage();
		inventoryPage.getproductOnListing().click();
		
		String textInventoryName = inventoryPage.getLabelInventoryName().getText();
		System.out.println("text Inventory Name: " + textInventoryName);
		Assert.assertEquals("Sauce Labs Fleece Jacket", textInventoryName);
		
		String textInventoryPrice = inventoryPage.getLabelInventoryPrice().getText();
		System.out.println("text Inventory Price: " + textInventoryPrice);
		Assert.assertEquals("$49.99", textInventoryPrice);
		
		Thread.sleep(3000);
		
		
		
	}

}
