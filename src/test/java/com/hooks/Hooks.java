package com.hooks;

import java.io.ByteArrayInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.utilities.LoggerLoad;
import com.utilities.configFileReader;
import com.webdrivermanager.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private configFileReader configReader=new configFileReader();
	Properties prop;
    
	@Before(order =0)
	public void getProperty() {
		configReader=new configFileReader();
		prop =configReader.init_prop();
	}
	
	@Before(order =1)
	public void beforeScenario(Scenario scenario) {
		String browsername=prop.getProperty("browser");
		String urlname=prop.getProperty("url");
		driverFactory = new DriverFactory();
		driver= driverFactory.init_driver(browsername);
		DriverFactory.getDriver().get(urlname);
		 LoggerLoad.info("===== Starting Scenario: " + scenario.getName() + " =====");
		
	}
 
	 // Consolidate driver.quit() in one place
	  @After(order = 0)
	  public void quitDriver() {
		    if (driver != null) {
		        DriverFactory.getDriver().quit();
		        DriverFactory.tlDriver.remove();  // Explicitly remove thread-local driver
		    }
		}

	    // Capture screenshots if scenario fails
	    @After(order = 1)
	    public void tearDown(Scenario scenario) {
	        if (scenario.isFailed()) {
	            // Take screenshot on failure
	            String screenshotName = scenario.getName().replaceAll(" ", "_");
	            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(sourcePath, "image/png", screenshotName);
	            Allure.addAttachment("failedScreenshot", new ByteArrayInputStream(sourcePath));
	            LoggerLoad.error("Scenario Failed: " + scenario.getName());
	        }
	    }
	}





	
	


