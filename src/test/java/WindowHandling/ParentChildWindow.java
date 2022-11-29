package WindowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
		Set<String> windows = driver.getWindowHandles();  //Stored in parent-child
		Iterator<String> iterate = windows.iterator();
		String parentId = iterate.next();
		String childId = iterate.next();
		driver.switchTo().window(childId);
		String email = driver.findElement(By.xpath("//p[text()='Please email us at ']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
		Thread.sleep(3000);
		driver.quit();
	}
}
