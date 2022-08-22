package By_Naveen_TestNG_Framwork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util_for_Screeshot {
	public static WebDriver driver;
	public static void Screenshot(String files, WebDriver driver ) throws IOException {
	
	
//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File target= new File("D:\\Screenshot_TestNg\\rushi.png");
//	System.out.println(target.exists());
//	FileUtils.copyFile(source, target);
	
	//File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot ts =((TakesScreenshot)driver);
		
	File source =ts.getScreenshotAs(OutputType.FILE);
	File target=new File("D:\\\\Screenshot_TestNg\\\\"+files+".png");
	FileUtils.copyFile(source, target );
	
	System.out.println("rusj");
	
	
//"D:\Screenshot_TestNg"
}
	
}
