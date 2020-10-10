package com.atmecs.blazedemo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.constants.Constants;

public class PropertyReader {

	WebDriver driver;
	

	public static Properties properties;

	public static Properties readProperties(String filePath) throws FileNotFoundException, IOException
	{
	properties = new Properties();
	
	properties.load(new FileInputStream(filePath));
	
	return properties;

	
	}

}
	

