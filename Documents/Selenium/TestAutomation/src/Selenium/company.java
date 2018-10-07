package Selenium;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class company {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
//SetUp
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\psrivastava\\Documents\\Selenium\\TestAutomation\\chromedriver.exe");
//Opening Browser	
		WebDriver driver = new ChromeDriver();
//Maximising the window	
		driver.manage().window().maximize();
//Implicit Wait		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//Opening the URL		
		driver.get("https://m.campusm.org/campusm/");
		
//Select “Student / Staff”
		clickon(driver,driver.findElement(By.xpath("//h2[text() = 'Student / Staff']")),40);
	
//Click on “Accept” button
	clickon(driver,driver.findElement(By.xpath("//button[@class = 'btn btn-success']")),40);

/*Enter the following values for:
	a.	Username	: <Your First Name>
	b.	Password	: <Any value>
*/
	   driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("123");
//Verify “Login” button is displayed and click it
		Boolean b1 = driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).isDisplayed();
		 if(b1 = true)
		 {
			 driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		 }
		 else 
		 {
		 System.out.println("Element is not displayed");
		 }
//Verify error message displayed is “Please try again.”		 
				
       String actual_message = driver.findElement(By.xpath("//div[@class = 'alert alert-error']")).getText();
       String expected = "Please try again.";
       Assert.assertEquals( actual_message, expected);
/*.	Enter the following values for:
       a.	Username	: joshua.c
       b.	Password	: campusm
*/
       driver.manage().deleteAllCookies();
       driver.findElement(By.xpath("//input[@name = 'username']")).clear();
       driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("joshua.c");
       driver.findElement(By.xpath("//input[@name = 'password']")).clear();
       driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("campusm");
//Click on “Login” button
       driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
 //Verify user is logged in    		
    		String title1 = driver.getTitle();
    	       System.out.println(title1);
    	       String title2 = "campusM";
    	       Assert.assertEquals(title1, title2);
//Click on tile, Enrolment -> Your Details -> Personal Details.
    	      
    	     Thread.sleep(10000);
    	       driver.findElement(By.xpath("//a[@aria-label = 'Enrollment']")).click();
    	     Thread.sleep(1000);
    	      driver.switchTo().frame(1);
    	      clickon(driver,driver.findElement(By.xpath("//span[text() = 'Your Details']")),30);
    	       clickon(driver,driver.findElement(By.xpath("//span[text() = 'Personal Details']")),30);
    	    //Get the value from the field: Date of Birth and assign it to a variable.
    	       String Str = driver.findElement(By.xpath("//input[@name='dob']")).getAttribute("value");
    	       System.out.println(Str);
    	     
/* Change the following values:
	a.	Date of Birth: 27/12/1990 
*/    	     
    	    driver.findElement(By.xpath("//input[@name = 'dob']")).sendKeys("27-12-1990");
/*	Add the following values in Parent’s/Guardian’s Name section:
a.	First Name	: Demo
b.	Last Name	: User
*/
    	      driver.findElement(By.xpath("//input[@name = 'pfirstname']")).sendKeys("Demo");
    	      driver.findElement(By.xpath("//input[@name = 'plastname']")).sendKeys("User");
 //Select a Male Gender:   	  
    	      Select gender = new Select(driver.findElement(By.xpath("//select[@placeholder = 'Please select a gender']")));
    	     gender.selectByVisibleText("Male");
  /* Add the following under Contact Information section:
    	    	 a.	Email Address	: demo.user@myemail.com
*/
    	     driver.findElement(By.xpath("//input[@label='Email Address']")).sendKeys("demo.user@myemail.com");
    	      //driver.quit();
    	      driver.switchTo().defaultContent();
 //Close the tile   	      
    	      driver.findElement(By.xpath("//button[@class = 'close']")).click();
 //Click on tile, Enrollment -> Your Details -> Personal Details.  	      
    	     Thread.sleep(10000);
   	       driver.findElement(By.xpath("//a[@aria-label = 'Enrollment']")).click();
    	    Thread.sleep(1000);
    	      driver.switchTo().frame(1);
    	      driver.findElement(By.xpath("//span[text() = 'Your Details']")).click();
   	       Thread.sleep(10000);
    	     driver.findElement(By.xpath("//span[text() = 'Personal Details']")).click();
