package SalesForceProject.SalesForceProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase37 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadInputdata();launchbrowser("ch");
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
		WebElement time=driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
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
		WebElement endtimetext=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		waitForPageElementTovisible(endtimetext);
		Thread.sleep(2000);
		endtimetext.click();
		WebElement endtime=driver.findElement(By.xpath("//div[@id='timePickerItem_38']"));
		waitForPageElementTovisible(endtime);
		Thread.sleep(2000);
		endtime.click();
		WebElement recurrence=driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		waitForPageElementTovisible(recurrence);
		Thread.sleep(2000);
		recurrence.click();
		WebElement weeklyradio=driver.findElement(By.xpath("//input[@id='rectypeftw']"));
		waitForPageElementTovisible(recurrence);
		Thread.sleep(2000);
		weeklyradio.click();
		WebElement recurrenceEnddate=driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		waitForPageElementTovisible(recurrenceEnddate);
		Thread.sleep(2000);
		recurrenceEnddate.click();
		Thread.sleep(10000);
		WebElement nextmonth=driver.findElement(By.xpath("//img[contains(@class,'calRight')]"));
		waitForPageElementTovisible(nextmonth);
		Thread.sleep(2000);
		nextmonth.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,10000)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement next2weeksdate=driver.findElement(By.xpath("//td[contains(text(),'14')]"));
		waitForPageElementTovisible(next2weeksdate);
		Thread.sleep(10000);
		next2weeksdate.click();
		//input[@id='reminder_select_check']
		WebElement reminderuncheck=driver.findElement(By.xpath("//input[@id='reminder_select_check']"));
		waitForPageElementTovisible(reminderuncheck);
		Thread.sleep(10000);
		reminderuncheck.click();
		WebElement save=driver.findElement(By.xpath("(//input[@name='save'])[2]"));
		waitForPageElementTovisible(save);
		Thread.sleep(5000);
		save.click();
		WebElement thismonthview=driver.findElement(By.xpath("//select[@id='tasklist_mode']"));
		waitForPageElementTovisible(thismonthview);
		Thread.sleep(2000);
		Select dropdown=new Select(thismonthview);
		//thismonthview.click();
		dropdown.selectByIndex(6);
		Thread.sleep(10000);
		quitbrowser();



	}

}
