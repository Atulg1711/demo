package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(Listners_class.class)
public class MethodClass extends  BaseUtil{
	
//	@Test
//	public void  OrnageHrm2() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
	
	@Test
	public void  OrnageHrm() {
		Invokemethod();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(false);
	}
	

	@Test
	public void  OrnageHrm1() {
		
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).isDisplayed();
		Assert.assertTrue(false);
	}

	
}
