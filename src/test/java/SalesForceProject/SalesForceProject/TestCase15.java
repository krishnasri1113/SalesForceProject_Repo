package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase15 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
		 Thread.sleep(2000);
		 WebElement dropdownop=driver.findElement(By.xpath("//select[@id='fcf']"));
		 waitForPageElementTovisible(dropdownop);
		 Thread.sleep(3000);
		 dropdownop.click();
		 System.out.println("displyed oppurtnities page");
		 System.out.println("oppurtnities drop down list is displayed");
		 Thread.sleep(10000);
		 quitbrowser();
		 

	}

}
