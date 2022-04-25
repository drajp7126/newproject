package com.abc.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	/*
	 * purpose =this method will help to launch
	 * 			 browser for specific aplication
	 */	
		public static WebDriver driver;
		public static Properties prop;
		
	public void BrowserLaunch() {
		ReadProperties();
		
		
		  if(prop.getProperty("browsername").equalsIgnoreCase("firefox")) {
		 
			System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		  if(prop.getProperty("browsername").equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			 driver =new ChromeDriver();
		  
		  }
		 
			//driver.get(prop.getProperty("https://opensource-demo.orangehrmlive.com/"));

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt( prop.getProperty("defaultwait")), TimeUnit.SECONDS);
	}
	
	public void ReadProperties() {
		
		prop=new Properties();
		try {
			prop.load(new FileInputStream("resources/Config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
			
			
			
			
			
			
			
}
