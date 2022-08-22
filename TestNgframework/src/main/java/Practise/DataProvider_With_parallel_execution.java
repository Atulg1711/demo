package Practise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_With_parallel_execution {
	
	@Test (dataProvider="login")
	public void dataprovider(String username,String pass)
	{
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(pass);
	driver.findElement(By.id("btnLogin")).click();
	}

	
	@DataProvider(parallel=true)
	public  Object[][]  login() {
		
		Object[][] data = new Object[6][2] ;
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		
		data[2][0]="Admin";
		data[2][1]="admin123";
		
		
		data[3][0]="Admin";
		data[3][1]="admin1235";
		
		data[4][0]="Admin";
		data[4][1]="admin123";
		
		data[5][0]="Admin";
		data[5][1]="admin1234";
		return data;
		
	}
}
