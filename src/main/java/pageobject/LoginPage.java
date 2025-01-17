package pageobject;

import org.openqa.selenium.By;

public class LoginPage {

	//public webdriver driver
	//public loginpage
	By Username_field = By.xpath("//input[@name='username']");
	By Password_field = By.xpath("//input[@name='password']");
	By Login_submit = By.xpath("//input[@value='Login']");
	By Register_onlogin = By.xpath("//a[text()='Register!']");
	
	
	
}
