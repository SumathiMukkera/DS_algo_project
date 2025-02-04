package stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.testng.Assert;

import com.commonfunctions.tryEditor;
import com.hooks.Loginbase;
import com.webdrivermanager.DriverFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageobject.Commonpage;
import pageobject.DataStructurespage;

public class DataStructuresSD {

	private static final boolean Questions = false;
	private DataStructurespage datapage = new DataStructurespage(DriverFactory.getDriver());
	Loginbase login = new Loginbase();
	tryEditor editor = new tryEditor(DriverFactory.getDriver());

	@Before("@DS_Introduction")
	public void login() throws IOException {

		login.getlogindetails();
	}

	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		System.out.println(datapage.getHomePageTitle());
		Assert.assertTrue(datapage.getHomePageTitle().contains("NumpyNinja"), "NumpyNinja");
	}

	@When("The user clicks on Get Started button Data Structures - Introduction")
	public void the_user_clicks_on_get_started_button_data_structures_introduction() {
		datapage.clickDSGetStarted();
	}

	@Then("The user should land in Data Structures- Introduction Page")
	public void the_user_should_land_in_data_structures_introduction_page() {

		String title = datapage.getDSIntroPageTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Data Structures-Introduction"), "Data Structures-Introduction");
	}

	@When("The user clicks Time Complexity button on Data Structures- Intoduction page")
	public void the_user_clicks_time_complexity_button_on_data_structures_intoduction_page() {

		datapage.clickTimeComplexity();
	}

	@Then("The user should be redirected to Time Complexity of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {

		datapage.clickTimeComplexity();
		String title = datapage.getTimeComplexityTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Time Complexity"), "Time Complexity");
	}

	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {

		datapage.clickTimeComplexity();
		String title = datapage.getTimeComplexityTitle();
		Assert.assertEquals(title, "Time Complexity");

	}

	@When("the user clicks Try here button on Time Complexity page")
	public void the_user_clicks_try_here_button_on_time_complexity_page() {

		datapage.clickTimeComplexity();
		datapage.clickTryHere();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {

		String text = datapage.getTryHerePageTitle();
		System.out.println(text);
		Assert.assertEquals(text, "Assessment");
	}

	@Given("user have to fetch python code from Excel file from sheet {string} and {int}")
	public void user_have_to_fetch_python_code_from_excel_file_from_sheet_and(String sheetName, Integer rowNumber)
			throws IOException, OpenXML4JException {

		datapage.clickTimeComplexity();
		datapage.clickTryHere();
		editor.getExceldata(sheetName, rowNumber);

	}

	@When("click run button")
	public void click_run_button() {

		editor.runButton();
	}

	@Then("user execute the Python code and validate the result")
	public void user_execute_the_python_code_and_validate_the_result() throws IOException, InvalidFormatException {
		String actualoutput;

		if (editor.isAlertPresent()) {

			actualoutput = editor.handleAlert();
			System.out.println(actualoutput);
		} else {

			actualoutput = editor.getOutput();
			System.out.println(actualoutput);
		}

		List<String> expectedResultsList = editor.getexpectedResults().stream().map(String::trim) // Trim any spaces
				.filter(expected -> !expected.isEmpty()) // Remove empty strings
				.collect(Collectors.toList());
		boolean matchFound = expectedResultsList.stream()
				.anyMatch(expected -> expected.equalsIgnoreCase(actualoutput != null ? actualoutput.trim() : ""));
		Assert.assertTrue(matchFound);
	}

	@When("The user clicks practice Questions button")
	public void the_user_clicks_practice_questions_button() { // failed scenario
		datapage.clickTimeComplexity();
		datapage.clickPracticeQuestions();
	}

	@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
		String title = datapage.getPracticeQuestionsPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Practice Questions");
	}

	@When("user is on practice questions page of datastructurespage")
	public void user_is_on_practice_questions_page_of_datastructurespage() {
		datapage.clickTimeComplexity();
		datapage.clickPracticeQuestions();
		String title = datapage.getPracticeQuestionsPageTitle();
		Assert.assertEquals(title, "Practice Questions");
	}

	@Then("user should see practice question on datastructurespage assessment page")
	public void user_should_see_practice_question_on_datastructurespage_assessment_page() {
		 Assert.assertTrue(Questions, "Practice Questions links");
	}

}
