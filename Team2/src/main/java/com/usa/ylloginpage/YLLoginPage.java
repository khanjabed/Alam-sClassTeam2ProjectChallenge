package com.usa.ylloginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.usa.ylbase.YLsuperclass;

public class YLLoginPage extends YLsuperclass{
	
	public YLLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
	}
	

}
