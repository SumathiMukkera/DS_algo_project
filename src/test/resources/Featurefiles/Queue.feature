@Queue
Feature: Queue
  To Open Queue data structure module in DS-algo Portal
  
  Background: Verify user able to navigate Queue page
Given The user is in the Home page after logged in
When The user clicks on Get Started button for Queue
Then The user should land in Queue Page
    
Scenario: Verify that user is able to navigate to Implementation of Queue in Python page
Given The user is on the Queue page
When The user clicks Implementation of Queue in Python link
Then The user should be redirected to Implementation of Queue in Python  page


Scenario: Verify that user is able to navigate to try Editor page
Given user is on the Implementation of Queue in Python  page
When The user clicks TryHere button in Implementation of Queue in Python page
Then The user should be redirected to a  Implementation of Queue in Python  
 
 
 Scenario Outline: verift user able to enter python code and execute for Implementation of Queue in Python
 	Given user get python code from excelfile sheet  "<Sheet1>" and <rowNumber> for implementation of queue
  When user clicks run button to test python code for implementation of queue
  Then user able to see output in console and alert message for implementation of queue
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |  
    
Scenario: Verify that user is able to navigate to Implementation using collections.deque pag
When The user clicks Implementation using collections.deque link
Then The user should be redirected to Implementation using collections.deque page     
   
Scenario: Verify that user is able to navigate to Try Editor page for Implementation using collections.deque page
Given The user is in the Implementation using collections.deque page
When The user clicks TryHere button for Implementation using collections.deque
Then The user should be redirected to a page having an try Editor with  Run button 
 
 Scenario Outline: verift user able to enter python code and execute for Implementation using collections.deque
 	Given user get python code from excelfile sheet  "<Sheet1>" and <rowNumber> for implementation collections.deque
  When user clicks run button to test python code for implementation collections.deque
  Then user able to see output in console and alert message for implementation using collections.deque
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         | 
 
 

Scenario: Verify that user is able to navigate to Implementation using Array page
 When The user clicks Implementation using Array link
Then The user should be redirected to Implementation using Array page

Scenario: Verify that user is able to navigate to tryeditor page for Implementation using Array
Given The user is in the Implementation using Array page
When The user clicks TryHere button in Implimentation using Array
Then The user should be redirected to try Editor with a Run button for Implementation using Array
 
 Scenario Outline: verift user able to enter python code and execute for Implementation using Array 
 	Given user get python code from excelfile sheet  "<Sheet1>" and <rowNumber> for implementation using Array
  When user clicks run button to test python code for implementation using Array
  Then user able to see output in console and alert message for implementation using Array
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         | 
 
 

Scenario: Verify that user is able to navigate to Queue Operations page
When The user clicks Queue Operations link
Then The user should be redirected to Queue Operations page

Scenario: Verify that user is able to navigate to try Editor page for Queue Operations
Given The user is in the Queue Operations  page
When The user clicks Try Here button in Queue Operations
Then The user should be redirected to  page having an try Editor with a Run button for Queue Operations 
 
Scenario Outline: verift user able to enter python code and execute for Queue Operations 
 	Given user get python code from excelfile sheet  "<Sheet1>" and <rowNumber> for Queue Operations
  When user clicks run button to test python code for Queue Operations
  Then user able to see output in console and alert message for Queue Operations
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         | 
 

 Scenario: Verify that user is able to navigate to Practice Questions page for Queue
   Given The user on the Queue Operations page
   When The user clicks practice Questions button 
   Then The user should be redirected to Practice Questions of Queue page
   
   Scenario: verify user able to see practice questions links for Queue
   When user is on practice questions page of Queue
   Then user should see practice question on Queue assessment page   

