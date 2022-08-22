package By_Naveen_TestNG_Framwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Exel_Reader {
	@DataProvider
	public static String [][]  Exel_Reader() throws IOException
	{
	
	File file = new File ("D:\\Workspace\\\\TestNgframework\\\\src\\\\New Microsoft Excel Worksheet.xlsx");
	
	FileInputStream  Fis = new FileInputStream (file);
	
	XSSFWorkbook  book= new XSSFWorkbook  (Fis );
	
	XSSFSheet sheet= book.getSheetAt(0);
	
	
	int rowno= sheet.getPhysicalNumberOfRows();
	System.out.println(rowno);
	int column=sheet.getRow(0).getLastCellNum();
	System.out.println(column);
	
	
String [][] data = new String [rowno-1][2];
	for (int i=0;i<rowno-1;i++)
	{ 
		for(int j= 0;j<column;j++)
		{
			data [i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
		}
	}
			
for (String [] Data:data)
	{
		System.out.println(Arrays.toString(Data));
	}
	
	return data;
	}
	
	
	//"D:\Workspace\Rushi\TestNgframework\Resource\New Microsoft Excel Worksheet.xlsx"

	public static void main(String[] args) throws IOException {

		
		Exel_Reader();
		
		}
	
	

}
//"D://h.txt"