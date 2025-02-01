package com.commonfunctions;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.ExcelfileReader;

public class tryEditor {

	private WebDriver driver;
	private By tryHereButton = By.xpath("//a[normalize-space()='Try here>>>']");
	private By runButton = By.xpath("//button[text()='Run']");
	private By tryEditor = By.className("CodeMirror");
	private By output = By.id("output");
	String filepath = "src/test/resources/ExcelTestData/ExcelData.xlsx";
	ExcelfileReader reader = new ExcelfileReader();
	
	public tryEditor(WebDriver driver) {

		this.driver = driver;
		
	}
	
	public void clickTryHere() {

		scrollToElement(tryHereButton);
		driver.findElement(tryHereButton).click();
	}

	public void scrollToElement(By locator) {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(locator);
		actions.moveToElement(element).sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	public String getTryHerePageTitle() {

		return driver.getTitle();
	}

	public void tryeditor(String pythonCode) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement codeMirror = wait.until(ExpectedConditions.visibilityOfElementLocated(tryEditor));

		// Simulate typing in the editor
		Actions actions = new Actions(driver);
		actions.moveToElement(codeMirror).click().sendKeys(pythonCode).perform();

	}
	
	public void runButton() {
		
		WebElement runbutton = driver.findElement(runButton);
		runbutton.click();
		
	}
	
	public void getExceldata(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		 
		List<Map<String, String>> excelData = reader.getData(filepath, sheetName);
		String pythonCode = excelData.get(rowNumber).get("Pythoncode");
		tryeditor(pythonCode);
	}
	public String getexpectedoutput() throws InvalidFormatException, IOException
	{
		String sheetName = "Try Editor";
		List<Map<String, String>> excelData = reader.getData(filepath, sheetName);
		String output = null;
		for(int i = 0; i<excelData.size(); i++) {
		 output =excelData.get(i).get("Output");
		System.out.println(output);
		}
		 return output;
	}
	public String getexpectedMessages() throws InvalidFormatException, IOException {
		
		String sheetName = "Try Editor";
		List<Map<String, String>> excelData = reader.getData(filepath, sheetName);
		String expectedmessage = null;
		for(int i = 0; i<excelData.size(); i++) {
		expectedmessage =excelData.get(i).get("ExpectedMessage");
		System.out.println(expectedmessage);
		}
		return expectedmessage;
		
	}
	
	public List<String> getexpectedResults() throws InvalidFormatException, IOException {
		String sheetName = "Try Editor";
		List<Map<String, String>> excelData = reader.getData(filepath, sheetName);
		List<String> expectedResultsList = new ArrayList<>();
	    
	    for (Map<String, String> row : excelData) {
	        String expectedResult = row.get("Result");
	        if (expectedResult != null) { // Avoid null values
	            expectedResultsList.add(expectedResult.trim());
	        }
	    }
	    
	    System.out.println("Expected Results from Excel: " + expectedResultsList);
	    return expectedResultsList;
	}
		
	
	
	public boolean isAlertPresent() {
		
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 2 seconds
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
	public String handleAlert() {
	    try {
	        Alert alert = driver.switchTo().alert();
	        String alertMessage = alert.getText(); // Capture alert message
	        //System.out.println("Alert Message: " + alertMessage);
	        alert.accept(); // Accept the alert
	        return alertMessage;
	    } catch (NoAlertPresentException e) {
	        System.out.println("No alert present");
	        return null;
	    }
	}
	
	public String getOutput() {
		
		
		return driver.findElement(output).getText();
		
	}

}