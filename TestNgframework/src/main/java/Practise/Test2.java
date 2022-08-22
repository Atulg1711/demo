package Practise;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void method1()

	{
		System.out.println("Test2"+"method1 "+Thread.currentThread().getId());
	}
	@Test
	public void method2()

	{
		System.out.println("Test2 "+"method2 "+Thread.currentThread().getId());
	}

	@Test
	public void method3()

	{
		System.out.println("Test3 "+"method3 "+Thread.currentThread().getId());
	}

	@Test
	public void method4()

	{
		System.out.println("Test3 "+"method4 "+Thread.currentThread().getId());
	}



}
