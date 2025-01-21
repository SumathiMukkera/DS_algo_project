package pageobject;

import org.openqa.selenium.By;

public class Registrationpage {

	By Username_field = By.xpath("//input[@name='username']");
	By Password_field = By.xpath("//input[@name='password1']");
	By Confirm_password = By.xpath("//input[@name='password2']");
	By Register_registration = By.xpath("//input[@value='Register']");
	By Login_registration = By.xpath("//a[text()='Login ']");
	
	
}
