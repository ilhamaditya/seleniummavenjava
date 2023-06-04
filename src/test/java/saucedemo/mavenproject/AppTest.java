package saucedemo.mavenproject;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.Hooks;

@Listeners(resources.Listeners.class)

public class AppTest extends Hooks
{
	public AppTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
    public void endToEndTesting() throws IOException, InterruptedException
    {
		
		BuyProductTest endToEndTesting = new BuyProductTest();
		endToEndTesting.buyProduct();
        
    }
}
