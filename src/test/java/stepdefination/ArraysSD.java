package stepdefination;


import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.testng.Assert;

import com.DriverFactory.DriverFactory;
import com.hooks.Loginbase;
import com.utilities.ExcelReader;
import com.utilities.practicequestionsAndtryEditorpage;
import com.utilities.tryEditor;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Arrayspage;
import pageobject.DataStructurespage;
import pageobject.Homepage;
import pageobject.LoginPage;

public class ArraysSD {
	
    public Arrayspage Arrays = new Arrayspage(DriverFactory.getDriver());
    //private DataStructurespage data = new DataStructurespage(DriverFactory.getDriver());
     private Loginbase login = new Loginbase();
     private tryEditor editor = new tryEditor(DriverFactory.getDriver());
      private practicequestionsAndtryEditorpage practicequestions = new practicequestionsAndtryEditorpage(DriverFactory.getDriver());
    
    @Before("@Array")
    public void login() throws IOException {
        login.getlogindetails();
    }
   

    	@Given("The user is in the Homepage after logged in")
    	public void the_user_is_in_the_homepage_after_logged_in() {
    		 String title = Arrays.getHomePageTitle();
    		System.out.println(title);
    		Assert.assertEquals(title, "NumpyNinja");
    		
    		
    	}

    	@When("The user clicks on Get Started button of Arrays")
    	public void the_user_clicks_on_get_started_button_of_arrays() {
    	   Arrays.clickArraysGetStartedbutton();
    	}

    	@Then("The user should land in Arrays page")
    	public void the_user_should_land_in_arrays_page() {
    		String title = Arrays.getArraysPageTitle();
            System.out.println(title);
            Assert.assertTrue(title.contains("Array"), "Array");
    	}

    	@Given("The user is in the Arrays page")
    	public void the_user_is_in_the_arrays_page() {
    		String title=Arrays.getArraysPageTitle();
            Assert.assertTrue(title.contains("Array"),"Array");
    	}

    	@When("The user clicks the Arrays in Python button")
    	public void the_user_clicks_the_arrays_in_python_button() {
    	   Arrays.clickArraysinPython();
    	}

    	@Then("The user should be redirected to Arrays in python page")
    	public void the_user_should_be_redirected_to_arrays_in_python_page() {
    		Arrays.getArraysinPythonTittle();
            String title = Arrays.getArraysinPythonTittle();
            System.out.println(title);
            Assert.assertEquals(title, "Arrays In Python");
        }
    	

    	@Given("The user is on the Arrays in Python page")
    	public void the_user_is_on_the_arrays_in_python_page() {
    		Arrays.clickArraysinPython();
            String title = Arrays.getArraysinPythonTittle();
            Assert.assertEquals(title, "Arrays In Python");
    	}

