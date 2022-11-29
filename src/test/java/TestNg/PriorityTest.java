package TestNg;

import org.testng.annotations.Test;

public class PriorityTest
{
	@Test(groups = "GroupA")
	public void a() 
	{
		System.out.println("A");
	}
	
	@Test(groups = "GroupA")
	public void d()
	{
		System.out.println("D");
	}
	
	@Test(groups = "GroupB")
	public void c() 
	{
		System.out.println("C");
	}
	
	@Test(groups = "GroupB")
	public void b() 
	{
		System.out.println("B");
	}
}
