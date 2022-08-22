package By_Naveen_TestNG_Framwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_execution {
	WebDriver driver;

	@Test(dataProvider = "dataa")
	public void method(String name, String pass) {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://classic.freecrm.com/index.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//body/div[2]/div[1]/div[3]/form[1]/div[1]/input[1]")).sendKeys(name);
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[3]/form[1]/div[1]/input[2]")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();

	}

	@DataProvider(parallel = true)
	public Object[][] dataa() throws IOException {
		File file = new File("D:\\Workspace\\Rushi\\TestNgframework\\src\\main\\java\\Freecrm.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int row = sheet.getPhysicalNumberOfRows();
		System.out.println(row);
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println(column);

		Object[][] data = new Object[row + 1][column];
		for (int i = 0; i < row - 1; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).getStringCellValue();
			}
		}

		return data;

		// "D:\Workspace\Rushi\TestNgframework\src\main\java\Freecrm.xlsx"

	}

	//

}
