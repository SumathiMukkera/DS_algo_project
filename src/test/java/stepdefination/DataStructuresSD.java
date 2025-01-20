package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.DataStructurespage;

public class DataStructuresSD {
	
	DataStructurespage datapage = new DataStructurespage();
	
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
	    
	}

	@When("The user clicks on Get Started button Data Structures - Introduction")
	public void the_user_clicks_on_get_started_button_data_structures_introduction() {
	   
	}

	@Then("The user should land in Data Structures- Introduction Page")
	public void the_user_should_land_in_data_structures_introduction_page() {
	    
	}

	@Given("The user is in the Data Structures - Introduction page after sign in")
	public void the_user_is_in_the_data_structures_introduction_page_after_sign_in() {
	    
	}

	@When("The user clicks Time Complexity button on Data Structures- Intoduction page")
	public void the_user_clicks_time_complexity_button_on_data_structures_intoduction_page() {
	    
	}

	@Then("The user should be redirected to Time Complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {
	   
	}

	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {
	   
	}

	@When("the user clicks Try here button on Time Complexity page")
	public void the_user_clicks_try_here_button_on_time_complexity_page() {
	    
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   
	}

	@Given("I have the Excel file {string} and sheet {string}")
	public void i_have_the_excel_file_and_sheet(String string, String string2) {
	    
	}

	@When("I fetch the Python code from row {string}")
	public void i_fetch_the_python_code_from_row(String string) {
	    
	}

	@Then("I execute the Python code and validate the result")
	public void i_execute_the_python_code_and_validate_the_result() {
	    
	}

	@When("The user clicks practice Questions Button")
	public void the_user_clicks_practice_questions_button() {
	    
	}

	@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
	    
	}


}
