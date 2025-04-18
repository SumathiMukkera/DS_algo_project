package com.commonfunctions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import com.DriverFactory.DriverFactory;
import com.utilities.ExcelfileReader;
import com.utilities.configFileReader;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.Before;
import pageobject.Commonpage;

public class commonFunctions {
	
	
	private WebDriver driver;
	private configFileReader configReader;
	Properties prop;
	private Commonpage commonpage = new Commonpage(com.webdrivermanager.DriverFactory.getDriver());
	public String expectedOutput = null;
	public String expectedmessage = null;
	
	
	public commonFunctions(WebDriver driver ) {
		this.driver = driver;
		}

public void loginDetails() {	
	configReader=new configFileReader();
	prop =configReader.init_prop();
	String username1=prop.getProperty("username");
    String password1=prop.getProperty("password");
	commonpage.enterCredentials(username1, password1);
	commonpage.submitForLoginClick();
	
	}
	
	// To get the error message in the alert popup
	public String getAlertMessageText() {
		return driver.switchTo().alert().getText();
	}

	// To click ok button on alert popup
	public void closeAlert() {
		driver.switchTo().alert().accept();
	}
	

public void enterExcelDataForTryEditor(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, OpenXML4JException {

		ExcelfileReader reader = new ExcelfileReader();

		List<Map<String, String>> testdata = reader.getData("src\\test\\resources\\ExcelTestData\\TestData.xlsx", sheetname);
		String pythoncode  = testdata.get(rownumber).get("PythonCode");
		String expectedoutput = testdata.get(rownumber).get("Output");
		String expectedmessage = testdata.get(rownumber).get("ExpectedMessage");
		this.expectedmessage=expectedmessage;
		commonpage.ValidInvalidtextEditorOperations(pythoncode);
		
	}

}
	


