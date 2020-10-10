package com.atmecs.blazedemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.balzedemo.pagehelper.SignupPage;
import com.atmecs.blazedemo.basetest.BaseTest;
import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo.utilities.ReadingData;
import com.atmecs.practice.Readdata1;

public class SignUpTest extends BaseTest {

//	WebDriver driver;
	
	@DataProvider
	
	
	public Object[][] getdata() throws IOException
	{
		
		
 // ReadingData xls=new ReadingData(Constants.EXCELPATH);
   //Object[][] data1=xls.getdata("Sheet1");
		//ReadingData rd=new ReadingData();
		
		Object[][]  data1= Readdata1.getdata(Constants.EXCELPATH);
		
		

		   return data1;
		
   
		
	}
	
	@Test(dataProvider="getdata")
	
	
	public void blazeSignUp(String emailid,String password) throws FileNotFoundException, IOException, InterruptedException {
		
		SignupPage signup=new SignupPage(driver);
		
		//signup.DemoSignup(emailid, password);
		
		signup.DemoSignup(emailid, password);
		
		
		
	}
}
