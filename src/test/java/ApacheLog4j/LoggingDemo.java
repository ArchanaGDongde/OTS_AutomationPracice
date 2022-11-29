package ApacheLog4j;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggingDemo 
{

    public static void main(String[] args) 
    {  
         WebDriver driver = new ChromeDriver();
         Logger logger = LogManager.getLogger(LoggingDemo.class);
         
         driver.get("https://healthunify.com/bmicalculator/");
         logger.debug("opening webiste");
        
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		 logger.debug("entering weight");
		 driver.findElement(By.name("wg")).sendKeys("87");
		 logger.debug("selecting kilograms");
         driver.findElement(By.name("opt1")).sendKeys("kilograms");
         logger.debug("selecting height in feet");
         driver.findElement(By.name("opt2")).sendKeys("5");
         logger.debug("selecting height in inchs");
         driver.findElement(By.name("opt3")).sendKeys("10");
         logger.debug("Clicking on calculate");
         driver.findElement(By.name("cc")).click();

         logger.debug("Getting SIUnit value");
         String SIUnit = driver.findElement(By.name("si")).getAttribute("value");
         logger.debug("Getting USUnit value");
         String USUnit = driver.findElement(By.name("us")).getAttribute("value");
         logger.debug("Getting UKUnit value");
         String UKUnit = driver.findElement(By.name("uk")).getAttribute("value");
         logger.debug("Getting overall description");
         String note = driver.findElement(By.name("desc")).getAttribute("value");
      
         System.out.println("SIUnit = " + SIUnit);
         System.out.println("USUnit = " + USUnit);
         System.out.println("UKUnit = " + UKUnit);
         System.out.println("note = " + note); 
		driver.quit();
	}
}