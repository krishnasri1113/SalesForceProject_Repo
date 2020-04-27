package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase18 extends BrowserUtility {

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
		 WebElement opurtunities=driver.findElement(By.xpath(" //li[@id='Opportunity_Tab']"));
		 waitForPageElementTovisible(opurtunities);
		 Thread.sleep(3000);
		 opurtunities.click();
		 WebElement stuckopurtunities=driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		 waitForPageElementTovisible(stuckopurtunities);
		 Thread.sleep(3000);
		 stuckopurtunities.click();
		 Thread.sleep(10000);
		 System.out.println("Report Page with the Opportunities that are Stuck will be displayed");
		 quitbrowser();
		 

		 

	}

}
