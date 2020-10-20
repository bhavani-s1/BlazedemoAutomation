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

public class contactPage {

	WebDriver driver;
	
Helpers h1;
Loggerclass log1;
	Properties prop1;
	
	public contactPage(WebDriver driver) 
	{
		
	this.driver=driver;
	}
	
	
	public void DemoContact(String contactemail,String name,String message) throws FileNotFoundException, IOException {
		
		
        h1=new Helpers(driver);
		
		prop1=PropertyReader.readProperties(Constants.LOCATORS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		prop1=PropertyReader.readProperties(Constants.LOCATORS);
		
		h1.clickOperation(prop1.getProperty("contactclick"));
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath(prop1.getProperty("emailtxt"))).sendKeys(contactemail);
		
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        
		driver.findElement(By.xpath(prop1.getProperty("nametxt"))).sendKeys(name);
		
driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop1.getProperty("messagetxt"))).sendKeys(message);
		
		h1.clickOperation(prop1.getProperty("messagebtn"));
		
	}
	
}
