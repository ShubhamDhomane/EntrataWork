package entrata.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import entrata.base.TestBase;

public class ProductPage extends TestBase {
	
// web repository
	
	// Resident Pay elements
	@FindBy(xpath = "(//a[text()='ResidentPay'])[1]")
	WebElement residentPayLink ;
		
	@FindBy(xpath = "//*[@title='ResidentPay Product Page – Product Banner – Button']")
	WebElement scheduleDemoLink;
	
	
	
// page factory
	public ProductPage() {
		PageFactory.initElements(driver, this);     // initialization of elements
	}
	
	
// Actions
	public void clickOnResidentPayLink() {
		residentPayLink.click();                 // clicking on resident pay link
		System.out.println("clicked on Resident Pay Link...");
	}
	
	public void clickOnScheduleDemoLink_Of_ResidentPayLink() {
		residentPayLink.click();                 // clicking on resident pay link
		System.out.println("clicked on Resident Pay Link...");
		
		scheduleDemoLink.click();      		     // clicking on schedule demo link of resident pay link
		System.out.println("clicked on Schedule Demo Link...");

	}


}
