package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registrationpage {

	private WebDriver driver;
	private By home_getstarted = By.xpath("//button[@class='btn']");
	By Username_field = By.xpath("//input[@name='username']");
	By Password_field = By.xpath("//input[@name='password1']");
	By Confirm_password = By.xpath("//input[@name='password2']");
	By Register_registration = By.xpath("//input[@value='Register']");
	By Login_registration = By.xpath("//a[@href='/login']");
	private By errormsg_register = By.xpath("//div[contains(text(),'password_mismatch')]");

	public Registrationpage(WebDriver Driver) {

		this.driver = Driver;
	}

	public String homepagetitle() {

		driver.findElement(home_getstarted).click();

		return driver.getTitle();

	}

	public void clickregisteremptyfields() {

		driver.findElement(Register_registration).click();
	}

	public boolean getalertmessage() {
		WebElement usermsg = driver.findElement(Username_field);
		boolean isrequired = usermsg.getDomAttribute("required") != null;
		return isrequired;
	}

	public void mismatchpassword() {

	}

	public String mismatchpassworderror() {
		
		driver.get("https://dsportalapp.herokuapp.com/register");
		driver.findElement(By.id("id_username")).sendKeys("Numpysdet192");
		driver.findElement(By.id("id_password1")).sendKeys("test1234");
		driver.findElement(By.id("id_password2")).sendKeys("test1234");
		driver.findElement(Register_registration).click();
		String errortext = driver.findElement(errormsg_register).getText();
		System.out.println(errortext);
		return errortext;

	}
	
	public String existingusererror() {
		
	 String errortext = driver.findElement(errormsg_register).getText();
	 return errortext ;	
	}
	
	public void clickSignInButton() {
		 
	     driver.findElement(Login_registration).click();
	 }
    
	public String getsignpagetitle() {
		
	  driver.findElement(Login_registration).click();
	  String title =  driver.getTitle();
	  return title;
	
		
	}
		
	}

