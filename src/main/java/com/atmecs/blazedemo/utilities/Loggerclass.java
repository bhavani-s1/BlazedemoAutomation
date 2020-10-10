package com.atmecs.blazedemo.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.atmecs.blazedemo.constants.Constants;

public class Loggerclass {

	Logger log1;
	
	
	public Loggerclass() {
		
		log4jtest();
		
		log1=Logger.getLogger(Loggerclass.class);
		
	}
	
	public void log4jtest() 
	{
	
		PropertyConfigurator.configure(Constants.LOG4J);
	
	}
	
	public void info(String message)
	
	{
		
		log1.info(message);
		
		
	}
}
