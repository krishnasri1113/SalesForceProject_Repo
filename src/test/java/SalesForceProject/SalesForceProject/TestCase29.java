package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase29 extends BrowserUtility {

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
		 Thread.sleep(5000);
		 WebElement mydata=driver.findElement(By.xpath("//a[contains(text(),'tommy')]"));
		 waitForPageElementTovisible(mydata);
		 Thread.sleep(2000);
		 //Select dropdown=new Select(mydata);
		 Thread.sleep(3000);
		mydata.click();
		 System.out.println("Tommy contact is displayed");
		 Thread.sleep(10000);
		 quitbrowser();


	}

}
