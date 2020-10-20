package com.atmecs.balzedemo.pagehelper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo.helpers.Helpers;
import com.atmecs.blazedemo.utilities.Loggerclass;
import com.atmecs.blazedemo.utilities.PropertyReader;

public class SignupPage{
	
	
WebDriver driver;
	
	Helpers h1;
	
	Properties prop1;
	
	Loggerclass log1;
	
	public SignupPage(WebDriver driver) 
	{
		
	this.driver=driver;
	System.out.println(driver);
	}
	
public void DemoSignup(String mailid, String password) throws FileNotFoundException, IOException, InterruptedException {
	
	h1=new Helpers(driver);
	
	log1= new Loggerclass();
	
	prop1=PropertyReader.readProperties(Constants.LOCATORS);
	
	
	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
   
	//h1.clickOperation(prop1.getProperty("signupclick"));
	
	driver.findElement(By.linkText("Sign up")).click();
   
	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	
	h1.textbox(prop1.getProperty("usernametxt"), mailid);
	
	//driver.findElement(By.xpath(prop1.getProperty("username"))).sendKeys("emailid");
	
	log1.info("giving useremailid");
	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	
	h1.textbox(prop1.getProperty("pwdtxt"), password);
	//driver.findElement(By.xpath(prop1.getProperty("signpwd"))).sendKeys("password");
	
	log1.info("giving password");
	
	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	
	h1.clickOperation(prop1.getProperty("signupbtn"));
	
	log1.info("clicking on signup");
	
}
}
	


