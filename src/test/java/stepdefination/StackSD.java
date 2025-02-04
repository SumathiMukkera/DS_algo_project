package stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.commonfunctions.tryEditor;
import com.hooks.Loginbase;
import com.webdrivermanager.DriverFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.DataStructurespage;
import pageobject.Stackpage;

public class StackSD {
	
	private static final boolean Questions = false;
	private Stackpage stack = new Stackpage(DriverFactory.getDriver());
	private tryEditor editor = new tryEditor(DriverFactory.getDriver());
	private DataStructurespage data = new DataStructurespage(DriverFactory.getDriver());
	private Loginbase login = new Loginbase();
	private String title;
	private String actualoutput;
	
	 @Before("@stack")
	    public void login() throws IOException {

	        login.getlogindetails();
	    }
	
	@When("The user clicks on Get Started button Stack")
	public void the_user_clicks_on_get_started_button_stack() {
	   
		stack.clickGetStarted();
	}

	@Then("The user should land in Stack Page")
	public void the_user_should_land_in_stack_page() {
	   title = stack.getStacktitle();
	   Assert.assertEquals(title, "Stack");
	}

	@When("The user clicks Operations in Stack link")
	public void the_user_clicks_operations_in_stack_link() {
		
		stack.clickOperationsInStack();
		
	}

	@Then("The user should be redirected to Operations in Stack page")
	public void the_user_should_be_redirected_to_operations_in_stack_page() {
	   
		title = stack.getStacktitle();
		 Assert.assertEquals(title, "Operations in Stack");
	}

	@When("The user clicks Try Here button in Operations in Stack page")
	public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
	  
