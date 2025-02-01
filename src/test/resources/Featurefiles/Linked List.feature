@LinkedList
Feature: Linked list module
Open Linked list module in DS-algo portal
  
  Background: Verify that user is able to navigate to Linked list page 
  Given The user is in the Home page after Sign in
  When The user select Linked list item from the drop down menu
  Then The user will be select  Linked list item  from dropdown
     
  Scenario: Verify that user is able to navigate to Introduction page
  Given The user is in the Linked list page after Sign in
  When The user clicks the Introduction button
  Then The user should be redirected to Introduction page 
  
  
  Scenario: Verify that user is able to navigate to tryEditor page from Introduction page
  Given The user is on the Introduction page
  When The user clicks Try Here button in the Introduction page 
  Then The user should be redirected to a page having a tryEditor with a Run button to test 
  
   Scenario Outline: Navigate to tryeditor page from intoduction page and execute Python code
    Given user have to fetch python code from Excel sheet "<Sheet1>" and <rowNumber>
    When  click run button in intoduction
    Then user execute the Python code and validate the output
    Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |
  
 	Scenario: Verify that user is able to navigate to Creating Linked list page from Introduction page	
 	Given The user is in the Linked list page after Sign in	
 	When The user click Creating linked List button	
 	Then The user should be redirected to Creating Linked List page 
 	
 	Scenario: Verify that user is able to navigate to Try Editor page for Creating Linked List page	
 	Given The user is on the Creating Linked List page	
	When The user click Try Here button in Creating Linked List page	
	Then The user should be redirected to a page having a try Editor with a Run button for Creating Linked List page
	
  Scenario Outline: Navigate to tryeditor from Creating Linked list  and execute Python code
    Given user have to fetch python code from Excel file  sheet "<Sheet1>" and <rowNumber>
    When  click run button for validate
    Then user execute the Python code and validate the result with expected results
    Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |
 	
 