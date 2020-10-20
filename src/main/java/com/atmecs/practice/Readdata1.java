package com.atmecs.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata1 {

	String path;
	
//	public Readdata1(String path){
//		
//		this.path=path;
//	}
	
	Workbook book;
	org.apache.poi.ss.usermodel.Sheet sheet;
	Object[][] data;

	public  Object[][] getData(String path, String sheetName)

	{
		System.out.println(sheetName);
	FileInputStream file = null;

	try {
	file = new FileInputStream(path);
	} catch (FileNotFoundException e) {

	e.printStackTrace();
	}

	try {
	book = WorkbookFactory.create(file);
	} catch (Exception e) {
	e.printStackTrace();
	}

	sheet = book.getSheet(sheetName);
	data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

	for(int i=0;i<sheet.getLastRowNum();i++) {
	for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
	data[i][k]=sheet.getRow(i+1).getCell(k).toString();
	System.out.println(data[i][k]);
	}
	}

	return data;
	}
}

	
	
	
	
	
	
/*	
	public static Object[][] getdata(String filepath) throws IOException  {
		
		 FileInputStream fis= new FileInputStream(filepath);
		 
		 System.out.println("entering into getdata method");
		 System.out.println("filepath"+filepath);
		 
		  XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 
		  //XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
			XSSFSheet sheet=workbook.getSheetAt(0);
			
			
		XSSFWorkbook workbook;
		workbook = new XSSFWorkbook(this.filePath);
		XSSFSheet sheet = workbook.getSheet(Sheetname);
		

			
			
			
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
}*/
	
	

