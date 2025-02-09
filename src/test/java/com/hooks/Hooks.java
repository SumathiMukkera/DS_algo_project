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

	
	@After(order =0)
	public void quitBrowser() {
		 if (driver != null) {

		        driver.quit(); // Quit the browser only if it's initialized
		    } else {
		        LoggerLoad.error("WebDriver instance is null, cannot quit browser.");
		    }

        driver.quit();
    }

	}
	
	@After(order=1)
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()) {
//			take screenshot:
			String screenshotName = scenario.getName().replaceAll("", "_");
			byte [] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
			Allure.addAttachment("failedScreenshot", new ByteArrayInputStream(sourcePath));
			LoggerLoad.error(" Scenario Failed: " + scenario.getName());
			
	}
		

		 if (driver != null) {
		        driver.quit();
		    }
	

	}
}




	
	


