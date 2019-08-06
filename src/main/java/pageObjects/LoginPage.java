package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By emailId=By.cssSelector("a[id='user_email']");
	By Password=By.cssSelector("input[type='password']");
	By Login=By.cssSelector("");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(emailId);
	}

	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement LoginLink()
	{
		return driver.findElement(Login);
	}
}
