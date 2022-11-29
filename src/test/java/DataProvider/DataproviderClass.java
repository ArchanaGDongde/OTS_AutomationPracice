package DataProvider;

import org.testng.annotations.DataProvider;

public class DataproviderClass 
{
	@DataProvider(name ="SearchProvider")
	public static Object[][] getDataFromDataProvider()
	{
		return new Object[][]
		{
			{"Selenium", "Automation"},
			{"Manual", "Testing"},
			{"SQL", "DataBase"},
			{"API", "Webservice"}
		};
	
	}
}
