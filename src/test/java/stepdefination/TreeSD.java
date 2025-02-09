package stepdefination;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Commonpage;
import pageobject.Treepage;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.testng.Assert;

//import com.DriverFactory.DriverFactory;
import com.commonfunctions.commonFunctions;


public class TreeSD {

	private static String title;
	private Treepage tree = new Treepage(com.webdrivermanager.DriverFactory.getDriver());
	private Commonpage commonpage = new Commonpage(com.webdrivermanager.DriverFactory.getDriver());
	private commonFunctions cf = new commonFunctions(com.webdrivermanager.DriverFactory.getDriver());

//################################## Background ###################################
	@Given("User is in landing page")
	public void user_is_in_landing_page() {

	}

	@When("User clicks on getStarted button in landing page and SignIn button in Home Page")
	public void user_clicks_on_get_started_button_in_landing_page_and_sign_in_button_in_home_page() {
		commonpage.landingGetStartedbtnClick();
		commonpage.SignInBtn();
	}

	@When("User enters valid credentials for login and Clicks Submit in Login Page")
	public void user_enters_valid_credentials_for_login_and_clicks_submit_in_login_page() {
		cf.loginDetails();
	}

	@Then("User should navigate to home Page with title {string}")
	public void user_should_navigate_to_home_page_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		//org.testng.Assert.assertTrue(title.contains(Expectedtitle));
		Assert.assertEquals(title, Expectedtitle);
	}
//########################################### Tree Page ##############################
	@Given("User is in Home Page")
	public void user_is_in_home_page() {

	}

	@When("User Clicks in Get Started of Tree Page")
	public void user_clicks_in_get_started_of_tree_page() {
		tree.treeGetStartedBtnClick();
	}

	@Then("User should navigate to Tree page with title {string}")
	public void user_should_navigate_to_tree_page_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		//Assert.assertTrue(title.contains(Expectedtitle));
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	// ################################## Overview of Trees page####################

	@Given("User is in Tree Page")
	public void user_is_in_tree_page() {
		
	}

	@When("User Clicks in Overview of Trees Page")
	public void user_clicks_in_overview_of_trees_page() {
		tree.treeGetStartedBtnClick();
		tree.overviewOfTreesClick();
	}

	@Then("User should navigate to Overview of Trees Page with title {string}")
	public void user_should_navigate_to_overview_of_trees_page_with_title(String Expectedtitle ) {
		title = tree.getPageTitle();
		Assert.assertEquals(title, Expectedtitle);
	}
	
	//#################### Try here  Assessment ##########
	
	@Given("User is in Overview of Tree Page")
	public void user_is_in_overview_of_tree_page() {
		tree.treeGetStartedBtnClick();
		tree.overviewOfTreesClick();
	}

	@When("User Clicks in  try here from Overview of Trees Page")
	public void user_clicks_in_try_here_from_overview_of_trees_page() {
	    commonpage.clickTryHere();
	}

	@Then("User should navigate to Try Here Page with title {string}")
	public void user_should_navigate_to_try_here_page_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		Assert.assertEquals(title, Expectedtitle);
	}

 //########### Valid Python code in Try Here editor Page #################################
	@When("User eenters valid python code in the textBox from the given sheet name {string} and  {int}")
	public void user_eenters_valid_python_code_in_the_text_box_from_the_given_sheet_name_and(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		tree.overviewOfTreesClick();
		commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User clicks on Run Button")
	public void user_clicks_on_run_button() {
		commonpage.clickRunButton();
	}

	@Then("User should see the output in the console of try editor page.")
	public void user_should_see_the_output_in_the_console_of_try_editor_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}
