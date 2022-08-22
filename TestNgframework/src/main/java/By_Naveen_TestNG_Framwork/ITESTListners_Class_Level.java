package By_Naveen_TestNG_Framwork;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestTListners_Implementation.class)
public class ITESTListners_Class_Level {
	@Test 
	public static void Method1()
	{
		System.out.println("Method1");
		Assert.assertTrue(false);
	}
	@Test 
	public static void Method2()
	{
		System.out.println("Method2");
	}
	@Test 
	public static void Method3()
	{
		System.out.println("Method3");
		
	}
	@Test 
	public static void Method4()
	{
		System.out.println("Method4");
	}
	@Test (timeOut=1000)
	public static void Method5()
	{ try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("Method5");
	}
	@Test(dependsOnMethods="Method5")
	public static void Method6()
	{
		System.out.println("Method6");
		
	}
}
