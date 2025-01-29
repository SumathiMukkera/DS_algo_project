package com.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tryEditor {
	
		private WebDriver driver;
		private By tryHereButton = By.xpath("//a[normalize-space()='Try here>>>']");
	    private By runButton = By.xpath("//button[text()='Run']");
	    private By tryEditor = By.className("CodeMirror");
	
public tryEditor(WebDriver driver) {
		
		this.driver = driver;
		
	}
  public  void tryeditor() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement codeMirror = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CodeMirror")));

    // Simulate typing in the editor
    Actions actions = new Actions(driver);
    actions.moveToElement(codeMirror).click().sendKeys("print('Hello, World!')").perform();

    // Click the Run button
    WebElement runButton = driver.findElement(By.xpath("//button[text()='Run']"));
    runButton.click();
  }
  
  
  
}
