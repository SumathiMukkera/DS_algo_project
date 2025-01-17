package stepdefination;

import org.testng.Assert;

import com.webdrivermanager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Treepage;
import com.hooks.*;
public class TreeSD {
	
	private Treepage tree = new Treepage(DriverManager.getDriver());
	
	@Given("User is in home page")
	public void user_is_in_home_page() {
	   
		
	}

	@When("User clicks Get Started of Tree in Home Page.")
	public void user_clicks_get_started_of_tree_in_home_page() {
	   tree.treeGetStartedBtnClick();
	}

	@Then("User should navigate to array Page with title {string}")
	public void user_should_navigate_to_array_page_with_title(String title) {
	    Assert.assertEquals(DriverManager.getDriver().getTitle(), title);
	}

	@When("User clicks in OverView of Trees Page .")
	public void user_clicks_in_over_view_of_trees_page() {
	   
	}

	@Then("User should navigate to Arrays in Python page with title {string}")
	public void user_should_navigate_to_arrays_in_python_page_with_title(String string) {
	    
	}

	@When("User clicks on TryHere link of OverView of Trees page .")
	public void user_clicks_on_try_here_link_of_over_view_of_trees_page() {
	   
	}

	@Then("User should navigate to TryEditor page from OverView of Trees with title {string}")
	public void user_should_navigate_to_try_editor_page_from_over_view_of_trees_with_title(String string) {
	    
	}


}
