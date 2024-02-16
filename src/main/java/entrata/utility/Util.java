package entrata.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import entrata.base.TestBase;

public class Util extends TestBase{
	
	public static void acceptCookies() {
		driver.findElement(By.id("rcc-confirm-button")).click();   // click on accept cookies button
	}

	public static void explicitWait(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));	  // applying explicit wait
	}
	
	public static void mouseOverAction(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();      // perform mouse over action on element
	}
	
	
}
