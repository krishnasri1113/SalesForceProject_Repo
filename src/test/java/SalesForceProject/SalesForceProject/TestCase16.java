package SalesForceProject.SalesForceProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase16  extends BrowserUtility{

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
		/* WebElement windowclose=driver.findElement(By.xpath("tryLexDialogX"));
		 windowclose.click();
		 */
		 
		 WebElement newopt=driver.findElement(By.xpath("//input[contains(@value,'New')]"));
		 waitForPageElementTovisible(newopt);
		 Thread.sleep(3000);
		 newopt.click();
		 WebElement Optname=driver.findElement(By.xpath("//input[@id='opp3']"));
		 waitForPageElementTovisible(Optname);
		 Thread.sleep(3000);
		 Optname.sendKeys(optname);
		 WebElement accname1=driver.findElement(By.xpath("//input[@id='opp4']"));
		 waitForPageElementTovisible(accname1);
		  Thread.sleep(3000);
		 accname1.sendKeys(accountname);
	WebElement closedate=driver.findElement(By.xpath("//input[@id='opp9']"));
				 waitForPageElementTovisible(closedate);
				 Thread.sleep(3000);
		 closedate.click();
	//WebElement date=driver.findElement(By.xpath("//a[@class='calToday']"));
		 WebElement date=driver.findElement(By.xpath("//td[contains(text(),'27')]"));
		 waitForPageElementTovisible(date);
		Thread.sleep(3000);
		date.click();
		WebElement stage=driver.findElement(By.xpath("//select[@id='opp11']"));
		 waitForPageElementTovisible(stage);
		Thread.sleep(3000);
		Select dropdown=new Select(stage);
		dropdown.selectByIndex(3);
		WebElement leadsource=driver.findElement(By.xpath("//select[@id='opp6']"));
		 waitForPageElementTovisible(leadsource);
		Thread.sleep(3000);
		Select dropdown1=new Select(leadsource);
		dropdown1.selectByIndex(1);
		WebElement primarycamp=driver.findElement(By.xpath("//input[@id='opp17']"));
		 waitForPageElementTovisible(primarycamp);
		Thread.sleep(3000);
		primarycamp.sendKeys("selinum");
		//div[contains(@class,'pbHeader')]//input[1]
		WebElement save=driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]"));
		 waitForPageElementTovisible(save);
		Thread.sleep(3000);
		save.click();
		System.out.println("New oppurtunity  page is displayed with  oppurtunity deatils");
		Thread.sleep(10000);
		quitbrowser();
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
