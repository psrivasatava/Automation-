package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testbase {
	public static 	WebDriver driver;
	//public static ChromeDriver driver;
	 
	public static Properties prop;
	
	public Testbase()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\psrivastava\\Documents\\Selenium\\cucumber\\src\\main\\java\\config");
			prop.load(fis);
		}
		catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initialization()
	{
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\psrivastava\\Documents\\Selenium\\TestAutomation\\chromedriver.exe");
			// driver = new ChromeDriver();
	      driver = new ChromeDriver();
			 driver.get("http://mkvsrvc2pos01:8080/WebApp/fmoportal/index.html#/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS) ;
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS) ;
			
	}
	
	 public static void clickon(WebDriver driver,WebElement Locator, int timeout)
		{
			new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(Locator));
			Locator.click();
		}
}