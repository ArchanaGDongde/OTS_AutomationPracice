package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubParameter
{	
	@Test
	@Parameters({ "a", "b" })
	
	   public void sub(int c, int d) 
	{
		int sum = c-d;
	   System.out.println("Substraction of two numbers: " + sum);
	}
}
