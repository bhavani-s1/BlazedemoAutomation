package com.atmecs.blazedemo.basetest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo.utilities.PropertyReader;
import com.atmecs.blazedemo.utilities.ReadingData;

public class BaseTest {

	public WebDriver driver;
	Properties properties;
	String baseUrl;
	String browserUrl;
	
	
	@DataProvider(name="getdata")

	public Object[][] getdata(Method method ) throws IOException
	{
			
	//ReadingData xls=new ReadingData(Constants.EXCELPATH);
	//Object[][] data1=xls.getdata("Sheet1");
		//ReadingData rd=new ReadingData();
		
		//ReadingData rd= new ReadingData();
		
		//String path=Constants.MULTIPLE;
		
		//Object[][]  data1= ReadingData.getdata(method.getName());
		
		ReadingData.getdata(method.getName());
		
		 return ReadingData.getdata(method.getName());
		
	}
		
		
	@BeforeMethod

	@Parameters("browser")

	public void beforeTest(String browser) throws InterruptedException, IOException
	{
	properties = PropertyReader.readProperties(Constants.CONFIG);
	
	baseUrl = properties.getProperty("burl");
	
	browserUrl = properties.getProperty("browser_name");

	if (browserUrl.equalsIgnoreCase("chrome"))
	{
	System.setProperty(Constants.CHROME_DIR, Constants.CHROME_PATH);
	
	driver = new ChromeDriver();
	System.out.println(driver);
	driver.get(baseUrl);
	}

	else if(browserUrl.equalsIgnoreCase("firefox"))
	{
	System.setProperty(Constants.GECKO_DIR, Constants.GECKO_PATH);
	driver = new FirefoxDriver();
	driver.get(baseUrl);
	}

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

	
}

	
	@AfterMethod
	public void afterTest()
	{
	driver.quit();

	}
	
	
}
