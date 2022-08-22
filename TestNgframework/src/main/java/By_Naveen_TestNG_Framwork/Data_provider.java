package By_Naveen_TestNG_Framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_provider {
	WebDriver driver;
	
	@Test(dataProvider="dataprovider")
	public  void method(String url,String username,String pass)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys( username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
}
	@DataProvider(parallel=true)
	public Object[] [] dataprovider()
	{
		 Object[] [] data= new Object[2][3];
		data[0] [0] ="https://opensource-demo.orangehrmlive.com/";
	    data[0] [1] ="Admin"; 
	    data [0] [2] = "admin123";
				
	    data[1] [0] ="https://opensource-demo.orangehrmlive.com/";
	    data[1] [1] ="Admin";
	    data[1] [2] ="admin124";
		return data;
	}
} 