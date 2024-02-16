package entrata.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import entrata.base.TestBase;
import entrata.pages.HomePage;
import entrata.utility.Util;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	
	@BeforeMethod
	public void initialization() {
		init();  //opening the url
			
		Util.acceptCookies();  // accepting the cookies
		
		homePage = new HomePage();    // initialization of Home Page 
	}
	

	@Test
	public void validateWatchDemoLink() {
		homePage.clickOnWatchDemoLink();    //perform click on watch demo
		
		WebElement watchDemoTxt = driver.findElement(By.xpath("//*[text()='Watch Demo']"));
		Assert.assertEquals(watchDemoTxt.getText(), "Watch Demo");   // validating 'watch demo' text		
	}
	
	
	@Test
	public void validateWatchDemo_Without_Entering_Data_Inside_All_TestBox() {
		homePage.clickOnWatchDemoBtn();    // perform click on watch demo button
		
		WebElement errorMsg = driver.findElement(By.id("ValidMsgFirstName"));
		Assert.assertEquals(errorMsg.getText(), "This field is required.");  //validating 'This field is required' text error massage
	}
	
	@Test
	public void validateProductTab() {
		homePage.mouseOverProductTab();  // perform mouse over action on Product tab
		
		String propManagementTxt = driver.findElement(By.xpath("(//*[text()='Property Management'])[1]")).getText();
		Assert.assertTrue(propManagementTxt.contains("Property Management"));  // validating 'Property Management' text
	}
	
	@Test
	public void validateSolutionsTab() {
		homePage.mouseOverSolutionTab(); // perform mouse over action on solution tab
		
		WebElement allSolutions = driver.findElement(By.xpath("(//*[text()='All Solutions'])[1]"));
		Assert.assertEquals(allSolutions.getText(), "All Solutions");    // validating 'All Solutions' text
	}
	
	@Test
	public void validateResourcesLink() {
		homePage.clickOnResourcesLink(); //perform click action on Resources link
		
		String resourcesTxt = driver.findElement(By.xpath("//*[text()='Resource Center']")).getText();
		Assert.assertTrue(resourcesTxt.contains("Resource Center"));   // validating 'Resources Center' text
	}
	
	
	@AfterMethod
	public void tearDown()  {
		driver.manage().deleteAllCookies(); // delecting all cookies
		driver.quit();  // quit window
		System.out.println("End the Test case...");
		System.out.println();
	}
	
	

}
