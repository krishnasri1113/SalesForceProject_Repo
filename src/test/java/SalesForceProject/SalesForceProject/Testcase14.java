package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase14  extends BrowserUtility{

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
			WebElement acountlastactivity=driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
			waitForPageElementTovisible(acountlastactivity);
			Thread.sleep(3000);
			acountlastactivity.click();
			WebElement datefield=driver.findElement(By.xpath("//img[@id='ext-gen148']"));
		    waitForPageElementTovisible(datefield);
			Thread.sleep(3000);
			datefield.click();
			WebElement createddate=driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
			waitForPageElementTovisible(createddate);
			Thread.sleep(3000);
			createddate.click();
			WebElement from=driver.findElement(By.xpath("//img[@id='ext-gen152']"));
			waitForPageElementTovisible(from);
		     Thread.sleep(3000);
		     from.click();
		     //WebElement fromdate=driver.findElement(By.xpath("//td[@class='x-date-active x-date-today x-date-selected']"));
		     //xpath for selecting today date todaty is the button
		     WebElement todaydate=driver.findElement(By.xpath("//table[@id='ext-comp-1112']"));
			waitForPageElementTovisible(todaydate);
		     Thread.sleep(3000);
		     todaydate.click();
		     WebElement save=driver.findElement(By.xpath("//table[@id='saveReportBtn']"));
				waitForPageElementTovisible(save);
			     Thread.sleep(3000);
			     save.click();
			   
			     WebElement Reportname=driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
					waitForPageElementTovisible(Reportname);
				     Thread.sleep(3000);
				     Reportname.sendKeys(reportname);
				 WebElement reportuniqname=driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
						waitForPageElementTovisible(reportuniqname);
					     Thread.sleep(3000);
					     //reportname.click();
					     reportuniqname.click();
					WebElement saveandrunreport=driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']"));
					waitForPageElementTovisible(saveandrunreport);
						     Thread.sleep(3000);
						     saveandrunreport.click();
						     System.out.println("Report page is displayed");
						     Thread.sleep(10000);
						     quitbrowser();
						    
		

	}

}
