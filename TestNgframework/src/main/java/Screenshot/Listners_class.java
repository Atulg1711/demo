package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.io.IOException;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;

import By_Naveen_TestNG_Framwork.Util_for_Screeshot;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Listners_class extends BaseUtil implements ITestListener {
	BaseUtil obj;
	@Override
	public void onTestStart(ITestResult result) {
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result)  {
		System.out.println("fail test case");
		 try {
			Screenshot(result.getMethod().getMethodName()) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void Screenshot(ITestNGMethod method) {
		// TODO Auto-generted method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}

}
