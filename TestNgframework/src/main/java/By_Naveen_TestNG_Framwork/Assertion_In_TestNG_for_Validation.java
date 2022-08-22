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

public class Assertion_In_TestNG_for_Validation {

	
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
	@Test
	public void Title() {

		driver.getTitle();
		System.out.println(driver.getTitle());
		String Title= driver.getTitle();
		Assert.assertEquals(Title, "Google","title is not maaaatch");
		
	}
	
	@Test
	public void logo() throws InterruptedException {

		WebElement logo = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("testing");
	System.out.println(	logo.isDisplayed());
	Thread.sleep(6000);
	
	}
	@AfterMethod
	public void end() {
System.out.println("method end");
	}
}
