package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil {
	public static WebDriver driver;
	
	@BeforeTest
	public  void Invokemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}//@AfterMethod
	public  void Teardown()
	{
		//WebDriverManager.chromedriver().setup();
		//driver.close();;
	}
	
	public void Screenshot(String file) throws IOException
	{
		System.out.println("rushikesh take screenshot");
		 		
		
		TakesScreenshot ts =((TakesScreenshot)driver);
	
		File source =ts.getScreenshotAs(OutputType.FILE);
	File target=new File("D:\\Screenshot_TestNg\\New folder\\"+file+"atul.jpg");
	FileUtils.copyFile(source, target );
		
				//"D:\Screenshot_TestNg\New folder"
	}
}
