package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase4A  extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		WebElement forgotpassword=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		waitForPageElementTovisible(forgotpassword);
		Thread.sleep(3000);
		forgotpassword.click();
		WebElement enteremail=driver.findElement(By.xpath("//input[@id='un']"));
		waitForPageElementTovisible(enteremail);
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[@id='un']"));
		enteremail.sendKeys(username);
		WebElement next = driver.findElement(By.xpath("//input[@value='Continue']"));
		waitForPageElementTovisible(next);
		Thread.sleep(3000);
		next.click();
		WebElement checkyouremail=driver.findElement(By.xpath("//h2[@id='header']"));
		waitForPageElementTovisible(checkyouremail);
		String actualresult=checkyouremail.getText();
		System.out.println("Actual Result: "+actualresult);
		String expectedresult="Check Your Email";
		if(expectedresult.equals(actualresult))
		{
			System.out.println("Testcase passed");
		}
		else
		{
			System.out.println("Testcase failed");
		}
		Thread.sleep(10000);
		quitbrowser();
		
		

	}

}
