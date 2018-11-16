package pageObject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Testbase;

public class document extends Testbase {
	

	
	@FindBy(css = "button[data-hook='documents.generateDocuments']")
 	public WebElement generateButton;

	@FindBy(css = "button[data-hook='documents.generator.send']")
 	public WebElement print;
	
	@FindBy(css = "label[class='cui-button cui-button--alt ng-binding']")
 	public WebElement choseAFile;
	
	@FindBy(css = "button[data-hook='documents.uploadform.upload']")
 	public WebElement upload;
	
	@FindBy(css = "input[data-hook='documents.manual-tag-dealerNotes']")
 	public WebElement tag;
			
	@FindBy(css = "input[data-hook='documents.manual-tag-Comments']")
 	public WebElement comment;		
	
	public document()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void generate() throws Throwable
	{
		
		Robot robot = new Robot();
		//Counting No. of Document in Document section:
				List<WebElement> list1 = driver.findElements(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook ='documents.fordeadtrees']//ul[@class='cui-listing documents-list']//li//div[@data-hook ='documents.document']"));
				 			
				System.out.println(list1);
				Thread.sleep(8000);
				
				for (int i = 0; i < list1.size(); i++) {
					  
					//	WebElement ActualText = driver.findElement(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook = 'documents.fordeadtrees']//wcg-select-all/ul/li["+ (i + 1) + "]//div//button"));
					//	String Refer = ActualText.getText();
						
						WebElement ActualText1 = driver.findElement(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook ='documents.fordeadtrees']//ul[@class='cui-listing documents-list']//li["+ (i + 1) +"]//div[@data-hook ='documents.document']//div//div//label[@data-hook = 'documents.document.label']//span[@data-hook = 'documents.document.requirement']"));
						String Refer4 = ActualText1.getText();
						System.out.println(Refer4);
						
						
						
						//Finding out that if document is waived or Required
						//System.out.println(Refer);
						Thread.sleep(4000);
						//If document is waived then making it required
					//	if (Refer.contains("Make Required")) {
							
					//	driver.findElement(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook = 'documents.fordeadtrees']//wcg-select-all/ul/li["+ (i + 1) + "]//div//button")).click();
							
					//} 
					
						if(Refer4.contains("(Provide)"))
						{
							
							continue;
					}	
						Thread.sleep(5000);
					  
						// Selecting the document to generate
					
						Thread.sleep(5000);
						//Actions action3 = new Actions(driver);
						driver.findElement(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook ='documents.fordeadtrees']//ul[@class='cui-listing documents-list']//li["+ (i + 1) +"]//div[@data-hook ='documents.document']//div//div//label[@data-hook = 'documents.document.label']//i")).click();
						//driver.findElement(By.xpath("/html/body/posportal-main/div/main/ui-view/posportal-proposing/div/ui-view/posportal-proposing-summary/div/posportal-proposing-standard-summary/div/section/div[4]/div[2]/div[1]/wcg-select-all/ul/li[1]/div/div[1]/div/label/i")).click();
					
				
						
						//Clicking on Generate Button to genearte the document
				       driver.findElement(By.cssSelector("button[data-hook='documents.generateDocuments']")).click();

						
						
						//Selecting which channel to generate document
						Select Document = new Select(driver.findElement(By.cssSelector("select[data-hook='documents.generator.outputchannel']")));
					
						Document.selectByVisibleText("Print/Mail");
						Thread.sleep(5000);
		
						String parent = driver.getWindowHandle();

						 if(driver.findElement(By.cssSelector("button[data-hook='documents.generator.send']")).isEnabled())
							{

						driver.findElement(By.cssSelector("button[data-hook='documents.generator.send']")).click();
							}



						   else
						 {
						// driver.findElement(By.cssSelector("input[data-hook = 'documents.manual-tag-dealerNotes']")).sendKeys("123");
						driver.findElement(By.cssSelector("input[data-hook = 'documents.manual-tag-Comments']")).sendKeys("123");	
						driver.findElement(By.cssSelector("button[data-hook='documents.generator.send']")).click();
						   }


						//driver.findElement(By.cssSelector("button[data-hook='documents.generator.send']")).click();
						//	String parent = driver.getWindowHandle();
						//	driver.findElement(By.cssSelector("button[data-hook='documents.generator.send']")).click();

			                     Thread.sleep(1000);
						Set<String> allWindows = driver.getWindowHandles();
				Thread.sleep(500);
						//driver.findElement(By.cssSelector("button[data-hook='documents.generator.send']")).click();
						//					allWindows.size();
						System.out.println("allWindows.size() = " + allWindows.size());
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

					}

	
	}
				//Uploading the document
				public void upload() throws Exception
				{
				
					Robot robot = new Robot();
					//Counting No. of Document in Document section:
							List<WebElement> list1 = driver.findElements(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook ='documents.fordeadtrees']//ul[@class='cui-listing documents-list']//li//div[@data-hook ='documents.document']"));
							//System.out.println(list1);
							Thread.sleep(8000);
							
							for (int i = 0; i < list1.size(); i++)
							  {
										
								WebElement ActualText1 = driver.findElement(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook ='documents.fordeadtrees']//ul[@class='cui-listing documents-list']//li["+ (i + 1) +"]//div[@data-hook ='documents.document']//div//div//label[@data-hook = 'documents.document.label']//span[@data-hook = 'documents.document.requirement']"));
								String Refer4 = ActualText1.getText();
								System.out.println(Refer4);
								if(Refer4.contains("(Give to Customer)"))
								{
									
									continue;
								}
								
								else
									if(Refer4.contains("(Provide)"))
									{
										Thread.sleep(15000);
										driver.findElement(By.cssSelector("input[data-hook='documents.document.upload']")).click();
										
										StringSelection stringselection = new StringSelection("C:\\Users\\psrivastava\\Documents\\DL.pdf");
											Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
												
											robot.setAutoDelay(10000);
											
											robot.keyPress(KeyEvent.VK_CONTROL);
										    robot.keyPress(KeyEvent.VK_V);
											
										   robot.keyRelease(KeyEvent.VK_CONTROL);
										   robot.keyRelease(KeyEvent.VK_V);
										    
										   
										    
										   robot.setAutoDelay(5000);
										   robot.keyPress(KeyEvent.VK_ENTER);
										   robot.keyPress(KeyEvent.VK_ENTER);
										   robot.setAutoDelay(5000);
										  
									}
								
									else	
									{
								Thread.sleep(15000);
							
							driver.findElement(By.cssSelector("label[class='cui-button cui-button--alt ng-binding']")).click();
									
						StringSelection stringselection = new StringSelection("C:\\Users\\psrivastava\\Downloads\\document"+i+".pdf");
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
							
								 WebElement Document = driver.findElement(By.xpath("//strong[@data-hook='documents.document.status']"));
								 String Refe = Document.getText();
								 System.out.println(Refe);
								 if(Refe.contains("Received"))
								 {
									 continue;
									 		 }
								
								 else
								 {
									 Thread.sleep(20000);
								 }
							  }
								
		}
				
				//Verifying and associating the Document
			public void verify() throws Exception
			{
				
				Robot robot = new Robot();
				//Counting No. of Document in Document section:
						List<WebElement> list1 = driver.findElements(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook ='documents.fordeadtrees']//ul[@class='cui-listing documents-list']//li//div[@data-hook ='documents.document']"));
						System.out.println(list1);
						Thread.sleep(8000);
						
						for (int i = 0; i < list1.size(); i++)
						{
							 WebElement ActualText1 = driver.findElement(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook ='documents.fordeadtrees']//ul[@class='cui-listing documents-list']//li["+ (i + 1) +"]//div[@data-hook ='documents.document']//div//div//label[@data-hook = 'documents.document.label']//span[@data-hook = 'documents.document.requirement']"));
								String Refer3 = ActualText1.getText();
								System.out.println(Refer3);
							
							Thread.sleep(6000); 
						//	WebElement ActualText2 = driver.findElement(By.cssSelector("button[data-hook='documents.unlinked']"));
						//	String Refer2 = ActualText2.getText();	
							//System.out.println("Refer");
						//	if(Refer2.equalsIgnoreCase("Associate Now"))
						//	{
							Thread.sleep(5000); 
						//		
							//	driver.findElement(By.cssSelector("button[data-hook='documents.unlinked']")).click();
							//	Select Action1 = new Select(driver.findElement(By.cssSelector("select[data-hook='documents.associate.page.doc']")));
							//	Action1.selectByIndex(1);
							//	Select Action2 = new Select(driver.findElement(By.cssSelector("select[data-hook='documents.associate.page.missing-page']")));
							//	Action2.selectByIndex(1);
							//	driver.findElement(By.cssSelector("button[data-hook='documents.associate.page.associate-button']")).click();
								// Thread.sleep(5000);
						//	}
							
						//	else
									if(Refer3.contains("(Give to Customer)"))
									{
										
										continue;
								}	
									else
									{
								String parent1 = driver.getWindowHandle();
								driver.findElement(By.xpath("//section[@data-hook = 'proposing.summary.documents']//div[@class = 'grid']//div[@class = 'unit unit--800--15']//div[@data-hook ='documents.fordeadtrees']//ul[@class='cui-listing documents-list']//li["+ (i + 1) +"]//div//div[@class ='documents-list__inner-right']//a")).click();
								Set<String> allWindows1 = driver.getWindowHandles();
								allWindows1.size();
								Thread.sleep(5000);
						for (String child : allWindows1) {
								if (!parent1.equalsIgnoreCase(child)) {
									Thread.sleep(10000);
									driver.switchTo().window(child);
										robot.setAutoDelay(1500);
									Actions action3 = new Actions(driver);
								action3.moveToElement(driver.findElement(By.cssSelector("input[name='35']"))).click().perform();
									//driver.findElement(By.cssSelector("input[data-hook='documentverification.questions.reason']")).sendKeys("1234");
										robot.setAutoDelay(1000);
										driver.findElement(By.cssSelector("button[data-hook='document.verification.revalidate']")).click();
									Thread.sleep(10000);
										driver.close();
								
							
								}
									
						}
						driver.switchTo().window(parent1);
									}
							
						}
							
						
						
						
						Select Action5 = new Select(driver.findElement(By.cssSelector("select[data-hook='actions.select']")));
						Action5.selectByVisibleText("Activate");
						driver.findElement(By.cssSelector("button[data-hook='actions.go']")).click();
						Thread.sleep(8000);
						driver.findElement(By.cssSelector("button[data-hook='actionperform.do']")).click();
						
					}	


	
}

