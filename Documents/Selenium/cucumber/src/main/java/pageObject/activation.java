package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Testbase;

public class activation extends Testbase{
	
	@FindBy(css = "select[data-hook='actions.select']")
 	public WebElement submit;

	@FindBy(css = "button[data-hook='actions.go']")
 	public WebElement go;

	@FindBy(css = "button[data-hook='actionperform.do']")
 	public WebElement go1;
	
	public activation()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submit() throws InterruptedException
	{
	Thread.sleep(5000);
		Select submit1 = new Select(submit);
		submit1.selectByVisibleText("Activate");
		go.click();
		Thread.sleep(5000);
		go1.click();
	}
	}
