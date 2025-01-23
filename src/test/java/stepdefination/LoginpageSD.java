package stepdefination;

import org.testng.Assert;

import com.DriverFactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Homepage;
import pageobject.LoginPage;

public class LoginpageSD{
	public LoginPage login =new LoginPage(DriverFactory.getDriver());
	public Homepage home = new Homepage(DriverFactory.getDriver());
	
	
	
	    @Given("The user is on the DS Algo Home Page")
	    public void the_user_is_on_the_ds_algo_home_page() {
	        String title = home.gethomepagetitle();
	        Assert.assertEquals("DS Algo", title);
	    }

	    @When("The user should click the Login link")
	    public void the_user_should_click_the_login_link() {
	    	login.navigatetoLoginpage();
	       // home.clickLoginLink();
	    }

	    @Then("The user should be redirected to login page")
	    public void the_user_should_be_redirected_to_login_page() {
	        String loginPageTitle = login.getLoginpageTitle();
	        Assert.assertEquals("Login", loginPageTitle);
	    }

	    @Given("The user is on the DS Algo Login Page")
	    public void the_user_is_on_the_ds_algo_login_page() {
	        login.navigatetoLoginpage();
	        Assert.assertTrue(login.isOnLoginPage());
	    }

	    @When("The user clicks register button")
	    public void the_user_clicks_register_button() {
	    	login.navigatetoRegistrationpage();
	        //login.clickRegisterbutton();
	    }

	    @Then("The user should redirected to registationpage")
	    public void the_user_should_redirected_to_registationpage() {
	        String registrationPageTitle = login.getregistrationpagetitle();
	        Assert.assertEquals("Register", registrationPageTitle);
	    }

	    @When("The user clicks login button after entering the {string} and leaves {string} textbox empty")
	    public void the_user_clicks_login_button_after_entering_the_and_leaves_textbox_empty(String username, String password) {
	        if (password.isEmpty()) {
	            login.setUsername(username);
	            login.clickLoginButton();
	        }
	    }

	    @Then("The error message {string} appears below Password textbox")
	    public void the_error_message_appears_below_password_textbox(String expectedErrorMessage) {
	        String actualErrorMessage = login.getErrorMessage();
	        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	    }

	    @When("The user clicks login button after entering the Password only")
	    public void the_user_clicks_login_button_after_entering_the_password_only() {
	        login.setPassword("ValidPassword");
	        login.clickLoginButton();
	    }

	    @Then("The error message {string} appears below Username textbox")
	    public void the_error_message_appears_below_username_textbox(String expectedErrorMessage) {
	        String actualErrorMessage = login.getErrorMessage();
	        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	    }

	    @When("The user clicks login button after entering invalid username and valid password")
	    public void the_user_clicks_login_button_after_entering_invalid_username_and_valid_password() {
	        login.setUsername("InvalidUsername");
	        login.setPassword("ValidPassword");
	        login.clickLoginButton();
	    }

	    @Then("The user should able to see an error message {string}.")
	    public void the_user_should_able_to_see_an_error_message(String expectedErrorMessage) {
	        String  actualErrorMessage = login.getErrorMessage();
	
	        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	    }

	    @Given("The user is on signin page")
	    public void the_user_is_on_signin_page() {
	        login.navigatetoLoginpage();
	        Assert.assertTrue(login.isOnLoginPage());
	    }

	    @When("The user enter sheet {string} and {int}")
	   /* public void the_user_enter_sheet_and(String sheetName, Integer rowIndex) {
	        String username = DataUtility.getCellData(sheetName, rowIndex, "Username");
	        String password = DataUtility.getCellData(sheetName, rowIndex, "Password");

	        loginPage.setUsername(username);
	        loginPage.setPassword(password);
	    }*/

	    @Then("click login button")
	    public void click_login_button() {
	        login.clickLoginButton();
	    }

	    @When("The user clicks login button after entering valid username and valid password")
	    public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() {
	        login.setUsername("ValidUsername");
	        login.setPassword("ValidPassword");
	        login.clickLoginButton();
	    }

	    @Then("The user should land in Data Structure Home Page with message {string}")
	    public void the_user_should_land_in_data_structure_home_page_with_message(String expectedMessage) {
	        String actualMessage = LoginPage.getSuccessMessage();
	        Assert.assertEquals(expectedMessage, actualMessage);
	    }
	}



