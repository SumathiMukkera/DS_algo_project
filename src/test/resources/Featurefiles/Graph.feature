@Graph
Feature: Graph module
 Open graph module in DS-algo portal
  
Background: Verify that user is able to navigate to Graph page	
	Given The user is in the Home page after Sign in	
	When The user clicks the Get Started button for Graph	
	Then The user should land on the Graph Page 
	
	Scenario: Verify that user is able to navigate to Grap h page 
	Given The user is in the Graph page after Signin graph
	When The user clicks inside the Graph button	
	Then The user should be redirected to Graph page 
 
 	Scenario: Verify that user is able to navigate to tryEditor page from Graph page
 	When The user clicks TryHere button in Graph page	
 	Then The user should be redirected to tryEditor with a Run button for Graph page
 	
 	Scenario Outline: verift user able to enter python code and execute for Graph page
 	Given user get python code from excelfile sheet  "<Sheet1>" and <rowNumber> for Graphpage
  When user clicks run button to test python code for Graph page
  Then user able to see output in console and alert message for Graph page
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         | 
 	
 	
 	Scenario: Verify that user is able to navigate to Graph Representation page 
 	When The user clicks Graph Representation button 
 	Then The user should be redirected to Graph Representation page 
 	
 	Scenario: Verify that user is able to navigate to TryEditor page from Graph Representation page	
 	Given The user is on the Graph Representation page	
 	When The user click TryHere button in Graph Representation page	
 	Then The user should be redirected to a page having an try Editor with a Run button in Graph Representation page 
 	
 	Scenario Outline: verift user able to enter python code and execute for Graph Representation page
 	Given user get python code from excelfile sheet  "<Sheet1>" and <rowNumber> for Graph Representation page
  When user clicks run button to test python code for Graph Representation page
  Then user able to see output in console and alert message for Graph Representation page
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         | 
 	
 	
 	
	Scenario: Verify that user is able to navigate to Practice Questions page of Graph
	Given The user is on the Graph Representation page		
  When The user clicks on Practice Questions Link	of Graph
	Then The user be directed to Practice Questions page of Graph
	
	Scenario: verify user able to see practice questions links of Graph
   When user is on practice questions page of Graph
   Then user should see inside the no practice questions of Graph    
	
	Scenario: Verify that user is able to navigate to Signout button 
	Given The user is in the Graph page 
	When The user clicks on Signout	
	Then The user be directed to Home page
	
	
