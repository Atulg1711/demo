import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configreader {

	
	Properties pro = new  Properties();
	
	public void method() throws Throwable
	{
	
	FileInputStream file = new	FileInputStream("src/main/java/sha.java");
	pro.load(file);
	}
	
	public static void main(String[] args) 
	{
		System.out.println();
		
	}
}
