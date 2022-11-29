package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

public class DemoTest 
{
	WebDriver driver;
	@Test
	public void startTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com/");
		//WebElement eleTitle = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		//System.out.println("title: "+ eleTitle.getText());
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void credentialTest(WebDriver driver) throws InterruptedException
	{
		this.driver= driver;
		//driver.findElement(By.xpath("//span[text()='Courses']\\")).click();
		//driver.findElement(By.xpath("//i[@class='fa fa-circle-o']\\")).click();
		
		driver.findElement(ByAll.xpath("//span[text()='Courses']\\\\")).click();
		driver.findElement(ByAll.xpath("//i[@class='fa fa-circle-o']\\\\")).click();
		
		Thread.sleep(3000);
		//Reporter.log("");
	}
}
