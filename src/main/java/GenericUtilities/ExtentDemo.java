package GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo 
{
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
	String path = (System.getProperty("user.dir")+"\\ExtentReportResults.html");
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);   
	//test = report.startTest("ExtentDemo");
	
	ExtentReports report = new ExtentReports();
	}
	@Test
	public void extentReportsDemo()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	}
	
	@AfterClass
	public static void endTest()
	{
	
	report.flush();
	}
}
