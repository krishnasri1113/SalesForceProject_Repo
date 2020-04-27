package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase24 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		loginsalesforce();
		WebElement leadstab=driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
		 waitForPageElementTovisible(leadstab);
		 Thread.sleep(2000);
		 leadstab.click();
		 WebElement  createnew=driver.findElement(By.xpath("//input[contains(@value,'New')]"));
		 waitForPageElementTovisible(createnew);
		 Thread.sleep(2000);
		 createnew.click();
		 WebElement  editlastname=driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		 waitForPageElementTovisible(editlastname);
		 Thread.sleep(2000);
		 
		 editlastname.sendKeys(leadlastname);
		WebElement  company=driver.findElement(By.xpath("//input[@id='lea3']"));
		 waitForPageElementTovisible(company);
		 Thread.sleep(2000);
		 company.sendKeys(leadcompany);
		 WebElement  save=driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]"));
		 waitForPageElementTovisible(save);
		 Thread.sleep(2000);
		 save.click();
		 
		 
		 
		 
		 
		 

	}

}
