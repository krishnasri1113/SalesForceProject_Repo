package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase3 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		WebElement rememberme=driver.findElement(By.xpath("//input[@id='rememberUn']"));
		waitForPageElementTovisible(rememberme);
		Thread.sleep(3000);
		rememberme.click();
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		 waitForPageElementTovisible(login);
		 login.click();
		 WebElement menu=driver.findElement(By.xpath("//div[@id='userNav']"));
		 waitForPageElementTovisible(menu);
		 Thread.sleep(3000);
		 menu.click();
		 WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		 waitForPageElementTovisible(logout);
		 Thread.sleep(3000);
		 logout.click();
	     Thread.sleep(3000);
	 //String expectedresult="1 Saved Username";
		 //String expectedresult1="krishnasri.d@salesforce.com";
		 String expectedresult=username;
		System.out.println("Expected Result "+expectedresult);
		// WebElement ActualResult=driver.findElement(By.xpath("//a[@id='hint_back_chooser']"));
		 WebElement ActualResult1=driver.findElement(By.xpath("//span[@id='idcard-identity']"));
		 String actualresult=ActualResult1.getText();
		 System.out.println("Actual Result "+actualresult);
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
