package extentReport;


import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtenteportTest
{
static ExtentTest test;
static ExtentReports report;
@BeforeClass
public static void startTest()
{
report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
test = report.startTest("ExtentDemo");
}
@Test
public void extentReportsDemo()
{
//System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\OTS_AutomationPracice");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in");
//assertEquals(true, "Google");
driver.navigate().to("https://www.facebook.com/");
driver.findElement(By.id("emil")).sendKeys("admins");


if(driver.getTitle().equals("Google"))
{
test.log(LogStatus.PASS, "Navigated to the specified URL");


driver.navigate().to("https://www.facebook.com/");
}
else
{
test.log(LogStatus.FAIL, "Test Failed");
}
}


@AfterClass
public static void endTest()
{
report.endTest(test);
report.flush();
}

// Screenshots can be captured for each failed step using the below code.

//test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");
public static String capture(WebDriver driver) throws IOException {
File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
File Dest = new File("./test-output/ScreenShot" + System.currentTimeMillis()+ ".png");
String errflpath = Dest.getAbsolutePath();
FileUtils.copyFile(scrFile, Dest);
return errflpath;
}
}



