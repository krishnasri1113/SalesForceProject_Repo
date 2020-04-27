package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase20  extends BrowserUtility{

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
		 WebElement leadstab=driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
		 waitForPageElementTovisible(leadstab);
		 Thread.sleep(2000);
		 leadstab.click();
		 WebElement label=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		 waitForPageElementTovisible(label);
		 Thread.sleep(3000);
		 String text=label.getText();
		 System.out.println(text+";"+" username found in the web page");
		 WebElement menu=driver.findElement(By.xpath("//div[@id='userNav']"));
		 waitForPageElementTovisible(menu);
		 Thread.sleep(3000);
		 menu.click();
		 WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		 waitForPageElementTovisible(logout);
		 Thread.sleep(3000);
		 logout.click();
	     Thread.sleep(10000);
	     quitbrowser();
		 
		 

	}

}
