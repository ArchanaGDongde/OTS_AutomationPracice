package DataProvider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GenericUtilities.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactsTest 
{
	
	//WebDriver driver;

	
	@Parameters("BROWSER")
	@BeforeTest
	@Test
	public void startBrowser(String BROWSER) 
	{
		WebDriver driver;
	//step 1: Launch the browser
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
	
			
			// step 2: Login to application
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
			
			// step 3: Navigate to Contacts link
			driver.findElement(By.linkText("Contacts")).click();
			
			//step 4: click on create contact look up image
			driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
			
			//step 5: Enter the mandatory fields
			driver.findElement(By.name("lastname")).sendKeys("DHONGE");
			
			//Step 5: Save 
			driver.findElement(By.name("button")).click();
	
			driver.close();
	}
}
