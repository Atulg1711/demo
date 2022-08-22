package Practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practise2 {
	@BeforeSuite
	public void beforesuitmethod()
	{
		System.out.println("this method is before suit");
	}
	@BeforeTest
	public void beforetestmethod()
	{
		System.out.println("this is method before test");
		
	}
	@BeforeGroups
	public void beforegroups()
	{
		System.out.println("this is methos before the  beforegroups");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this is method beforeclass");
		
	}
	@BeforeMethod()
	public void beforemethods()
	{
		System.out.println("this is method before the before methods");
	}
	@Test
	public void Testmethod()
	{
		System.out.println("this is test method");
	}
	
	@AfterMethod
	public void Aftermethods()
	{
		System.out.println("the method after the aftermethods");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("this method is afterclass method");
	}
	@AfterGroups
	public void aftergrups()
	{
		System.out.println("method after the after groups");
	}
	
	@AfterTest
	public void aftertets()
	{
		System.out.println("meethod after after method");
	}
	@AfterSuite
	public void aftersuit() 
	{
		System.out.println("method after the AfterSuite");
	}
	

}
