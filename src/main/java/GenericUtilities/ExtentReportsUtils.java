package GenericUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsUtils 
{
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		String path = System.getProperty("user.dir")+"\\reports\\extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);     //ExtentSparkReporter responsible to create html file
		reporter.config().setReportName("Web automation result");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Archana");
	}
	@Test
	public void extent()
	{
		extent.createTest("extent");	//need to give test name
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("admins");
		extent.flush();	
	}
}
