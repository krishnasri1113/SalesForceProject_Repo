package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase11 extends BrowserUtility {

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
		 WebElement account=driver.findElement(By.xpath("//li[@id='Account_Tab']"));
			waitForPageElementTovisible(account);
			Thread.sleep(2000);
			account.click();
			Thread.sleep(3000);
		 WebElement createview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		 waitForPageElementTovisible(createview);
		 Thread.sleep(2000);
		 createview.click();
		 Thread.sleep(2000);
		 WebElement Viewname=driver.findElement(By.xpath("//input[@id='fname']"));
		 waitForPageElementTovisible(Viewname);
		 Thread.sleep(3000);
		    Viewname.sendKeys(viewname);
		    WebElement viewuniquename=driver.findElement(By.xpath("//input[@id='devname']"));
		    waitForPageElementTovisible(viewuniquename);
		    Thread.sleep(2000);
		    viewuniquename.click();
		    WebElement save=driver.findElement(By.xpath("(//input[contains(@value,'Save')])[1]"));
		    waitForPageElementTovisible(save);
		    Thread.sleep(2000);
            save.click();
            System.out.println(viewname+"  is created in the account dropdown  view list");
            Thread.sleep(5000);
            quitbrowser();
	}

}
