package com.atmecs.blazedemo.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	//String filePath;

	/*public ReadingData(String filePath) {
		this.filePath = filePath;
	}*/
	
	public static  Object[][] getdata(String filepath) throws IOException  {
		
		 FileInputStream fis= new FileInputStream(filepath);
		 
		 System.out.println("entering into getdata method");
		 System.out.println("filepath"+filepath);
		 
		  XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 
		  //XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
			XSSFSheet sheet=workbook.getSheetAt(0);
			
			
	/*	XSSFWorkbook workbook;
		workbook = new XSSFWorkbook(this.filePath);
		XSSFSheet sheet = workbook.getSheet(Sheetname);*/
		

			
			
			
			//row count
			
			int rowNum=sheet.getLastRowNum()+1;
			
			System.out.println("rowcount" +rowNum);
			
			
			//column count
			
			int colcount=sheet.getRow(0).getLastCellNum();
			
			System.out.println("column count"+colcount);
			
			
			Object[][]data= new String[rowNum][colcount];
			
			//iterating
			
			for(int i=0;i<rowNum;i++) {
				
				//XSSFRow row= sheet.getRow(i);//current row
				
				XSSFRow currentrow=sheet.getRow(i);	
				
				for(int j=0;j<colcount;j++) {
					
					//getting cell values
					
					String value=currentrow.getCell(j).toString(); //read the value from cell
					
					System.out.println(value);
				
			       data[i][j]=value;
					
					System.out.print("the value is:\n" +data);
					
				
			
				
				System.out.println();
			}
			
			
			
			}
			return data;
			
	}	
}
