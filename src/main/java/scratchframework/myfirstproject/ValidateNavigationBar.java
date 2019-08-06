package scratchframework.myfirstproject;

import java.io.IOException;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Resources.Base;

import pageObjects.LandingPage;

public class ValidateNavigationBar extends Base {
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	
	
	public void Initialize() throws IOException
	
	{
		driver= InitializeDriver();
		log.info("driver is initialised");
		driver.get(prop.getProperty("url"));
		log.info("navigated to home page");
		
		
	}
	
	@Test 
	
	public void basePageNavigation() throws IOException
	{
	
	
	LandingPage l=new LandingPage(driver);
	Assert.assertTrue(l.getNavigationBar().isDisplayed());
	log.info("successfully validated");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver=null;
	}
}

