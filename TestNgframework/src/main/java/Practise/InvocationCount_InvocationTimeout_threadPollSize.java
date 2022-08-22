package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount_InvocationTimeout_threadPollSize {
	@Test(invocationCount=3,invocationTimeOut=10000,threadPoolSize=2)
	public void method()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
	driver.get("https://randomuser.me/");
	System.out.println(driver.findElement(By.id("user_value")).getText());
				
	}
	
	
	
}
