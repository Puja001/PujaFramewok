package com.puja.WebAutomationFrameworkBase;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.puja.WebAutomationFrameworkHelper.ByClass;
import com.puja.WebAutomationFrameworkHelper.ConfigUtils;
import com.puja.WebAutomationFrameworkHelper.ScreenshotUtils;
import com.puja.WebAutomationFrameworkHelper.WebUIDriver;

public class BaseTest {
	
	 protected WebDriver driver;
	
	@BeforeTest
	
	public void beforeTest(){
		ByClass.loadProperties();
		ConfigUtils.loadProperties("config.properties");
		driver = WebUIDriver.getDriver(ConfigUtils.getValue("browser"));
		driver.get(ConfigUtils.getValue("url"));
		
	}
	
	@AfterMethod
	
	public void afterMethod(ITestResult rs){
		if( ITestResult.FAILURE  ==  rs.getStatus()){
		ScreenshotUtils.takeScreenShot(rs.getName(),driver);
			
		}
	}
		
	@AfterTest
	

	public void afterTest(){
		
		driver.close();
		}
	
	    
		
		
	}


