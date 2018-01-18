package com.puja.WebAutomationFrameworkHelper;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	
	
	 static Logger log = LogManager.getLogger(ExcelHelper.class);
	
	public static Object[][] getExcelData(String fileName, String sheetName){
		Object [][] data = null;
		XSSFWorkbook wb = null;
		try{
		
		wb= new XSSFWorkbook(Constants.RESOURCES+"/testdata/"+ fileName);
		XSSFSheet  sheet=  wb.getSheet(sheetName);
		int rowsIndex = sheet.getLastRowNum();// return last row index-index start from 0
		log.info("Total rows: " +rowsIndex);
		data = new Object[rowsIndex][];
		
		
		for (int i=1;i<=rowsIndex;i++){
			XSSFRow row = sheet.getRow(i);
			int cols = row.getLastCellNum();
	    log.info("Total cols: " +cols);
	    String[] colData = new String[cols];
	    
		for (int j=0;j<cols;j++){
			System.out.println(row.getCell(j));
			colData[j] = row.getCell(j).toString();
		}
		data[i-1]= colData;
		}
		
		
		
		}catch(IOException e){
			log.error("ExcelHelper exception: "+e);
		    
		} finally {
			try{
				wb.close();
			
			}catch (IOException e) {
				log.error(e);
			}
		}
		
		
		return data;
		
	}
	
	
	

}
	