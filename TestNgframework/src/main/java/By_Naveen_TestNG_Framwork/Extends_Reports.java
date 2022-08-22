package By_Naveen_TestNG_Framwork;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extends_Reports {
static public WebDriver  driver;
	public static void main(String[] args) {
		String date = new SimpleDateFormat().format(new Date());
		System.out.println(date);
		ExtentHtmlReporter  extendhtml= new 	ExtentHtmlReporter ("extend1334.html");
		ExtentReports  exte= new ExtentReports ();
		exte.attachReporter( extendhtml);
		ExtentTest test1 = exte.createTest("google test", "fetch th adat");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		 test1.log(Status.INFO,"test is pass");
		driver.findElement(By.name("q")).sendKeys("test");
		 test1.pass("test is pss");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		//  test1.pass("test is pss");
		 driver.close();
		
		 exte.flush();
		
		

	}

}
