package pageObject;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Testbase;

public class customerCapture extends Testbase{


	
	 
	@FindBy(css = "a[data-hook='dashboard.newproposal']")
 	public WebElement newProposal;
 
	@FindBy(css = "button[data-hook='dpaaccept']")
 	public WebElement dpaAgreement;
 
	@FindBy(css = "select[data-hook='proposal.summary.creation.customertype']")
 	public WebElement customerType ;
	
	
	@FindBy(css = "button[data-hook='proposal.summary.creation.create']")
 	public WebElement button ;
	
	@FindBy(css = "select[data-hook='.title']")
	public WebElement title ;
	
	@FindBy(css = "input[data-hook='.firstName']")
	 public WebElement firstName ;
	
	@FindBy(css = "input[data-hook='.lastName']")
	public WebElement lastName ;
	
	@FindBy(css = "input[data-hook='.dateOfBirth']")
	public WebElement dateOfBirth ;
	
	@FindBy(css = "select[data-hook='.gender']")
	public WebElement gender ;
	
	@FindBy(css = "select[data-hook='.maritalStatus']")
	public WebElement maritalStatus ;
	
	@FindBy(css = "select[data-hook='.residentialStatus']")
	 public WebElement residentialStatus ;
	
	@FindBy(css = "input[data-hook='.email']")
	public WebElement email ;
	
	@FindBy(css = "select[name='contactDetails.phones[0].type']")
	 public WebElement phonestype0 ;
	
	@FindBy(css = "input[name='contactDetails.phones[0].number']")
	 public WebElement phones0 ;
	
	@FindBy(css = "select[name='contactDetails.phones[1].type']")
	 public WebElement phonestype1 ;
	
	@FindBy(css = "input[name='contactDetails.phones[1].number']")
	 public WebElement phones1 ;
	
	@FindBy(css = "select[name='contactConsentDetails.consentQuestions.questions[0].customerConsentAnswer']")
	public WebElement contest1 ;
	
	@FindBy(css = "select[name='contactConsentDetails.consentQuestions.questions[1].customerConsentAnswer']")
	public WebElement contest2 ;
	
	@FindBy(css = "select[name='contactConsentDetails.consentQuestions.questions[2].customerConsentAnswer']")
 	public WebElement contest3 ;
	
	@FindBy(css = "input[name='currentAddress.streetNumber']")
	public WebElement currentAddressstreetNumber ;
	
	@FindBy(css = "input[name='currentAddress.zipPostal']")
	public WebElement currentAddresszipPostal ;
	
	@FindBy(css = "input[name='currentAddress.streetName']")
	public WebElement currentAddressstreetName ;
	
	@FindBy(css = "input[name='currentAddress.timeAtAddressYears']")
	public WebElement currentAddresstimeAtAddressYears ;
	
	@FindBy(css = "input[name='currentAddress.timeAtAddressMonths']")
	public WebElement currentAddresstimeAtAddressMonths ;
	
	@FindBy(css = "input[name='invoiceAddress.streetNumber']")
	public WebElement invoiceAddressstreetNumber ;
	
	@FindBy(css = "input[name='invoiceAddress.zipPostal']")
	public WebElement invoiceAddresszipPostal ;
	
	@FindBy(css = "input[name='invoiceAddress.streetName']")
	public WebElement invoiceAddressstreetName ;
	
	@FindBy(css = "input[name='mailingAddress.streetNumber']")
	public WebElement mailingAddressstreetNumber ;
	
	@FindBy(css = "input[name='mailingAddress.zipPostal']")
	public WebElement mailingAddresszipPostal ;
	
	@FindBy(css = "input[name='mailingAddress.streetName']")
	public WebElement mailingAddressstreetName ;
	
	@FindBy(css = "select[data-hook='.employmentType']")
	public WebElement employmentType ;
	
	@FindBy(css = "select[data-hook='.employmentStatus']")
	public WebElement employmentStatus ;
	
	@FindBy(css = "select[data-hook='.occupation']")
	public WebElement occupation ;
	
	
	@FindBy(css = "input[data-hook='.jobTitle']")
	public WebElement jobTitle ;
 
