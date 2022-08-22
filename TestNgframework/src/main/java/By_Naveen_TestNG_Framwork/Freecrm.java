package By_Naveen_TestNG_Framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Freecrm {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

	}
	@Test
	public void url()
	{driver.get("https://classic.freecrm.com/login.cfm");
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void Login()
	{ WebElement user=driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/input[1]"));
	System.out.println(user.isDisplayed());
	 WebElement pass=	driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/input[2]"));
		System.out.println(pass.isDisplayed());
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	}
	
	

}
