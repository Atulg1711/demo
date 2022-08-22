package By_Naveen_TestNG_Framwork;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG_Basic_Anotations {
	
	
	
	
//	set up system property for chrome-----------> BeforeSiutr
//	launch browser---------> Beforetest
//	login to application--------->Beforeclass
//	enter url--------->BeforeMethod
//	google Title Test--------->Test
//	logout from brwoser--------->Aftermethodr
//	Close the Browser--------->AfterClass
//	Delet cokies---------> Aftertest
	
	@BeforeSuite
	public  void  BeforeSiutr()
	{
	System.out.println("set up system property for chrome-----------> BeforeSiutr");
	
	}
	
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("launch browser---------> Beforetest");
	}
	
	@BeforeClass
	public  void Beforeclass()
	{
		System.out.println("login to application--------->Beforeclass");
	}
	@org.testng.annotations.BeforeMethod
	public  void BeforeMethod()
	{
		System.out.println("enter url--------->BeforeMethod");
	}
	@Test
	public  void Test()
	{
		System.out.println("google Title Test--------->Test");
	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("logout from brwoser--------->Aftermethodr");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("Close the Browser--------->AfterClass");
	}
	@AfterTest
	public  void Aftertest()
	{
		
		System.out.println("Delet cokies---------> Aftertest");
    }
	@AfterSuite
	public  void Aftersuit()
	{
		System.out.println("--------->  Aftersuit");
	}

	
	
	

}
