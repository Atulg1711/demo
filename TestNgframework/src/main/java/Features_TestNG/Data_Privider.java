package Features_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Privider {
	
	WebDriver driver;
	
	
	
	@Test(dataProvider="data")
	public void method (String User,String pass)
	
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		////input[@id='btnLogin']
	}

	
	
	
	
	
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] arr= new Object[2][2];
		arr[0][0]="Admin";
		arr[0][1]=	"admin123"	;
		
		arr[1][0]="Admin";
		arr[1][1]=	"admin123"	;
		return arr;
		
	}

}
