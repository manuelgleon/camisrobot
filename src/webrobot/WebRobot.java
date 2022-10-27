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



public class WebRobot {
	int timeoutSeconds = 15;
	 public static void main(String[] args) {
		 
	        // declaration and instantiation of objects/variables
		 	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "https://padlet.com/educaciontrendi/yxbdm3vsnd8t7xnq";
	        String expectedTitle = "Explorers";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	        

	      try {
	        	new WebDriverWait(driver, Duration.ofSeconds(20));
	            System.out.println("Wait 20 seconds");
	   
	            WebElement  cardElement=driver.findElement(By.id("wish-2309587956"));
	            System.out.println("FoundCardElement");
	            WebElement ele2 = cardElement.findElement(By.xpath("./div/article/div/section/div/div/div/i"));
	            System.out.println("foundEle2");

	            JavascriptExecutor ex=(JavascriptExecutor)driver;
	            ex.executeScript("arguments[0].click()", ele2);
	            System.out.println("starclicked");
	            WebElement appElement=driver.findElement(By.id("app"));
	            System.out.println("appElement");
	            JavascriptExecutor exFiveStar=(JavascriptExecutor)driver;
	            String fiveStart ="document.querySelector(\"#app > main > div.surface-panels > div.font-sans.fixed.w-full.top-0.left-0.z-modal2.transform-gpu.bg-none.flex.items-center.justify-end.md\\\\:justify-center.flex-col.overflow-hidden.md\\\\:overflow-auto.modal-bottom-tray.bg-modal-overlay-light > div > div > div > div > div > div:nth-child(5) > div > div > i:nth-child(5)\")";
	            String clickFiveStar = fiveStart.concat(".click()");
	            System.out.println("--"+clickFiveStar+"--");
	            exFiveStar.executeScript(clickFiveStar);
	            System.out.println("clickFiveStartDocumentQuery");
	          
	      
	            
	            
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
	  
	       //driver.close();
	    }

}
