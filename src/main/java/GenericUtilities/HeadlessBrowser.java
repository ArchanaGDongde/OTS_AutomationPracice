package GenericUtilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
			
			/*	
			ChromeOptions options = new ChromeOptions();    
			options.addArguments("headless");
			WebDriver driver = new ChromeDriver(options);
			 */
	
			//WebDriver driver = new HtmlUnitDriver();
			//HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_ESR);
			
			// WebDriver driver = new PhantomJSDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			System.out.println("Title:"+ driver.getTitle());
			driver.navigate().to("https://www.amazon.com/");
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
			System.out.println(handles);
			driver.navigate().back();
			 
			 Thread.sleep(3000);
			 driver.navigate().forward();
			 Thread.sleep(3000);
			 driver.navigate().refresh();
			 driver.close();

}
}