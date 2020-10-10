package com.atmecs.blazedemo.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helpers {

  WebDriver driver;
	
	public Helpers(WebDriver driver)
	{
		
		this.driver=driver;
		
		System.out.println(driver);
		
	}
public void clickOperation(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void textbox(String xpath,String value) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	

	
}
