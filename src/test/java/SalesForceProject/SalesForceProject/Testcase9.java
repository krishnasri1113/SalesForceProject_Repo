package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase9  extends BrowserUtility{

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
