package SalesForceProject.SalesForceProject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase7 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
	    SendCredentials();
	    loginsalesforce();
	    WebElement menu=driver.findElement(By.xpath("//div[@id='userNav']"));
		 waitForPageElementTovisible(menu);
		 Thread.sleep(2000);
		 menu.click();
		 WebElement  mysettings=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		 waitForPageElementTovisible(mysettings);
		 Thread.sleep(3000);
		 mysettings.click();
		 WebElement personal=driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']"));
		 waitForPageElementTovisible(personal);
		 Thread.sleep(2000);
		 personal.click();
		 ////a[@id='LoginHistory_font']
		 WebElement loginhistory=driver.findElement(By.xpath("//a[@id='LoginHistory_font']"));
		 waitForPageElementTovisible(loginhistory);
		 Thread.sleep(2000);
		 loginhistory.click();
		//a[contains(text(),'Download login history for last six months, includ')]
		 WebElement download=driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		 waitForPageElementTovisible(download);
		 Thread.sleep(2000);
		 download.click();
		 WebElement display=driver.findElement(By.xpath("//div[@id='DisplayAndLayout']"));
		 waitForPageElementTovisible(display);
		 Thread.sleep(2000);
		 display.click();
		 WebElement customizetabs=driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"));
		 waitForPageElementTovisible(customizetabs);
		 Thread.sleep(2000);
		 customizetabs.click();
		 WebElement chatter=driver.findElement(By.xpath("//select[@id='p4']"));
		 waitForPageElementTovisible(chatter);
		 Thread.sleep(2000);
		 Select dropdown=new Select(chatter);
		 dropdown.selectByVisibleText("Salesforce Chatter");
		 Thread.sleep(5000);
		 WebElement report=driver.findElement(By.xpath("//option[@value='report']"));
		 waitForPageElementTovisible(report);
		 Thread.sleep(3000);
		 report.click();
		  WebElement add=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		 waitForPageElementTovisible(add);
		 Thread.sleep(2000);
		 add.click();
	WebElement save=driver.findElement(By.xpath("//input[contains(@value,'Save')]"));
		 waitForPageElementTovisible(save);
		 Thread.sleep(3000);
		 save.click();
		 WebElement Email=driver.findElement(By.xpath("//div[@id='EmailSetup']//a[contains(@class,'header setupFolder')]"));
		 waitForPageElementTovisible(Email);
		 Thread.sleep(3000);
		 Email.click();
		//a[@id='EmailSettings_font']
		 WebElement emailsettings=driver.findElement(By.xpath("//a[@id='EmailSettings_font']"));
		 waitForPageElementTovisible(emailsettings);
		 Thread.sleep(3000);
		 emailsettings.click();
		 WebElement emailname=driver.findElement(By.xpath("//input[@id='sender_name']"));
		 waitForPageElementTovisible(emailname);
		 Thread.sleep(3000);
		 emailname.clear();
		 emailname.sendKeys("krishnasri devi");
		 WebElement emailid=driver.findElement(By.xpath("//input[@id='sender_email']"));
		 waitForPageElementTovisible(emailname);
		 Thread.sleep(3000);
		 emailid.clear();
		 emailid.sendKeys("krishnasri.devisetti1113@gmail.com");
		//input[@id='auto_bcc1']
		 WebElement radiobutton=driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		 waitForPageElementTovisible(radiobutton);
		 Thread.sleep(1000);
		 radiobutton.click();
		//input[contains(@value,'Save')]
		 WebElement saveEmail=driver.findElement(By.xpath("//input[contains(@value,'Save')]"));
		 waitForPageElementTovisible(saveEmail);
		 Thread.sleep(1000);
		 saveEmail.click();
		 WebElement Calenderandreminders=driver.findElement(By.xpath("//div[@id='CalendarAndReminders']"));
		 waitForPageElementTovisible(Calenderandreminders);
		 Calenderandreminders.click();
		 WebElement activityreminders=driver.findElement(By.xpath("//a[@id='Reminders_font']"));
		 waitForPageElementTovisible(Calenderandreminders);
		 Thread.sleep(2000);
		 activityreminders.click();
		 WebElement testreminder=driver.findElement(By.xpath("//input[contains(@value,'Open a Test Reminder')]"));
		 waitForPageElementTovisible(testreminder);
		 Thread.sleep(2000);
		 testreminder.click();
		 Thread.sleep(2000);
		 ArrayList<String> listofwindows=new ArrayList(driver.getWindowHandles());
	       Thread.sleep(5000);
	      driver.switchTo().window(listofwindows.get(1));
	      Thread.sleep(3000);
	      driver.close();
		 //driver.close();
		 Thread.sleep(10000);
		 quitbrowser();
		 
		 
		 
		 
		 
		 
		 
		 


	}

}
