package com.atmecs.blazedemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.balzedemo.pagehelper.contactPage;
import com.atmecs.blazedemo.basetest.BaseTest;
import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo.utilities.ReadingData;

public class ContactTest extends BaseTest {

WebDriver driver;
	
	@DataProvider
	
	public Object[][] getdata() throws IOException
	{
		
		
   Object[][]  data1= ReadingData.getdata(Constants.EXCELPATH1);

   return data1;
			
		
	}
	
//@Test(dataProvider="getdata")
	
	
	public void blazeLogin(String contactemail,String name,String message) throws FileNotFoundException, IOException {
		
		contactPage contact=new contactPage(driver);
		
		contact.DemoContact(contactemail,name,message);
		
		
		
	}
}

