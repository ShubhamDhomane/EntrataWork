package entrata.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import entrata.base.TestBase;
import entrata.utility.Util;

public class HomePage extends TestBase{
	
// web repository
	
	// Watch demo elements
    @FindBy(xpath = "(//a[@class = 'button-default solid-dark-button'])[1]")
    WebElement watchDemoLink;
    
    @FindBy(xpath = "//button[text()='Watch Demo']")
    WebElement watchDemoBtn;
    
    // Product element
    @FindBy(xpath = "(//*[@class='main-nav-link'])[1]")
	WebElement productTab;
    
    // Solution element
    @FindBy(xpath = "(//*[@class='main-nav-link'])[2]")
	WebElement solutionTab;
	
    // Resources element
    @FindBy(xpath = "(//*[@class='main-nav-link'])[3]")
	WebElement resourcesLink;
    
    
// Page factory
	public HomePage() {
		PageFactory.initElements(driver, this);  // initialization of elements
	}
	
	
// Actions
	public void clickOnWatchDemoLink() {
		watchDemoLink.click();      // clicking the demo link
		System.out.println("clicked on Demo Link...");
	}
	
	public void clickOnWatchDemoBtn() {
		watchDemoLink.click();      // clicking the demo link
		System.out.println("clicked on watch demo link...");
		
		watchDemoBtn.click();       // clicking the demo button 
		System.out.println("clicked on watch demo button...");

	}
	
	public void mouseOverProductTab() {
		Util.mouseOverAction(productTab);   // mouse over product tab
		System.out.println("perfomed mouse over on Product Tab...");
	}
	
	public void mouseOverSolutionTab() {
		Util.mouseOverAction(solutionTab);  // mouse over solution tab
		System.out.println("perfomed mouse over on Solution Tab...");

	}
	
	public void clickOnResourcesLink() {
		resourcesLink.click();               // click on resources link
		System.out.println("clicked on Resources Link...");

	}
	
	
}
