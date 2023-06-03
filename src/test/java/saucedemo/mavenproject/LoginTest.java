package saucedemo.mavenproject;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import PageObjects.LoginPage;
import base.BasePage;
import base.Hooks;

@Listeners(resources.Listeners.class)

public class LoginTest extends Hooks {
	
	public LoginTest() throws IOException {
		super();
	}
	

	@Test
	public void login() throws IOException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "/Users/ilhamaditya/driver_v1/chromedriver");
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.saucedemo.com/");
		LoginPage loginPage = new LoginPage();
		
		loginPage.getUsername().click();
		loginPage.getUsername().sendKeys("standard_user");
		loginPage.getPassword().click();
		loginPage.getPassword().sendKeys("secret_sauce");
		loginPage.getBtnLogin().click();
		
//		String inventoryUrl = driver.getCurrentUrl();
//		AssertJUnit.assertEquals(inventoryUrl, "https://www.saucedemo.com/inventory.html");
		
		Thread.sleep(3000);
		
//		takeSnapShot(driver);

		System.out.println("user has logged in!");
		
		
	}

}
