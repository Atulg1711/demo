package By_Naveen_TestNG_Framwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import freemarker.template.SimpleDate;
import io.github.bonigarcia.wdm.WebDriverManager;

public class extent_Dataprovider {
	WebDriver driver;

	ExtentHtmlReporter htmlrep;
	ExtentReports Exrepo;
	ExtentTest test;

	@BeforeTest
	public void report() {
		String date= new SimpleDateFormat("yyyyMMDDHHmmss").format(new Date());
		htmlrep = new ExtentHtmlReporter(date+"Report1234.html");
		htmlrep.config().setDocumentTitle("new report");
		htmlrep.config().setReportName("new report");

		Exrepo = new ExtentReports();
		Exrepo.attachReporter(htmlrep);
		Exrepo.setSystemInfo("host", "localHost");
		Exrepo.setSystemInfo("user", "Rushi");

	}

	@AfterTest
	public void teardown() {
		Exrepo.flush();
	}

	@BeforeMethod
	public void invoke() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
	}

	@Test
	public void homepage() {
		test=Exrepo.createTest("verify home page");
		boolean d = driver.findElement(By.xpath("//a[@class='navbar-brand']//img[1]")).isDisplayed();
		Assert.assertTrue(d);
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRM  - CRM software for customer relationship management, sales, and support.");

	}
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException
	{
		if (result.getStatus()==result.FAILURE)
		{
			test.log(Status.FAIL, "test is fail"+result.getName());
			
			test.log(Status.FAIL, "test is fail"+ result.getThrowable());
			extent_Dataprovider.getscreenshot(driver, result.getTestName());
				test.addScreenCaptureFromPath("D:\\\\Workspace\\\\Rushi\\\\New folder\\\\photo.jpg");
			
		}
		else if (result.getStatus()==result.SUCCESS)
		{
			test.log(Status.PASS,"test is pass"+result.getName());
			
		}
		else if (result.getStatus()==result.SKIP)
		{
			test.log(Status.SKIP,"test is skip"+result.getName());
		
			
		}
	}
	@Test (dataProvider="data")
	public void loginpage(String id,String pass) {
		test= Exrepo.createTest("loginpage");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(id);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		 driver.findElement(By.xpath("//input[@class='btn btn-small']")).sendKeys(Keys.ENTER);
		
	}
		
		@DataProvider
		public String [][] data() throws IOException
		
		{
			File file = new File("D:\\Workspace\\Rushi\\TestNgframework\\src\\main\\java\\New Microsoft Excel Worksheet.xlsx");
			FileInputStream fis = new 	FileInputStream(file);
			XSSFWorkbook book= new	XSSFWorkbook(fis);
			XSSFSheet sheet= book.getSheetAt(0);
			int row = sheet.getPhysicalNumberOfRows();
			int column = sheet.getRow(0).getLastCellNum();
			String [][] data=  new String [row-1][column] ;
					for (int i=0;i<row-1;i++)
					{
						for(int j=0;j<column;j++)
						{
							data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
						}
					}
			
			return data;
			
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
	 

		
//		
//		public static void screenshot(WebDriver driver) throws IOException
//		{
//			TakesScreenshot ts=  (TakesScreenshot)driver;
//			
//			File dest= ts.getScreenshotAs(OutputType.FILE);
//			
//			File source= new File("D:\\\\Workspace\\\\Rushi\\\\New folder\\\\photos12.jpg");
//			FileUtils.copyFile(source, dest);
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


