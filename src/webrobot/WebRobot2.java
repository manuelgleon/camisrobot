package webrobot;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebRobot2 {
	int timeoutSeconds = 15;
	 public static void main(String[] args) {
		 
	        // declaration and instantiation of objects/variables
		 	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "https://padlet.com/educaciontrendi/yxbdm3vsnd8t7xnq/wish/2309587956";
	        String expectedTitle = "Explorers";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	        
	      try {
	        	new WebDriverWait(driver, Duration.ofSeconds(20));
	            WebElement rateElement = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[4]/div[1]/div/div[2]/div/div/div/div/div/div/div/div[3]/div/span[2]"));
	             //*[@id="app"]/main/div[4]/div[1]/div/div[2]/div/div/div/div/div/div/div/div[3]/div/span[2]
	            
	            String selector = "";
	        //    <span role="button" class="text-body-extra-small font-sans font-semibold ms-1">
	        //    Rate
	        //  </span>
	          //*[@id="app"]/main/div[4]/div[1]/div/div[2]/div[2]/div[3]/div/span[2]
	          //*[@id="app"]/main/div[4]/div[3]/div/div/div/div/div/div[5]/div/div/i[5]
	          //  WebElement  element=driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[2]/div[3]/div/article/div[1]/section/div/div/div/i[5]"));  
	           // System.out.println("FoundXpAth");
	            JavascriptExecutor ex=(JavascriptExecutor)driver;
	            ex.executeScript("arguments[0].click()", rateElement);
	            System.out.println("rateclicked");
	            WebElement appElement=driver.findElement(By.id("app"));
	            System.out.println("appElement");
	          //  String selector = "#app > main > div.surface-panels > div.fixed.z-dropdown.bg-transparent.left-0.right-0.bottom-0.top-0 > div > div > i:nth-child(5)";
	            WebElement fiveStart = driver.findElement(By.cssSelector(selector));
	            JavascriptExecutor ex2=(JavascriptExecutor)driver;
	            ex2.executeScript("arguments[0].click()", fiveStart);
	            System.out.println("fivestarsclicked");
	          //  WebElement eleStarts = appElement.findElement(By.xpath("./main/div[4]/div[2]/div/div/i[5]"));
	            
	            
	            /*
	            Actions actions = new Actions(driver);
	            actions.contextClick(cardElement).perform();*/
	            System.out.println("card clicked");
	          }
	        catch(TimeoutException e) {
	            System.out.println("Element isn't clickable");
	         }

	       
	      new WebDriverWait(driver, Duration.ofSeconds(20));
          System.out.println("Wait 20 seconds");

	     // Code To click on a specific option from the Context menu once right-click is performed.
	  //   WebElement elementOpen = driver.findElement(By.xpath("<Xpath of the specific option")); 
	  //   elementOpen.click();
	        

	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        System.out.println("Closing");
	  
	       driver.close();
	    }

}
