package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AllStatusCode {

	public static void main(String[] args) throws MalformedURLException, IOException
	 {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int totalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Total links: "+ totalLinks);
		SoftAssert sa= new SoftAssert();
		
		List<WebElement> Alllinks = driver.findElements(By.cssSelector("li[class*='gf-li'] a"));
		for(WebElement links: Alllinks)
		{
			String url = links.getAttribute("href");
			
			// Open a connection to url.
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			
			// Set the request method to property value.
			conn.setRequestMethod("GET");
			conn.connect();
			
			 // Retrieve response code.
			int respcode = conn.getResponseCode();
			System.out.println(respcode);

				sa.assertTrue(respcode<400, "The link with Text"+ links.getText()+" is broken with code "+ respcode);
			
		}
				sa.assertAll();
				 
				 
		
	}

}