	@FindBy(css = "input[data-hook='.employer']")
	public WebElement employer ;
	
	@FindBy(css = "input[data-hook='.yearsWithEmployer']")
	public WebElement yearsWithEmployer ;
	
	@FindBy(css = "input[data-hook='.monthsWithEmployer']")
	public WebElement monthsWithEmployer ;
	
	@FindBy(css = "input[name='employment.employersAddress.streetNumber']")
	public WebElement employersAddressstreetNumber ;
	
	@FindBy(css = "input[name='employment.employersAddress.zipPostal']")
	public WebElement employersAddresszipPostal ;
	
	@FindBy(css = "input[name='employment.employersAddress.streetName']")
	public WebElement employersAddressstreetName ;
	
	@FindBy(css = "input[name='bank.bankDetails.accountName']")
	public WebElement accountName ;
	
	@FindBy(css = "input[name='bank.bankDetails.bankName']")
	public WebElement bankName ;
	
	@FindBy(css = "input[name='bank.bankDetails.accountNumber']")
	public WebElement accountNumber ;
	
	@FindBy(css = "input[name='bank.bankDetails.bankSortCode']")
	public WebElement bankSortCode ;
	
	@FindBy(css = "input[name='bank.bankAddress.zipPostal']")
	public WebElement zipPostal ;
	
	@FindBy(css = "input[name='bank.bankAddress.streetNumber']")
	public WebElement streetNumber ;
	
	@FindBy(css = "input[name='bank.bankAddress.streetName']")
	public WebElement streetName ;
	
	@FindBy(css = "input[name='bank.bankAddress.city']")
	public WebElement city ;
	
	@FindBy(css = "input[name='bank.bankAddress.county']")
	public WebElement county ;
	
	@FindBy(css = "input[name='bank.bankDetails.timeAtBankYears']")
	public WebElement timeAtBankYears ;
	
	@FindBy(css = "input[name='bank.bankDetails.timeAtBankMonths']")
	public WebElement timeAtBankMonths ;
	
	@FindBy(css = "button[data-hook='customercapture.save']")
	public WebElement SaveButton ;
	
	public customerCapture()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void newProposal()
	{
		newProposal.click();
	}
	

	public void dpaAgreement()
	{
		dpaAgreement.click();
	}
	

	public void customerType()
	{
		Select customerType1 = new Select(customerType);
		customerType1.selectByIndex(2);
	}
	
	public void buttn()
	{
		button.click();
	}
	
	
	public void title()
	{
		Select title1 = new Select(title);
		title1.selectByIndex(2);
	}
	
	public void firstName(String firstName1)
	{
		firstName.sendKeys(firstName1);
	}
	
	public void lastName(String lastName1)
	{
		lastName.sendKeys(lastName1);
	}

	public void dateOfBirth(String dateOfBirth1)
	{
		dateOfBirth.sendKeys(dateOfBirth1);
	}
	
	public void gender()
	{
		Select gender1 = new Select(gender);
		gender1.selectByIndex(2);
	}
	
	public void maritalStatus()
	{
		Select maritalStatus1 = new Select(maritalStatus);
		maritalStatus1.selectByIndex(2);
	}
	
	public void residentialStatus()
	{
		Select residentialStatus1 = new Select(residentialStatus);
		residentialStatus1.selectByIndex(2);
	}
	
	public void email(String email1)
	{
		email.sendKeys(email1);
	}
	
	public void phonestype0()
	{
		Select phonestype01 = new Select(phonestype0);
		phonestype01.selectByIndex(2);
	}
	
	public void phones0(String phones01)
	{
		phones0.sendKeys(phones01);
	}
	
	public void phonestype1()
	{
		Select phonestype11 = new Select(phonestype1);
		phonestype11.selectByIndex(2);
	}
	
	public void phones1(String phones11)
	{
		phones1.sendKeys(phones11);
	}
	
	public void contest1()
	{
		Select contest2 = new Select(contest1);
		contest2.selectByIndex(2);
	}
	
	public void contest2()
	{
		Select contest3 = new Select(contest2);
		contest3.selectByIndex(2);
	}
	
