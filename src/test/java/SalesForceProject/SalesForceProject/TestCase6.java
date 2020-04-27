package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCase6 extends BrowserUtility{

	public static void main(String[] args) {
		try 
		{
			loadInputdata();
			launchbrowser("ch");
			LaunchApp();
			SendCredentials();
			WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
			waitForPageElementTovisible(login);
			Thread.sleep(2000);
			login.click();
			 WebElement label=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			 waitForPageElementTovisible(label);
			 Thread.sleep(2000);
			 String text=label.getText();
			 System.out.println(text+";"+" username found in the web page");
			 WebElement menu=driver.findElement(By.xpath("//div[@id='userNav']"));
			 waitForPageElementTovisible(menu);
			 Thread.sleep(2000);
			 menu.click();
			 WebElement myprofile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
			   String mp=myprofile.getText();
			   System.out.println(mp+" is found in the dropdown");
			   waitForPageElementTovisible(myprofile);
			   Thread.sleep(2000);
			   myprofile.click();
			   WebElement editcontact=driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img"));
			   waitForPageElementTovisible(editcontact);
			   Thread.sleep(2000);
			   editcontact.click();
			   /*WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
			   waitForPageElementTovisible(about);
			   Thread.sleep(2000);
			   about.click();*/
			   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
			   WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
			   waitForPageElementTovisible(about);
			   Thread.sleep(3000);
			   about.click();
			   WebElement editLastname=driver.findElement(By.xpath("//input[@id='lastName']"));
			   waitForPageElementTovisible(editLastname);
			   editLastname.clear();
			   Thread.sleep(2000);
			   editLastname.sendKeys(lastname);
			   WebElement saveall=driver.findElement(By.xpath("//input[contains(@value,'Save All')]"));
			   waitForPageElementTovisible(saveall);
			   Thread.sleep(2000);
			   saveall.click();
			   WebElement updatedname=driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
			   /*WebElement update=driver.findElement(By.xpath("//input[@value='devi']"));
			   String name=update.getText();
			   System.out.println(name);*/
			   waitForPageElementTovisible(updatedname);
			   String Updatedname=updatedname.getText();
			   System.out.println("lastname is updated as "+Updatedname);
			   WebElement post=driver.findElement(By.xpath("(//span[contains(@class,'publisherattachtext')])[1]"));
			   waitForPageElementTovisible(post);
			   Thread.sleep(2000);
			  post.click();
			  //switch to iframe to post a message
			  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")));
			  //xpath for postmessage
			  WebElement message=driver.findElement(By.xpath("//body[@contenteditable='true']"));
			  waitForPageElementTovisible(message);
			  Thread.sleep(3000);
			  message.sendKeys(postmessage);
			  //again switch to default content from iframe to share message
			  driver.switchTo().defaultContent();
			  WebElement share=driver.findElement(By.xpath("//span[contains(@class,'publisherShareButtonPlaceholder')]"));
			  waitForPageElementTovisible(share);
			  Thread.sleep(3000);
			  share.click();
			  WebElement file=driver.findElement(By.xpath("//span[contains(text(),'File')]"));
			  waitForPageElementTovisible(file);
			  Thread.sleep(3000);
			  file.click();
			  WebElement fileupload=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
			  waitForPageElementTovisible(fileupload);
			  Thread.sleep(3000);
			  fileupload.click();
			  WebElement choosefile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
			  waitForPageElementTovisible(choosefile);
			  Thread.sleep(3000);
			  choosefile.sendKeys("C:\\Users\\krishna sri\\Downloads\\I94.txt");
			  //choosefile.sendKeys(file);
			  WebElement fileshare=driver.findElement(By.xpath("//span[contains(@class,'publisherShareButtonPlaceholder')]//input[contains(@value,'Share')]"));
			  waitForPageElementTovisible(fileshare);
			  Thread.sleep(3000);
			  fileshare.click();
			  WebElement addpic=driver.findElement(By.xpath("//img[contains(@class,'chatter-photo')]"));
			  waitForPageElementTovisible(addpic);
			  Thread.sleep(3000);
			  addpic.click();
			  WebElement addphoto=driver.findElement(By.xpath("//a[@id='uploadLink']"));
			  waitForPageElementTovisible(addphoto);
			  Thread.sleep(3000);
			  addphoto.click();
			 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']")));
			 WebElement uploadimage=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
			 waitForPageElementTovisible(uploadimage);
			 Thread.sleep(3000);
			 uploadimage.sendKeys("C:\\Users\\krishna sri\\Downloads\\flower.jpg");
			 WebElement saveimage=driver.findElement(By.xpath("//div[contains(@class,'uploadButtonPanel')]//input[2]"));
			 waitForPageElementTovisible(saveimage);
			 saveimage.click();
			 System.out.println("image uploaded successfully");
			 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']")));
			 WebElement cropimage=driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleNE']"));
			 Actions act=new Actions(driver);
			 act.dragAndDropBy(cropimage, 100, 20);
			 WebElement savemyimage=driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
			 waitForPageElementTovisible(savemyimage);
			 saveimage.click();
			 Thread.sleep(3000);
			 saveimage.click();
			 Thread.sleep(10000);
			 //quitbrowser();
			  
			 
			   
			   
			   
			   
			 
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

		
		

	}

}
