package By_Naveen_TestNG_Framwork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowsing {

	public WebDriver driver;

	  @Parameters("browser")

	  @BeforeClass

	  // Passing Browser parameter from TestNG xml

	  public void beforeTest(String browser) {

	  // If the browser is Firefox, then do this

	  if(browser.equalsIgnoreCase("firefox")) {
		 
	//Initializing the firefox driver (Gecko)
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();	  

	  }else if (browser.equalsIgnoreCase("chrome")) { 

		  //Initialize the chrome driver
WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();

	  } 

	  // Enter the website address in the browser

	  driver.get("https://google.com"); 

	  }

	  // Once Before method is completed, Test method will start

	  @Test public void login() throws InterruptedException {

		driver.findElement(By.name("q")).sendKeys("test");

		}  

	  @AfterClass public void afterTest() {

			driver.quit();

		}

}
