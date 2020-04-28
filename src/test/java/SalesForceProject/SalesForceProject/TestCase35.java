package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase35  extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		loginsalesforce();
		WebElement alltabs=driver.findElement(By.xpath("//li[@id='AllTab_Tab']"));
		waitForPageElementTovisible(alltabs);
		Thread.sleep(3000);
		alltabs.click();
		WebElement customizetabs=driver.findElement(By.xpath("//input[@value='Customize My Tabs']"));
		waitForPageElementTovisible(customizetabs);
		Thread.sleep(3000);
		customizetabs.click();
		WebElement chatter=driver.findElement(By.xpath("//option[contains(@value,'Chatter')]"));
		waitForPageElementTovisible(chatter);
		Thread.sleep(3000);
		chatter.click();
		WebElement remove=driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]"));
		waitForPageElementTovisible(remove);
		Thread.sleep(3000);
		remove.click();
		WebElement save=driver.findElement(By.xpath("//input[contains(@value,'Save')]"));
		waitForPageElementTovisible(save);
		Thread.sleep(3000);
		save.click();
		 WebElement menu=driver.findElement(By.xpath("//div[@id='userNav']"));
		 waitForPageElementTovisible(menu);
		 Thread.sleep(3000);
		 menu.click();
		 WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		 waitForPageElementTovisible(logout);
		 Thread.sleep(3000);
		 logout.click();
		 LaunchApp();
		 SendCredentials();
		 loginsalesforce();
		 Thread.sleep(10000);
		 quitbrowser();
		
		

	}

}
