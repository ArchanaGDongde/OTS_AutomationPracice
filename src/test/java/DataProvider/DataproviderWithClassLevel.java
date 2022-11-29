package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import graphql.Assert;

public class DataproviderWithClassLevel 
{

	
	WebDriver driver;
	@Parameters({ "Browser", "url" })
	public void setUp() 
	{
		WebDriver driver ;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}	
	
	@Test(dataProvider = "SearchProvider", dataProviderClass = DataproviderClass.class)

	public void testMethod(String course,String searchKey) throws InterruptedException
	{
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys(searchKey);
		System.out.println("Course - >"+ course+" Domain ->"+ searchKey);
		Thread.sleep(3000);
		
		//get test from searchbox
		String testValue = searchText.getAttribute("value");
		System.out.println(testValue + "::" + searchKey);
		searchText.clear();
		
		//verify if search box has correct value
		Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	}
}
