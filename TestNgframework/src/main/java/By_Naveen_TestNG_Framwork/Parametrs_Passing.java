package By_Naveen_TestNG_Framwork;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametrs_Passing {
	WebDriver driver;

	@Parameters({ "url", "id", "password" })
	@Test
	public void method1(String url, String id, String password) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(id);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		;

	}

	// <parameter name = "url" value="https://opensource-demo.orangehrmlive.com/" />
}

//<parameter name = "url" value="https://opensource-demo.orangehrmlive.com/"   />
// <parameter name = "password" value="admin123"   />