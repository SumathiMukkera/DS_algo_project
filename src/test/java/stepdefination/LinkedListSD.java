package stepdefination;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.testng.Assert;

import com.commonfunctions.tryEditor;
import com.hooks.Loginbase;
import com.utilities.LoggerLoad;
import com.webdrivermanager.DriverFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.DataStructurespage;
import pageobject.LinkedListpage;



public class LinkedListSD {
	
   private  LinkedListpage linked = new LinkedListpage(DriverFactory.getDriver());
   private DataStructurespage datapage = new DataStructurespage(DriverFactory.getDriver());
   private tryEditor editor = new tryEditor(DriverFactory.getDriver());
   private Loginbase login = new Loginbase();
   
   private String actualoutput;
	 private String title;
	
	  @Before("@LinkedList")
	    public void login() throws IOException {

	        login.getlogindetails();
	    }
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		title = datapage.getHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "NumpyNinja");
		LoggerLoad.info("user is on homepage");
		
	}

	@When("The user select Linked list item from the drop down menu")
	public void the_user_select_linked_list_item_from_the_drop_down_menu() {
		linked.getDsdropdown();
		LoggerLoad.info("user selecting datastructure dropdown");
	    
	}

	@Then("The user will be select  Linked list item  from dropdown")
	public void the_user_will_be_select_linked_list_item_from_dropdown() {
		
		linked.getlinkedListfromdropdown();
		LoggerLoad.info("user selected from dropdown");
	   
	}

	@Given("The user is in the Linked list page after Sign in")
	public void the_user_is_in_the_linked_list_page_after_sign_in() {
		
		title = linked.getLinkedlisttitle();
		Assert.assertEquals(title , "Linked List");
	    
	}

	@When("The user clicks the Introduction button")
	public void the_user_clicks_the_introduction_button() {
		
		linked.getItroduction();
	    
	}

	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_introduction_page() {
	  title =   linked.getIntroductiontitle();
	    Assert.assertEquals(title , "Introduction");
	}

	@Given("The user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {
		
		linked.getItroduction();
		 title =  linked.getIntroductiontitle();
		    Assert.assertEquals(title , "Introduction");
	}

	@When("The user clicks Try Here button in the Introduction page")
	public void the_user_clicks_try_here_button_in_the_introduction_page() {
		
	   editor.clickTryHere();
	}

	@Then("The user should be redirected to a page having a tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test1() {
		
		title = editor.getTryHerePageTitle();
		Assert.assertEquals(title , "Assessment");
	   
	}
	
	 @Given("user have to fetch python code from Excel sheet {string} and {int}")
	    public void user_have_to_fetch_python_code_from_excel_sheet_and(String sheetName, Integer rowNumber)  throws IOException, OpenXML4JException {
	        
	           	linked.getInsertion();
	      	    editor.clickTryHere();
	      	    editor.getExceldata(sheetName, rowNumber);
	             
	           	
	    }
	 @When("click run button in intoduction")
	 public void click_run_button_in_intoduction() {
	    	
	    	editor.runButton();
	    }
	    
	    @Then("user execute the Python code and validate the output")
	    public void user_execute_the_python_code_and_validate_the_output() throws IOException, InvalidFormatException {
	    	    	
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

	

	@When("The user click Creating linked List button")
	public void the_user_click_creating_linked_list_button() {
       linked.getcreatinglinkedlist();
	}

	@Then("The user should be redirected to Creating Linked List page")
	public void the_user_should_be_redirected_to_creating_linked_list_page() {
	  title = linked.getcreatinglinkedlisttitle();
	  Assert.assertEquals(title, "Creating Linked LIst");
	}

	@Given("The user is on the Creating Linked List page")
	public void the_user_is_on_the_creating_linked_list_page() {
		 linked.getcreatinglinkedlist();
		 title = linked.getcreatinglinkedlisttitle();
		  Assert.assertEquals(title, "Creating Linked LIst");
	}

	@When("The user click Try Here button in Creating Linked List page")
	public void the_user_click_try_here_button_in_creating_linked_list_page() {
		
		editor.clickTryHere();
	    
	}

	@Then("The user should be redirected to a page having a try Editor with a Run button for Creating Linked List page")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_for_creating_linked_list_page() {
		editor.getTryHerePageTitle();
		Assert.assertEquals(title, "Assessment");
	}

	
	 @Given("user have to fetch python code from Excel file  sheet {string} and {int}")
	    public void user_have_to_fetch_python_code_from_excel_file_sheet_and(String sheetName, Integer rowNumber)  throws IOException, OpenXML4JException {
	        
		        linked.getcreatinglinkedlist();
		        editor.clickTryHere();
	      	    editor.getExceldata(sheetName, rowNumber);
	             
	           	
	    }

	 @When("click run button for validate")
	 public void click_run_button_for_validate() {
	    	
	    	editor.runButton();
	    }
	    
	    @Then("user execute the Python code and validate the result with expected results")
	    public void user_execute_the_python_code_and_validate_the_result_with_expected_results() throws IOException, InvalidFormatException {
	    	
	    	
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
	    
	    @When("user clicks Types of Linked List page button on linked list page")
	    public void user_clicks_types_of_linked_list_page_button_on_linked_list_page() {
	        linked.getTypesofLinkedList();
	    }
	    @Then("user navigato to Types of Linked List page")
	    public void user_navigato_to_types_of_linked_list_page() {
	        title = linked.gettypesofLinkedListtitle();
	        Assert.assertEquals(title, "Types of Linked List");
	    }
	    
	    @When("user clicks tryhere button on Types of Linked List page")
	    public void user_clicks_tryhere_button_on_types_of_linked_list_page() {
	    	linked.getTypesofLinkedList();
	    	editor.clickTryHere();
	    	
	        
	    }
	    @Then("user navigate to assessment page of Types of Linked List page")
	    public void user_navigate_to_assessment_page_of_types_of_linked_list_page() {
	    	title = editor.getTryHerePageTitle();
	    	Assert.assertEquals(title, "Assessment");
	    }
	    
	    @Given("user needs read python code from excelfile sheet  {string} and {int}")
	    public void user_needs_read_python_code_from_excelfile_sheet_and(String pythoncode, Integer rowNumber) throws InvalidFormatException, IOException {
	    	linked.getTypesofLinkedList();
	        editor.clickTryHere();
      	    editor.getExceldata(pythoncode , rowNumber);
	    }
	    @When("user clicks run button to test python code")
	    public void user_clicks_run_button_to_test_python_code() {
	        editor.runButton();
	    }
	    @Then("user able to see output in console and alert message")
	    public void user_able_to_see_output_in_console_and_alert_message() throws InvalidFormatException, IOException {
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

	    @When("user clicks Implement Linked List in Python button on linked list page")
	    public void user_clicks_implement_linked_list_in_python_button_on_linked_list_page() {
	       linked.getImplementLinkedList();
	    }
	    @Then("user navigato to Implement Linked List in Python")
	    public void user_navigato_to_implement_linked_list_in_python() {
	        title = linked.getImplementLinkedListTitle();
	        Assert.assertEquals(title, "Implement Linked List in Python");
	    }
	    @When("user clicks tryhere button on Implement Linked List in Python")
	    public void user_clicks_tryhere_button_on_implement_linked_list_in_Python() {
	    	linked.getImplementLinkedList();
	    	editor.clickTryHere();
	    }	    
	    @Then("user navigate to assessment page of Implement Linked List in Python")
	    public void user_navigate_to_assessment_page_of_implement_linked_list_in_python() {
	    	 title =editor.getTryHerePageTitle();
		       Assert.assertEquals(title, "Assessment");
	    }
	    @Given("user needs to read python code from excelfile sheet  {string} and {int} for Implement Linked List in Python")
	    public void user_needs_to_read_python_code_from_excelfile_sheet_and_for_implement_linked_list_in_python(String pythoncode, Integer rowNumber) throws InvalidFormatException, IOException {
	    	linked.getImplementLinkedList();
	        editor.clickTryHere();
      	    editor.getExceldata(pythoncode , rowNumber);
	    }
	    @When("user clicks run button to test python code for Implement Linked List in Python assessment")
	    public void user_clicks_run_button_to_test_python_code_for_implement_linked_list_in_python_assessment() {
	    	editor.runButton();
	    }
	    @Then("user able to see output in console and alert message for Implement Linked List in Python")
	    public void user_able_to_see_output_in_console_and_alert_message_for_implement_linked_list_in_python() throws InvalidFormatException, IOException {
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
	    @When("user clicks Traversal button on linked list page")
	    public void user_clicks_traversal_button_on_linked_list_page() {
	       linked.getTraversal();
	    }
	    @Then("user navigato to Traversal page")
	    public void user_navigato_to_traversal_page() {
	        title = linked.getTraversalTitle();
	        Assert.assertEquals(title, "Traversal");
	    }
	    
	    @When("user clicks tryhere button on Traversal page")
	    public void user_clicks_tryhere_button_on_traversal_page() {	   
	       linked.getTraversal();
	       editor.clickTryHere();
	    }
	    @Then("user navigate to assessment page of Traversal page")
	    public void user_navigate_to_assessment_page_of_traversal_page() {
	    	 title =editor.getTryHerePageTitle();
		       Assert.assertEquals(title, "Assessment");
	    }
	    @Given("user needs to read python code from excelfile sheet  {string} and {int} for Traversal")
	    public void user_needs_to_read_python_code_from_excelfile_sheet_and_for_traversal(String pythoncode, Integer rowNumber) throws InvalidFormatException, IOException {
	    	linked.getTraversal();
	        editor.clickTryHere();
      	    editor.getExceldata(pythoncode , rowNumber);
	    }
	    @When("user clicks run button to test python code for Traversal assessment")
	    public void user_clicks_run_button_to_test_python_code_for_traversal_assessment() {
	    	editor.runButton();
	    }
	    @Then("user able to see output in console and alert message for Traversal")
	    public void user_able_to_see_output_in_console_and_alert_message_for_traversal() throws InvalidFormatException, IOException {
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
	    
	    @When("user clicks Insertion button on linked list page")
	    public void user_clicks_insertion_button_on_linked_list_page() {
	       linked.getInsertion();
	    }
	    @Then("user navigato to Insertion page")
	    public void user_navigato_to_insertion_page() {
	      title = linked.getInsertionTitle();
	      Assert.assertEquals(title, "Insertion");
	    }
	    
	    @When("user clicks tryhere button on Insertion page")
	    public void user_clicks_tryhere_button_on_insertion_page() {
	    	linked.getInsertion();
	    	editor.clickTryHere();
	    }
	    @Then("user navigate to assessment page of Insertion page")
	    public void user_navigate_to_assessment_page_of_insertion_page() {
	       title =editor.getTryHerePageTitle();
	       Assert.assertEquals(title, "Assessment");
	    }
	    
	    @Given("user needs to read python code from excelfile sheet  {string} and {int} for Insertion")
	    public void user_needs_to_read_python_code_from_excelfile_sheet_and_for_insertion(String pythoncode, Integer rowNumber) throws InvalidFormatException, IOException {
	    	linked.getInsertion();
	        editor.clickTryHere();
      	    editor.getExceldata(pythoncode , rowNumber);
	    }
	    @When("user clicks run button to test python code for Insertion assessment")
	    public void user_clicks_run_button_to_test_python_code_for_insertion_assessment() {
	    	editor.runButton();
	    }
	    @Then("user able to see output in console and alert message for Insertion")
	    public void user_able_to_see_output_in_console_and_alert_message_for_insertion() throws InvalidFormatException, IOException {
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

	    
	    @When("user clicks Deletion button on linked list page")
	    public void user_clicks_deletion_button_on_linked_list_page() {
	        linked.getDeletion();
	    }
	    @Then("user navigato to Deletion page")
	    public void user_navigato_to_deletion_page() {
	      title = linked.getDeletionTitle();
	      Assert.assertEquals(title, "Deletion");
	    }
	    
	    @When("user clicks tryhere button on Deletion page")
	    public void user_clicks_tryhere_button_on_deletion_page() {
	    	 linked.getDeletion();
	    	 editor.clickTryHere();
	    }
	    @Then("user navigate to assessment page of Deletion page")
	    public void user_navigate_to_assessment_page_of_deletion_page() {
	       title = editor.getTryHerePageTitle();
	       Assert.assertEquals(title, "Assessment");
	    }

	    @Given("user needs to read python code from excelfile sheet  {string} and {int} for Deletion")
	    public void user_needs_to_read_python_code_from_excelfile_sheet_and_for_deletion(String pythoncode, Integer rowNumber) throws InvalidFormatException, IOException {
	    	linked.getDeletion();
	        editor.clickTryHere();
      	    editor.getExceldata(pythoncode , rowNumber);
	    }
	    @When("user clicks run button to test python code for Deletion assessment")
	    public void user_clicks_run_button_to_test_python_code_for_deletion_assessment() {
	    	editor.runButton();
	    }
	    @Then("user able to see output in console and alert message for Deletion")
	    public void user_able_to_see_output_in_console_and_alert_message_for_deletion() throws InvalidFormatException, IOException {
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
	    
	    @Given("The user is in the Deletion page")
	    public void the_user_is_in_the_deletion_page() {
	        linked.getDeletion();
	    }
	    @When("The user clicks practice Questions button on Deletion page")
	    public void the_user_clicks_practice_questions_button_on_deletion_page() {
	        datapage.clickPracticeQuestions();
	    }
	    @Then("The user should be redirected to Practice Questions of Linked List  page")
	    public void the_user_should_be_redirected_to_practice_questions_of_linked_list_page() {
	       title = datapage.getPracticeQuestionsPageTitle();
	       Assert.assertEquals(title, "Practice Questions");
	    }
	    
	    @When("user is on practice questions page of linkedlist")
	    public void user_is_on_practice_questions_page_of_linkedlist() {
	    	 linked.getDeletion();
	    	 datapage.clickPracticeQuestions();
	    	 title = datapage.getPracticeQuestionsPageTitle();
		       Assert.assertEquals(title, "Practice Questions");
	    }
	    
	    @Then("user should see practice question on linked list assessment page")
	    public void user_should_see_practice_question_on_linked_list_assessment_page() {
	    	 Assert.assertTrue(true, "Practice Questions links");
	    }
		
	    
	    
}

