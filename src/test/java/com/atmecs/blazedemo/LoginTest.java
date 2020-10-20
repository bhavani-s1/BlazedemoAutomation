package com.atmecs.blazedemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.balzedemo.pagehelper.loginPage;
import com.atmecs.blazedemo.basetest.BaseTest;
import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo.utilities.ReadingData;
import com.atmecs.practice.Readdata1;

public class LoginTest extends BaseTest {

//WebDriver driver;
	
	@DataProvider(name="getlogindata")
	
	public static Object[][] getlogindata() throws IOException
	{
ReadingData rd= new ReadingData();
		
		//String path=Constants.TESTDATA;
		Object[][]  data1= rd.getdata(Constants.TESTDATA, "Sheet2");
		
		

		   return data1;
		
 //  Object[][]  data1= ReadingData.getdata(Constants.EXCELPATH);

   //return data1;
			
		
	}
	
@Test(dataProvider="getlogindata")
	
	
	public void blazeLogin(String emailid,String password) throws FileNotFoundException, IOException {
		
		System.out.println("entering blazelogin method");
		
		loginPage log1=new loginPage(driver);
		
		log1.DemoLogin(emailid, password);
		
		
		
	}
}
	

