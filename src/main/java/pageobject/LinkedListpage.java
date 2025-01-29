package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedListpage {
	
	private WebDriver driver;
	
	private By DSdropdown = By.xpath("//a[@data-toggle='dropdown' and text() = 'Data Structures']");
	private By linkedlist = By.xpath(null);
	private By introduction = By.xpath("");
	private By CreatingLinkedLIst = By.xpath("");
	private By TypesofLinkedList = By.xpath("");
	private By ImplementLinkedList = By.xpath("");
	private By Traversal = By.xpath("");
	private By Insertion = By.xpath("");
	private By Deletion = By.xpath("");
	
	public LinkedListpage(WebDriver Driver) {
		
		this.driver = Driver;
	}

}
