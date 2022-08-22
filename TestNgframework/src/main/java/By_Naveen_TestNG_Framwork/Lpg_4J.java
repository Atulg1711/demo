package By_Naveen_TestNG_Framwork;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lpg_4J {
	static WebDriver driver;

	static Logger logger = Logger.getLogger(" Lpg_4J");

	public static void method() {
		DOMConfigurator.configure("Log4j.xml");

		logger.info("get window handle");
		driver.getWindowHandle();
	}

	public static void main(String[] args) {

//		Logger logger= 	Logger.getLogger(" Lpg_4J");
		DOMConfigurator.configure("Log4j.xml");
		// PropertyConfigurator.configure("log4j.properties");
		logger.info("webdriver invoke");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		logger.info("enter the ggogle name");
		driver.get("https://google.com");
		logger.info("Find element and pass the value test");
		driver.findElement(By.name("q")).sendKeys("test", Keys.ENTER);
		logger.getName();
		System.out.println(driver.getTitle());
		method();
		driver.quit()

		;

	}
}
