package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase31  extends BrowserUtility{

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
    	WebElement createview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
			 waitForPageElementTovisible(createview);
			 Thread.sleep(2000);
			 createview.click();
			 Thread.sleep(3000);
			 WebElement Contactviewname=driver.findElement(By.xpath("//input[@id='fname']"));
			 waitForPageElementTovisible(Contactviewname);
			 Thread.sleep(2000);
			 Contactviewname.sendKeys(contactnewview);
			 WebElement contactuniqname=driver.findElement(By.xpath("//input[@id='devname']"));
			 waitForPageElementTovisible(contactuniqname);
			 Thread.sleep(2000);
			 contactuniqname.click();
			 contactuniqname.clear();
			 Thread.sleep(2000);
			 contactuniqname.sendKeys(contactnewuniqueview);
			 WebElement cancel=driver.findElement(By.xpath("(//input[@value='Cancel'])[1]"));
			 waitForPageElementTovisible(cancel);
			 Thread.sleep(2000);
			 cancel.click();
			 System.out.println("new view is not created in the contact  view dropdown list");
			 Thread.sleep(10000);
			 quitbrowser();
			 
			 
	
	}
}
