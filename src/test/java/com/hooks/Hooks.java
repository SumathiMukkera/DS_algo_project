package com.hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.utilities.configFileReader;
import com.webdrivermanager.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks {

	private WebDriver driver;
	public Properties configProp;
	private DriverManager drivermanager = new DriverManager();
	
	@Before()
	public void setUp() throws IOException {
		configProp = configFileReader.initializeProperties();
		driver=drivermanager.getDriver();
		driver.get(configProp.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@After()
	public void quitBrowser() {
		DriverManager.getDriver().quit();
	}
	}