//################### Invalid Python Code in Try here editor Page ################
	@When("User enters invalid python code in the textBox from the given sheet name {string} and  {int}")
	public void user_enters_invalid_python_code_in_the_text_box_from_the_given_sheet_name_and(String sheetname, Integer rownum) throws Exception, Exception, Exception {
		tree.treeGetStartedBtnClick();
		tree.overviewOfTreesClick();
		commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User clicks on Run Button of python page")
	public void user_clicks_on_run_button_of_python_page() {
		commonpage.clickRunButton();
	}

	@Then("User should see alert error message of try editor page.")
	public void user_should_see_alert_error_message_of_try_editor_page() {
		  String actualOutput = cf.getAlertMessageText();
			 Assert.assertEquals(actualOutput,cf.expectedmessage );
			 cf.closeAlert();
	}
//############################################Terminologies of Tree Page ########################
	
	@When("User Clicks in Terminologies of Trees Page")
	public void user_clicks_in_terminologies_of_trees_page() {
	   tree.treeGetStartedBtnClick();
	   tree.TerminologiesClick();
	}

	@Then("User should navigate to Terminologies of Trees Page with title {string}")
	public void user_should_navigate_to_terminologies_of_trees_page_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}
	
//### Try Editor
	@When("User Clicks in Try here from Terminologies of Trees Page")
	public void user_clicks_in_try_here_from_terminologies_of_trees_page() {
		tree.treeGetStartedBtnClick();
		tree.TerminologiesClick();
		commonpage.clickTryHere();
	}

	@Then("User navigates to Try here editor with Title {string}")
	public void user_navigates_to_try_here_editor_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		//Assert.assertTrue(title.contains(Expectedtitle));
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);  
	}
//Valid Python code for Terminologies
	@When("User enters valid python code in the textBox from the sheet name {string} and  {int} of Terminologies page")
	public void user_enters_valid_python_code_in_the_text_box_from_the_sheet_name_and_of_terminologies_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		tree.TerminologiesClick();
		commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User click1 on run button")
	public void user_click1_on_run_button() {
	   commonpage.clickRunButton();
	}

	@Then("User sees the output in the console of try editor page.")
	public void user_sees_the_output_in_the_console_of_try_editor_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}
	
//Invalid Python Code
	@When("User enters invalid python code in the textBox from the given sheet name {string} and  {int} to tryEditor page from Terminologies of Trees page")
	public void user_enters_invalid_python_code_in_the_text_box_from_the_given_sheet_name_and_to_try_editor_page_from_terminologies_of_trees_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		tree.TerminologiesClick();
		commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User clicks on RunButton of try editor")
	public void user_clicks_on_run_button_of_try_editor() {
	   commonpage.clickRunButton();
	}

	@Then("User should see alert error message of try editor page from terminologies.")
	public void user_should_see_alert_error_message_of_try_editor_page_from_terminologies() {
		 String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();
	}
	