/* Verify the following values:
a.	Date of Birth (shows updated date of birth)
b.	Parent’s/Guardian’s First Name	: (shows updated first name)
c.	Parent’s/Guardian’s Last Name	: (shows updated last name)
d.	Gender				: (shows updated gender)
e.	Email Address				: (shows updated email address)
   */	      
   	    String dob1 =  driver.findElement(By.xpath("//input[@name = 'dob']")).getAttribute("value");
		String dob2 = "1990-12-27";
		Assert.assertEquals(dob1, dob2);
		
	   String FName1 =  driver.findElement(By.xpath("//input[@name = 'pfirstname']")).getAttribute("value");
	   String FName2 = "Demo";
	   Assert.assertEquals(FName1, FName2);
	   
	   String LName1 = driver.findElement(By.xpath("//input[@name = 'plastname']")).getAttribute("value");
	   String LName2 = "User";
	   Assert.assertEquals(LName1, LName2);
	   
	   String Gender1 = driver.findElement(By.xpath("//select[@placeholder = 'Please select a gender']")).getAttribute("value");
	   String Gender2 = "Male";
	   Assert.assertEquals(Gender1, Gender2);
	   
	   String Email1 = driver.findElement(By.xpath("//input[@label='Email Address']")).getAttribute("value");
	   String Email2 = "demo.user@myemail.com";
	   Assert.assertEquals(Email1, Email2);
	   
	
   	      
   	       Thread.sleep(5000);

/*Update the following fields:
a.	Date of Birth	: <saved value from variable>
b.	First Name	: blank
c.	Last Name	: blank
d.	Gender	: Prefer not to say
e.	Email Address	: blank
*/    
	 String date = UpdateDate("yyyy-MM-dd","dd/MM/yyyy", Str);
	 System.out.println(date);
	 driver.findElement(By.xpath("//input[@name = 'dob']")).sendKeys(date);
	   Thread.sleep(5000);
		update();
	      Thread.sleep(5000);
	      driver.switchTo().defaultContent();
//Close the Tile 	
	      driver.findElement(By.xpath("//button[@class = 'back icon-arrow-left']")).click();
	      driver.findElement(By.xpath("//button[@class = 'back icon-arrow-left']")).click();
	      driver.findElement(By.xpath("//button[@class = 'back icon-arrow-left']")).click();
//Click on Angle down button 
	      driver.findElement(By.xpath("//button[@class = 'icon icon-angle-down']")).click();
//Click on LogOut
	      driver.findElement(By.xpath("//span[text() = 'Log Out']")).click();
//Verify user is logged out	      
     String Title = driver.getTitle();
     String log2 = "campusM";
     Assert.assertEquals(Title, log2);
    	         	       
       }
       
//For date conversion
	 public static String UpdateDate(String inputpattern,String outPattern, String givenDate) throws Exception
	 {
		 SimpleDateFormat inputFormat = new SimpleDateFormat(inputpattern);
		 SimpleDateFormat outputFormat = new SimpleDateFormat(outPattern);
		 
		 Date date = null;
		 String requiredDate = null;
		 
		 date = inputFormat.parse(givenDate);
		 requiredDate = outputFormat.format(date);
		 
		return requiredDate;
	 }

//For Explicit Wait
	 public static void clickon(WebDriver driver,WebElement Locator, int timeout)
		{
			new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(Locator));
			Locator.click();
		}
	 public static void update() throws InterruptedException
	 {
		 WebElement fN = driver.findElement(By.xpath("//input[@name = 'pfirstname']"));
			fN.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			fN.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
		      WebElement LN = driver.findElement(By.xpath("//input[@name = 'plastname']"));
		      LN.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				LN.sendKeys(Keys.BACK_SPACE);
		      Thread.sleep(5000);
		      Select gender1 = new Select(driver.findElement(By.xpath("//select[@placeholder = 'Please select a gender']")));
		      gender1.selectByVisibleText("Perfer not to say");
		      Thread.sleep(5000);
		      WebElement EA = driver.findElement(By.xpath("//input[@label='Email Address']"));
		      EA.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				EA.sendKeys(Keys.BACK_SPACE);
	 }
	
}


