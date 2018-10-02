package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.activation;
import pageObject.createQuote;
import pageObject.customerCapture;
import pageObject.document;
import pageObject.loginPage;
import pageObject.submit;
import pageObject.updateScreen;
import util.Testbase;

public class homeStepdefinition extends Testbase{
	loginPage LoginPage ;
	customerCapture CC;
	

	@Given("^User open browser$")
	public void User_open_browser() throws Throwable {	
	Testbase.initialization();
	}
	
	@When("User enter user name and password$")
	public void User_enter_user_name_and_password() throws Throwable{
		loginPage LoginPage = new loginPage();
	CC =	LoginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

@Then("^User enter new proposal option$")
public void user_enter_new_proposal_option() throws Throwable {
	CC.newProposal();
    
}

@Then("^User accept DPA Agreement$")
public void user_accept_DPA_Agreement() throws Throwable {
	Thread.sleep(8000);
	CC.dpaAgreement();
    
}

@Then("^User enter all mandatory answers$")
public void user_enter_all_mandatory_answers() throws Throwable {
	CC.customerType();
	CC.buttn();
	CC.title();
	CC.firstName("First");
	CC.lastName("Last name");
	CC.dateOfBirth("30/08/2000");
	CC.gender();
	CC.maritalStatus();
	CC.residentialStatus();
	CC.email("test@gmail.com");
	CC.phonestype0();
	CC.phones0("89656565656");
	CC.phonestype1();
	CC.phones1("896565656265");
	CC.contest1();
	CC.contest2();
	CC.contest3();
	CC.currentAddressstreetNumber("74");
	CC.currentAddresszipPostal("6789");
	CC.currentAddressstreetName("ikujik");
    CC.currentAddresstimeAtAddressYears("7");
	CC.currentAddresstimeAtAddressMonths("6");
	CC.invoiceAddressstreetName("Invoice");
	CC.invoiceAddressstreetNumber("9");
	CC.invoiceAddresszipPostal("8596");
	CC.mailingAddressstreetName("mailing");
	CC.mailingAddressstreetNumber("9");
	CC.mailingAddresszipPostal("7896");
	CC.employmentType();
	Thread.sleep(8000);
	CC.employmentStatus();
	Thread.sleep(8000);
	CC.occupation();
	CC.jobTitle("ploiko");
	CC.employer("ujikil");
	CC.monthsWithEmployer("7");
	CC.yearsWithEmployer("7");
	CC.employersAddressstreetName("9878");
	CC.employersAddresszipPostal("7878");
	CC.employersAddressstreetNumber("8526");
	
}

@Then("^User save the form$")
public void user_save_the_form() throws Throwable {
CC.SaveButton();
 
}

@Then("^User create a quote$")
public void User_create_a_quote() throws Throwable {
	createQuote CQ = new createQuote();
	Thread.sleep(10000);
	CQ.quote1();
	CQ.newquote1();
	Thread.sleep(10000);
	CQ.assetselection1();
	Thread.sleep(10000);
	CQ.manufacture1r();
	CQ.model1();
	CQ.variant1();
	CQ.button2();
	Thread.sleep(10000);
	CQ.finance1();
	CQ.search1();
	CQ.productSelect();
	Thread.sleep(10000);
	CQ.save1();
    
}

@Then("^User submit the proposal$")
public void User_submit_the_proposal() throws Throwable {
	submit SB = new submit();
	Thread.sleep(10000);
	SB.submit1();
	Thread.sleep(20000);
	SB.submit2();
}

@Then("^User goto Update screen$")
public void User_goto_Update_screen() throws Throwable {
	updateScreen US = new updateScreen();
	Thread.sleep(10000);
     US.update1();
     US.paymentdate1();
     US.accountHolderName("testing");
     US.bankName("ploki");
     US.accountNumber("123456");
     US.bankSortCode("789456");
     US.zipPostal("7894");
     US.streetNumber("85");
     US.streetName("plok");
     US.city("plokk");
     US.county("oikuj");
     US.timeAtBankYears("8");
     US.timeAtBankMonths("7");
     US.registrationDate("23/08/2018");
     US.registrationNumber("8596323");
     US.odometer("8");
     US.vin("78945612345696444");
     US.orderNumber("1234567898");
     US.serialNumber("12356");
     US.Save();
     Thread.sleep(10000);
     US.SummaryPage();
}

@Then("^User verify the document$")
public void User_verify_the_document() throws Throwable {
	document DO = new document();
	Thread.sleep(10000);
	DO.generate();
	DO.upload();
	DO.verify();
}


@Then("^User Activate the Proposal$")
public void User_Activate_the_Proposal() throws Throwable {
	activation AT = new activation();
	Thread.sleep(10000);
	AT.submit();
	
}

}