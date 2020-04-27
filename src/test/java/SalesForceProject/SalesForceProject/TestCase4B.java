package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase4B extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		 WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
		 waitForPageElementTovisible(email);
		 Thread.sleep(2000);
		 email.sendKeys(wrongusername);
		 WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		 waitForPageElementTovisible(Password);
		 Thread.sleep(2000);
		 Password.sendKeys(wrongpassword);
		 WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		 waitForPageElementTovisible(login);
		 Thread.sleep(3000);
		 login.click();
		 WebElement errormessage=driver.findElement(By.xpath("//div[@id='error']"));
		 waitForPageElementTovisible(errormessage);
		 String expectedresult="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		 String actualresult=errormessage.getText();
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
