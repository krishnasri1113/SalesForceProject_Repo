package SalesForceProject.SalesForceProject;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
       static WebDriver driver=null;
        static String url,username,password,wrongusername,wrongpassword,lastname,postmessage,file,accountname,viewname,leadlastname,leadcompany,
       contacteditaccountname,contactlastnameedit,editviewinaccount,mergeaccountname,contactviewname,contactuniquename,optname,reportname;
   
       static void launchbrowser(String sbrowser)
       {
    	   if(sbrowser.startsWith("ch"))
    	   {
    		 WebDriverManager.chromedriver().setup();
    		 driver=new ChromeDriver();
    		 }
    	   else
    	   {
    		   System.out.println("you have not given browser type correctly");
    	   }
    	   driver.manage().window().maximize();
    	  driver.get("https://login.salesforce.com/");
       }
       static void waitForPageElementTovisible(WebElement elewait)
       {
    	   WebDriverWait wait=new WebDriverWait(driver,30);
    	   wait.until(ExpectedConditions.visibilityOf(elewait));
       }
       static void loadInputdata () {
    	   
    	   String spath=System.getProperty("user.dir")+"\\salesforcedetails.xls";
   		try
   		{
   			FileInputStream fi=new FileInputStream(spath);
   			HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
   			HSSFSheet myExcleSheet = myExcelBook.getSheet("userdetails");
   			HSSFRow row1 = myExcleSheet.getRow(0);
   			url=row1.getCell(1).getStringCellValue();
            HSSFRow row2 = myExcleSheet.getRow(1);
   			username=row2.getCell(1).getStringCellValue();
   			HSSFRow row3 = myExcleSheet.getRow(2);
   			password=row3.getCell(1).getStringCellValue();
   			HSSFRow row4=myExcleSheet.getRow(3);
   			wrongusername=row4.getCell(1).getStringCellValue();
   			HSSFRow row5=myExcleSheet.getRow(4);
   			wrongpassword=row5.getCell(1).getStringCellValue();
   			HSSFRow row6=myExcleSheet.getRow(5);
   			lastname=row6.getCell(1).getStringCellValue();
   			HSSFRow row7=myExcleSheet.getRow(6);
   			postmessage=row7.getCell(1).getStringCellValue();
   			HSSFRow row8=myExcleSheet.getRow(7);
   			file=row8.getCell(1).getStringCellValue();
   			HSSFRow row9=myExcleSheet.getRow(8);
   			accountname=row9.getCell(1).getStringCellValue();
   			HSSFRow row10=myExcleSheet.getRow(9);
   			viewname=row10.getCell(1).getStringCellValue();
   			HSSFRow row11=myExcleSheet.getRow(10);
   			leadlastname=row11.getCell(1).getStringCellValue();
   			HSSFRow row12=myExcleSheet.getRow(11);
   			leadcompany=row12.getCell(1).getStringCellValue();
   			HSSFRow row13=myExcleSheet.getRow(12);
   			contactlastnameedit=row13.getCell(1).getStringCellValue();
   			HSSFRow row14=myExcleSheet.getRow(13);
   			contacteditaccountname=row14.getCell(1).getStringCellValue();
   			HSSFRow row15=myExcleSheet.getRow(14);
   			editviewinaccount=row15.getCell(1).getStringCellValue();
   			HSSFRow row16=myExcleSheet.getRow(15);
   			mergeaccountname=row16.getCell(1).getStringCellValue();
   			HSSFRow row17=myExcleSheet.getRow(16);
   			contactviewname=row17.getCell(1).getStringCellValue();
   			HSSFRow row18=myExcleSheet.getRow(17);
   			contactuniquename=row18.getCell(1).getStringCellValue();
   			HSSFRow row19=myExcleSheet.getRow(18);
   			optname=row19.getCell(1).getStringCellValue();
   			HSSFRow row20=myExcleSheet.getRow(19);
   			reportname=row20.getCell(1).getStringCellValue();
   			


   		}
   		catch(Exception e)
   		{
   			System.out.println(e);
   		}
       }
       static void LaunchApp()  
       {
         driver.get(url);
		System.out.println("Salesforce  application page is displayed");
    	   
       }
       
       static void SendCredentials () {
	
			 WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
			 waitForPageElementTovisible(email);
			 email.sendKeys(username);
			 System.out.println("username is displayed in the username field");
			 WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
			 waitForPageElementTovisible(Password);
			 Password.sendKeys(password);
			 System.out.println("Passwors is displayed in the password field");
			 /*WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
			 waitForPageElementTovisible(login);
			 login.click();*/
       }
       static void loginsalesforce() 
       {
    	   WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
  		 waitForPageElementTovisible(login);
  		 //Thread.sleep(2000);
  		 login.click();
  		 
       }
       static void quitbrowser()
       {
    	   driver.quit();
       }

	}


