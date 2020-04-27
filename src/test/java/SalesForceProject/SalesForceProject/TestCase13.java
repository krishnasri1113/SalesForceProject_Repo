package SalesForceProject.SalesForceProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase13 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
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
			WebElement mergeaccounts=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
			waitForPageElementTovisible(mergeaccounts);
			Thread.sleep(2000);
			mergeaccounts.click();
			WebElement search=driver.findElement(By.xpath("//input[@id='srch']"));
			waitForPageElementTovisible(search);
			Thread.sleep(2000);
			//search.sendKeys(mergeaccountname);
			search.sendKeys("sravan");
			//sravan is merged with sravani so you will have sravni  now
			WebElement findaccounts=driver.findElement(By.xpath("//input[contains(@value,'Find Accounts')]"));
			waitForPageElementTovisible(findaccounts);
			Thread.sleep(3000);
			findaccounts.click();
			WebElement next=driver.findElement(By.xpath("(//input[contains(@value,'Next')])[2]"));
			waitForPageElementTovisible(next);
			Thread.sleep(2000);
			next.click();
			WebElement merge=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@value,'Merge')]"));
			waitForPageElementTovisible(merge);
			Thread.sleep(3000);
			merge.click();
			Alert alrt=driver.switchTo().alert();
			System.out.println(alrt.getText());
			Thread.sleep(3000);
			alrt.accept();
			System.out.println("sravani is successfully merged into sravni");
			Thread.sleep(3000);
			quitbrowser();

	}

}
