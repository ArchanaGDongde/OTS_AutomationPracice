package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolsQaTest 
{	
		WebDriver driver;
	    // Saving the expected title of the Webpage
	    String title = "ToolsQA - Demo Website For Automation";
	    
	   
	    @Test
	    public void starting_point(){
	    	System.out.println("This is the starting point of the test");
	    	//Initialize Chrome Driver
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    	driver = new ChromeDriver();
	    	driver.get("https://demoqa.com/");
	    }
	    
	    
	    @Test(groups = { "demo1" })	
	    public void checkTitle() {	
	       String testTitle = "Free QA Automation Tools For Everyone";
	       String originalTitle = driver.getTitle();
	      Assert.assertEquals(originalTitle, testTitle);
	    }	
	    
	    @Test(groups = { "demo2" })	
	    public void click_element() {	
	       driver.findElement(By.xpath("//h5[text()='Elements']")).click();
	        System.out.println("Home Page heading is displayed");	
	    }
}
