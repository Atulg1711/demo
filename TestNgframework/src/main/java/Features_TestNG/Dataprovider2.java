package Features_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider2 {
	WebDriver driver;

	@Test(dataProvider = "data1")
	public void method(String User, String pass, String empl, String id) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//input[@class='ac_input inputFormatHint']")).sendKeys(empl);
		driver.findElement(By.xpath("//input[@class='inputFormatHint']")).sendKeys(id);
	}
	//// input[@class='ac_input inputFormatHint']

	@DataProvider
	public Object[][] data1() throws IOException {
		File file = new File("D:\\Workspace\\Rushi\\TestNgframework\\src\\main\\java\\Features_TestNG\\Exel.xlsx");
		FileInputStream Fis = new FileInputStream(file);
		// "D:\Workspace\Rushi\TestNgframework\src\main\java\Features_TestNG\Exel.xlsx"
		XSSFWorkbook book = new XSSFWorkbook(Fis);

		XSSFSheet sheet = book.getSheetAt(0);

		int row = sheet.getPhysicalNumberOfRows();

		System.out.println(row);

		int coulmn = sheet.getRow(0).getLastCellNum();
		System.out.println(coulmn);

		Object[][] arry = new Object[row - 1][coulmn];

		for (int i = 0; i < row - 1; i++) {

			for (int j = 0; j < coulmn; j++) {

				DataFormatter df = new DataFormatter();
				

				arry[i][j] =  df.formatCellValue(sheet.getRow(i +1).getCell(j));z//sheet.getRow(i +1).getCell(j).getStringCellValue();
			}
		}
		return arry;
		/*
		 * FileInputStream fis = new FileInputStream(file); XSSFWorkbook book = new
		 * XSSFWorkbook(fis); XSSFSheet sheet= book.getSheetAt(0);
		 * 
		 * int row = sheet.getPhysicalNumberOfRows(); int colum=
		 * sheet.getRow(0).getLastCellNum(); Object [][] arr= new Object[row-1][colum];
		 * for (int i=0;i<row-1;i++) { for (int j=0;j<colum;j++) {
		 * arr[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
		 * 
		 * 
		 * } } return arr;
		 */
	}

}
//"D:\Workspace\Rushi\TestNgframework\src\main\java\Features_TestNG\Exel.xlsx"