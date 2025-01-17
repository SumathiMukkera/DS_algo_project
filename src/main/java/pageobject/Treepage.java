package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Treepage {

	public WebDriver driver;
	public Treepage(WebDriver driver ) {
		this.driver = driver;
		}

	public	By treeGetStartedBtn = By.xpath("//a[@href='tree']");
	public By overviewTrees = By.xpath("//a[@href=\"overview-of-trees\"]");
	public	By tryHere = By.linkText("Try here>>>");
	public	By texteditor = By.xpath("//div[contains(@class,'CodeMirror')]/div/textarea");
	public By runbutton = By.xpath("//button[text()='Run']");
	public By output = By.id("output");
	
	
	public void treeGetStartedBtnClick() {
		driver.findElement(treeGetStartedBtn).click();
	}
	
	public void clickTryHereInTree () {
		driver.findElement(tryHere).click();
	}
	public void textEditorOperations () {
		driver.findElement(texteditor).sendKeys("print(\"Hello World\")");
	}
	
	public void clickRunButton () {
		driver.findElement(runbutton).click();
	}
	
	public void textEditorInvalidOperations () {
		driver.findElement(texteditor).sendKeys("Hello");
	}
	

}
