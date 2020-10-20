package com.atmecs.blazedemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.balzedemo.pagehelper.contactPage;
import com.atmecs.blazedemo.basetest.BaseTest;
import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo.utilities.ReadingData;

public class ContactTest extends BaseTest {

//WebDriver driver;
	
		
@Test(dataProvider="getdata")
	
	
	public void contactus(String contactemail,String name,String message) throws FileNotFoundException, IOException {
		
		contactPage contact=new contactPage(driver);
		
		contact.DemoContact(contactemail, name, message);
		
		
		
	}
}

