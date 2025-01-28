package com.hooks;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import com.DriverFactory.DriverFactory;

import Base.Loginexecution;

	public class Loginbase {
	 
	 private	Properties prop;
	 private WebDriver driver;
		
		public Loginexecution login = new Loginexecution(DriverFactory.getDriver());

		public void getlogindetails() throws IOException {
		
			prop = new Properties();
			FileInputStream file = new FileInputStream(("src\\test\\resources\\Confg\\confg.properties"));
			prop.load(file);
		
	     String username = prop.getProperty("username");
	     String password = prop.getProperty("password");
	     
	     login.executeLogin( username, password);
	     
		}
		
		
	}

