package By_Naveen_TestNG_Framwork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Feature_TestNG {
	
	
	@Test(priority=1,groups="nitin",expectedExceptions=AssertionError.class)
	public static void method1()
	{
		System.out.println("Login page methd");
	Assert.assertTrue(false);
	}
	
	@Test(priority=2,dependsOnMethods="method1",invocationCount=5,groups="rushi")
	public static void method2()
	{
		System.out.println("homeopage method");
	}
	
	@Test(priority=4,dependsOnMethods="method1",groups="rushi")
	
		public static void method3()
		{
			System.out.println(" search page method");
		}
	@Test(priority=3,dependsOnMethods="method1",groups="atul")
	public static void method4()
	{
		System.out.println("regestration page method");
			
	}
				
	

}
