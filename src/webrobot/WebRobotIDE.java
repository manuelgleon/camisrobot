package webrobot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class WebRobotIDE {
	
	 public static void main(String[] args) throws InterruptedException {
	
		Map<String, Object> vars;
		JavascriptExecutor js;
		for(int i=0;i<2000;i++) {
			System.out.println("Execution:"+i);
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
		try {
		driver.get("https://padlet.com/educaciontrendi/yxbdm3vsnd8t7xnq");
		    // 3 | runScript | window.scrollTo(0,0) | 
		js.executeScript("window.scrollTo(0,0)");
		System.out.println("Waiting 10 secs");
		Thread.sleep(10000);
		System.out.println("Waited 10 secs");
		    // 4 | click | css=#wish-2309587956 .bg-light-ui-100 > .pt-2 .oricon | 
		driver.findElement(By.xpath("//div[@id=\'wish-2309587956\']/div/article/div/section/div/div/div/i")).click();
		    // 5 | click | css=.oricon:nth-child(5) | 
		System.out.println("Waiting starts 5 secs");
		Thread.sleep(5000);
		System.out.println("Waited starts 5 secs");
		driver.findElement(By.cssSelector(".oricon:nth-child(5)")).click();
	//	driver.findElement(By.xpath("//i[5]")).click();
		 System.out.println("Waiting 10*2 secs");
		//new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(10000);
		System.out.println("Waited 10*2 secs");
		driver.findElement(By.xpath("//div[@id=\'wish-2309587956\']/div/article/div/section/div/div/div/i")).click();
		System.out.println("Waiting starts 5 secs");
		Thread.sleep(5000);
		System.out.println("Waited starts 5 secs");
		try {
			driver.findElement(By.cssSelector(".oricon:nth-child(5)")).click();
			 System.out.println("Waiting 15 3 secs");
			Thread.sleep(15000);
			 System.out.println("Waited 15 3 secs");
		}catch(ElementClickInterceptedException e) {
			 System.out.println("ClickInterceptedException");
		}
		
		}
		catch(Exception e)
		{
			 System.out.println("Huge exception");
		}
		driver.quit();
	 }
	 }
	 
}
