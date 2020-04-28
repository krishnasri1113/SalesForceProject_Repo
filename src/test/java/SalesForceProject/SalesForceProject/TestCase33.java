package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase33 extends BrowserUtility{

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
		quitbrowser();
	}

}
