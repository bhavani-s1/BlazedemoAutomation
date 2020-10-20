package com.atmecs.blazedemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.balzedemo.pagehelper.SignupPage;
import com.atmecs.balzedemo.pagehelper.contactPage;
import com.atmecs.blazedemo.basetest.BaseTest;
import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo.utilities.ReadingData;

public class Multiplesheets extends BaseTest{

	//WebDriver driver;
	
	
@Test(dataProvider="getdata")
	
	
	public void blazeSignUp(String emailid,String password) throws FileNotFoundException, IOException, InterruptedException {
		
		SignupPage signup=new SignupPage(driver);
		
		//signup.DemoSignup(emailid, password);
		
		signup.DemoSignup(emailid, password);
		
		
		
	}
	
	/*
@Test(dataProvider="getdata")	
	
public void contactus(String contactemail,String name,String message) throws FileNotFoundException, IOException {
		
		contactPage contact=new contactPage(driver);
		
		contact.DemoContact(contactemail, name, message);
		
		
	}
	
	
*/
	
	
}





