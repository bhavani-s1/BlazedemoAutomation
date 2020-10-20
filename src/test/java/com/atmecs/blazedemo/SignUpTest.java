package com.atmecs.blazedemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.balzedemo.pagehelper.SignupPage;
//import com.atmecs.balzedemo.pagehelper.SignupPage;
import com.atmecs.blazedemo.basetest.BaseTest;
import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo.utilities.ReadingData;


public class SignUpTest extends BaseTest {

//	WebDriver driver;
	
	/*@DataProvider
	
	
	public Object[][] getdata() throws IOException
	{
		
		
 //ReadingData xls=new ReadingData(Constants.EXCELPATH);
   //Object[][] data1=xls.getdata("Sheet1");
		//ReadingData rd=new ReadingData();
		
		ReadingData rd= new ReadingData();
		
		String path=Constants.TESTDATA;
		
		Object[][]  data1= rd.getdata(path, "Sheet1");
		
		 return data1;
		
	}*/
	
	@Test(dataProvider="getdata")
	
	
	public void blazeSignUp(String emailid,String password) throws FileNotFoundException, IOException, InterruptedException {
		
		SignupPage signup=new SignupPage(driver);
		
		//signup.DemoSignup(emailid, password);
		
		signup.DemoSignup(emailid, password);
		
		
		
	}
	
	
	
	
	
}
