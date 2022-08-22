package By_Naveen_TestNG_Framwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial1 {
	WebDriver driver;

	@BeforeTest
	public void setpropery() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		// https://www.google.com/

	driver.manage().window().maximize();

	}
	

	@Test(priority=1,groups="rushi")
	public void Title() {

		driver.getTitle();
		System.out.println(driver.getTitle());
		String handle = driver.getWindowHandle();
		System.out.println(handle+"------------>handle");
	}
	
	@Test(priority=1,groups="atul")
	public void logo() {

		WebElement logo = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
	boolean i= logo.isDisplayed();
	
	Assert.assertTrue(true);
	}
	
	@Test(priority=1,groups="rushi")
	public void input() {

		WebElement input = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		input.sendKeys("rushi");

	}
	
	//img[@class="lnXdpd"]
////input[@class="gLFyf gsfi"]
	@AfterMethod
	public void end() {

		driver.close();;
	}

}
