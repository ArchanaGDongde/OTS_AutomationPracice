package DataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtilities.ExcelFileUtility;

public class DataProviderTest
{
	@Test(dataProvider = "OrgName")
	public void OrgNameIndustryType(String Orgname,String IndustryType)
	{
		System.out.println(Orgname+"-"+IndustryType);
	}
	
	@DataProvider(name = "OrgName")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		ExcelFileUtility eUtil = new ExcelFileUtility();
		Object[][] data = eUtil.readMultipleDataFromExcel("MultipleOrg");
		return data;
	}
}
