package SalesForceProject.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://login.salesforce.com/");
		 WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
		 Thread.sleep(3000);
		 String username="krishnasri.d@salesforce.com";
		 email.sendKeys(username);
		 Thread.sleep(3000);
		 WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		 String Password="test@123";
		 password.sendKeys(Password);
		 WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		 Thread.sleep(3000);
		 login.click();
		 Thread.sleep(10000);
		 driver.quit();
		 System.out.println(System.getProperty("user.dir"));

	}

}