	public void contest3()
	{
		Select contest4 = new Select(contest3);
		contest4.selectByIndex(2);
	}
	
	public void currentAddressstreetNumber(String currentAddressstreetNumber1)
	{
		currentAddressstreetNumber.sendKeys(currentAddressstreetNumber1);
	}
	
	public void currentAddresszipPostal(String currentAddresszipPostal1)
	{
		currentAddresszipPostal.sendKeys(currentAddresszipPostal1);
	}
	
	public void currentAddresstimeAtAddressYears(String currentAddresstimeAtAddressYears1)
	{
		currentAddresstimeAtAddressYears.sendKeys(currentAddresstimeAtAddressYears1);
	}
	
	public void currentAddresstimeAtAddressMonths(String currentAddresstimeAtAddressMonths1)
	{
		currentAddresstimeAtAddressMonths.sendKeys(currentAddresstimeAtAddressMonths1);
	}
	
	public void currentAddressstreetName(String currentAddressstreetName1)
	{
		currentAddressstreetName.sendKeys(currentAddressstreetName1);
	}
	
	
	public void invoiceAddressstreetNumber(String invoiceAddressstreetNumber1)
	{
		invoiceAddressstreetNumber.sendKeys(invoiceAddressstreetNumber1);
	}
	
	public void invoiceAddresszipPostal(String invoiceAddresszipPostal1)
	{
		invoiceAddresszipPostal.sendKeys(invoiceAddresszipPostal1);
	}
	
	public void invoiceAddressstreetName(String invoiceAddressstreetName1)
	{
		invoiceAddressstreetName.sendKeys(invoiceAddressstreetName1);
	}
	
	public void mailingAddressstreetNumber(String mailingAddressstreetNumber1)
	{
		mailingAddressstreetNumber.sendKeys(mailingAddressstreetNumber1);
	}
	
	public void mailingAddresszipPostal(String mailingAddresszipPostal1)
	{
		mailingAddresszipPostal.sendKeys(mailingAddresszipPostal1);
	}
	
	public void mailingAddressstreetName(String mailingAddressstreetName1)
	{
		mailingAddressstreetName.sendKeys(mailingAddressstreetName1);
	}

	public void employmentType()

	{
		Select employmentType1 = new Select(employmentType);
		employmentType1.selectByIndex(1);
	}
	
	public void employmentStatus()
	{
		Select employmentStatus1 = new Select(employmentStatus);
		employmentStatus1.selectByIndex(1);
	}

	public void occupation()
	{
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select occupation1 = new Select(occupation);
		occupation1.selectByIndex(1);
	}
	
	public void jobTitle(String jobTitle1)
	{
		jobTitle.sendKeys(jobTitle1);
	}
	
	public void employer(String employer1)
	{
		employer.sendKeys(employer1);
	}
	
	public void yearsWithEmployer(String yearsWithEmployer1)
	{
		yearsWithEmployer.sendKeys(yearsWithEmployer1);
	}
	
	public void monthsWithEmployer(String monthsWithEmployer1)
	{
		monthsWithEmployer.sendKeys(monthsWithEmployer1);
	}
	
	public void employersAddressstreetNumber(String employersAddressstreetNumber1)
	{
		employersAddressstreetNumber.sendKeys(employersAddressstreetNumber1);
	}
	
	public void employersAddresszipPostal(String employersAddresszipPostal1)
	{
		employersAddresszipPostal.sendKeys(employersAddresszipPostal1);
	}
	
	public void accountName(String accountName1)
	{
		accountName.sendKeys(accountName1);
	}
	
	public void employersAddressstreetName(String employersAddressstreetName1)
	{
		employersAddressstreetName.sendKeys(employersAddressstreetName1);
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
	
	public void timeAtBankYears(String timeAtBankYears1)
	{
		timeAtBankYears.sendKeys(timeAtBankYears1);
	}
	
	public void timeAtBankMonths(String timeAtBankMonths1)
	{
		timeAtBankMonths.sendKeys(timeAtBankMonths1);
	}
		
		
	public void SaveButton()
	{
		SaveButton.click();
	}
}


