package com.puja.WebAutomationFrameworkPage;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.puja.WebAutomationFrameworkHelper.ByClass;

public class HomePage{
	
	// depencdency injection -HomePage is dependent on webdriver object and we are injecting that dependency
	// using constructor 
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	public int navLinks(){
		
	      List <WebElement> links = driver.findElements(ByClass.getBy("css-navLocator"));
	      //getting actual value using webdriver automation.
	      return links.size();
	} 
	
	public String searchBox(){
		
		 driver.findElement(ByClass.getBy("id-searchBoxLocator")).sendKeys("laptop");
		 driver.findElement(ByClass.getBy("css-submitButtonLocator")).click();
		 return  driver.getTitle();
		 
	}
	
	public SignInPage signInLink(){
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement myAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getBy("xpath-signInAndCreateAccountLocator")));
		Actions action=new Actions(driver);
		action.moveToElement(myAccountElement).perform();
		driver.findElement(ByClass.getBy("link-signInLocator")).click();
		return new SignInPage(driver);
		
		
		
	}
	public String CreateAccountLink (){
	
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		WebElement myAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getBy("xpath-signInAndCreateAccountLocator")));
		Actions action=new Actions(driver);
		action.moveToElement(myAccountElement).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getBy("link-creatAnAccountLocator"))).click();
		return driver.getTitle();
	}
}






