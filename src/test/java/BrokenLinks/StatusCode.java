package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusCode
{
	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String url = driver.findElement(By.xpath("//a[text()='Broken Link']")).getAttribute("href");
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		System.out.println(url);
		
		HttpURLConnection connect =(HttpURLConnection)new URL(url).openConnection();
		connect.setRequestMethod("HEAD");
		connect.connect();
		int rescode = connect.getResponseCode();
		System.out.println(rescode);
	
	}
}