		stack.clickOperationsInStack();
		editor.clickTryHere();
	}

	@Then("The user should be redirected to operations in stack assessment page")
	public void the_user_should_be_redirected_to_operations_in_stack_assessment_page() {
	  title = editor.getTryHerePageTitle();
	  Assert.assertEquals(title, "Assessment");
	}

	@Given("user needs to read python code from excelfile sheet  {string} and {int} for operations in stack")
	public void user_needs_to_read_python_code_from_excelfile_sheet_and_for_operations_in_stack(String pythoncode, Integer rownumber) throws InvalidFormatException, IOException {
		stack.clickOperationsInStack();
		editor.clickTryHere();
		editor.getExceldata(pythoncode, rownumber);
	}

	@When("user clicks run button to test python code for operations in stack assessment")
	public void user_clicks_run_button_to_test_python_code_for_operations_in_stack_assessment() {
	   editor.runButton();
	}

	@Then("user able to see output in console and alert message for operations in stack assessment")
	public void user_able_to_see_output_in_console_and_alert_message_for_operations_in_stack_assessment() throws InvalidFormatException, IOException {
		
		if(editor.isAlertPresent()) {
			
			 actualoutput = editor.handleAlert();
			 System.out.println(actualoutput);
			} 
			else {
				
			   actualoutput =	editor.getOutput();
			   System.out.println(actualoutput);
			}

			List<String> expectedResultsList = editor.getexpectedResults().stream()
		            .map(String::trim)  // Trim any spaces
		            .filter(expected -> !expected.isEmpty())  // Remove empty strings
		            .collect(Collectors.toList());
			 boolean matchFound = expectedResultsList.stream()
				        .anyMatch(expected -> expected.equalsIgnoreCase(actualoutput != null ? actualoutput.trim() : ""));
				    Assert.assertTrue(matchFound);
	}

	@When("The user clicks Implementation link on stack")
	public void the_user_clicks_implementation_link_on_stack() {
	    
		stack.clickImplementation();
	}

	@Then("The user should be redirected to Implementation of stack")
	public void the_user_should_be_redirected_to_implementation_of_stack() {
	    
		title = stack.getStacktitle();
		 Assert.assertEquals(title, "Implementation");
	}

	@When("The user clicks Try Here button in Implementation page of stack")
	public void the_user_clicks_try_here_button_in_implementation_page_of_stack() {
	   
		stack.clickImplementation();
		editor.clickTryHere();
	}

	@Then("The user should be redirected to assessment page of stack implementation")
	public void the_user_should_be_redirected_to_assessment_page_of_stack_implementation() {
		 title = editor.getTryHerePageTitle();
		  Assert.assertEquals(title, "Assessment");
	}

	@Given("user needs to read python code from excelfile sheet  {string} and {int} for implementation")
	public void user_needs_to_read_python_code_from_excelfile_sheet_and_for_implementation(String pythoncode, Integer rownumber) throws InvalidFormatException, IOException {
		stack.clickImplementation();
		editor.clickTryHere();
		editor.getExceldata(pythoncode, rownumber);
	}

	@When("user clicks run button to test python code for implementation assessment")
	public void user_clicks_run_button_to_test_python_code_for_implementation_assessment() {
	    
		editor.runButton();
	}
	
	@Then("user able to see output in console and alert message for implementation in stack assessment")
	public void user_able_to_see_output_in_console_and_alert_message_for_implementation_in_stack__assessment() throws InvalidFormatException, IOException {
	    
		if(editor.isAlertPresent()) {
			
			 actualoutput = editor.handleAlert();
			 System.out.println(actualoutput);
			} 
			else {
				
			   actualoutput =	editor.getOutput();
			   System.out.println(actualoutput);
			}

			List<String> expectedResultsList = editor.getexpectedResults().stream()
		            .map(String::trim)  // Trim any spaces
		            .filter(expected -> !expected.isEmpty())  // Remove empty strings
		            .collect(Collectors.toList());
			 boolean matchFound = expectedResultsList.stream()
				        .anyMatch(expected -> expected.equalsIgnoreCase(actualoutput != null ? actualoutput.trim() : ""));
				    Assert.assertTrue(matchFound);
	}

	@When("The user clicks Applications link on stack")
	public void the_user_clicks_applications_link_on_stack() {
	   
		stack.clickApplications();
	}

	@Then("The user should be redirected to Applications page")
	public void the_user_should_be_redirected_to_applications_page() {
	    
		title = stack.getStacktitle();
		 Assert.assertEquals(title, "Applications");
	}

	@When("The user clicks Try Here button in Applications page")
	public void the_user_clicks_try_here_button_in_applications_page() {
	   
		stack.clickApplications();
		editor.clickTryHere();
	}

	@Then("The user should be redirected to applictions assessment page")
	public void the_user_should_be_redirected_to_applictions_assessment_page() {
		 title = editor.getTryHerePageTitle();
		  Assert.assertEquals(title, "Assessment");
	}

	@Given("user needs to read python code from excelfile sheet  {string} and {int} for applications assessment")
	public void user_needs_to_read_python_code_from_excelfile_sheet_and_for_applications_assessment(String pythoncode, Integer rownumber) throws InvalidFormatException, IOException {
		stack.clickApplications();
		editor.clickTryHere();
		editor.getExceldata(pythoncode, rownumber);
	}

	@When("user clicks run button to test python code for applications assessment")
	public void user_clicks_run_button_to_test_python_code_for_applications_assessment() {
	  
		editor.runButton();
	}

	@Then("user able to see output in console and alert message for applications assessment")
	public void user_able_to_see_output_in_console_and_alert_message_for_applications_assessment() throws InvalidFormatException, IOException {
	    
		if(editor.isAlertPresent()) {
			
			 actualoutput = editor.handleAlert();
			 System.out.println(actualoutput);
			} 
			else {
				
			   actualoutput =	editor.getOutput();
			   System.out.println(actualoutput);
			}

			List<String> expectedResultsList = editor.getexpectedResults().stream()
		            .map(String::trim)  // Trim any spaces
		            .filter(expected -> !expected.isEmpty())  // Remove empty strings
		            .collect(Collectors.toList());
			 boolean matchFound = expectedResultsList.stream()
				        .anyMatch(expected -> expected.equalsIgnoreCase(actualoutput != null ? actualoutput.trim() : ""));
				    Assert.assertTrue(matchFound);
	}
  
	@Given("The user is in the applications page of stack")
	public void the_user_is_in_the_applications_page_of_stack() {
		stack.clickApplications();
				
	}
	@When("The user clicks practice Questions button on applications page")
	public void the_user_clicks_practice_questions_button_on_applications_page() {
		data.clickPracticeQuestions();

	}
	@Then("The user should be redirected to Practice Questions of stack  page")
	public void the_user_should_be_redirected_to_practice_questions_of_stack_page() {
	   title = data.getPracticeQuestionsPageTitle();
	Assert.assertEquals(title, "Practice Questions");
	}
	
	@When("user is on practice questions page of stack")
	public void user_is_on_practice_questions_page_of_stack() {
		stack.clickApplications();
		data.clickPracticeQuestions();
	}
	@Then("user should see practice question on stack assessment page")
	public void user_should_see_practice_question_on_stack_assessment_page() {
	  
		 Assert.assertTrue(Questions, "Practice Questions links");
	}



}
