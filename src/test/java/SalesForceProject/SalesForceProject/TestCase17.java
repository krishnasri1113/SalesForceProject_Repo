package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase17 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		 WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		 waitForPageElementTovisible(login);
		 Thread.sleep(2000);
		 login.click();
		 WebElement opurtunities=driver.findElement(By.xpath(" //li[@id='Opportunity_Tab']"));
		 waitForPageElementTovisible(opurtunities);
		 Thread.sleep(3000);
		 opurtunities.click();
		 WebElement oppipeline=driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		 waitForPageElementTovisible(oppipeline);
		 Thread.sleep(3000);
		 oppipeline.click();
		 Thread.sleep(10000);
		 System.out.println("Report Page with the Opportunities that are pipelined will be displayed.");
		 quitbrowser();
		 
		 

	        

	}

}
