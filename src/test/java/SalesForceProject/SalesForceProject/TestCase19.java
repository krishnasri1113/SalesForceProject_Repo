package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase19 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	     loadInputdata();
	     launchbrowser("ch");
	     LaunchApp();
	     SendCredentials();
	     loginsalesforce();
	    WebElement opurtunities=driver.findElement(By.xpath(" //li[@id='Opportunity_Tab']"));
		 waitForPageElementTovisible(opurtunities);
		 Thread.sleep(3000);
		 opurtunities.click();
		//select[@id='quarter_q']
		 WebElement interval=driver.findElement(By.xpath("//select[@id='quarter_q']"));
		 waitForPageElementTovisible(interval);
		 Thread.sleep(3000);
		 Select dropdown=new Select(interval);
		 dropdown.selectByIndex(0);
		 WebElement include=driver.findElement(By.xpath("//select[@id='open']"));
		 waitForPageElementTovisible(include);
		 Thread.sleep(3000);
		 Select dropdown1=new Select(include);
		 dropdown1.selectByIndex(1);
		//input[@value='Run Report']
		 WebElement runreport=driver.findElement(By.xpath("//input[@value='Run Report']"));
		 waitForPageElementTovisible(runreport);
		 Thread.sleep(3000);
		 runreport.click();
		 System.out.println("Report Page with the Opportunities that satisfies the search criteria is displayed");
		 Thread.sleep(10000);
		 quitbrowser();
		 
		 

	}

}
