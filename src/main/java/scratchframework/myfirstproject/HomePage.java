package scratchframework.myfirstproject;
import  java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;


public class HomePage extends Base{
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password) throws IOException
	
	{
		driver= InitializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys("Password");
	    lp.LoginLink().click();
		
		
		
	}
	@DataProvider
	public Object[][] getData()
	{
		//row stand sfor how many different data types should run
		//column stands for how many vales per each tets
		Object[][] data=new Object[1][2];
		data[0][0]="";
		data[0][1]="";
		data[0][2]="";
		
		
	    data[1][0]="";
	    data[1][1]="";
	    data[1][2]="";
		
		return data;
	}
	

}