//############## Types of Trees page #########################
	
	@When("User Clicks in Types of Trees Page")
	public void user_clicks_in_types_of_trees_page() {
	    tree.treeGetStartedBtnClick();
	    tree.TypesOfTreesClick();
	}

	@Then("User should navigate to Types of Trees Page with title {string}")
	public void user_should_navigate_to_types_of_trees_page_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		//Assert.assertTrue(title.contains(Expectedtitle));
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}
	
	@When("User Clicks in Try here from Types of Trees of Trees Page")
	public void user_clicks_in_try_here_from_types_of_trees_of_trees_page() {
		tree.treeGetStartedBtnClick();
	    tree.TypesOfTreesClick();
		commonpage.clickTryHere();
	}

	@Then("User navigates to Try here editor from Types of Trees with Title {string}")
	public void user_navigates_to_try_here_editor_from_types_of_trees_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User enters valid python code in the textBox from the {string} and  {int} of Types of Trees page")
	public void user_enters_valid_python_code_in_the_text_box_from_the_and_of_types_of_trees_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
	    tree.treeGetStartedBtnClick();
	    tree.TypesOfTreesClick();
	    commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User click on run button from Types of Trees Page")
	public void user_click_on_run_button_from_types_of_trees_page() {
	    commonpage.clickRunButton();
	}

	@Then("User sees the output in the console of try editor from Types of Trees of page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_types_of_trees_of_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from the given sheet  {string} and  {int} to tryEditor page from Types of Trees page page")
	public void user_enters_invalid_python_code_in_the_text_box_from_the_given_sheet_and_to_try_editor_page_from_types_of_trees_page_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		  tree.treeGetStartedBtnClick();
		    tree.TypesOfTreesClick();
		    commonpage.clickTryHere();
	        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User clicks on RunButton of try editor from Types of Trees page")
	public void user_clicks_on_run_button_of_try_editor_from_types_of_trees_page() {
	    commonpage.clickRunButton();
	}

	@Then("User should see alert error message of try editor page from Types of Trees page.")
	public void user_should_see_alert_error_message_of_try_editor_page_from_types_of_trees_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();
	}
	
	//######################### Tree Traversals ##############
	
	@When("User Clicks in Tree Traversals Page")
	public void user_clicks_in_tree_traversals_page() {
	    tree.treeGetStartedBtnClick();
	    tree.TreeTraversalsClick();
	}

	@Then("User should navigate to Tree Traversals Page with title {string}")
	public void user_should_navigate_to_tree_traversals_page_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		Assert.assertTrue(title.contains(Expectedtitle));
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User Clicks in Try here from Tree Traversals Page")
	public void user_clicks_in_try_here_from_tree_traversals_page() {
		tree.treeGetStartedBtnClick();
	    tree.TreeTraversalsClick();
	    commonpage.clickTryHere();
	}

	@Then("User navigates to Try here editor from Tree Traversals with Title {string}")
	public void user_navigates_to_try_here_editor_from_tree_traversals_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User enters valid python code in the textBox from the {string} and  {int} of Tree Traversals page")
	public void user_enters_valid_python_code_in_the_text_box_from_the_and_of_tree_traversals_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
	    tree.TreeTraversalsClick();;
	    commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User click on run button from Tree Traversals Page")
	public void user_click_on_run_button_from_tree_traversals_page() {
	    commonpage.clickRunButton();
	}

	@Then("User sees the output in the console of try editor from Tree Traversals page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_tree_traversals_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from the given sheet  {string} and  {int} to tryEditor page from Tree Traversals page")
	public void user_enters_invalid_python_code_in_the_text_box_from_the_given_sheet_and_to_try_editor_page_from_tree_traversals_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
	    tree.TreeTraversalsClick();;
	    commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User clicks on RunButton of try editor from Tree Traversals page")
	public void user_clicks_on_run_button_of_try_editor_from_tree_traversals_page() {
	    commonpage.clickRunButton();
	}

	@Then("User should see alert error message of try editor page from Tree Traversals page.")
	public void user_should_see_alert_error_message_of_try_editor_page_from_tree_traversals_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();
	}
	
	//#################### Traversals Illustrations ##############################
	
	@When("User Clicks in Traversals-Illustration Page")
	public void user_clicks_in_traversals_illustration_page() {
	   tree.treeGetStartedBtnClick();
	   tree.TraversalillustartionClick();
	}

	@Then("User should navigate to Traversals-Illustration Page with title {string}")
	public void user_should_navigate_to_traversals_illustration_page_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		Assert.assertTrue(title.contains(Expectedtitle));
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User Clicks in Try here from Traversals-Illustration Page")
	public void user_clicks_in_try_here_from_traversals_illustration_page() {
		tree.treeGetStartedBtnClick();
		tree.TraversalillustartionClick();
		commonpage.clickTryHere();
	}

	@Then("User navigates to Try here editor from Traversals-Illustration with Title {string}")
	public void user_navigates_to_try_here_editor_from_traversals_illustration_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		Assert.assertTrue(title.contains(Expectedtitle));
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User enters valid python code in the textBox {string} and  {int} of Traversals-Illustration page")
	public void user_enters_valid_python_code_in_the_text_box_and_of_traversals_illustration_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
	    tree.TraversalillustartionClick();
	    commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User click on run button from Traversals-Illustration Page")
	public void user_click_on_run_button_from_traversals_illustration_page() {
		commonpage.clickRunButton();
	}

	@Then("User sees the output in the console of try editor from Traversals-Illustration page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_traversals_illustration_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from the  {string} and  {int} to tryEditor page from Traversals-Illustration page")
	public void user_enters_invalid_python_code_in_the_text_box_from_the_and_to_try_editor_page_from_traversals_illustration_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
	    tree.TraversalillustartionClick();
	    commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User clicks on RunButton of try editor from Traversals-Illustration page")
	public void user_clicks_on_run_button_of_try_editor_from_traversals_illustration_page() {
	    commonpage.clickRunButton();
	}

	
	@Then("User should see alert error message of try editor page from Traversals-Illustration page.")
	public void user_should_see_alert_error_message_of_try_editor_page_from_traversals_illustration_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();

	}

 //Binary Trees 
	
	@When("User Clicks in Binary Trees Page")
	public void user_clicks_in_binary_trees_page() {
	   tree.treeGetStartedBtnClick();
	   tree.BinaryTreesClick();
	  
	}

	
	@Then("User should navigate to Binary TreesPage with title {string}")
	public void user_should_navigate_to_binary_trees_page_with_title(String Expectedtitle) {
		title = tree.getPageTitle();
		Assert.assertTrue(title.contains(Expectedtitle));
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);


	}

	@When("User Clicks in Try here from Binary Trees Page")
	public void user_clicks_in_try_here_from_binary_trees_page() {
		tree.treeGetStartedBtnClick();
		tree.BinaryTreesClick();
		commonpage.clickTryHere();
	}

	
	@Then("User navigates to Try here editor from Binary Trees with Title {string}")
	public void user_navigates_to_try_here_editor_from_binary_trees_with_title(String Expectedtitle) {
		
		title = tree.getPageTitle();
		Assert.assertTrue(title.contains(Expectedtitle));
		Assert.assertEquals(title, Expectedtitle);

	    
	}

	@When("User enters valid python code in the textBox {string} and  {int} of Binary Trees page")
	public void user_enters_valid_python_code_in_the_text_box_and_of_binary_trees_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
	    tree.BinaryTreesClick();;
	    commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User click on run button from Binary Trees Page")
	public void user_click_on_run_button_from_binary_trees_page() {
	    commonpage.clickRunButton();
	}

	
	@Then("User sees the output in the console of try editor from Binary Trees page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_binary_trees_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from the  {string} and  {int} to tryEditor page from Binary Trees page")
	public void user_enters_invalid_python_code_in_the_text_box_from_the_and_to_try_editor_page_from_binary_trees_page(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
	    tree.BinaryTreesClick();;
	    commonpage.clickTryHere();
        cf.enterExcelDataForTryEditor(sheetname, rownum);
	}

	@When("User clicks on RunButton of try editor from Binary Trees page")
	public void user_clicks_on_run_button_of_try_editor_from_binary_trees_page() {
	    commonpage.clickRunButton();
	}

	
	@Then("User should see alert error message of try editor page from Binary Trees page.")
	public void user_should_see_alert_error_message_of_try_editor_page_from_binary_trees_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();
	}
