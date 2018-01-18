package com.puja.WebAutomationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.puja.WebAutomationFrameworkBase.BaseTest;
import com.puja.WebAutomationFrameworkHelper.ExcelHelper;
import com.puja.WebAutomationFrameworkPage.HomePage;
import com.puja.WebAutomationFrameworkPage.SearchPage;
import com.puja.WebAutomationFrameworkPage.SignInPage;

public class SearchPageTest extends BaseTest {

	
	SearchPage srchp;
	 HomePage hm;
	 static Logger log = LogManager.getLogger(ExcelHelper.class);

	 
	 @BeforeClass
		public void beforeClass(){
			
	         srchp = new SearchPage(driver);
		}
		
	 
	 @Test
	 
	 public void searchPageVerifyTitle(){
		
	 }

	 @Test
	 
	 public void sortResult(){
	 
	 }
}
