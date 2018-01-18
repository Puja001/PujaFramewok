package com.puja.WebAutomationFrameworkPage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.puja.WebAutomationFrameworkHelper.ByClass;



public class SignInPage {
	
	WebDriver driver;

     public SignInPage(WebDriver driver){
	  this.driver=driver;
     }
	
	

	
	public String getSignInTitle(){
		return driver.getTitle();
		
	}
    public String signInInvalid(String uname,String pwd){
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	WebElement elm = driver.findElement(ByClass.getBy("name-email"));
    	elm.clear();
    	elm.sendKeys("uname");
    	elm = driver.findElement(ByClass.getBy("name-password"));
    	elm.clear();
    	elm.sendKeys("pwd");
    	driver.findElement(ByClass.getBy("xpath-signinBtn")).click();
    	return driver.findElement(ByClass.getBy("xpath-alertmsg")).getText();
    	
    	
    }
    
    public String signInValid(){
    	driver.findElement(By.name("email")).sendKeys("a@a.com");
    	driver.findElement(By.name("password")).sendKeys("1234");
    	driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
    	return driver.getTitle();
    	
    	
    }
}
 