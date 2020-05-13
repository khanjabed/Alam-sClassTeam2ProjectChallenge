package com.usa.ylbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.usa.ylutil.YLUtil;

public class YLsuperclass {
	public static Logger logger;
	public static WebDriver driver;
	public static Properties prop;
	
  public YLsuperclass() {
		logger = Logger.getLogger("QA Akhar");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
 public  static void initialization() {
	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	 driver = new ChromeDriver();
	
	// driver.navigate().to(prop.getProperty("url"));

	 driver.manage().window().maximize();
	 logger.info("+++++++++++window maximized+++++++++++++++");
	 driver.manage().deleteAllCookies();
     driver.manage().timeouts().pageLoadTimeout(YLUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
	 }
 
 public void teardown() {
	 driver.close();
	 }
 
 public static void qiutdown() {
	 driver.quit();
 }
 
 
 
 
 
 
 
 

 
}
