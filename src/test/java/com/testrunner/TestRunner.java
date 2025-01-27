package com.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(stepdefination.class)

@CucumberOptions(
    features = {"src/test/resources/Featurefiles/Data Structures-introduction.feature"},
    glue = {"stepdefination", "com.hooks"},
    plugin = {"pretty", "html:target/cucumberreports.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
//	
//	@Override
//	@DataProvider(parallel = false) 
//	 public Object[][] scenarios() 
//	{
//	   return super.scenarios(); 
//	   }
 }
