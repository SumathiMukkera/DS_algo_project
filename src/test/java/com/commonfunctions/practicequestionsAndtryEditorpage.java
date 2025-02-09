package com.commonfunctions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.ExcelfileReader;



public class practicequestionsAndtryEditorpage {
	
	private WebDriver driver;
	 WebDriverWait wait;
	By Searchthearray=By.xpath("//a[text()='Search the array']");
	By MaxConsecutiveOnes=By.xpath("//a[text()='Max Consecutive Ones']");
    By FindNumberswithEvenNumberofDigits=By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
    By SquaresofaSortedArray = By.xpath("//a[text()='Squares of a Sorted Array']");
    private By TryEditor = By.className("CodeMirror");
	private By runButton = By.xpath("//button[text()='Run']");
	private By submitButton = By.xpath("//input[@type='submit' and @value='Submit']");
	private By output = By.id("output");
	String filepath = "src/test/resources/ExcelTestData/action.xlsx";
	ExcelfileReader reader = new ExcelfileReader();
	 private By alertMessage = By.className("alert");
   
		public practicequestionsAndtryEditorpage(WebDriver driver) {
			this.driver=driver;
			//this.wait = new WebDriverWait(driver, 10);
		}
		
		// Method to navigate to different questions
	    public void navigateToPage(String pageName) {
	        switch (pageName) {
	            case "Search the array":
	                driver.findElement(Searchthearray).click();
	                break;
	            case "Max Consecutive Ones":
	                driver.findElement(MaxConsecutiveOnes).click();
	                break;
	            case "Find Numbers with even numbers of digits":
	                driver.findElement(FindNumberswithEvenNumberofDigits).click();
	                break;
	            case "Squares of Sorted a Array":
	                driver.findElement(SquaresofaSortedArray).click();
	                break;
	        }
	    }

	    // Method to verify TryEditor elements are displayed
	    public boolean isTryEditorDisplayed() {
	    	
			return driver.findElement(TryEditor).isDisplayed();
	    }

	    public boolean isRunButtonDisplayed() {
	        return driver.findElement(runButton).isDisplayed();
	    }

	    public boolean isSubmitButtonDisplayed() {
	        return driver.findElement(submitButton).isDisplayed();
	    }

	    /*public void getExceldata(int action, String expectedmessage) throws InvalidFormatException, IOException {
			 
			List<Map<String, String>> excelData = reader.getData(filepath, action);
			String pythonCode = excelData.get(action).get("Pythoncode");
			TryEditor(pythonCode);
		}*/
	    

	    private void TryEditor(String pythonCode) {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement codeMirror = wait.until(ExpectedConditions.visibilityOfElementLocated(TryEditor));

			// Simulate typing in the editor
			Actions actions = new Actions(driver);
			actions.moveToElement(codeMirror).click().sendKeys(pythonCode).perform();

			
		}

		// Click Run or Submit Button
	    public void clickActionButton(String action) {
	        if (action.equalsIgnoreCase("run")) {
	            driver.findElement(runButton).click();
	        } else if (action.equalsIgnoreCase("submit")) {
	            driver.findElement(submitButton).click();
	        }
	    }
	    
	    /*public String getAlertMessage() {
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        alert.accept();
	        return alertText;
	        
	    }*/
     public String getexpectedmessage() throws InvalidFormatException, IOException {
			
			String action = "action";//run and submit
			List<Map<String, String>> excelData = reader.getData(filepath, getexpectedmessage());
			String expectedmessage = null;
			for(int i = 0; i<excelData.size(); i++) {
			expectedmessage =excelData.get(i).get("expectedmessage");
			System.out.println(expectedmessage);
			}
			return expectedmessage;
			
		}

	    // Get Console or Alert Message Output
	    public String getResultMessage(String expectedResult) {
	       if (expectedResult.contains("alert")) {
	            return wait.until(ExpectedConditions.visibilityOfElementLocated(alertMessage)).getText();
	        } else {
	            return wait.until(ExpectedConditions.visibilityOfElementLocated(output)).getText();
	        }
	    }

		public void clickSearchtheArray() {
		 driver.findElement(Searchthearray).click();
		         
		     }
		     public String getSearchtheArary() {
		    	 return driver.findElement(Searchthearray).getText();
		     }
		     
		     public void clickMaxConsecutiveOnes() {
		         driver.findElement(MaxConsecutiveOnes).click();
		     }
		     public String getMaxConsecutiveOnes() {
		    	 return driver.findElement(MaxConsecutiveOnes).getText();
		     }
		


	          public void clickFindNumbersWithEvenNumberOfDigits() {
		         driver.findElement(FindNumberswithEvenNumberofDigits).click();
		     }
	          public String getFindNumbersWithEvenNumberOfDigits() {
	 	    	 return driver.findElement(FindNumberswithEvenNumberofDigits).getText();
	 	     }
	          
	          public void clickSquaresofaSortedArray() {
	 	    	 driver.findElement(SquaresofaSortedArray).click();
	 	     
	 		}
	 	     public String getSquaresofaSortedArray() {
	  	    	 return driver.findElement(SquaresofaSortedArray).getText();
	  	     }

	          public void clickRun() {
	 	         driver.findElement(runButton).click();
	 	     }

	 	     public void clickSubmit() {
	 	         driver.findElement(submitButton).click();
	 	     }

	 	    public String getexpectedoutput() throws InvalidFormatException, IOException
			{
				String action = "action";
				List<Map<String, String>> excelData = reader.getData(filepath, getexpectedoutput());
				String output = null;
				for(int i = 0; i<excelData.size(); i++) {
				 output =excelData.get(i).get("Output");
				System.out.println(output);
				}
				 return output;
			}



			
		}