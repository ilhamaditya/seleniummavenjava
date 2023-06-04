package saucedemo.mavenproject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.CheckoutCompletePage;
import PageObjects.CheckoutStepOnePage;
import PageObjects.CheckoutStepTwoPage;
import PageObjects.InventoryItemPage;
import base.Hooks;

@Listeners(resources.Listeners.class)

public class BuyProductTest extends Hooks {

	public BuyProductTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void buyProduct() throws IOException, InterruptedException {
		
		//		DetailsProductPriceTest detailsProduct = new DetailsProductPriceTest();
		//		detailsProduct.detailsProductPrice();
		
		InventoryItemPage inventoryItem = new InventoryItemPage();
		inventoryItem.getAddToCart().click();
		inventoryItem.getShoppingCartIcon().click();
		Thread.sleep(3000);
		CartPage cart = new CartPage();
		cart.getCheckout().click();
		Thread.sleep(3000);
		CheckoutStepOnePage checkoutStepOne = new CheckoutStepOnePage();
		checkoutStepOne.getFirstName().sendKeys("Ilham");
		checkoutStepOne.getLastName().sendKeys("Aditya");
		checkoutStepOne.getZipPostalCode().sendKeys("19557");
		checkoutStepOne.getContinue().click();
		Thread.sleep(3000);
		
		CheckoutStepTwoPage checkoutStepTwo = new CheckoutStepTwoPage();
		String textCheckoutItemName = checkoutStepTwo.getLabelItemName().getText();
		System.out.println("text Inventory Name: " + textCheckoutItemName);
		AssertJUnit.assertEquals("Sauce Labs Fleece Jacket", textCheckoutItemName);
	
		String textCheckoutPrice = checkoutStepTwo.getLabelItemPrice().getText();
		System.out.println("text Inventory Price: " + textCheckoutPrice);
		AssertJUnit.assertEquals("$49.99", textCheckoutPrice);
		takeSnapShot("Your Cart");
		checkoutStepTwo.getBtnFinish().click();
		
		Thread.sleep(3000);
//		CheckoutCompletePage checkoutComplete = new CheckoutCompletePage();
//		checkoutComplete.getBtnBackHome().click();
		
		takeSnapShot("Thank you for your order!");
		
		
		Thread.sleep(3000);
		
	}
}