//Types of Binary trees
	
	@When("User Clicks in Types of Binary Trees Page")
	public void user_clicks_in_types_of_binary_trees_page() {
	   tree.treeGetStartedBtnClick();
	   tree.TypesOfBinaryTreesClick();
	}

	
	@Then("User should navigate to Types of Binary Trees with title {string}")
	public void user_should_navigate_to_types_of_binary_trees_with_title(String Expectedtitle) {
	    String title =tree.getPageTitle();
	    Assert.assertTrue(title.contains(Expectedtitle));
	}

	@When("User Clicks in Try here from Types of Binary Trees Page")
	public void user_clicks_in_try_here_from_types_of_binary_trees_page() {
		tree.treeGetStartedBtnClick();
		tree.TypesOfBinaryTreesClick();
		commonpage.clickTryHere();
	}

	
	@Then("User navigates to Try here editor from Types of Binary Trees with Title {string}")
	public void user_navigates_to_try_here_editor_from_types_of_binary_trees_with_title(String Expectedtitle) {
		String title =tree.getPageTitle();
	    Assert.assertTrue(title.contains(Expectedtitle));
	}

	@When("User enters valid python code in the textBox {string} and  {int} of Types of Binary Trees page and clicks Run button.")
	public void user_enters_valid_python_code_in_the_text_box_and_of_types_of_binary_trees_page_and_clicks_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		tree.TypesOfBinaryTreesClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User sees the output in the console of try editor from Types of Binary Trees.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_types_of_binary_trees() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from the  {string} and  {int} to tryEditor page from Types of Binary Trees page and clicks on run button")
	public void user_enters_invalid_python_code_in_the_text_box_from_the_and_to_try_editor_page_from_types_of_binary_trees_page_and_clicks_on_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		tree.TypesOfBinaryTreesClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User should see alert error message of try editor page from Types of Binary Trees page.")
	public void user_should_see_alert_error_message_of_try_editor_page_from_types_of_binary_trees_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();
	}
	
