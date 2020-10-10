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

public class LoginTest extends BaseTest {

//WebDriver driver;
	
	@DataProvider
	
	public static Object[][] getdata() throws IOException
	{
		
		
   Object[][]  data1= ReadingData.getdata(Constants.EXCELPATH);

   return data1;
			
		
	}
	
//@Test(dataProvider="getdata")
	
	
	public void blazeLogin(String emailid,String password) throws FileNotFoundException, IOException {
		
		loginPage log1=new loginPage(driver);
		
		log1.DemoLogin(emailid, password);
		
		
		
	}
}
	

