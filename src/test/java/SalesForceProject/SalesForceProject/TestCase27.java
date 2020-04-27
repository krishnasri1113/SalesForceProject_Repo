package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase27  extends BrowserUtility{

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
		 WebElement data=driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
		 waitForPageElementTovisible(data);
		 Thread.sleep(2000);
		 Select dropdown=new Select(data);
		 Thread.sleep(3000);
		 dropdown.selectByVisibleText("Recently Created");
		 Thread.sleep(10000);
		 quitbrowser();

	}

}
