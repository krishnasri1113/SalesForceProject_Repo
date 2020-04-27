package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase10 extends BrowserUtility {

	public static void main(String[] args)  {
		try
		{
		
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		 waitForPageElementTovisible(login);
		 Thread.sleep(2000);
		 login.click();
		WebElement account=driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		waitForPageElementTovisible(account);
		Thread.sleep(2000);
		account.click();
		WebElement newacc=driver.findElement(By.xpath("//input[contains(@value,'New')]"));
		waitForPageElementTovisible(newacc);
		Thread.sleep(2000);
		newacc.click();
		WebElement accname=driver.findElement(By.xpath("//input[@id='acc2']"));
		waitForPageElementTovisible(accname);
		Thread.sleep(2000);
		accname.sendKeys(accountname);
		WebElement acctype=driver.findElement(By.xpath("//select[@id='acc6']"));
		waitForPageElementTovisible(acctype);
		Select dropdown=new Select(acctype);
		Thread.sleep(1000);
		dropdown.selectByIndex(6);
		WebElement priority=driver.findElement(By.xpath("//select[@id='00N5w00000HZc2o']"));
		waitForPageElementTovisible(priority);
		Select dropdown1=new Select(priority);
		dropdown1.selectByVisibleText("High");
		WebElement save=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"));
		waitForPageElementTovisible(save);
		Thread.sleep(2000);
		save.click();
		System.out.println("Account name is created in new account [account tab]");
		Thread.sleep(10000);
		quitbrowser();
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
