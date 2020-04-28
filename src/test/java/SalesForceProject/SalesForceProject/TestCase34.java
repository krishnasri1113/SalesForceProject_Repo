package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase34 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		loginsalesforce();
		WebElement home=driver.findElement(By.xpath("//li[@id='home_Tab']"));
		waitForPageElementTovisible(home);
		Thread.sleep(2000);
		home.click();
		//span[@class='mruText'][contains(text(),'krishnasri devi')]
		WebElement myname=driver.findElement(By.xpath("//span[@class='mruText'][contains(text(),'krishnasri devi')]"));
		waitForPageElementTovisible(myname);
		Thread.sleep(2000);
		myname.click();
		Thread.sleep(3000);
		System.out.println("My profile is displayed");
		 WebElement editcontact=driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img"));
		   waitForPageElementTovisible(editcontact);
		   Thread.sleep(2000);
		   editcontact.click();
		   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		   WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		   waitForPageElementTovisible(about);
		   Thread.sleep(3000);
		   about.click();
		   WebElement editLastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		   waitForPageElementTovisible(editLastname);
		   editLastname.clear();
		   Thread.sleep(2000);
		   editLastname.sendKeys("siri");
		   WebElement saveall=driver.findElement(By.xpath("//input[contains(@value,'Save All')]"));
		   waitForPageElementTovisible(saveall);
		   Thread.sleep(2000);
		   saveall.click();
		   System.out.println("last name is updated at all places");
           Thread.sleep(10000);
           quitbrowser();
	}

}
