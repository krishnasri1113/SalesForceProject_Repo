package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase28 extends BrowserUtility {

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
		 WebElement mydata=driver.findElement(By.xpath("//select[@name='fcf']"));
		 waitForPageElementTovisible(mydata);
		 Thread.sleep(2000);
		 Select dropdown=new Select(mydata);
	     dropdown.selectByIndex(2);
		 System.out.println("My contacts dropdownlist is diplayed");
		 Thread.sleep(10000);
		 quitbrowser();

	}

}
