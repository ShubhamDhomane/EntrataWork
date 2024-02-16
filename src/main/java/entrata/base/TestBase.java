package entrata.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
   public static WebDriver driver;
  	

	public void init() {
		
		String browser = "chrome";
        
		if(browser == "chrome") 
		{
        // setting up webdriver manager for the chrome driver
        WebDriverManager.chromedriver().setup(); 
		
        // initialization of chrome driver
		driver = new ChromeDriver();    
		System.out.println("Lounched the chrome browser...");
		}
		
		else if(browser == "edge") 
		{
	      // setting up webdriver manager for the edge driver
	      WebDriverManager.edgedriver().setup(); 
			
	      // initialization of edge driver
		  driver = new EdgeDriver();     
		  System.out.println("Lounched the Edge browser...");

		}
		
		else if(browser == "firefox") 
		{
	      // setting up webdriver manager for the firefox driver
	      WebDriverManager.firefoxdriver().setup();
			
	      // initialization of firefox driver
		  driver = new FirefoxDriver();     
		  System.out.println("Lounched the Firefox browser...");

		}
		
		// maximizing window
		driver.manage().window().maximize();  
		System.out.println("maximized the window...");
		
		// Lunching the url
		driver.get("https://www.entrata.com/");  
		System.out.println("Lounched the URL...");
		
		
		// Applying implicit or global wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	   
		
		
		
		
		
	}
	
	
	
	
	

}
