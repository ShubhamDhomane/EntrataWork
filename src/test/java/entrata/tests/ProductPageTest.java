package entrata.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import entrata.base.TestBase;
import entrata.pages.HomePage;
import entrata.pages.ProductPage;
import entrata.utility.Util;


public class ProductPageTest extends TestBase{
	
	ProductPage productPage;
	HomePage homePage ;
	
	@BeforeMethod
	public void initialization() {		
		init();                 //opening the url	
		Util.acceptCookies();   // accepting the cookies
		
		productPage = new ProductPage();  // initialization of product page		
		homePage = new HomePage();        // initialization of Home Page 
		
		homePage.mouseOverProductTab();   // perform mouse over action on Product tab	
	}
	
	
	@Test
	public void validateResidentPayLink () {
		productPage.clickOnResidentPayLink();   // perform click action on Resident Pay link
		
		WebElement supSign = driver.findElement(By.xpath("//sup[text()='®']"));
		Assert.assertEquals(supSign.getText(), "®");    //  validating '®' Sign
	}
	
	@Test
	public void validateSchedeleLink_Of_ResidentPayLink () {
		productPage.clickOnResidentPayLink();                        // perform click action on Resident Pay link
		productPage.clickOnScheduleDemoLink_Of_ResidentPayLink();    // perform click action on Schedule demo link of Resident Pay link
		
		String scheduleDemoTxt = driver.findElement(By.cssSelector("[type='submit']")).getText();
		Assert.assertTrue(scheduleDemoTxt.contains("Schedule Demo"));    //  validating 'Schedule Demo' text
	}
	
	
	@AfterMethod
	public void tearDown()  {
		driver.manage().deleteAllCookies(); // delecting all cookies
		driver.quit();  // quit window
		System.out.println("End the Test case...");
		System.out.println();
	}

}
