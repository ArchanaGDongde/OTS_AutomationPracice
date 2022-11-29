package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn
{
	@Test
	public void ceateCustomer() 
	{
		System.out.println("customer created");
		Assert.fail();
	}
	@Test(dependsOnMethods= "ceateCustomer")
	public void modifyCustomer() 
	{
		System.out.println("customer modified");
		
	}
	@Test(dependsOnMethods = "modifyCustomer")
	public void deleteceateCustomer() 
	{
		System.out.println("customer deleted");
	}
}
