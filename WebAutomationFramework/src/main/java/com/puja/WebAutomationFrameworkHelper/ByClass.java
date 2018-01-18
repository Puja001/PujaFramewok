package com.puja.WebAutomationFrameworkHelper;

import java.util.Properties;

import org.openqa.selenium.By;

      public class ByClass {

        static Properties prop;
        
        public static void  loadProperties(){
        	 prop = ConfigUtils.loadProperties("/locator/signInPageLocator.properties");        	
        }
       
    	  
	    public static By getBy(String key){
	    	String value = prop.getProperty(key);
	    	By by= null;
	    	
	    	if(key.startsWith("css")){
				by=By.cssSelector(value);
			}else if(key.startsWith("xpath")){
				by= By.xpath(value);
			}else if(key.startsWith("link")){
				by=By.linkText(value);
			}else if(key.startsWith("id")){
				by= By.id(value);
			}else if(key.startsWith("partialLink")){
				by=By.partialLinkText(value);
			}else if(key.startsWith("tag")){
				by= By.tagName(value);
			}else if(key.startsWith("class")){
				by= By.className(value);
			}else if(key.startsWith("name")){
				by= By.name(value);
			}
	
			 return by;
			 
		}
	}

	/*
      public class ByClass {



      static Properties prop;



      public static void loadProperties() {



      try {

      prop = ConfigUtils.loadProperties("/locator/signInPageLocator.properties");;

      } catch (IOException e) {

      // TODO Auto-generated catch block

      e.printStackTrace();

      }



      }



      // create By object for locator and return the object

      public static By getByObject(String key){//css-navLocator

      By by=null;

      String value=prop.getProperty(key).trim();

      if(key.startsWith("css")){

      return By.cssSelector(value);

      }else if(key.startsWith("xpath")){

      return By.xpath(value);

      }else if(key.startsWith("link")){

      return By.linkText(value);

      }else if(key.startsWith("id")){

      return By.id(value);

      }else if(key.startsWith("partialLink")){

      return By.partialLinkText(value);

      }else if(key.startsWith("tag")){

      return By.tagName(value);

      }else if(key.startsWith("class")){

      return By.className(value);

      }else if(key.startsWith("name")){

      return By.name(value);

      }




      return by;



      }*/