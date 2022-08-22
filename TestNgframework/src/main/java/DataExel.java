import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExel {
	public static  void ExelDtata() throws IOException
	{
		File file = new File("D:\\Workspace\\\\TestNgframework\\\\src\\\\New Microsoft Excel Worksheet.xlsx");
			FileInputStream Fis = new FileInputStream (file);
			
			XSSFWorkbook book = new XSSFWorkbook (Fis);
			XSSFSheet sheet= book.getSheetAt(0); 
			int row = sheet.getPhysicalNumberOfRows();
			System.out.println(row);
			int coulmn= sheet.getRow(0).getLastCellNum();
			System.out.println(coulmn);
			

			String [] [] arry= new String [row-1][ coulmn];
			
	for (int i=0;i<row-1;i++)
	{
		for (int j=0;j< coulmn;j++)
		{
			arry[i][j]=  sheet.getRow(i+1).getCell(j).getStringCellValue();
		}
	}
			for (String [] d:arry) {
		System.out.println(Arrays.toString(d));	
		
			}
		
		
		
		//"D:\Workspace\Rushi\TestNgframework\src\main\java\New Microsoft Excel Worksheet.xlsx"
	}

	public static void main(String[] args) throws IOException {
		ExelDtata() ;
	}

}
