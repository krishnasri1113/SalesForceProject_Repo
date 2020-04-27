package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase30 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		loginsalesforce();
		WebElement contacttab=driver.findElement(By.xpath("//li[@id='Contact_Tab']"));
		 waitForPageElementTovisible(contacttab);
		 Thread.sleep(2000);
		 contacttab.click();
		Thread.sleep(3000);
		 WebElement newview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		 waitForPageElementTovisible(newview);
		 Thread.sleep(2000);
		 newview.click();
		 WebElement Contactuniqname=driver.findElement(By.xpath("//input[@id='devname']"));
		 waitForPageElementTovisible(Contactuniqname);
		 Thread.sleep(2000);
		 Contactuniqname.sendKeys(contactuniquename);
		//div[@class='pbHeader']//input[contains(@value,'Save')]
		 WebElement save=driver.findElement(By.xpath("//div[@class='pbHeader']//input[contains(@value,'Save')]"));
		 waitForPageElementTovisible(save);
		 Thread.sleep(2000);
		 save.click();
		 System.out.println("Error message is displayed");
		 Thread.sleep(10000);
		 quitbrowser();
		 

	}

}
