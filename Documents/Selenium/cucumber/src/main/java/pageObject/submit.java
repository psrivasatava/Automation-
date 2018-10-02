package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Testbase;

public class submit extends Testbase{
	
	@FindBy(css = "select[data-hook='actions.select']")
 	public WebElement submit;

	@FindBy(css = "button[data-hook='actions.go']")
 	public WebElement go;

	@FindBy(css = "button[data-hook='actionperform.do']")
 	public WebElement go1;
	
	@FindBy(css = "select[data-hook='actions.select']")
 	public WebElement submit1;
	
	@FindBy(css = "button[data-hook='actions.go']")
 	public WebElement go2;
	
	@FindBy(css = "button[data-hook='actionperform.do']")
 	public WebElement go3;
	
	public submit()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submit1()
	{
		Select submit1 = new Select(submit);
		submit1.selectByVisibleText("Submit");
		go.click();
		go1.click();
	}
	
	public void submit2() throws InterruptedException
	{
		WebElement ActualText = driver.findElement(By.cssSelector("dd[data-hook='proposal.status']"));
		String Refer = ActualText.getText();	
		//System.out.println("Refer");
		if(Refer.equalsIgnoreCase("Proposal Referral"))
		{
			Select submit2 = new Select(submit1);
			submit2.selectByVisibleText("Accept");
			go2.click();
			Thread.sleep(10000);
			go3.click();
		}
	        else
		{
			System.out.println("Proposal already accepted");
		}
		
		
	}
	
	
}
