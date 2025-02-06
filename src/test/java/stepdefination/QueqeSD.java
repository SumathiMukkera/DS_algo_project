package stepdefination;


import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.DriverFactory.DriverFactory;
import com.hooks.Loginbase;
import com.utilities.tryEditor;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.DataStructurespage;
//import pageobject.DataStructurespage;
import pageobject.Queuepage;

public class QueueSD {
	
	private Queuepage queue = new Queuepage(DriverFactory.getDriver());
	private tryEditor editor = new tryEditor(DriverFactory.getDriver());
	//private DataStructurespage data = new DataStructurespage(DriverFactory.getDriver());
	private Loginbase login = new Loginbase();
    private String actualoutput;

	 @Before("@Queue")
	    public void login() throws IOException {

	        login.getlogindetails();
	    }
	
	
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		 String title = queue.getHomePageTitle();
 		System.out.println(title);
 		Assert.assertEquals(title, "NumpyNinja"); 
	}
	

	@When("The user clicks on Get Started button for Queue")
	public void the_user_clicks_on_get_started_button_for_queue() {
	    queue.clickQueueGetStartedbutton();
	}

	@Then("The user should land in Queue Page")
	public void the_user_should_land_in_queue_page() {
		String title = queue.getQueuePageTitle();
       Assert.assertEquals(title, "Queue");
	}

	@Given("The user is on the Queue page")
	public void the_user_is_on_the_queue_page() {
		//String title = queue.getQueuePageTitle();
	      // Assert.assertEquals(title, "Queue");
	}

	@When("The user clicks Implementation of Queue in Python link")
	public void the_user_clicks_implementation_of_queue_in_python_link() {
	 queue.clickImplementationofQueueinPython();
	}

	@Then("The user should be redirected to Implementation of Queue in Python  page")
	public void the_user_should_be_redirected_to_implementation_of_queue_in_python_page() {
		queue.clickImplementationofQueueinPython();
        String title = queue.getImplementationofQueueinPython();
        Assert.assertEquals(title, "Implementation of Queue in Python ");
	}

	@Given("user is on the Implementation of Queue in Python  page")
	public void user_is_on_the_implementation_of_queue_in_python_page() {
		queue.clickImplementationofQueueinPython();
        String title = queue.getImplementationofQueueinPython();
        Assert.assertEquals(title, "Implementation of Queue in Python ");
	}

	@When("The user clicks TryHere button in Implementation of Queue in Python page")
	public void the_user_clicks_try_here_button_in_implementation_of_queue_in_python_page() {
		queue.clickImplementationofQueueinPython();
		editor.clickTryHere();
	}

	@Then("The user should be redirected to a  Implementation of Queue in Python")
	public void the_user_should_be_redirected_to_a_implementation_of_queue_in_python() {
		String title = editor.getTryHerePageTitle();
		  Assert.assertEquals(title, "Assessment");
		
	}

	@Given("user get python code from excelfile sheet  {string} and {int} for implementation of queue")
	public void user_get_python_code_from_excelfile_sheet_and_for_implementation_of_queue(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException  {
		queue.clickImplementationofQueueinPython();
		editor.clickTryHere();
		editor.getExceldata(sheetName, rowNumber);
	}

	@When("user clicks run button to test python code for implementation of queue")
	public void user_clicks_run_button_to_test_python_code_for_implementation_of_queue() {
	    editor.runButton();
	}

	@Then("user able to see output in console and alert message for implementation of queue")
	public void user_able_to_see_output_in_console_and_alert_message_for_implementation_of_queue()  throws InvalidFormatException, IOException {
				
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
	

	@When("The user clicks Implementation using collections.deque link")
	public void the_user_clicks_implementation_using_collections_deque_link() {
	   queue.clickImplementationusingcollectionsdeque();
	}

	@Then("The user should be redirected to Implementation using collections.deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		 String title = queue.getImplementationusingcollectionsdeque();
	        Assert.assertEquals(title, "Implementation using collections.deque");
		}
	

	@Given("The user is in the Implementation using collections.deque page")
	public void the_user_is_in_the_implementation_using_collections_deque_page() {
		 String title = queue.getImplementationusingcollectionsdeque();
	        Assert.assertEquals(title, " Implementation using collections.deque");
		
	}

	@When("The user clicks TryHere button for Implementation using collections.deque")
	public void the_user_clicks_try_here_button_for_implementation_using_collections_deque() {
		queue.clickImplementationusingcollectionsdeque();
		editor.clickTryHere();
	}

	@Then("The user should be redirected to a page having an try Editor with  Run button")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_run_button() {
		String title = editor.getTryHerePageTitle();
		  Assert.assertEquals(title, "Assessment");

	}

	@Given("user get python code from excelfile sheet  {string} and {int} for implementation collections.deque")
	public void user_get_python_code_from_excelfile_sheet_and_for_implementation_collections_deque(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException  {
			queue.clickImplementationusingcollectionsdeque();
			editor.clickTryHere();
			editor.getExceldata(sheetName, rowNumber);
	}

	@When("user clicks run button to test python code for implementation collections.deque")
	public void user_clicks_run_button_to_test_python_code_for_implementation_collections_deque() {
	 editor.runButton();
	 
	}
	@Then("user able to see output in console and alert message for implementation collections.deque")
	public void user_able_to_see_output_in_console_and_alert_message_for_implementation_collections_deque()  throws InvalidFormatException, IOException {
				
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
	
	

	@When("The user clicks Implementation using Array link")
	public void the_user_clicks_implementation_using_array_link() {
		queue.clickImplementationusingarray();
	}

	@Then("The user should be redirected to Implementation using Array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		 String title = queue.getImplementationusingarray();
	        Assert.assertEquals(title, "Implementation using Array");
	}

	@Given("The user is in the Implementation using Array page")
	public void the_user_is_in_the_implementation_using_array_page() {
		String title = queue.getImplementationusingarray();
        Assert.assertEquals(title, "Implementation using Array");
	}

	@When("The user clicks TryHere button in Implimentation using Array")
	public void the_user_clicks_try_here_button_in_implimentation_using_array() {
		queue.clickImplementationusingarray();
		editor.clickTryHere();
	}

	@Then("The user should be redirected to try Editor with a Run button for Implimentation using Array")
	public void the_user_should_be_redirected_to_try_editor_with_a_run_button_for_implimentation_using_array() {
		String title = editor.getTryHerePageTitle();
		  Assert.assertEquals(title, "Assessment");
	}

	@Given("user get python code from excelfile sheet  {string} and {int} for implementation using Array")
	public void user_get_python_code_from_excelfile_sheet_and_for_implementation_using_array(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException  {
				queue.clickImplementationusingcollectionsdeque();
				editor.clickTryHere();
				editor.getExceldata(sheetName, rowNumber);
	}

	@When("user clicks run button to test python code for implementation using Array")
	public void user_clicks_run_button_to_test_python_code_for_implementation_using_array() {
	  editor.runButton();
	}

	@Then("user able to see output in console and alert message for implementation using Array")
	public void user_able_to_see_output_in_console_and_alert_message_for_implementation_using_array() throws InvalidFormatException, IOException {
			
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

	

	@When("The user clicks Queue Operations link")
	public void the_user_clicks_queue_operations_link() {
		queue.clickQueueOperations();
	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		 String title = queue.getQueueOperations();
	        Assert.assertEquals(title, "Queue Operations");
	}

	@Given("The user is in the Queue Operations  page")
	public void the_user_is_in_the_queue_operations_page() {
		String title = queue.getQueueOperations();
        Assert.assertEquals(title, "Queue Operations");
	}

	@When("The user clicks Try Here button in Queue Operations")
	public void the_user_clicks_try_here_button_in_queue_operations() {
		queue.clickQueueOperations();
		editor.clickTryHere();
	}

	@Then("The user should be redirected to  page having an try Editor with a Run button for Queue Operations")
	public void the_user_should_be_redirected_to_page_having_an_try_editor_with_a_run_button_for_queue_operations() {
		String title = editor.getTryHerePageTitle();
		  Assert.assertEquals(title, "Assessment");
	}

	@Given("user get python code from excelfile sheet  {string} and {int} for Queue Operations")
	public void user_get_python_code_from_excelfile_sheet_and_for_queue_operations(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException  {
			queue.clickImplementationusingcollectionsdeque();
			editor.clickTryHere();
			editor.getExceldata(sheetName, rowNumber);
	}

	@When("user clicks run button to test python code for Queue Operations")
	public void user_clicks_run_button_to_test_python_code_for_queue_operations() {
	    editor.runButton();
	}

	@Then("user able to see output in console and alert message for Queue Operations")
	public void user_able_to_see_output_in_console_and_alert_message_for_queue_operations()throws InvalidFormatException, IOException {
			
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
	
  
    @Given("The user on the Queue Operations page")
    public void the_user_on_the_queue_operations_page() {
    queue.clickQueueOperations();
}

   @When("The user clicks practice Questions button")
   public void the_user_clicks_practice_questions_button() {
      queue.clickPracticeQuestions();
}

  @Then("The user should be redirected to Practice Questions of Queue page")
  public void the_user_should_be_redirected_to_practice_questions_of_queue_page() {
	 String title = queue.getPracticeQuestionsPageTitle();
		Assert.assertEquals(title, "Practice Questions");
}

   @When("user is on practice questions page of Queue")
   public void user_is_on_practice_questions_page_of_queue() {
	   queue.getQueueOperations();
		queue.clickPracticeQuestions();
}

  @Then("user should see practice question on Queue assessment page")
   public void user_should_see_practice_question_on_queue_assessment_page() {
	  Assert.assertTrue(false,"Practice Question link is not visible");
}

}


/*@Then("The user should be redirected to a page having an try Editor with  Run button for Implementation using collections.deque")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_run_button_for_implementation_using_collections_deque() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user able to see output in console and alert message for implementation using collections.deque")
public void user_able_to_see_output_in_console_and_alert_message_for_implementation_using_collections_deque() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should be redirected to try Editor with a Run button for Implementation using Array")
public void the_user_should_be_redirected_to_try_editor_with_a_run_button_for_implementation_using_array() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user able to see output in console and alert message for Queue Operations")
public void user_able_to_see_output_in_console_and_alert_message_for_queue_operations() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();*/


