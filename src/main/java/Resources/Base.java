package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver InitializeDriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\SaiKrishnaBikan\\eclipse-workspace\\myfirstproject\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
	    String browserName=	prop.getProperty("browser");
		if(browserName.equals("chrome"))
		   {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiKrishnaBikan\\Desktop\\seleniumsoftwrae\\chromedriver.exe");
			 driver=new ChromeDriver();
		   }
		else if(browserName.equals("firefox"))
		   {
			
		   }
		else if(browserName.equals("Ie"))
			{
			
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
public void getScreenshot(String result) throws IOException
{
 File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyfile(src,new File("C://test//"+result+"screenshot.png"));
  
}
private Object newfile(String string) {
	// TODO Auto-generated method stub
	return null;
}

}
