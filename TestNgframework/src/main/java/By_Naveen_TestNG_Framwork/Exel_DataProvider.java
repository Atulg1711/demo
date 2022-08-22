package By_Naveen_TestNG_Framwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exel_DataProvider {
	WebDriver driver;

	@Test(dataProvider = "dataprovider")
	public void method1(String id, String password) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get(url);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(id);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

	@DataProvider
	public String[][] dataprovider() throws IOException {

		File file = new File("D:\\Workspace\\\\TestNgframework\\\\src\\\\New Microsoft Excel Worksheet.xlsx");

		FileInputStream Fis = new FileInputStream(file);

		XSSFWorkbook book = new XSSFWorkbook(Fis);

		XSSFSheet sheet = book.getSheetAt(0);
		int rowno = sheet.getPhysicalNumberOfRows();
		System.out.println(rowno);
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println(column);

		String[][] data = new String[rowno - 1][column];
		for (int i = 0; i < rowno - 1; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).getStringCellValue();
			}
		}

//	for (String [] Data:data)
//	{
//		System.out.println(Arrays.toString(Data));
//	}

		return data;
	}

}
