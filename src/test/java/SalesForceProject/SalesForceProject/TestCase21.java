package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase21 extends  BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		loginsalesforce();;
		WebElement leadstab=driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
 		 waitForPageElementTovisible(leadstab);
 		 Thread.sleep(2000);
 		 leadstab.click();
 		 Thread.sleep(5000);
		WebElement leadsdropdown=driver.findElement(By.xpath("//select[@name='fcf']"));
        Thread.sleep(5000);
        leadsdropdown.click();
        System.out.println(" lead tab dropdown list is displayed ");
		 Thread.sleep(10000);
		 quitbrowser();
		 
		
		

	}

}
