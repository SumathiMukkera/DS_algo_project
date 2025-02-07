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
import pageobject.Graphpage;


public class GraphSD {

	private Graphpage graph = new Graphpage(DriverFactory.getDriver());
	private tryEditor editor = new tryEditor(DriverFactory.getDriver());
	//private DataStructurespage data = new DataStructurespage(DriverFactory.getDriver());
	private Loginbase login = new Loginbase();
    private String actualoutput;
	
    

	 @Before("@Graph")
	    public void login() throws IOException {

	        login.getlogindetails();
	    }
	
    
	
	@Given("The user is in the Home page after Sign in for graph")
	public void the_user_is_in_the_home_page_after_sign_in_for_graph() {
		String title = graph.getHomePageTitle();
 		System.out.println(title);
 		Assert.assertEquals(title, "NumpyNinja"); 
	}

	@When("The user clicks the Get Started button for Graph")
	public void the_user_clicks_the_get_started_button_for_graph() {
		 graph.clickGraphGetStartedbutton();
	}
	

	@Then("The user should land on the Graph Page")
	public void the_user_should_land_on_the_graph_page() {
		String title = graph.getGraphPageTitle();
	       Assert.assertEquals(title, "Graph");
	}

	@Given("The user is in the Graph page after Signin graph")
	public void the_user_is_in_the_graph_page_after_signin_graph() {
		String title = graph.getGraphPageTitle();
	       Assert.assertEquals(title, "Graph");
	}

	@When("The user clicks inside the Graph button")
	public void the_user_clicks_inside_the_graph_button() {
		//graph.clickGraphGetStartedbutton();
		graph.clickGraph();
	
	}

	@Then("The user should be redirected to Graph page")
	public void the_user_should_be_redirected_to_graph_page() {
		//graph.clickGraph();
        String title = graph.getGraphPageTitle();
        Assert.assertEquals(title, "Graph");
	}

	@When("The user clicks TryHere button in Graph page")
	public void the_user_clicks_try_here_button_in_graph_page() {
		
		graph.clickGraph();
		editor.clickTryHere();
	}

	@Then("The user should be redirected to tryEditor with a Run button for Graph page")
	public void the_user_should_be_redirected_to_try_editor_with_a_run_button_for_graph_page() {
		String title = editor.getTryHerePageTitle();
		  Assert.assertEquals(title, "Assessment");
	}

	@Given("user get python code from excelfile sheet  {string} and {int} for Graphpage")
	public void user_get_python_code_from_excelfile_sheet_and_for_graphpage(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException  {
				graph.clickGraph();
				editor.clickTryHere();
				editor.getExceldata(sheetName, rowNumber);
	}

	@When("user clicks run button to test python code for Graph page")
	public void user_clicks_run_button_to_test_python_code_for_graph_page() {
		editor.runButton();
	}

	@Then("user able to see output in console and alert message for Graph page")
	public void user_able_to_see_output_in_console_and_alert_message_for_graph_page() throws InvalidFormatException, IOException {
			
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


	

	@When("The user clicks Graph Representation button")
	public void the_user_clicks_graph_representation_button() {
		graph.clickGraphRepresentations();
	}

	@Then("The user should be redirected to Graph Representation page")
	public void the_user_should_be_redirected_to_graph_representation_page() {
		String title = graph.getGraphRepresentations();
        Assert.assertEquals(title, "Graph Representations");
	}

	@Given("The user is on the Graph Representation page")
	public void the_user_is_on_the_graph_representation_page() {
		graph.clickGraphRepresentations();
		String title = graph.getGraphRepresentations();
        Assert.assertEquals(title, "Graph Representations");
	}

	@When("The user click TryHere button in Graph Representation page")
	public void the_user_click_try_here_button_in_graph_representation_page() {
		
		editor.clickTryHere();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button in Graph Representation page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_in_graph_representation_page() {
		String title = editor.getTryHerePageTitle();
		  Assert.assertEquals(title, "Assessment");
	}

	@Given("user get python code from excelfile sheet  {string} and {int} for Graph Representation page")
	public void user_get_python_code_from_excelfile_sheet_and_for_graph_representation_page(String sheetNamee, Integer rowNumber) throws InvalidFormatException, IOException  {
		  graph.clickGraphRepresentations();
			editor.clickTryHere();
			editor.getExceldata(sheetNamee, rowNumber);
	}

	@When("user clicks run button to test python code for Graph Representation page")
	public void user_clicks_run_button_to_test_python_code_for_graph_representation_page() {
		editor.runButton();
	}
	

	@Then("user able to see output in console and alert message for Graph Representation page")
	public void user_able_to_see_output_in_console_and_alert_message_for_graph_representation_page() throws InvalidFormatException, IOException {
			
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


	
	

	@When("The user clicks on Practice Questions Link	of Graph")
	public void the_user_clicks_on_practice_questions_link_of_graph() {
		graph.clickGraphRepresentations();
		graph.clickPracticeQuestions();
		//graph.clickPracticeQuestions();
	}

	@Then("The user be directed to Practice Questions page of Graph")
	public void the_user_be_directed_to_practice_questions_page_of_graph() {
		String title = graph.getPracticeQuestionsPageTitle();
		Assert.assertEquals(title, "Practice Questions");
	}

	@When("user is on practice questions page of Graph")
	public void user_is_on_practice_questions_page_of_graph() {
		graph.clickGraphRepresentations();
		graph.clickPracticeQuestions();
	}
	

	@Then("user should see inside the no practice questions of Graph")
	public void user_should_see_inside_the_no_practice_questions_of_graph() {
		Assert.assertTrue(false,"Practice Question link is not visible");
	
	}

	@Given("The user is in the Graph page")
	public void the_user_is_in_the_graph_page() {
		String title = graph.getGraphPageTitle();
	       Assert.assertEquals(title, "Graph");  
	}

	@When("The user clicks on Signout")
	public void the_user_clicks_on_signout() {
	 graph.clickSignout();
	}

	@Then("The user be directed to Home page")
	public void the_user_be_directed_to_home_page() {
		String title = graph.getHomePageTitle();
 	  Assert.assertEquals(title, "NumpyNinja"); 
	}
	}


   


