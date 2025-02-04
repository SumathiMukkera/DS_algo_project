package com.testrunner;

import java.util.Properties;

import org.testng.annotations.BeforeTest;
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.utilities.configFileReader;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(stepdefination.class)

@CucumberOptions(
    features = {"src/test/resources/Featurefiles"},
    glue = {"stepdefination", "com.hooks"},
    plugin = {"pretty", "html:target/cucumberreports.html",
    		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
    		  "json:target/cucumber-report.json"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	@Parameters("bowserType")
	public void defineBrowser(@Optional String browser) {
		
	    configFileReader.setBrowserType(browser);
	
	}
	
	
	@Override
	@DataProvider(parallel = true) 
	 public Object[][] scenarios() 
	{
	   return super.scenarios(); 
	   }
 }

