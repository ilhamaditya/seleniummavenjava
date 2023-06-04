package saucedemo.mavenproject;

import org.testng.annotations.Test;

import PageObjects.LoginPage;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.Hooks;

@Listeners(resources.Listeners.class)

public class EndToEndTest extends Hooks
{
	public EndToEndTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
    public void endToEndTesting() throws IOException, InterruptedException
    {
		
		
		LoginTest login = new LoginTest();
		login.login();
		
		SortProductsTest sortProduct = new SortProductsTest();
		sortProduct.sortProducts();		
		
		DetailsProductPriceTest detailsProduct = new DetailsProductPriceTest();
		detailsProduct.detailsProductPrice();
		
		BuyProductTest buyProduct = new BuyProductTest();
		buyProduct.buyProduct();
        
    }
}
