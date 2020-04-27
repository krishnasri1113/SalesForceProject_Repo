package SalesForceProject.SalesForceProject;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase1 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.clear();
		System.out.println("Password  is Cleared");
	    WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		 waitForPageElementTovisible(login);
		 login.click();
	    String Expectedresult="Please enter your password.";
		 WebElement text=driver.findElement(By.xpath("//div[@id='error']"));
		 waitForPageElementTovisible(text);
		 String ActualResult=text.getText();
		 if(Expectedresult.equals(ActualResult))
		 {
			 System.out.println("Testcase Passed");
		 }
		 else
		 {
			 System.out.println("Testcase failed");
		 }
		 
		 Thread.sleep(10000);
		 quitbrowser();
		
	}	 
		
		

	}

