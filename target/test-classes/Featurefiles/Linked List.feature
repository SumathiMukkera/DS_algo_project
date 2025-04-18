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
 	Scenario: verify user able to navigate to Types of Linked List page 
 	When user clicks Types of Linked List page button on linked list page
 	Then user navigato to Types of Linked List page 
 	
 	Scenario: verify user navigate to tryeditor from Types of Linked List page 
 	When user clicks tryhere button on Types of Linked List page 
 	Then user navigate to assessment page of Types of Linked List page 
 	
 	Scenario Outline: verift user able to enter python code and execute it for Types of Linked List page assessment
 	Given user needs read python code from excelfile sheet  "<Sheet1>" and <rowNumber>
  When user clicks run button to test python code
  Then user able to see output in console and alert message
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |
 	
 	Scenario: verify user able to navigate to Implement Linked List in Python
 	When user clicks Implement Linked List in Python button on linked list page
 	Then user navigato to Implement Linked List in Python 
 	
 	Scenario: verify user navigate to tryeditor from Implement Linked List in Python
  When user clicks tryhere button on Implement Linked List in Python 
 	Then user navigate to assessment page of Implement Linked List in Python

 	Scenario Outline: verift user able to enter python code and execute it for Implement Linked List in Python assessment
 	Given user needs to read python code from excelfile sheet  "<Sheet1>" and <rowNumber> for Implement Linked List in Python
  When user clicks run button to test python code for Implement Linked List in Python assessment
  Then user able to see output in console and alert message for Implement Linked List in Python
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |
 	Scenario: verify user able to navigate to Traversal page
 	When user clicks Traversal button on linked list page
 	Then user navigato to Traversal page
 	
 	Scenario: verify user navigate to tryeditor from Traversal page
  When user clicks tryhere button on Traversal page
 	Then user navigate to assessment page of Traversal page

 	Scenario Outline: verift user able to enter python code and execute it forTraversal assessment
 	Given user needs to read python code from excelfile sheet  "<Sheet1>" and <rowNumber> for Traversal
  When user clicks run button to test python code for Traversal assessment
  Then user able to see output in console and alert message for Traversal
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |
            
  Scenario: verify user able to navigate to Insertion page
 	When user clicks Insertion button on linked list page
 	Then user navigato to Insertion page
 	
 	Scenario: verify user navigate to tryeditor from Insertion page
  When user clicks tryhere button on Insertion page
 	Then user navigate to assessment page of Insertion page

 	Scenario Outline: verift user able to enter python code and execute it for Insertion assessment
 	Given user needs to read python code from excelfile sheet  "<Sheet1>" and <rowNumber> for Insertion
  When user clicks run button to test python code for Insertion assessment
  Then user able to see output in console and alert message for Insertion
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |
            
   Scenario: verify user able to navigate to Deletion page
 	When user clicks Deletion button on linked list page
 	Then user navigato to Deletion page
 	
 	Scenario: verify user navigate to tryeditor from Deletion page
  When user clicks tryhere button on Deletion page
 	Then user navigate to assessment page of Deletion page

 	Scenario Outline: verift user able to enter python code and execute it for Deletion assessment
 	Given user needs to read python code from excelfile sheet  "<Sheet1>" and <rowNumber> for Deletion
  When user clicks run button to test python code for Deletion assessment
  Then user able to see output in console and alert message for Deletion
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |     
            
   Scenario: Verify that user is able to navigate to Practice Questions page for Linked List 
   Given The user is in the Deletion page
   When The user clicks practice Questions button on Deletion page
   Then The user should be redirected to Practice Questions of Linked List  page
   
   Scenario: verify user able to see practice questions links
   When user is on practice questions page of linkedlist
   Then user should see practice question on linked list assessment page           