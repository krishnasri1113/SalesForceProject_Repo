package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase26 extends BrowserUtility {

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
		 //Thread.sleep(3000);
		 WebElement createview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		 waitForPageElementTovisible(createview);
		 Thread.sleep(2000);
		 createview.click();
		 Thread.sleep(3000);
		 WebElement Contactviewname=driver.findElement(By.xpath("//input[@id='fname']"));
		 waitForPageElementTovisible(Contactviewname);
		 Thread.sleep(2000);
		 Contactviewname.sendKeys(contactviewname);
		 WebElement contactuniqname=driver.findElement(By.xpath("//input[@id='devname']"));
		 waitForPageElementTovisible(contactuniqname);
		 Thread.sleep(2000);
		 contactuniqname.click();
		 WebElement save=driver.findElement(By.xpath("//div[@class='pbHeader']//input[contains(@value,'Save')]"));
		 waitForPageElementTovisible(save);
		 Thread.sleep(3000);
		 save.click();
		 quitbrowser();

	}

}
