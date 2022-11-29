package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@Test
	public void test() 
	{
		System.out.println("Annotation Test");
	}
	
	@BeforeSuite
	public void beforeSuiteTest() 
	{
		System.out.println("Before suite");
	} 
	
	@AfterSuite
	public void afterSuiteTest() 
	{
		System.out.println("After suite");
	}
	
	@BeforeClass
	public void beforeClassTest() 
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClassTest() 
	{
		System.out.println("After Class");
		
	}
	
	@BeforeTest 
	public void beforeTest() 
	{
		System.out.println("Before Test");
		
	}
	
	@AfterTest
	public void afterTest() 
	{
		System.out.println("After Test");
	}
	
	@BeforeMethod
	public void beforeMethodTest() 
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod(enabled = false)
	public void afterMethodTest() 
	{
		System.out.println("After Method");
		//Assert.fail();
	}
	
	@BeforeTest
	public void beforeTest1() 
	{
		System.out.println("Before Test 1");
	}
	
}

