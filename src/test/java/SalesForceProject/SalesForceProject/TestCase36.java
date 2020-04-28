package SalesForceProject.SalesForceProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase36 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		loginsalesforce();
		WebElement home=driver.findElement(By.xpath("//li[@id='home_Tab']"));
		waitForPageElementTovisible(home);
		Thread.sleep(2000);
		home.click();
		WebElement caltoday=driver.findElement(By.xpath("//td[contains(@class,'calToday')]"));
		waitForPageElementTovisible(caltoday);
		Thread.sleep(2000);
		caltoday.click();
		WebElement time=driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
		waitForPageElementTovisible(time);
		Thread.sleep(5000);
		time.click();
		//img[@class='comboboxIconOn']
		Thread.sleep(5000);
		WebElement subjecticon=driver.findElement(By.xpath("//div[contains(@class,'requiredInput')]/a[1]"));
		waitForPageElementTovisible(subjecticon);
		Thread.sleep(2000);
		subjecticon.click();
		//switching to next window
		List<String> noOfwindows=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(noOfwindows.get(1));
		WebElement other=driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		waitForPageElementTovisible(other);
		Thread.sleep(2000);
		other.click();
		Thread.sleep(3000);
		//switching to current window
		driver.switchTo().window(noOfwindows.get(0));
		WebElement endtimetext=driver.findElement(By.xpath("//input[@value='9:00 PM']"));
		waitForPageElementTovisible(endtimetext);
		Thread.sleep(2000);
		endtimetext.click();
		WebElement endtime=driver.findElement(By.xpath("//div[@id='timePickerItem_44']"));
		waitForPageElementTovisible(endtime);
		Thread.sleep(2000);
		endtime.click();
		WebElement save=driver.findElement(By.xpath("(//input[@name='save'])[1]"));
		waitForPageElementTovisible(save);
		Thread.sleep(2000);
		save.click();
		 Thread.sleep(10000);
		 quitbrowser();
		
		
		

	}

}