// Implementation in python page
	@When("User Clicks in Implementation in Python Page")
	public void user_clicks_in_implementation_in_python_page() {
		tree.treeGetStartedBtnClick();
		   tree.ImplementationInPythonClick();
	}
	
	
	@Then("User should navigate to Implementation in Python page with title {string}")
	public void user_should_navigate_to_implementation_in_python_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User Clicks in Try here from Implementation in Python page")
	public void user_clicks_in_try_here_from_implementation_in_python_page() {
		tree.treeGetStartedBtnClick();
		   tree.ImplementationInPythonClick();
		   commonpage.clickTryHere();
	}
	
	
	@Then("User navigates to Try here editor from Implementation in Python page with Title {string}")
	public void user_navigates_to_try_here_editor_from_implementation_in_python_page_with_title(String Expectedtitle) {
		//Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);

	}

	@When("User enters valid python code in the textBox {string} and  {int} of Implementation in Python page and clicks Run button.")
	public void user_enters_valid_python_code_in_the_text_box_and_of_implementation_in_python_page_and_clicks_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		   tree.ImplementationInPythonClick();
		   commonpage.clickTryHere();
		   cf.enterExcelDataForTryEditor(sheetname,rownum );
			commonpage.clickRunButton();
	}

	@Then("User sees the output in the console of try editor from Implementation in Python page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_implementation_in_python_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from the  {string} and  {int} to tryEditor page from Implementation in Python page and clicks on run button")
	public void user_enters_invalid_python_code_in_the_text_box_from_the_and_to_try_editor_page_from_implementation_in_python_page_and_clicks_on_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.ImplementationInPythonClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}
 
	
	@Then("User should see alert error message of try editor page from Implementation in Python page")
	public void user_should_see_alert_error_message_of_try_editor_page_from_implementation_in_python_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();
	}
//Binary Tree Traversals Page
	
	@When("User Clicks in Binary Tree Traversals Page")
	public void user_clicks_in_binary_tree_traversals_page() {
	   tree.treeGetStartedBtnClick(); 
	   tree.BinaryTreeTraversalsClick();
	}

	
	@Then("User should navigate to Binary Tree Traversals page with title {string}")
	public void user_should_navigate_to_binary_tree_traversals_page_with_title(String Expectedtitle) {
	   
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User Clicks in Try here from Binary Tree Traversals page")
	public void user_clicks_in_try_here_from_binary_tree_traversals_page() {
		 tree.treeGetStartedBtnClick(); 
		   tree.BinaryTreeTraversalsClick();
		   commonpage.clickTryHere();
	}

	
	@Then("User navigates to Try here editor from Binary Tree Traversals page with Title {string}")
	public void user_navigates_to_try_here_editor_from_binary_tree_traversals_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User enters valid python code in the textBox {string} and  {int} of Binary Tree Traversals page and clicks Run button.")
	public void user_enters_valid_python_code_in_the_text_box_and_of_binary_tree_traversals_page_and_clicks_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.BinaryTreeTraversalsClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User sees the output in the console of try editor from Binary Tree Traversals in Python page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_binary_tree_traversals_in_python_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from {string} and  {int} to tryEditor page from Binary Tree Traversals page and clicks on run button")
	public void user_enters_invalid_python_code_in_the_text_box_from_and_to_try_editor_page_from_binary_tree_traversals_page_and_clicks_on_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.BinaryTreeTraversalsClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User should see alert error message of try editor page from Binary Tree Traversals in Python page")
	public void user_should_see_alert_error_message_of_try_editor_page_from_binary_tree_traversals_in_python_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();
	}
	
