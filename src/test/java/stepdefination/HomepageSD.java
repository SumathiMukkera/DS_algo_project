package stepdefination;

import org.testng.Assert;

import com.utilities.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Homepage;

public class HomepageSD {
	
	public Homepage home = new Homepage(com.webdrivermanager.DriverFactory.getDriver());
	
	@Given("The user is on the DS Algo Portal")
	public void the_user_is_on_the_ds_algo_portal() {
		
	home.getlandingpagetitle();  
	LoggerLoad.warn("user is on home page after login");
	
	}
	
	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		
		home.navigateToHomePage();
		LoggerLoad.warn("user is on home page after login");
	}

	@Then("The user should be navigated to the Data Structure Introduction page, which displays the {string} and {string} links.")
	public void the_user_should_be_navigated_to_the_data_structure_introduction_page_which_displays_the_and_links(String string, String string2) {
	   home.isdisplayedonhome();
	   LoggerLoad.warn("user can see register and login buttons");
	}

	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		
		home.gethomepagetitle();
		LoggerLoad.info("user is on home page after login");
	    
	}

	@When("The user clicks the Data Structures dropdown")
	public void the_user_clicks_the_data_structures_dropdown() {
		
     home.clickDSdropdown();
     LoggerLoad.warn("user can see data structure dropdown");
	    
	}

	@Then("The user should able to see {int} options  in dropdown menu")
	public void the_user_should_able_to_see_options_in_dropdown_menu(Integer itemcount) {
		
		int dropdowncount = home.getDropdownItemCount();
		  System.out.println("Expected item count: " + itemcount + ", Actual item count: " + dropdowncount);
		Assert.assertEquals(dropdowncount,itemcount.intValue());
		LoggerLoad.warn("user can see dopdown list");
	   
	}

	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
		home.clickDropdownOption(string);
		LoggerLoad.info("user can click dropsown option");
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String expectedMessage) {
		Assert.assertEquals(expectedMessage, home.getErrorMessage());
		LoggerLoad.warn("user will notify that need to login to application");
	}
	@When("The user clicks Get Started buttons of Data Structures-Introduction on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_data_structures_introduction_on_the_homepage_without_sign_in() {
		
		home.clickDSintrogetstarted();	  
		LoggerLoad.warn("user will notify that need to login to application");
	}
	
	@When("The user clicks Get Started buttons of Array on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_array_on_the_homepage_without_sign_in() {
		home.clickarraygetstarted();
		LoggerLoad.warn("user will notify that need to login to application");
	}
	

	@When("The user clicks Get Started buttons of Linked List on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_linked_list_on_the_homepage_without_sign_in() {
	   home.clicklinkedlistgetstarted();
	   LoggerLoad.warn("user will notify that need to login to application");
	}

	@When("The user clicks Get Started buttons of Stack on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_stack_on_the_homepage_without_sign_in() {
	    home.clickstackgetstarted();
	    LoggerLoad.warn("user will notify that need to login to application");
	}

	@When("The user clicks Get Started buttons of Queue on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_queue_on_the_homepage_without_sign_in() {
	   home.clickqueuegetstarted();
	}

	@When("The user clicks Get Started buttons of Tree on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_tree_on_the_homepage_without_sign_in() {
	    home.clicktreegetstarted();
	}

	@When("The user clicks Get Started buttons of Graph on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_graph_on_the_homepage_without_sign_in() {
	    home.clickgraphgetstarted();
	    LoggerLoad.warn("user will notify that need to login to application");
	}


	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String expectedMessage) {
		Assert.assertEquals(expectedMessage, home.getErrorMessage());
		LoggerLoad.warn("user will notify that need to login to application");
	   
	}

	@Given("user is in homepage")
	public void user_is_in_homepage() {
		
		home.gethomepagetitle();
		LoggerLoad.warn("user is on home page");
	   
	}

	@When("user clicks register button on homepage")
	public void user_clicks_register_button_on_homepage() {
		
		home.clickRegisterButton();
		LoggerLoad.info("user will navigate to register page");
	    
	}

	@Then("user redirected to registration page")
	public void user_redirected_to_registration_page() {
		
	Assert.assertEquals(home.getregistrationpagetitle(), "Registration");
	
	}


}
