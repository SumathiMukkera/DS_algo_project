package com.hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.DriverFactory.*;
import com.utilities.configFileReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private configFileReader configReader;
	Properties prop;
	
	@Before(order =0)
	public void getProperty() {
		configReader=new configFileReader();
		prop =configReader.init_prop();
	}
	

	@Before(order =1)
	public void launchBrowser() {
		String browsername=prop.getProperty("browser");
		String urlname=prop.getProperty("url");
		driverFactory = new DriverFactory();
		driver= driverFactory.init_driver(browsername);
		 DriverFactory.getDriver().get(urlname);
	
	}
	
	@After(order =0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()) {
			//take screenshot:
			String screenshotName = scenario.getName().replaceAll("", "_");
			byte [] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
	

	}


