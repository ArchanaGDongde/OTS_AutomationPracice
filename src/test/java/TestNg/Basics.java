package TestNg;

import org.testng.annotations.Test;

public class Basics 
{
@Test(priority = 2)
	public void priority1()
	{
		System.out.println("Hello Java");
	}

@Test(priority = 1, invocationCount = 2, enabled = false)
	public void priority()
	{
		System.out.println("Hello Selenium");
	}
@Test(invocationCount =2)
	public void ic() 
	{
		System.out.println("TestNg Practice");
	}
}