//Implementation of Binary Trees Page
	@When("User Clicks in Implementation of Binary Trees Page")
	public void user_clicks_in_implementation_of_binary_trees_page() {
	    tree.treeGetStartedBtnClick();
	    tree.implementationOfBinaryTreesClick();
	}

	@Then("User should navigate to Implementation of Binary Trees page with title {string}")
	public void user_should_navigate_to_implementation_of_binary_trees_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User Clicks in Try here from Implementation of Binary Trees page")
	public void user_clicks_in_try_here_from_implementation_of_binary_trees_page() {
		tree.treeGetStartedBtnClick();
	    tree.implementationOfBinaryTreesClick();
	    commonpage.clickTryHere();
	}

	
	@Then("User navigates to Try here editor from Implementation of Binary Trees page with Title {string}")
	public void user_navigates_to_try_here_editor_from_implementation_of_binary_trees_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User enters valid python code in the textBox {string} and  {int} of Implementation of Binary Trees page and clicks Run button.")
	public void user_enters_valid_python_code_in_the_text_box_and_of_implementation_of_binary_trees_page_and_clicks_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.implementationOfBinaryTreesClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	@Then("User sees the output in the console of try editor from Implementation of Binary Trees in Python page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_implementation_of_binary_trees_in_python_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from {string} and  {int} to tryEditor page from Implementation of Binary Trees page and clicks on run button")
	public void user_enters_invalid_python_code_in_the_text_box_from_and_to_try_editor_page_from_implementation_of_binary_trees_page_and_clicks_on_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.implementationOfBinaryTreesClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	@Then("User should see alert error message of try editor page from Implementation of Binary Trees page")
	public void user_should_see_alert_error_message_of_try_editor_page_from_implementation_of_binary_trees_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();  
	}
	
