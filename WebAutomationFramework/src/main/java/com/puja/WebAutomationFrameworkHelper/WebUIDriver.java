package com.puja.WebAutomationFrameworkHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUIDriver {
	
	public static WebDriver getDriver(String browserName){
		
		 WebDriver driver= null;
		 
		 switch(browserName.trim().toLowerCase()){
		 case"chrome":
		     System.setProperty("webdriver.chrome.driver",Constants.RESOURCES +"/chromedriver");
		     driver = new ChromeDriver();
		     break;
		     
		 
		 case"firefox":
			 System.setProperty("webdriver.firefox.driver",Constants.RESOURCES+"/geckodriver");
			 driver = new FirefoxDriver();
			 break;
			 
			 
		 case"ie":
			 System.setProperty("webdriver.ie.driver",Constants.RESOURCES+"/internetexlporerdriver");
			 driver = new InternetExplorerDriver();	
			 break;
		 
		 case"safari":
			 System.setProperty("webdriver.safari.driver",Constants.RESOURCES+"/safaridriver");
			 driver = new SafariDriver();
			 break;
			 
		 case"htmlunit":
			 driver = new HtmlUnitDriver();
			 break;	 
		
			 
			 default:
				 System.setProperty("webdriver.chrome.driver",Constants.RESOURCES +"/chromedriver");
			     driver = new ChromeDriver();
		 }
		
		 return  driver;
		 
	}

}
