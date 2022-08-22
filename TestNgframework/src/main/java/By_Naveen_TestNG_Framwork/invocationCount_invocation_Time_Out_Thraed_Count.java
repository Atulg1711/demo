package By_Naveen_TestNG_Framwork;

import java.awt.Desktop.Action;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invocationCount_invocation_Time_Out_Thraed_Count {

	WebDriver driver;

	@Test (invocationCount=5)
	public void method() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://randomuser.me/");
		driver.manage().window().maximize();
	//	System.out.println(driver.findElement(By.xpath("//p[@id='user_value']"))+"<---- user name");
		Actions act= new Actions (driver);
		act.moveToElement(driver.findElement(By.xpath("//ul[@class='values_list horizontal_center']/child::li[1]"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//ul[@class='values_list horizontal_center']/child::li[2]"))).build().perform();
		System.out.println(driver.findElement(By.xpath("//p[@id='user_value']")));
		
		List<WebElement> data= driver.findElements(By.xpath("//p[@id='user_value']"));
		for (WebElement d:data)
		{
			System.out.println(d);
		}
		

	}
}
