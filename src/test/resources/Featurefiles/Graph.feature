Feature: Graph module
Open graph module in DS-algo portal
  
Background: The user sign in to dsAlgo Portal 
  
	Scenario: Verify that user is able to navigate to Graph page	
	Given The user is in the Home page after Sign in	
	When The user clicks the dropdownn menu and select Graph	
	Then The user will redirected to be Graph Page 
	
	Scenario: Verify that user is able to navigate to Graph page 
	Given The user is in the Graph page after Sign in	
	When The user clicks Graph button	
	Then The user should be redirected to Graph page 
 
 	Scenario: Verify that user is able to navigate to try Editor page from Graph page	
 	Given The user is on the Graph page 
 	When The user clicks Try Here button in Graph page	
 	Then The user should be redirected to a page having an try Editor with a Run button to test 
 	
 	Scenario: Verify that user receives error when click on Run button without entering code for Graph page	
 	Given The user is in the tryEditor page	
 	When The user clicks the Run button without entering the code in the Editor	
 	Then The user should able to see an error message in alert window 
 	
 	Scenario: Verify that user receives error for invalid python code for Graph page	
 	Given The user is in the tryEditor page	
 	When The user write the invalid code in Editor and click the Run button	
 	Then The user should able to see an error message in alert window its display the NameError: name 'test' is not defined on line 1 
 	
 	Scenario: Verify that user is able to see output for valid python code for Graph page	
 	Given The user is in the tryEditor page	
 	When The user write the valid code in Editor and click the Run button	
 	Then The user should able to see output in the console 
 	
 	
 	Scenario: Verify that user is able to navigate to Graph Representation page from Graph page
 	Given The user is in the Array page after Sign in	
 	When The user clicks Graph Representation button 
 	Then The user should be redirected to Graph Representation page 
 	
 	Scenario: Verify that user is able to navigate to Try Editor page from Graph Representation page	
 	Given The user is on the Graph Representation page	
 	When The user click Try Here button in Graph Representation page	
 	Then The user should be redirected to a page having an try Editor with a Run button to test 
 	
 	Scenario: Verify that user receives an error when click on Run button without enter code for Graph Representation page	
 	Given The user is in the Try Editor page	
	When The user clicks the Run button without entering the code in the Editor	
	Then User should able to see error message in alert window 
	
	Scenario: Verify that user receives error for invalid python code for Graph Representation page	
	Given The user in the Try Editor page	
	When The user click the Run button entering invalid code in the editor	
	Then User should able to see error message in alert window 
	
	Scenario: Verify that user is able to navigate to Practice Questions page	
	Given The user is in the Graph page 
	When The user clicks on Practice Questions Link	
	Then The user be directed to Practice Questions page 
	
	Scenario: Verify that the user is able to navigate to tha landing page	
	Given The user is in the Graph page 
	When Click on the Numpy Ninja button 
	Then The user should be redirected to landing page 
	
	Scenario: Verify that user is able to navigate to Signout button 
	Given The user is in the Graph page 
	When The user clicks on Signout	
	Then The user be directed to Home page
	
	
