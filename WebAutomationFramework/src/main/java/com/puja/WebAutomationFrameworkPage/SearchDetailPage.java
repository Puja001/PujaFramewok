package com.puja.WebAutomationFrameworkPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchDetailPage {
	WebDriver driver;

    public SearchDetailPage (WebDriver driver){
	  this.driver=driver;
    }
	
	public String getDetailsTitle(){
		return driver.getTitle();
		
	}
	public String resultTitle(){
		WebElement elm = driver.findElement(By.xpath("//*[@class='prod-ProductTitle no-margin heading-a']/div"));
		return elm.getText();
		
	}

}
