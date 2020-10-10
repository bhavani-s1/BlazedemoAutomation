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

public class loginPage {

public WebDriver driver;
	
	Helpers h1;
	
	Properties prop1;
	
	Loggerclass log1;
	
	public loginPage(WebDriver driver) 
	{
		
	this.driver=driver;
	}
	
	public void DemoLogin(String emailid, String password) throws FileNotFoundException, IOException
	{
		
		h1=new Helpers(driver);
		
		prop1=PropertyReader.readProperties(Constants.LOCATORS);
		
		log1= new Loggerclass();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		prop1=PropertyReader.readProperties(Constants.LOCATORS);
		
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		
		//h1.clickOperation(prop1.getProperty("loginlink"));
		
		driver.findElement(By.linkText("Log in")).click();
		
		log1.info("clicking on login link");
		
		//driver.findElement(By.xpath(prop1.getProperty("loginusername"))).sendKeys(emailid);
		
		
		log1.info("giving usermail");
		
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop1.getProperty("signpwd"))).sendKeys(password);
		
		log1.info("giving password");
		
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		
		h1.clickOperation(prop1.getProperty("loginclick"));
		
		log1.info("clicking on submit");
		
		
		
		
		
		
		
	}
}
