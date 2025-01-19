package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Treepage {

	private WebDriver driver;
	
//2. constructure of the page class
	public Treepage(WebDriver driver ) {
		this.driver = driver;
		}
//1.By locators
	private By landingGetStartedbtn=By.xpath("//button[@class=\"btn\"]");
	private By signIn=By.xpath("//a[@href=\"/login\"]");
	
	private By username=By.xpath("//input[@name=\"username\"]");
	private By password = By.xpath("//input[@name=\"password\"]"); 
	
	private	By treeGetStartedBtn = By.xpath("//a[@href='tree']");
	private By overviewTrees = By.xpath("//a[@href=\"overview-of-trees\"]");
	private	By tryHere = By.linkText("Try here>>>");
	private	By texteditor = By.xpath("//div[contains(@class,'CodeMirror')]/div/textarea");
	private By runbutton = By.xpath("//button[text()='Run']");
	private By output = By.id("output");
	
//3.page actions
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	public void landingGetStartedbtnClick() {
		driver.findElement(landingGetStartedbtn).click();
	}
	
	public void SignInBtn() {
		driver.findElement(signIn).click();
	}
	
	public void enterUsername(String userName) {
		driver.findElement(username).sendKeys(userName);
	}
	
	
	
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
