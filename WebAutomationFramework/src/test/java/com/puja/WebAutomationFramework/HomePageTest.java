package com.puja.WebAutomationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.testng.Assert.*;
import com.puja.WebAutomationFrameworkBase.BaseTest;
import com.puja.WebAutomationFrameworkHelper.ExcelHelper;
import com.puja.WebAutomationFrameworkPage.HomePage;
import com.puja.WebAutomationFrameworkPage.SignInPage;

public class HomePageTest extends BaseTest{
	
     HomePage hm;
     static Logger log = LogManager.getLogger(ExcelHelper.class);
     

	
	@BeforeClass
	public void beforeClass(){
		
         hm = new HomePage(driver);
	}
	
	@Test

	public void testNavLinks(){
		AssertJUnit.assertEquals(6, hm.navLinks());
		}
	
	@Test
	public void testsignInLink() {
		SignInPage sp= hm.signInLink();
		//Assert.assertEquals("Login", sp.getSignInTitle());
	
		}
			
			
		
	
	@Test
	public void testsearchBox(){
		AssertJUnit.assertEquals("laptop - Walmart.com", hm.searchBox());
		
	}
}
