package stepdefination;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.utilities.ExcelfileReader;
import com.webdrivermanager.DriverFactory;

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
		//home.navigateToHomePage();
		login.clickGetStartedbutton();
		String title = login.gethomepagetitle();
        Assert.assertEquals("NumpyNinja", title);
        
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
	
	@Given("user is on LoginPage")
	public void user_is_on_login_page() {
		login.navigatetoLoginpage();
        Assert.assertTrue(login.isOnLoginPage());

	}
	@When("The user clicks login button after entering the {string} only")
	public void the_user_clicks_login_button_after_entering_the_only(String username) {
		// if (password.isEmpty()) {
	            login.setUsername(username);
	            login.clickLoginButton();
	        }

	

	@Then("The error message Please fill out this field appears below Password textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_textbox() {
		boolean actualErrorMessage = login.getalertforemptypasswordfield();
		Assert.assertTrue(actualErrorMessage, "The Username field is not marked as required!");
   
	}

   @Given("The user on LoginPage")
   public void the_user_on_login_page() {
	   login.navigatetoLoginpage();
       Assert.assertTrue(login.isOnLoginPage());

   }
   
   @When("The user click login button after entering the {string} only")
	public void the_user_click_login_button_after_entering_the_only(String password) {
		// if (password.isEmpty()) {
	            login.setPassword(password);
	            login.clickLoginButton();
	        }
   
   

   @Then("The error message Please fill out this field appears below Username textbox")
   public void the_error_message_please_fill_out_this_field_appears_below_username_textbox() {
		boolean actualErrorMessage = login.getalertforemptyusernamefield();
		Assert.assertTrue(actualErrorMessage, "The Username field is not marked as required!");
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
		String excelFilePath="src/test/resources/ExcelTestData/ExcelData.xlsx";
		ExcelfileReader reader = new ExcelfileReader();
		 List<Map<String, String>> testData =reader.getData(excelFilePath,sheetName);
          String username = testData.get(rowNumber).get("Username");
		  String password = testData.get(rowNumber).get("Password");
		 
		  login.loginfunction(username, password);
 
	}

	@Then("click login button")
	public void click_login_button() {
		login.clickLoginButton();
	}
	
	@Then("user can see alert user is logged in or not")
	public void user_can_see_alert_user_is_logged_in_or_not() throws InvalidFormatException, IOException {
		
		String actualoutput = login.getErrorMessage();
		String sheetName = "Logindetails";
		String excelFilePath="src/test/resources/ExcelTestData/ExcelData.xlsx";
		
		ExcelfileReader reader = new ExcelfileReader();
		List<Map<String, String>> excelData = reader.getData(excelFilePath, sheetName);
		List<String> expectedResultsList = new ArrayList<>();
	    
	    for (Map<String, String> row : excelData) {
	        String expectedResult = row.get("Expected message");
	        if (expectedResult != null) { // Avoid null values
	            expectedResultsList.add(expectedResult.trim());
	        }
	    }
			
	    List<String> expectedResultsLists = expectedResultsList.stream().map(String::trim) // Trim any spaces
				.filter(expected -> !expected.isEmpty()) // Remove empty strings
				.collect(Collectors.toList());
		boolean matchFound = expectedResultsList.stream()
				.anyMatch(expected -> expected.equalsIgnoreCase(actualoutput != null ? actualoutput.trim() : ""));
		Assert.assertTrue(matchFound);
	}


}  

