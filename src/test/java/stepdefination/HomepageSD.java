package stepdefination;

import com.DriverFactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Homepage;

public class HomepageSD {
	
	Homepage home = new Homepage(DriverFactory.getDriver());
	
	@Given("The user has browser open")
	public void the_user_has_browser_open() {
	    
	}

	@When("The user enter correct dsAlgo portal URL")
	public void the_user_enter_correct_ds_algo_portal_url() {
	   
	}

	@Then("The user should be able to land on dsAlgo portal with Get Started button")
	public void the_user_should_be_able_to_land_on_ds_algo_portal_with_get_started_button() {
	    
	}

	@Given("The user is on the DS Algo Portal")
	public void the_user_is_on_the_ds_algo_portal() {
	   
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	   
	}

	@Then("The user should be navigated to the Data Structure Introduction page, which displays the {string} and {string} links.")
	public void the_user_should_be_navigated_to_the_data_structure_introduction_page_which_displays_the_and_links(String string, String string2) {
	   
	}

	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
	    
	}

	@When("The user clicks the Data Structures dropdown")
	public void the_user_clicks_the_data_structures_dropdown() {
	    
	}

	@Then("The user should able to see {int} options {string} in dropdown menu")
	public void the_user_should_able_to_see_options_in_dropdown_menu(Integer int1, String string) {
	   
	}

	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
	    
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
	    
	}

	@When("The user clicks {string} buttons of {string} on the homepage without Sign in")
	public void the_user_clicks_buttons_of_on_the_homepage_without_sign_in(String string, String string2) {
	   
	}

	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) {
	   
	}

	@Given("user is in homepage")
	public void user_is_in_homepage() {
	   
	}

	@When("user clicks register button on homepage")
	public void user_clicks_register_button_on_homepage() {
	    
	}

	@Then("user redirected to registration page")
	public void user_redirected_to_registration_page() {
	   
	}


}
