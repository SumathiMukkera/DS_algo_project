package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataStructurespage {
	
	public WebDriver driver;
	public WebDriver Wait;
	
	public DataStructurespage(WebDriver Driver) {
		
		this.driver = Driver;
	}
	
	 By home_getstarted =By.xpath("//button[@class='btn']");
	 By DS_getstarted = By.xpath("//a[@href ='data-structures-introduction']");
	 By Timecomplexity = By.xpath("//a[@href='time-complexity']");
	 By Try_here = By.xpath("//a[@class='btn btn-info']");
	 
	 public void navigatetohomepage() {
		  
		  driver.findElement(home_getstarted).click();
	  }
	 
	 public String click_DSgetstarted() {
		 
		WebElement DS_intoduction = driver.findElement(DS_getstarted);
		DS_intoduction.click();
		String dS_title = DS_intoduction.getText();
		return dS_title ;
	 }
	 
	 

}
