package Features_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters1 {
	
	WebDriver  driver;
	@Parameters({"url","id","pass"})
	@Test
	public void paraeter (String url,String id, String pass)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get(url);
		
		driver.findElement(By.xpath("//form[@class='navbar-form pull-right']//input[@name='span2' ]")).sendKeys(id);;
		driver.findElement(By.xpath("//form[@class='navbar-form pull-right']//input[@name='password' ]")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
	}

		
}
