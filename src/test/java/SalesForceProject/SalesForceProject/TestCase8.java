package SalesForceProject.SalesForceProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase8 extends BrowserUtility
{

	public static void main(String[] args) throws Exception {
		loadInputdata();
		launchbrowser("ch");
		LaunchApp();
		SendCredentials();
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		 waitForPageElementTovisible(login);
		 Thread.sleep(2000);
		 login.click();
		 WebElement label=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		 waitForPageElementTovisible(label);
		 Thread.sleep(2000);
		 String text=label.getText();
		 System.out.println(text+";"+" username found in the web page");
		 WebElement menu=driver.findElement(By.xpath("//div[@id='userNav']"));
		 waitForPageElementTovisible(menu);
		 Thread.sleep(2000);
		 menu.click();
		 WebElement developerconsole=driver.findElement(By.xpath("//a[contains(@class,'debugLogLink menuButtonMenuLink')]"));
		 waitForPageElementTovisible(developerconsole);
		 Thread.sleep(3000);
	       developerconsole.click();//Assuming clicking on this element brings out the new window
	       ArrayList<String> listofwindows=new ArrayList(driver.getWindowHandles());
	       Thread.sleep(5000);
	      driver.switchTo().window(listofwindows.get(1));
	      Thread.sleep(3000);
	      driver.close();
	      //Thread.sleep(3000);
	      //driver.switchTo().window(listofwindows.get(0));
			//Thread.sleep(3000);
	       /*for (String twohandle : driver.getWindowHandles()) 
	       {
	    	   Thread.sleep(3000);
	           driver.switchTo().window(twohandle);
	       }      */
		 //Thread.sleep(3000);
		 //driver.close();
		 Thread.sleep(5000);
		 quitbrowser();
		 
		

	}

}
