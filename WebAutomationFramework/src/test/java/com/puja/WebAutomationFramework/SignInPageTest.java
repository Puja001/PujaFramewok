package com.puja.WebAutomationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.*;
import com.puja.WebAutomationFrameworkBase.BaseTest;
import com.puja.WebAutomationFrameworkHelper.ExcelHelper;
import com.puja.WebAutomationFrameworkPage.HomePage;
//import com.puja.WebAutomationFrameworkPage.HomePage;
import com.puja.WebAutomationFrameworkPage.SignInPage;

public class SignInPageTest extends BaseTest {
	
	SignInPage sp;
	 HomePage hm;
	 static Logger log = LogManager.getLogger(ExcelHelper.class);

	
	@BeforeClass
	public void beforeClass(){
		hm = new HomePage(driver);
	
		//using home page sign method to get signInLinkpage
		sp = hm.signInLink();
	}
	@DataProvider(name="signin")
	public Object[][] signinData(){
		Object[][] data= ExcelHelper.getExcelData("signin.xlsx","logindata");
		return data;
		
		}
	
	
	@Test(dataProvider="signin")
	public void testSignIn(String uname,String pwd,String expected){
		System.out.println("expected value"+expected);
		String actual = (sp.signInInvalid(uname,pwd));
		assertNotNull(actual.contains(expected));
		//assertTrue(actual.contains(expected));
		//System.out.println("current url after:" +driver.getCurrentUrl());
	}


	

}