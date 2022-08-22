package For_Data_Provider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider {

	WebDriver driver;
	
	@Test(priority = 1, dataProvider = "dataprovider")
	
	public void method(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(url);

	}

	@Test(priority = 2, dataProvider = "ExelDtata")
	public void method1(String username, String pass) {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

	@DataProvider
	public Object[][] dataprovider() {
		
		Object[][] data = new Object[2][1];
		
		data[0][0] = "https://opensource-demo.orangehrmlive.com/";

		data[1][0] = "https://opensource-demo.orangehrmlive.com/";

		return data;
	}

	@DataProvider
	public String[][] ExelDtata() throws IOException {
		
		File file = new File("D:\\Workspace\\\\TestNgframework\\\\src\\\\New Microsoft Excel Worksheet.xlsx");
		
		FileInputStream Fis = new FileInputStream(file);
		
		XSSFWorkbook book = new XSSFWorkbook(Fis);
		
		XSSFSheet sheet = book.getSheetAt(0);
		
		int row = sheet.getPhysicalNumberOfRows();
		
		System.out.println(row);
		
		int coulmn = sheet.getRow(0).getLastCellNum()
				;
		System.out.println(coulmn);

		String[][] arry = new String[row - 1][coulmn];

		
		for (int i = 0; i < row - 1; i++) {
			
			for (int j = 0; j < coulmn; j++) {
				
				arry[i][j] = sheet.getRow(i + 1).getCell(j).getStringCellValue();
			}
		}
		return arry;

	}

}
