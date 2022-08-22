package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Assertion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		String str= driver.getTitle();
		String str2="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\r\n"
				+ "";
		Assert.assertEquals(str, str2);
		//https://www.amazon.in/
	}

}
