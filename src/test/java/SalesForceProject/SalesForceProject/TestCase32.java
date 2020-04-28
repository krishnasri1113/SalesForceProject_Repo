package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase32  extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		loginsalesforce();
		WebElement contacttab=driver.findElement(By.xpath("//li[@id='Contact_Tab']"));
		 waitForPageElementTovisible(contacttab);
		 Thread.sleep(2000);
		 contacttab.click();
		 WebElement newcontact=driver.findElement(By.xpath("//input[contains(@value,'New')]"));
		 waitForPageElementTovisible(newcontact);
		 Thread.sleep(2000);
		 newcontact.click();
		 WebElement contactlastname=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		 waitForPageElementTovisible(contactlastname);
		 Thread.sleep(2000);
		 contactlastname.sendKeys(contactlastnameedit);
		 WebElement contactaccname=driver.findElement(By.xpath("//input[@id='con4']"));
		 waitForPageElementTovisible(contactaccname);
		 Thread.sleep(2000);
	     contactaccname.sendKeys(contacteditaccountname);
	   //td[@id='topButtonRow']//input[contains(@value,'Save & New')]
	     WebElement saveandnew=driver.findElement(By.xpath("(//input[contains(@value,'Save & New')])[1]"));
		 waitForPageElementTovisible(saveandnew);
		 Thread.sleep(2000);
		 saveandnew.click();
		 Thread.sleep(10000);
		 quitbrowser();

	}

}
