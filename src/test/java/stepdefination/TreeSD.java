package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobject.Treepage;

import com.DriverFactory.DriverFactory;
public class TreeSD {
	
	private static String title;
	private Treepage tree = new Treepage(DriverFactory.getDriver());
	
	@Given("User is in landing page")
	public void user_is_in_landing_page() {
		//DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
	}

	@When("Userclicks Get Started of landing Page.")
	public void userclicks_get_started_of_landing_page() {
	   tree.landingGetStartedbtnClick();
	}

	@SuppressWarnings("deprecation")
	@Then("User should navigate to home Page with title {string}")
	public void user_should_navigate_to_home_page_with_title(String Expectedtitle) {
		 title=tree.getPageTitle();
		System.out.println("homepagetitle is" +title);
		Assert.assertTrue(title.contains(Expectedtitle));
	    Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}


}
