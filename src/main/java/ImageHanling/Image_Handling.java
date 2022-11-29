package ImageHanling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_Handling {

	public static void main(String[] args) {
																
	        WebDriver driver = new ChromeDriver();					
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.get("https://www.amazon.com/");	
	        //click on the "Amazon" logo	
				WebElement img = driver.findElement(By.id("nav-logo-sprites"));					
				if(img.isDisplayed())
				{
					System.out.println("image is displayed"+ img.getAttribute("href"));
				}
				else
				{
					System.out.println("image not displayed");
				}
				
			
				WebElement deal = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
				//deal.click();
				driver.findElement(By.xpath("//span[@class='a-button-inner']")).click();
				System.out.println(driver.getCurrentUrl());
				if(deal.isEnabled())
				{
					deal.click();
					System.out.println(driver.getCurrentUrl());
				}
				else
				{
					System.out.println("not enabled");
				}
				
				
					driver.close();		

	    }		

	}


