package scratchframework.myfirstproject;

import java.io.IOException;

import org.testng.Assert;

import pageObjects.LandingPage;
import Resources.Base;

public class Validate extends Base
{
   public void basePageNavigation(String Username,String Password) throws IOException
	
	{
		driver= InitializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FeaturedText");

     }
}
