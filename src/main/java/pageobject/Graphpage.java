package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphpage {
	
	public WebDriver driver;
	public Graphpage(WebDriver driver ) {
		this.driver = driver;
		}
	
	By Graphgetstarted = By.xpath("//a[@href='graph']");
	By Graph = By.xpath("//a[@class='list-group-item'][normalize-space()='Graph']");
	By tryhere = By.xpath("//a[@class='list-group-item'][normalize-space()='Graph']");
	By tryeditor=By.xpath("//div[@class='CodeMirror-lines']");
	By run = By.xpath("//button[@type='button']");
	By GraphRepresentations =By.xpath("//a[href='/graph/graph-representations/']");
	By tryhere1= By.xpath("//span[@class='cm-string']");
	By run1=By.xpath("//button[@type=button']");
	By output=By.xpath("//pre[@id=output']");
	By practicequestions=By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	

}
