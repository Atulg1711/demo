package By_Naveen_TestNG_Framwork;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Report_TestNg_Pavan {

	ExtentHtmlReporter htmlreport;
	ExtentReports extereport;
	ExtentTest extetest;
	WebDriver driver;
	
	
	@BeforeTest
	public void extentreport()
	{
		String date= new  SimpleDateFormat().format(new Date());
		htmlreport= new 	ExtentHtmlReporter ("extend135.html");
		// htmlreport = new ExtentHtmlReporter (System.getProperty(("user.dir")+"/test-output/result1.html"));
		 htmlreport.config().setDocumentTitle("Extend report By pavan");
		 htmlreport.config().setReportName("Test Extent reoprt");
		 extereport = new ExtentReports();
		 extereport.attachReporter (htmlreport);
		 extereport.setSystemInfo("Hostname", "Loclahost");
		 extereport.setSystemInfo("TesterName", "Rushi");
		 
	}
	
	@AfterTest()
	public void endtest()
	{
		extereport.flush();
	}
	
	
	@BeforeMethod
	public void invoke()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
	}@Test
	public void Title()
	{
		 extetest = extereport.createTest("get title");
		 String Title= driver.getTitle();
		 Assert.assertEquals(Title,"OrangeHRM");
		
	}@Test
    public void Title1()
{
	 extetest = extereport.createTest("get title");
	 String Title= driver.getTitle();
	 Assert.assertEquals(Title,"OrangeHRM1");
	
}
	@Test
	public void Logo()
	{
		 extetest = extereport.createTest("Logo test");
		boolean data= driver.findElement(By.xpath("//div[@id='divLogo']//img[1]")).isDisplayed();
		Assert.assertTrue(data);
		
	}
	
	@AfterMethod
	public void teardown(ITestResult Result) throws IOException
	{
		if (Result.getStatus()==Result.FAILURE)
				{
			extetest.log(Status.FAIL,"test is fail"+Result.getName());
			
			extetest.log(Status.FAIL, "test is fali"+Result.getThrowable());
			
	 Extent_Report_TestNg_Pavan.getscreenshot(driver, Result.getTestName());
		extetest.addScreenCaptureFromPath("D:\\\\Workspace\\\\Rushi\\\\New folder\\\\photo.jpg");
				}
		else if (Result.getStatus()==Result.SUCCESS)
		{
			extetest.log(Status.PASS, "test is pass");
		}
				
	}
	
	public static void getscreenshot(WebDriver driver, String Screenshotname) throws IOException
	{
		String dataname = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot ts= ((TakesScreenshot)driver);
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		String desti= System.getProperty("user.dir"+"/screenshot/"+Screenshotname+dataname+".jpg");
		File destination= new File("D:\\Workspace\\Rushi\\New folder\\photo.jpg");
		FileUtils.copyFile(source, destination);
		//return desti;//"D:\Workspace\Rushi\New folder"
		
	}
 

}
