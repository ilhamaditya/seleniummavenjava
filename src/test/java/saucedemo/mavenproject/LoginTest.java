package saucedemo.mavenproject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.Listeners;
import PageObjects.LoginPage;
import base.Hooks;

@Listeners(resources.Listeners.class)

public class LoginTest extends Hooks {
	
	public LoginTest() throws IOException {
		super();
	}
	

	@Test
	public void login() throws IOException, InterruptedException {
		LoginPage loginPage = new LoginPage();
		
		loginPage.getUsername().click();
		loginPage.getUsername().sendKeys("standard_user");
		loginPage.getPassword().click();
		loginPage.getPassword().sendKeys("secret_sauce");
		loginPage.getBtnLogin().click();
		
		String inventoryUrl = loginPage.driver.getCurrentUrl();
		AssertJUnit.assertEquals(inventoryUrl, "https://www.saucedemo.com/inventory.html");
		
	
		Thread.sleep(3000);

		System.out.println("user has logged in!");
		
		
	}

}
