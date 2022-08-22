package By_Naveen_TestNG_Framwork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_shot   {
public static WebDriver driver;

	public static void main(String[] args) throws IOException

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://Google.com");
		Util_for_Screeshot.Screenshot("rushiiiii1",driver);
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("rushi");

		Util_for_Screeshot.Screenshot("rushiiii2",driver);
		driver.quit();

	}
}