    	@When("The user clicks TryHere button in Arrays in Python page")
    	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
    		Arrays.clickArraysinPython();
             editor.clickTryHere();
    	}

    	@Then("The user should be redirected to TryEditor with a Run button to test")
    	public void the_user_should_be_redirected_to_try_editor_with_a_run_button_to_test() {
    		String text = editor.getTryHerePageTitle();
            System.out.println(text);
            Assert.assertEquals(text, "Assessment");
    	}
    	

    	@Given("user have to fetch python code from Excel file from sheet {string} and {int}")
    	public void user_have_to_fetch_python_code_from_excel_file_from_sheet_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException{

           	Arrays.clickArraysinPython();
      	    editor.clickTryHere();
      	    editor.getExceldata(sheetName, rowNumber);
    	}

    	@When("The user clicks the {string} button")
    	public void the_user_clicks_the_button(String string) {
    		editor.runButton();
    	}

    	@Then("user execute the Python code and validate the result for Arrays in Python")
    	public void user_execute_the_python_code_and_validate_the_result_for_arrays_in_python() throws IOException, InvalidFormatException {
    		 String actualoutput;
    	    	
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
    	

    	@Given("The user is on the Arrays page")
    	public void the_user_is_on_the_arrays_page() {
    		String title=Arrays.getArraysPageTitle();
            Assert.assertTrue(title.contains("Array"),"Array");
    	}
    	

    	@When("The user clicks the Arrays Using List button")
    	public void the_user_clicks_the_arrays_using_list_button() {
    		Arrays.clickArraysUsingList();
    	}

    	@Then("The user should be redirected to Arrays Using List page")
    	public void the_user_should_be_redirected_to_arrays_using_list_page() {
    		Arrays.getArraysUsingListTittle();
            String title = Arrays.getArraysUsingListTittle();
            System.out.println(title);
            Assert.assertEquals(title, "Arrays Using List");
        }
    	

    	@Given("The user is on the Arrays Using List  page")
    	public void the_user_is_on_the_arrays_using_list_page() {
    		String title=Arrays.getArraysUsingListTittle();
            Assert.assertEquals(title,"Arrays Using List");
    	}

    	@When("The user clicks TryHere button in Arrays Using List page")
    	public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
    		Arrays.clickArraysUsingList();
            editor.clickTryHere();
    	}

    	@Then("The user should  redirected to TryEditor with a Run button to test")
    	public void the_user_should_redirected_to_try_editor_with_a_run_button_to_test() {
    		String text = editor.getTryHerePageTitle();
            System.out.println(text);
            Assert.assertEquals(text, "Assessment");
    	}

    	@Given("user have  fetch python code from Excel file from sheet {string} and {int}")
    	public void user_have_fetch_python_code_from_excel_file_from_sheet_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
    		Arrays.clickArraysUsingList();
      	    editor.clickTryHere();
      	    editor.getExceldata(sheetName, rowNumber);
    	}
    	

    	@When("The user click the {string} button")
    	public void the_user_click_the_button(String string) {
       editor.runButton();
    	}

    	@Then("user execute the Python code and validate the result for Arrays Using List Pge")
    	public void user_execute_the_python_code_and_validate_the_result_for_arrays_using_list_pge()  throws IOException, InvalidFormatException{
    		String actualoutput;
	    	
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

    	@Given("The user  on the Arrays Using List page")
    	public void the_user_on_the_arrays_using_list_page() {
    		String title=Arrays.getArraysUsingListTittle();
            Assert.assertEquals(title,"Arrays Using List");
    	}

    	@Then("The user clicks the Basic Operations in Lists button")
    	public void the_user_clicks_the_basic_operations_in_lists_button() {
    		Arrays.clickBasicOperationsinLists();
    	}

    	@When("The user should be redirected to Basic Operations in Lists page")
    	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
    		Arrays.getBasicOperationsinListsTittle();
            String title = Arrays.getBasicOperationsinListsTittle();
            System.out.println(title);
            Assert.assertEquals(title, "Basic Operations in Lists");
    	}

    	@Given("The user is on the Basic Operations in Lists page")
    	public void the_user_is_on_the_basic_operations_in_lists_page() {
    		String title=Arrays.getBasicOperationsinListsTittle();
            Assert.assertEquals(title,"Basic Operations in Lists");
    	}
    	

    	@When("The user click TryHere button in Basic Operations in Lists page")
    	public void the_user_click_try_here_button_in_basic_operations_in_lists_page() {
    		Arrays.clickBasicOperationsinLists();
            editor.clickTryHere();
    	}

    	@Then("user should be redirected to TryEditor with a Run button to test")
    	public void user_should_be_redirected_to_try_editor_with_a_run_button_to_test() {
    		String text = editor.getTryHerePageTitle();
            System.out.println(text);
            Assert.assertEquals(text, "Assessment");
    	}

    	@Given("The User have to fetch python code from Excel file from sheet {string} and {int}")
    	public void the_user_have_to_fetch_python_code_from_excel_file_from_sheet_and1(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException  {
    		Arrays.clickBasicOperationsinLists();
      	    editor.clickTryHere();
      	    editor.getExceldata(sheetName, rowNumber);
    	}

    	@When("user clicks the {string} button")
    	public void user_clicks_the_button(String string) {
    		editor.runButton();
    	}

    	@Then("user execute the Python code and validate the result for Basic Operations in Lists page")
    	public void user_execute_the_python_code_and_validate_the_result_for_basic_operations_in_lists_page() throws IOException, InvalidFormatException{
        		String actualoutput;
    	    	
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

    	@Given("The user on the Basic Operations in Lists page")
    	public void the_user_on_the_basic_operations_in_lists_page() {
    		String title=Arrays.getBasicOperationsinListsTittle();
            Assert.assertEquals(title,"Basic Operations in Lists");
    	}

    	@When("The user click Applications of Array button")
    	public void the_user_click_applications_of_array_button() {
    		Arrays.clickApplicationsofArray();
    	}

    	@Then("The user should be redirected to Applications of Array page")
    	public void the_user_should_be_redirected_to_applications_of_array_page() {
    		Arrays.getApplicationsofArrayTitle();
            String title = Arrays.getApplicationsofArrayTitle();
            System.out.println(title);
            Assert.assertEquals(title, "Applications of Array");
    	}

    	@Given("The user is on the Applications of Array page")
    	public void the_user_is_on_the_applications_of_array_page() {
    		String title=Arrays.getApplicationsofArrayTitle();
            Assert.assertEquals(title,"ApplicationsofArray");
    	}

    	@When("The user click TryHere buton in Applications of Array page")
    	public void the_user_click_try_here_buton_in_applications_of_array_page() {
    		Arrays.clickApplicationsofArray();
            editor.clickTryHere();
    	}

    	@Then("The user should be redirected to TryEditor with a Run button to test the python code")
    	public void the_user_should_be_redirected_to_try_editor_with_a_run_button_to_test_the_python_code() {
    		String text = editor.getTryHerePageTitle();
            System.out.println(text);
            Assert.assertEquals(text, "Assessment");
    	}

    	@Given("The user have to fetch python code from Excel file from sheet {string} and {int}")
    	public void the_user_have_to_fetch_python_code_from_excel_file_from_sheet_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException{
    		Arrays.clickApplicationsofArray();
      	    editor.clickTryHere();
      	    editor.getExceldata(sheetName, rowNumber);

    	}

    	@When("The user clicks the {string} buton")
    	public void the_user_clicks_the_buton(String string) {
    		editor.runButton();
    	}

    	@Then("user execute the Python code and validate the result for Applicatins of Array page")
    	public void user_execute_the_python_code_and_validate_the_result_for_applicatins_of_array_page() throws IOException, InvalidFormatException{
         		String actualoutput;
     	    	
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
    	

    	@Given("The user on Applications of Array page")
    	public void the_user_on_applications_of_array_page() {
    		String title=Arrays.getApplicationsofArrayTitle();
            Assert.assertEquals(title,"ApplicationsofArray");
    	}

    	@When("The user clicks Practice Questions button")
    	public void the_user_clicks_practice_questions_button() {
    		Arrays.clickApplicationsofArray();
            Arrays.clickPracticeQuestions();
    	}

    	@Then("The user should be redirected to Practice page")
    	public void the_user_should_be_redirected_to_practice_page() {
    		String title = Arrays.getPracticeQuestionspageTitle();
            System.out.println(title);
            Assert.assertEquals(title, "Practice Questions");
    	}
    	@Given("The user is on the practice Questions page")
    	public void the_user_is_on_the_practice_questions_page() {
    		String title =Arrays.getPracticeQuestionspageTitle();
            System.out.println(title);
            Assert.assertEquals(title, "Practice Questions");	
    	}

    	@When("The user clicks the Search the array link")
    	public void the_user_clicks_the_search_the_array_link() {
    		practicequestions.clickSearchtheArray();
    	}

    	@Then("The user should be redirected to Questions page contains a question,and TryEditor with Run and Submit buttons")
    	public void the_user_should_be_redirected_to_questions_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
    		
			//Assert.assertTrue(tryEditorPage.getPageTitle().contains("Search the array"));
    		Assert.assertTrue(practicequestions.isTryEditorDisplayed());
            Assert.assertTrue(practicequestions.isRunButtonDisplayed());
            Assert.assertTrue(practicequestions.isSubmitButtonDisplayed());
        
    	}

    	@When("user clicks {string} button on search the array")
    	public void user_clicks_button_on_search_the_array(String action) {
    		 if (action.equalsIgnoreCase("run")) {
    	            practicequestions.clickRun();
    	        } else if (action.equalsIgnoreCase("submit")) {
    	            practicequestions.clickSubmit();
    	        }
    	    }
    	

    	@Then("The user able to see the {string} for Search the array")
    	public void the_user_able_to_see_the_for_search_the_array(String expectedResult ) throws InvalidFormatException, IOException {
    		String actualresult =expectedResult.contains("alert") ? practicequestions.getexpectedmessage() : practicequestions.getexpectedoutput();
    		Assert.assertEquals(expectedResult, actualresult);
        }

    	

    	@When("The user clicks the Max Consecutive Ones page")
    	public void the_user_clicks_the_max_consecutive_ones_page() {
    	 practicequestions.clickMaxConsecutiveOnes();
    	}

    	@Then("The user should be redirected to Max Consecutive Ones page contains a question,and TryEditor with Run and Submit buttons")
    	public void the_user_should_be_redirected_to_max_consecutive_ones_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {

			//Assert.assertTrue(tryEditorPage.getPageTitle().contains("Search the array"));
    		Assert.assertTrue(practicequestions.isTryEditorDisplayed());
            Assert.assertTrue(practicequestions.isRunButtonDisplayed());
            Assert.assertTrue(practicequestions.isSubmitButtonDisplayed());
        
    	}

    	@When("The user clicks {string} button on  Max Consecutive Ones page")
    	public void the_user_clicks_button_on_max_consecutive_ones_page(String action) {
    		 if (action.equalsIgnoreCase("run")) {
 	            practicequestions.clickRun();
 	        } else if (action.equalsIgnoreCase("submit")) {
 	            practicequestions.clickSubmit();
 	        }
    	}

    	@Then("The user able to see {string} for Max Consecutive Ones")
    	public void the_user_able_to_see_for_max_consecutive_ones(String expectedResult) throws InvalidFormatException, IOException {
        		String actualresult =expectedResult.contains("alert") ? practicequestions.getexpectedmessage() : practicequestions.getexpectedoutput();
        		Assert.assertEquals(expectedResult, actualresult);
    	}

    	@When("The user clicks the Find Numbers with even numbers of digits page")
    	public void the_user_clicks_the_find_numbers_with_even_numbers_of_digits_page() {
         practicequestions.clickFindNumbersWithEvenNumberOfDigits();
    	}

    	@Then("The user should be redirected to Find Numbers with even numbers of digits page contains a question,and TryEditor with Run and Submit buttons")
    	public void the_user_should_be_redirected_to_find_numbers_with_even_numbers_of_digits_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
    		Assert.assertTrue(practicequestions.isTryEditorDisplayed());
            Assert.assertTrue(practicequestions.isRunButtonDisplayed());
            Assert.assertTrue(practicequestions.isSubmitButtonDisplayed());
        
    	}

    	@When("The user click {string} button on Find Numbers with even numbers of digits")
    	public void the_user_click_button_on_find_numbers_with_even_numbers_of_digits(String action) {
    		if (action.equalsIgnoreCase("run")) {
 	            practicequestions.clickRun();
 	        } else if (action.equalsIgnoreCase("submit")) {
 	            practicequestions.clickSubmit();
 	        }

    	}

    	@Then("User able to see {string} for Find Numbers with even numbers of digits")
    	public void user_able_to_see_for_find_numbers_with_even_numbers_of_digits(String expectedResult) throws InvalidFormatException, IOException {
        		String actualresult =expectedResult.contains("alert") ? practicequestions.getexpectedmessage() : practicequestions.getexpectedoutput();
        		Assert.assertEquals(expectedResult, actualresult);
    	}

    	@When("The user clicks the Squares of a Sorted Array page")
    	public void the_user_clicks_the_squares_of_a_sorted_array_page() {
    	    practicequestions.clickSquaresofaSortedArray();
    	}

    	@Then("The user should be redirected to Squares of a Sorted Array page contains a question,and TryEditor with Run and Submit buttons")
    	public void the_user_should_be_redirected_to_squares_of_a_sorted_array_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
    		Assert.assertTrue(practicequestions.isTryEditorDisplayed());
            Assert.assertTrue(practicequestions.isRunButtonDisplayed());
            Assert.assertTrue(practicequestions.isSubmitButtonDisplayed());
    	}

    	@When("The user click {string} buton on Squares of a Sorted Array page")
    	public void the_user_click_buton_on_squares_of_a_sorted_array_page(String action) {
    		if (action.equalsIgnoreCase("run")) {
 	            practicequestions.clickRun();
 	        } else if (action.equalsIgnoreCase("submit")) {
 	            practicequestions.clickSubmit();
 	        }
    	}

    	@Then("User able to see the {string} for Squares of a Sorted Array page")
    	public void user_able_to_see_the_for_squares_of_a_sorted_array_page(String expectedResult) throws InvalidFormatException, IOException {
        		String actualresult =expectedResult.contains("alert") ? practicequestions.getexpectedmessage() : practicequestions.getexpectedoutput();
        		Assert.assertEquals(expectedResult, actualresult);
    	}
}


    	    