//Applications of Binary trees Page
	

	@When("User Clicks in Applications of Binary trees Page")
	public void user_clicks_in_applications_of_binary_trees_page() {
		tree.treeGetStartedBtnClick();
		tree.applicationOfBinaryTreesClick();
	}

	
	@Then("User should navigate to Applications of Binary trees page with title {string}")
	public void user_should_navigate_to_applications_of_binary_trees_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User Clicks in Try here from Applications of Binary trees page")
	public void user_clicks_in_try_here_from_applications_of_binary_trees_page() {
		tree.treeGetStartedBtnClick();
		tree.applicationOfBinaryTreesClick();
		commonpage.clickTryHere();
	}

	
	@Then("User navigates to Try here editor from Applications of Binary trees page with Title {string}")
	public void user_navigates_to_try_here_editor_from_applications_of_binary_trees_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User enters valid python code in the textBox {string} and  {int} of Applications of Binary trees page and clicks Run button.")
	public void user_enters_valid_python_code_in_the_text_box_and_of_applications_of_binary_trees_page_and_clicks_run_button(
			String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.applicationOfBinaryTreesClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User sees the output in the console of try editor from Applications of Binary trees page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_applications_of_binary_trees_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from {string} and  {int} to tryEditor page from Applications of Binary trees and clicks on run button")
	public void user_enters_invalid_python_code_in_the_text_box_from_and_to_try_editor_page_from_applications_of_binary_trees_and_clicks_on_run_button(
			String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.applicationOfBinaryTreesClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User should see alert error message of try editor page from Applications of Binary trees page")
	public void user_should_see_alert_error_message_of_try_editor_page_from_applications_of_binary_trees_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert(); 
	}
	
  //Binary Search Trees Page
	@When("User Clicks in Binary Search Trees Page")
	public void user_clicks_in_binary_search_trees_page() {
	    tree.treeGetStartedBtnClick();
	    tree.BinarySearchTreesClick();
	}

	
	@Then("User should navigate to Binary Search Trees page with title {string}")
	public void user_should_navigate_to_binary_search_trees_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User Clicks in Try here from Binary Search Trees page")
	public void user_clicks_in_try_here_from_binary_search_trees_page() {
		 tree.treeGetStartedBtnClick();
		 tree.BinarySearchTreesClick();
		 commonpage.clickTryHere();
	}

	@Then("User navigates to Try here editor from Binary Search Trees page with Title {string}")
	public void user_navigates_to_try_here_editor_from_binary_search_trees_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User enters valid python code in the textBox {string} and  {int} of Binary Search Trees page and clicks Run button.")
	public void user_enters_valid_python_code_in_the_text_box_and_of_binary_search_trees_page_and_clicks_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.BinarySearchTreesClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User sees the output in the console of try editor from Binary Search Trees in Python page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_binary_search_trees_in_python_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from {string} and  {int} to tryEditor page from Binary Search Trees page and clicks on run button")
	public void user_enters_invalid_python_code_in_the_text_box_from_and_to_try_editor_page_from_binary_search_trees_page_and_clicks_on_run_button(String sheetname , Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.BinarySearchTreesClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User should see alert error message of try editor page from Binary Search Trees in Python page")
	public void user_should_see_alert_error_message_of_try_editor_page_from_binary_search_trees_in_python_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert(); 
	}
	
 // Implementation Of BST Page
	@When("User Clicks in Implementation Of BST Page")
	public void user_clicks_in_implementation_of_bst_page() {
	    tree.treeGetStartedBtnClick();
	    tree.implementationOfBstClick();
	}

	@Then("User should navigate to Implementation Of BST page with title {string}")
	public void user_should_navigate_to_implementation_of_bst_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User Clicks in Try here from Implementation Of BST page")
	public void user_clicks_in_try_here_from_implementation_of_bst_page() {
		tree.treeGetStartedBtnClick();
	    tree.implementationOfBstClick();
	    commonpage.clickTryHere();
	}

	@Then("User navigates to Try here editor from Implementation Of BST page with Title {string}")
	public void user_navigates_to_try_here_editor_from_implementation_of_bst_page_with_title(String Expectedtitle) {
		Assert.assertEquals(tree.getPageTitle(), Expectedtitle);
	}

	@When("User enters valid python code in the textBox {string} and  {int} of Implementation Of BST page and clicks Run button.")
	public void user_enters_valid_python_code_in_the_text_box_and_of_implementation_of_bst_page_and_clicks_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.implementationOfBstClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User sees the output in the console of try editor from Implementation Of BST in Python page.")
	public void user_sees_the_output_in_the_console_of_try_editor_from_implementation_of_bst_in_python_page() {
		String actualOutput = commonpage.getOutput();
		  Assert.assertEquals(actualOutput, cf.expectedOutput);
	}

	@When("User enters invalid python code in the textBox from {string} and  {int} to tryEditor page from Implementation Of BST page and clicks on run button")
	public void user_enters_invalid_python_code_in_the_text_box_from_and_to_try_editor_page_from_implementation_of_bst_page_and_clicks_on_run_button(String sheetname, Integer rownum) throws InvalidFormatException, IOException, OpenXML4JException {
		tree.treeGetStartedBtnClick();
		 tree.implementationOfBstClick();
		commonpage.clickTryHere();
		cf.enterExcelDataForTryEditor(sheetname,rownum );
		commonpage.clickRunButton();
	}

	
	@Then("User should see alert error message of try editor page from Implementation Of BST  page")
	public void user_should_see_alert_error_message_of_try_editor_page_from_implementation_of_bst_page() {
		String actualOutput = cf.getAlertMessageText();
		 Assert.assertEquals(actualOutput,cf.expectedmessage );
		 cf.closeAlert();
	}
}

