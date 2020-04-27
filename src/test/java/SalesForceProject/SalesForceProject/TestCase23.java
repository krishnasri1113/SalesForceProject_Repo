package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase23 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		loginsalesforce();
		WebElement leadstab=driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
		 waitForPageElementTovisible(leadstab);
		 Thread.sleep(2000);
		 leadstab.click();
		 WebElement leadsdw=driver.findElement(By.xpath("//select[@name='fcf']"));
		 Select leadlistindropdown=new Select(leadsdw);
		 Thread.sleep(3000);
		 leadlistindropdown.selectByIndex(3);
		 Thread.sleep(5000);
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
