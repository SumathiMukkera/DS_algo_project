package stepdefination;

import org.testng.Assert;

import com.DriverFactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Homepage;
import pageobject.Registrationpage;

public class RegistrationpageSD {
	
	public Registrationpage register = new Registrationpage(DriverFactory.getDriver());
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		 String hometitle = register.homepagetitle();
		  System.out.println(hometitle);
		  Assert.assertTrue(hometitle.contains("NumpyNinja"),"The homepage title is incorrect.");
	}

	@When("user name and passsword filed will be empty and then click on register")
	public void user_name_and_passsword_filed_will_be_empty_and_then_click_on_register() {
		
		register.clickregisteremptyfields();
	}

	@Then("user should see alert on required empty field")
	public void user_should_see_alert_on_required_empty_field() {
		boolean isrequired = register.getalertmessage();
		Assert.assertTrue(isrequired, "The Username field is not marked as required!");
	}

	@When("user enters mismatch password in cofirm password field and click on registration field")
	public void user_enters_mismatch_password_in_cofirm_password_field_and_click_on_registration_field() {
	   
	}

	@Then("user should see error message password mismatched")
	public void user_should_see_error_message_password_mismatched() {
		String alertText = register.mismatchpassworderror();
		Assert.assertTrue(alertText.contains("password_mismatch"));
	}

	@When("user enter existing creadentials and enter register button")
	public void user_enter_existing_creadentials_and_enter_register_button() {
	    
	}

	@Then("user should see error message existing account")
	public void user_should_see_error_message_existing_account() {
	   
	}

	@When("user enters login button on registration page")
	public void user_enters_login_button_on_registration_page() {
		register.clickSignInButton();
	}

	@Then("user should redirected to login page")
	public void user_should_redirected_to_login_page() {
		  String signinpagetitle = register.getsignpagetitle();
		  Assert.assertTrue(signinpagetitle.contentEquals("Login"));
	}

	@When("user clicks Register button after entering a password with numeric data")
	public void user_clicks_register_button_after_entering_a_password_with_numeric_data() {
	    
	}

	@Then("user is not able to see error msg after entering invalid data")
	public void user_is_not_able_to_see_error_msg_after_entering_invalid_data() {
	   
	}

	@When("user enters a password less than {int} characters and clicks Register")
	public void user_enters_a_password_less_than_characters_and_clicks_register(Integer int1) {
	    
	}

	@Then("user should see an error {string}")
	public void user_should_see_an_error(String string) {
	    
	}

	@When("user clicks the {string} button after entering a username {string}")
	public void user_clicks_the_button_after_entering_a_username(String string, String string2) {
	    
	}

	@Then("user should see an error message indicating that the username {string}")
	public void user_should_see_an_error_message_indicating_that_the_username(String string) {
	   
	}

	@When("user clicks Register button after entering  with valid username, password and password confirmation in related textboxes")
	public void user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes() {
	  
	}

	@Then("user should be redirected to Home Page of DS Algo with message {string}")
	public void user_should_be_redirected_to_home_page_of_ds_algo_with_message(String string) {
	  
	}

}
