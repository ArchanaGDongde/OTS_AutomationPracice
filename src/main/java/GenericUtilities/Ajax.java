package GenericUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajax {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		//moves to specific element
		a.moveToElement(ele).build().perform();
		
		WebElement searchEle = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(searchEle).click().keyDown(Keys.SHIFT).sendKeys("samsung mobile").doubleClick().build().perform();
	
	}

}
