package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase12 extends BrowserUtility {

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
			Thread.sleep(3000);
			WebElement viewselect=driver.findElement(By.xpath("//select[@id='fcf']"));
			Select dropdown=new Select(viewselect);
			Thread.sleep(3000);
			dropdown.selectByIndex(5);
			Thread.sleep(3000);
			WebElement Editview=driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]"));
			waitForPageElementTovisible(Editview);
			Thread.sleep(2000);
			Editview.click();
			Thread.sleep(2000);
			//WebElement editviewname=driver.findElement(By.xpath("//input[@value='sri account']"));
			WebElement editviewname1=driver.findElement(By.xpath("//input[@id='fname']"));
			waitForPageElementTovisible(editviewname1);
			Thread.sleep(2000);
			editviewname1.clear();
			editviewname1.sendKeys(editviewinaccount);
			//WebElement editviewuniqname=driver.findElement(By.xpath("//input[@value='sri_account']"));
			WebElement editviewuniqname1=driver.findElement(By.xpath("//input[@id='devname']"));
			waitForPageElementTovisible(editviewuniqname1);
			Thread.sleep(2000);
			editviewuniqname1.clear();
			editviewname1.click();
			editviewuniqname1.click();
			WebElement field=driver.findElement(By.xpath("//select[@id='fcol1']"));
			waitForPageElementTovisible(field);
			Select dropdown1=new Select(field);
			Thread.sleep(1000);
			dropdown1.selectByVisibleText("Account Name");;
			WebElement Operators=driver.findElement(By.xpath("//select[@id='fop1']"));
			waitForPageElementTovisible(Operators);
			Select dropdown2=new Select(Operators);
			Thread.sleep(1000);
			dropdown2.selectByVisibleText("contains");
			WebElement value=driver.findElement(By.xpath("//input[@id='fval1']"));
			waitForPageElementTovisible(value);
		    Thread.sleep(1000);
		    value.clear();
			value.sendKeys("ltd");
			WebElement save=driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]"));
			waitForPageElementTovisible(save);
			Thread.sleep(2000);
			save.click();
			System.out.println("new view is added in the account dropdown list after editing the old view");
			Thread.sleep(10000);
			quitbrowser();

	}

}
