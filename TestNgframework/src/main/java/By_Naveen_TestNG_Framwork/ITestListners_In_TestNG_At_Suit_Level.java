package By_Naveen_TestNG_Framwork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ITestListners_In_TestNG_At_Suit_Level 
{

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

/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
<listeners>
<listener  class-name="By_Naveen_TestNG_Framwork.ITESTListners"></listener>
</listeners>
  <test name="Test1">
    <classes>
      <class name="By_Naveen_TestNG_Framwork.Listners_In_TestNG">
      <methods>
      <include name="Method1"/>
      <include name="Method2"/>
       <include name="Method3"/>
       </methods>
       </class >
    </classes>
  </test> <!-- Test -->
   <test name="Test2">
    <classes>
      <class name="By_Naveen_TestNG_Framwork.Listners_In_TestNG">
      <methods>
      <include name="Method4"/>
      <include name="Method5"/>
      <include name="Method6"/>
       </methods>
       </class >
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->*/
