package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

import java.io.IOException;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	public WebDriver driver;
	
	By username = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");
	
//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public LoginPage() throws IOException {
		super();
	}
	
	public WebElement getUsername() throws IOException {
		this.driver = getDriver();
		return driver.findElement(username);
	}
	
	public WebElement getPassword() throws IOException {
		this.driver = getDriver();
		return driver.findElement(password);
	}
	
	public WebElement getBtnLogin() throws IOException {
		this.driver = getDriver();
		return driver.findElement(btnLogin);
	}
	
}
