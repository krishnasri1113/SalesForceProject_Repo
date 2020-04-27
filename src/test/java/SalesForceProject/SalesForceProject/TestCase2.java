package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase2  extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		 waitForPageElementTovisible(login);
		 login.click();
		 WebElement salesforcelogo=driver.findElement(By.xpath("//img[@id='phHeaderLogoImage']"));
		 waitForPageElementTovisible(salesforcelogo);
		 String actualresult=salesforcelogo.getAttribute("title");
		 String expectedresult="Salesforce.com";
		 if(expectedresult.equals(actualresult))
		 {
			 System.out.println("Testcase Passed");
		 }
		 else 
		 {
			 System.out.println("Testcase failed");
		 }
		 Thread.sleep(10000);
		 quitbrowser();

	}

}
