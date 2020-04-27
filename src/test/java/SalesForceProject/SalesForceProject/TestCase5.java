package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase5  extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		 waitForPageElementTovisible(login);
		 login.click();
		 WebElement label=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		 waitForPageElementTovisible(label);
		 Thread.sleep(3000);
		 String text=label.getText();
		 System.out.println(text+";"+" username found in the web page");
		 WebElement menu=driver.findElement(By.xpath("//div[@id='userNav']"));
		 waitForPageElementTovisible(menu);
		 Thread.sleep(3000);
		 menu.click();
		 WebElement myprofile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		   String mp=myprofile.getText();
		   System.out.println(mp+" is found in the dropdown");
		   WebElement  mysettings=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		   String myset=mysettings.getText();
		   System.out.println(myset+" is found in the dropdown");
		   WebElement developerconsole=driver.findElement(By.xpath("//a[contains(@class,'debugLogLink menuButtonMenuLink')]"));
		   String dc=developerconsole.getText();
		   System.out.println(dc+" is found in the dropdown");
		   Thread.sleep(10000);
		   quitbrowser();
		 
		 
	}

}
