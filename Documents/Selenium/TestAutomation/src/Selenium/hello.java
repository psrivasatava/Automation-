package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


	
	public class hello {
		
		WebDriver driver;
		
		
		public static void main(String[] args) throws InterruptedException, IOException, AWTException  {
			Robot robot = new Robot();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\psrivastava\\Documents\\Selenium\\TestAutomation\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://mkvsrvc2pos01:8080/WebApp/fmoportal/index.html#/login");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath("//*[@id=\"7\"]")).sendKeys("superuser");
			driver.findElement(By.xpath("//*[@id=\"11\"]")).sendKeys("admin1");
			driver.findElement(By.cssSelector("button[data-hook ='login.submit']")).click();
			driver.findElement(By.cssSelector("a[data-hook='dashboard.newproposal']")).click();
			
			Thread.sleep(8000);
			
			driver.findElement(By.cssSelector("button[ng-click='$ctrl.accept()']")).click();
			
			Thread.sleep(8000);
			
		Select customerType = new Select(driver.findElement(By.cssSelector("select[data-hook='proposal.summary.creation.customertype']")));
		customerType.selectByIndex(2);
		
		driver.findElement(By.cssSelector("button[data-hook='proposal.summary.creation.create']")).click();
		Thread.sleep(8000);
		
		Select title = new Select(driver.findElement(By.cssSelector("select[data-hook='.title']")));
		title.selectByIndex(2);
		
		driver.findElement(By.cssSelector("input[data-hook='.firstName']")).sendKeys("AUtomation");
		driver.findElement(By.cssSelector("input[data-hook='.lastName']")).sendKeys("APPROVE");
		driver.findElement(By.cssSelector("input[data-hook='.dateOfBirth']")).sendKeys("09/09/1990");
		
		Select gender = new Select(driver.findElement(By.cssSelector("select[data-hook='.gender']")));
		gender.selectByIndex(2);
		
		Select MaritalStatus = new Select(driver.findElement(By.cssSelector("select[data-hook='.maritalStatus']")));
		MaritalStatus.selectByIndex(2);
		
		Select ResidentialStatus = new Select(driver.findElement(By.cssSelector("select[data-hook='.residentialStatus']")));
		ResidentialStatus.selectByIndex(2);
		
		driver.findElement(By.cssSelector("input[data-hook='.email']")).sendKeys("test@gmail.com");
		
		Select HomeContact = new Select(driver.findElement(By.cssSelector("select[name='contactDetails.phones[0].type']")));
		HomeContact.selectByIndex(0);
		driver.findElement(By.cssSelector("input[name='contactDetails.phones[0].number']")).sendKeys("9876543210");
		
		Select WorkContact = new Select(driver.findElement(By.cssSelector("select[name='contactDetails.phones[1].type']")));
		WorkContact.selectByIndex(1);
		driver.findElement(By.cssSelector("input[name='contactDetails.phones[1].number']")).sendKeys("9876543910");
		
		Select Consent1 = new Select(driver.findElement(By.cssSelector("select[name='contactConsentDetails.consentQuestions.questions[0].customerConsentAnswer']")));
		Consent1.selectByIndex(1);
		Select Consent2 = new Select(driver.findElement(By.cssSelector("select[name='contactConsentDetails.consentQuestions.questions[1].customerConsentAnswer']")));
		Consent2.selectByIndex(1);
		Select Consent3 = new Select(driver.findElement(By.cssSelector("select[name='contactConsentDetails.consentQuestions.questions[2].customerConsentAnswer']")));
		Consent3.selectByIndex(1);
		
		driver.findElement(By.cssSelector("input[name='currentAddress.streetNumber']")).sendKeys("Black");
		driver.findElement(By.cssSelector("input[name='currentAddress.zipPostal']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name='currentAddress.streetName']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name='currentAddress.timeAtAddressYears']")).sendKeys("4");
		driver.findElement(By.cssSelector("input[name='currentAddress.timeAtAddressMonths']")).sendKeys("4");
		driver.findElement(By.cssSelector("input[name='invoiceAddress.streetNumber']")).sendKeys("45");
		driver.findElement(By.cssSelector("input[name='invoiceAddress.zipPostal']")).sendKeys("45");
		driver.findElement(By.cssSelector("input[name='invoiceAddress.streetName']")).sendKeys("black");
		driver.findElement(By.cssSelector("input[name='mailingAddress.streetNumber']")).sendKeys("45");
		driver.findElement(By.cssSelector("input[name='mailingAddress.zipPostal']")).sendKeys("45");
		driver.findElement(By.cssSelector("input[name='mailingAddress.streetName']")).sendKeys("orange");
		
		
		Select EmploymentType = new Select(driver.findElement(By.cssSelector("select[data-hook='.employmentType']")));
		EmploymentType.selectByIndex(1);
		Select EmploymentStatus = new Select(driver.findElement(By.cssSelector("select[data-hook='.employmentStatus']")));
		EmploymentStatus.selectByIndex(1);
		Select Occupation = new Select(driver.findElement(By.cssSelector("select[data-hook='.occupation']")));
		Occupation.selectByIndex(1);
		
		driver.findElement(By.cssSelector("input[data-hook='.jobTitle']")).sendKeys("tgyhuj");
		driver.findElement(By.cssSelector("input[data-hook='.employer']")).sendKeys("tgyhuj");
		driver.findElement(By.cssSelector("input[data-hook='.yearsWithEmployer']")).sendKeys("4");
		driver.findElement(By.cssSelector("input[data-hook='.monthsWithEmployer']")).sendKeys("5");
		
		driver.findElement(By.cssSelector("input[name='employment.employersAddress.streetNumber']")).sendKeys("Black");
		driver.findElement(By.cssSelector("input[name='employment.employersAddress.zipPostal']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name='employment.employersAddress.streetName']")).sendKeys("1234");
		Thread.sleep(2000); 
		Utility.captureScreenshot(driver,"Proposal");
		//Select Payment = new Select(driver.findElement(By.cssSelector("select[name='bank.bankDetails.paymentMethod']")));
		//Payment.deselectByVisibleText("Direct Debit");
		driver.findElement(By.cssSelector("input[name='bank.bankDetails.accountName']")).sendKeys("blue");
		driver.findElement(By.cssSelector("input[name='bank.bankDetails.bankName']")).sendKeys("bl090ue");
		driver.findElement(By.cssSelector("input[data-hook='.bankName']")).sendKeys("blue");
		driver.findElement(By.cssSelector("input[name='bank.bankDetails.accountNumber']")).sendKeys("98988888");
		driver.findElement(By.cssSelector("input[name='bank.bankDetails.bankSortCode']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='bank.bankAddress.zipPostal']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name='bank.bankAddress.streetNumber']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='bank.bankAddress.streetName']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='bank.bankAddress.city']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='bank.bankAddress.county']")).sendKeys("UK");
		driver.findElement(By.cssSelector("input[name='bank.bankDetails.timeAtBankYears']")).sendKeys("5");
		driver.findElement(By.cssSelector("input[name='bank.bankDetails.timeAtBankMonths']")).sendKeys("5");
		
		
		
		driver.findElement(By.cssSelector("button[data-hook='customercapture.save']")).click();
		
		
		
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[data-hook='proposal.quotepreview.create']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[data-hook='quoting.asset.chooseanasset']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[data-hook='assetselection.selectViaDropdowns']")).click();
		Select Manufacter = new Select(driver.findElement(By.cssSelector("select[data-hook='assetselection.newform.make']")));
		Manufacter.selectByVisibleText("AUDI");
		
		Select Model = new Select(driver.findElement(By.cssSelector("select[data-hook='assetselection.newform.model']")));
		Model.selectByVisibleText("A1 DIESEL HATCHBACK");
		
		Select Variant = new Select(driver.findElement(By.cssSelector("select[data-hook='assetselection.newform.variant']")));
		Variant.selectByVisibleText("1.6 TDI SE 3dr (2015-)");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[data-hook='assetselection.newform.usethisasset']")).click();
		
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("button[data-hook='quoting.finance.product-select']")).click();
		
		
		List<WebElement> list = driver.findElements(By.xpath("//a[@data-hook='search-results.anchor']//div/descendant::h3[@class='ng-binding']"));
		//System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Gold"))
			{
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(5000); 
		//Utility.captureScreenshot(driver);
		
		driver.findElement(By.cssSelector("button[data-hook='product-selection.use']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("button[ng-click='saveQuotePopup()']")).click();
		Thread.sleep(2000); 
		Utility.captureScreenshot(driver,"Quote");
		
		Thread.sleep(8000);
		Select Action = new Select(driver.findElement(By.cssSelector("select[data-hook='actions.select']")));
		
		Action.selectByVisibleText("Submit");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("button[data-hook='actions.go']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("button[data-hook='actionperform.do']")).click();
		Thread.sleep(30000);
		
		WebElement ActualText = driver.findElement(By.cssSelector("dd[data-hook='proposal.status']"));
		String Refer = ActualText.getText();	
		//System.out.println("Refer");
		if(Refer.equalsIgnoreCase("Proposal Referral"))
		{
		Thread.sleep(25000); 
			Select Action1 = new Select(driver.findElement(By.cssSelector("select[class='cui-dropdown ng-pristine ng-untouched ng-valid ng-empty']")));
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			Action1.selectByVisibleText("Accept");
			driver.findElement(By.cssSelector("button[class='cui-button ng-scope']")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath("/html/body/posportal-main/div/main/ui-view/posportal-proposing/posportal-action-perform/cui-popover/div/div/div/div/form/cui-form-field[4]/div/div[2]/field-control/button[1]/span")).click();
				}
		
			
		else
		{
			System.out.println("Proposal already accepted");
		}
		Thread.sleep(5000); 
	
		
		//Counting No. of Document in Document section:
				List<WebElement> list1 = driver.findElements(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook = 'documents.fordeadtrees']//wcg-select-all/ul/li"));
				
				
				Thread.sleep(5000);
				System.out.println(list1.size());
				
				for (int i = 0; i < list1.size(); i++) {
		  
					//Finding out that if document is waived or Required
					List<WebElement> list2 = driver.findElements(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook = 'documents.fordeadtrees']//wcg-select-all/ul/li["+ (i + 1) + "]//div//button"));
					
					Thread.sleep(5000);
					
					Thread.sleep(4000);
					System.out.println(list2.get(i).getText());
					Thread.sleep(4000);
					//If document is waived then making it required
					if (list2.get(i).getText().contains("Make Required")) {
						
					driver.findElement(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook = 'documents.fordeadtrees']//wcg-select-all/ul/li["+ (i + 1) + "]//div//button")).click();
						
					} 
				
					Thread.sleep(5000);
				  
					// Selecting the document to generate
				
					Thread.sleep(5000);
					
					driver.findElement(By.xpath("/html/body/posportal-main/div/main/ui-view/posportal-proposing/div/ui-view/posportal-proposing-summary/div/posportal-proposing-standard-summary/div/section/div[4]/div[2]/div[1]/wcg-select-all/ul/li["+ (i + 1) + "]/div/div[1]/div/label/i")).click();
					
			
					
					//Clicking on Generate Button to genearte the document
			    driver.findElement(By.cssSelector("button[data-hook='documents.generateDocuments']")).click();

					
					
					//Selecting which channel to generate document
					Select Document = new Select(driver.findElement(By.cssSelector("select[data-hook='documents.generator.outputchannel']")));
				
					Document.selectByVisibleText("Print/Mail");

					String parent = driver.getWindowHandle();
					driver.findElement(By.cssSelector("button[data-hook='documents.generator.send']")).click();
					Set<String> allWindows = driver.getWindowHandles();
					allWindows.size();
		        	Thread.sleep(5000);

					for (String child : allWindows) {
						if (!parent.equalsIgnoreCase(child)) {
						Thread.sleep(10000);
							driver.switchTo().window(child);
						
							//Downloading the document and saving it
						robot.setAutoDelay(500);
						driver.findElement(By.xpath("//*[@id=\"plugin\"]")).click();		
						robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.keyRelease(KeyEvent.VK_S);
							
						robot.keyPress(KeyEvent.VK_D);
						robot.keyPress(KeyEvent.VK_O);
						robot.keyPress(KeyEvent.VK_C);
						robot.keyPress(KeyEvent.VK_U);
						robot.keyPress(KeyEvent.VK_M);
						robot.keyPress(KeyEvent.VK_E);
					robot.keyPress(KeyEvent.VK_N);
						robot.keyPress(KeyEvent.VK_T);
							
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						driver.close();
						
							//Renaming the document
							 File oldfile =new File("C:\\Users\\psrivastava\\Downloads\\document.pdf");
						     File newfile =new File("C:\\Users\\psrivastava\\Downloads\\document"+i+".pdf");

						      if(oldfile.renameTo(newfile)){
						           System.out.println("File renamed");
						       }else{
						            System.out.println("Sorry! the file can't be renamed");
						       }
							}
							
						
					}
					
			
					driver.switchTo().window(parent);	
				
					Thread.sleep(5000);
				driver.findElement(By.cssSelector("label[class='cui-button cui-button--alt ng-binding']")).click();
				
				//Uploading the document
				StringSelection stringselection = new StringSelection("C:\\Users\\psrivastava\\Downloads\\docment"+i+".pdf");
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
					
					robot.setAutoDelay(5000);
				
					robot.keyPress(KeyEvent.VK_CONTROL);
				    robot.keyPress(KeyEvent.VK_V);
					
				   robot.keyRelease(KeyEvent.VK_CONTROL);
				   robot.keyRelease(KeyEvent.VK_V);
				    
				   
				    
				  robot.setAutoDelay(5000);
				    
				   robot.keyPress(KeyEvent.VK_ENTER);
				   robot.keyPress(KeyEvent.VK_ENTER);
				   robot.setAutoDelay(5000);
				  driver.findElement(By.cssSelector("button[data-hook='documents.uploadform.upload']")).click();	     
				  Thread.sleep(5000);
				}
			
				
				
				//Verifying and associating the Document
				for (int i = 0; i < list1.size(); i++)
				{
				  
					Thread.sleep(5000); 
					WebElement ActualText2 = driver.findElement(By.cssSelector("button[data-hook='documents.unlinked']"));
					String Refer2 = ActualText2.getText();	
					//System.out.println("Refer");
					if(Refer2.equalsIgnoreCase("Associate Now"))
					{
					Thread.sleep(5000); 
						
						driver.findElement(By.cssSelector("button[data-hook='documents.unlinked']")).click();
						Select Action1 = new Select(driver.findElement(By.cssSelector("select[data-hook='documents.associate.page.doc']")));
						Action1.selectByVisibleText("testing");
						Select Action2 = new Select(driver.findElement(By.cssSelector("select[data-hook='documents.associate.page.missing-page']")));
						Action2.selectByVisibleText("1");
						driver.findElement(By.cssSelector("button[data-hook='documents.associate.page.associate-button']")).click();
						 Thread.sleep(5000);
					}
				   String parent1 = driver.getWindowHandle();
					driver.findElement(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook = 'documents.fordeadtrees']//wcg-select-all/ul/li["+(i+1)+"]//div//div//a[@ng-if='isReceivedOrLater(document.status)']")).click();
					Set<String> allWindows1 = driver.getWindowHandles();
					allWindows1.size();
					Thread.sleep(5000);
			for (String child : allWindows1) {
					if (!parent1.equalsIgnoreCase(child)) {
						Thread.sleep(10000);
						driver.switchTo().window(child);
							robot.setAutoDelay(500);
						Actions action3 = new Actions(driver);
					action3.moveToElement(driver.findElement(By.cssSelector("input[name='36']"))).click().perform();
						driver.findElement(By.cssSelector("input[data-hook='documentverification.questions.reason']")).sendKeys("1234");
							robot.setAutoDelay(1000);
							driver.findElement(By.cssSelector("button[data-hook='document.verification.revalidate']")).click();
						Thread.sleep(10000);
							driver.close();
						}
				}
				    
					driver.switchTo().window(parent1);	
				}		
					
				}
		}


	
			
		
		
		
	