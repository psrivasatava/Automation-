package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Testbase;

public class createQuote extends Testbase {
	
	@FindBy(css = "button[data-hook='progressionsteps.item.button']")
 	public WebElement quote;

	@FindBy(css = "button[data-hook='quoting.asset.chooseanasset']")
 	public WebElement newquote;
	
	@FindBy(css = "a[data-hook='assetselection.selectViaDropdowns']")
 	public WebElement assetselection;
	
	
	@FindBy(css = "select[data-hook='assetselection.newform.make']")
 	public WebElement manufacturer;
	
	@FindBy(css = "select[data-hook='assetselection.newform.model']")
 	public WebElement model;
	
	@FindBy(css = "select[data-hook='assetselection.newform.variant']")
 	public WebElement variant;
	
	@FindBy(css = "button[data-hook='assetselection.newform.usethisasset']")
 	public WebElement button1;
	
	@FindBy(css = "button[data-hook='quoting.finance.product-select']")
 	public WebElement finance;
	
	@FindBy(css = "input[data-hook='search-results.search']")
 	public WebElement search;
	
	@FindBy(css = "button[data-hook='product-selection.use']")
 	public WebElement productSelect;
	
	@FindBy(css = "button[data-hook='save']")
 	public WebElement save;
	

	public createQuote()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void quote1()
	{
		quote.click();
	}
	
	public void newquote1()
	{
		newquote.click();
	}
	
	public void assetselection1()
	{
		assetselection.click();
	}
	
	public void manufacture1r()

	{
		Select manufacturer1 = new Select(manufacturer);
		manufacturer1.selectByVisibleText("AUDI");
	}
	
	public void model1()

	{
		Select model1 = new Select(model);
		model1.selectByVisibleText("A1 DIESEL HATCHBACK");
	}
	
	public void variant1()

	{
		Select variant1 = new Select(variant);
		variant1.selectByVisibleText("1.6 TDI SE 3dr (2015-)");
	}
	
	public void button2()
	{
		button1.click();
	}
	
	public void finance1()
	{
		finance.click();
	}
	
	public void search1()

	{
		List<WebElement> list = driver.findElements(By.xpath("//a[@data-hook='search-results.anchor']//div/descendant::h3[@class='ng-binding']"));
		//System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Gold Lease purchase"))
			{
				list.get(i).click();
				break;
			}
		}
		search.click();
	}
	
	public void productSelect()
	{
		productSelect.click();
	}
	
	public void save1()
	{
		save.click();
	}
	
}
