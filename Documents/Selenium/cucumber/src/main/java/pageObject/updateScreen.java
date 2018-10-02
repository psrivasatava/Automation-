package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Testbase;

public class updateScreen extends Testbase{
	
	@FindBy(css = "button[data-hook='progressionsteps.item.button']")
 	public WebElement update;

	@FindBy(css = "select[data-hook='.paymentDay']")
 	public WebElement paymentDate;
	
	@FindBy(css = "input[data-hook='.accountName']")
 	public WebElement accountHolderName;
	
	@FindBy(css = "input[data-hook='.bankName']")
 	public WebElement bankName;
	
	@FindBy(css = "input[data-hook='.accountNumber']")
 	public WebElement accountNumber;

	@FindBy(css = "input[data-hook='.bankSortCode']")
 	public WebElement bankSortCode;

	@FindBy(css = "input[data-hook='.zipPostal']")
 	public WebElement zipPostal;

	@FindBy(css = "input[data-hook='.streetNumber']")
 	public WebElement streetNumber;
	
	@FindBy(css = "input[data-hook='.streetName']")
 	public WebElement streetName;
	
	@FindBy(css = "input[data-hook='.city']")
 	public WebElement city;
	
	@FindBy(css = "input[data-hook='.county']")
 	public WebElement county;
	
	@FindBy(css = "input[data-hook='.timeAtBankYears']")
 	public WebElement timeAtBankYears;
	
	@FindBy(css = "input[data-hook='.timeAtBankMonths']")
 	public WebElement timeAtBankMonths;
 
	@FindBy(css = "input[data-hook='.registrationDate']")
 	public WebElement registrationDate;
 
	@FindBy(css = "input[data-hook='.registrationNumber']")
 	public WebElement registrationNumber;
 	
 	@FindBy(css = "input[data-hook='.odometer']")
 	public WebElement odometer;

 	@FindBy(css = "input[data-hook='.vin']")
 	public WebElement vin;
 	
 	@FindBy(css = "input[data-hook='.orderNumber']")
 	public WebElement orderNumber;
 	
 	@FindBy(css = "input[data-hook='.serialNumber']")
 	public WebElement serialNumber;
 	
 	
 	@FindBy(css = "button[data-hook='proposalupdate.save']")
 	public WebElement Save;
 	
	@FindBy(css = "a[data-hook='proposal.nav.summary']")
 	public WebElement SummaryPage;
 	
 	public updateScreen()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void update1()
	{
		update.click();
	}
	
	public void paymentdate1()
	{
		Select paymentDate1 = new Select(paymentDate);
		paymentDate1.selectByIndex(2);
	}

	public void accountHolderName(String accountName11)
	{
		accountHolderName.sendKeys(accountName11);
	}
    
	public void bankName(String bankName1)
	{
		bankName.sendKeys(bankName1);
	}

	public void accountNumber(String accountNumber1)
	{
		accountNumber.sendKeys(accountNumber1);
	}
  

	public void bankSortCode(String bankSortCode1)
	{
		bankSortCode.sendKeys(bankSortCode1);
	}
	
	public void zipPostal(String zipPostal1)
	{
		zipPostal.sendKeys(zipPostal1);
	}


	public void streetNumber(String streetNumber1)
	{
		streetNumber.sendKeys(streetNumber1);
	}
	

	public void streetName(String streetName1)
	{
		streetName.sendKeys(streetName1);
	}
	
	public void city(String city1)
	{
		city.sendKeys(city1);
	}
	
	public void county(String county1)
	{
		county.sendKeys(county1);
	}
	
	public void timeAtBankYears(String timeAtBankYears1)
	{
		timeAtBankYears.sendKeys(timeAtBankYears1);
	}
	public void timeAtBankMonths(String timeAtBankMonths1)
	{
		timeAtBankMonths.sendKeys(timeAtBankMonths1);
	}
	
	public void registrationDate(String registrationDate1)
	{
		registrationDate.sendKeys(registrationDate1);
	}
	

	public void registrationNumber(String registrationNumber1)
	{
		registrationNumber.sendKeys(registrationNumber1);
	}
	public void odometer(String odometer1)
	{
		odometer.sendKeys(odometer1);
	}
	
	public void vin(String vin1)
	{
		vin.sendKeys(vin1);
	}
	public void orderNumber(String orderNumber1)
	{
		orderNumber.sendKeys(orderNumber1);
	}
	
	public void serialNumber(String serialNumber1)
	{
		serialNumber.sendKeys(serialNumber1);
	}
	public void Save()
	
	{
		Save.click();
	}

public void SummaryPage()
	
	{
	SummaryPage.click();
	}
}
