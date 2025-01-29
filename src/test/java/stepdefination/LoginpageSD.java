package stepdefination;

import org.testng.Assert;

import com.DriverFactory.DriverFactory;
import com.utilities.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Homepage;
import pageobject.LoginPage;

public class LoginpageSD{
	public LoginPage login =new LoginPage(DriverFactory.getDriver());
	public Homepage home = new Homepage(DriverFactory.getDriver());
	
	@Given("user is on Homepage")
	public void user_is_on_homepage() {
		home.navigateToHomePage();
		String title = home.gethomepagetitle();
        Assert.assertEquals("NumpyNinja", title);
		//home.navigateToHomePage();
		//Assert.assertTrue(home.isOnhomepage());
        
	}

	@When("user clicks signin button on homepage")
	public void user_clicks_signin_button_on_homepage() {
		//login.navigatetoLoginpage();
		home.clickSignInButton();
	      
	}

	@Then("user redirected to signin page")
	public void user_redirected_to_signin_page() {
		String loginPageTitle = login.getLoginpageTitle();
        Assert.assertEquals(loginPageTitle,"Login");

    }
	

	@Given("The user is on the LoginPage")
	public void the_user_is_on_the_login_page() {
		login.navigatetoLoginpage();
        Assert.assertTrue(login.isOnLoginPage());
	}

	@When("The user clicks register button")
	public void the_user_clicks_register_button() {
		login.navigatetoRegisterpage();
	}

	@Then("The user should redirected to registerpage")
	public void the_user_should_redirected_to_registerpage() {
		 String registerPageTitle = login.getregisterpagetitle();
	        Assert.assertEquals(registerPageTitle,"Registration");

	}

	@When("The user clicks login button after entering the {string} only")
	public void the_user_clicks_login_button_after_entering_the_only(String username) {
		// if (password.isEmpty()) {
	            login.setUsername(username);
	            login.clickLoginButton();
	        }

	//}

	@Then("The error message {string} appears below Password textbox")
	public void the_error_message_appears_below_password_textbox(String expectedErrorMessage) {
		String actualErrorMessage = login.getErrorMessage();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
   
	}
	
	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox(String expectedErrorMessage) {
		String actualErrorMessage = login.getErrorMessage();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
     
	}

	@When("The user clicks login button after entering invalid username and valid password")
	public void the_user_clicks_login_button_after_entering_invalid_username_and_valid_password() {
		login.setUsername("InvalidUsername");
        login.setPassword("ValidPassword");
        login.clickLoginButton();
	}

	@Then("The user should able to see an error message {string}")
	public void the_user_should_able_to_see_an_error_message(String expectedErrorMessage ) {
		String  actualErrorMessage = login.getErrorMessage();
		Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
	}

	@When("The user enter sheetname {string} and rownumber {int}")
	public void the_user_enter_sheet_and(String sheetName, Integer rowNumber) throws Exception {
		ExcelReader excelReader = new ExcelReader(sheetName);

		String excelPath="src/test/resources/TestData/Login.xlsx";
        String username = excelReader.getCellData(sheetName, rowNumber, 0);
        String password = excelReader.getCellData(sheetName, rowNumber, 1);

        // Perform login actions
        login.setUsername(username);
        login.setPassword(password);
        //login.clickLoginButton();

        // Close the reader
        excelReader.close();


	}

	@Then("click login button")
	public void click_login_button() {
		login.clickLoginButton();
	}

	@When("The user clicks login button after entering valid Username and valid Password")
	public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() {
	//@When("The user clicks login button after entering {string}")
	//public void the_user_clicks_login_button_after_entering(String string) {
	    login.setUsername("ValidUsername");
        login.setPassword("ValidPassword");
        login.clickLoginButton();
	}

	@Then("The user should land in Data Structure HomePage with message {string}")
	public void the_user_should_land_in_data_structure_home_page_with_message(String expectedMessage) {
		String actualMessage = login.getYouareloggedin();
        Assert.assertEquals(actualMessage,expectedMessage); 
      
	}

}  

