@stack
Feature: Stack Feature
   To Open Stack data structure module in DS-algo portal

Background: Verify user able to navigate Stack page
   Given The user is in the Home page after logged in
   When The user clicks on Get Started button Stack
   Then The user should land in Stack Page

Scenario: Verify that user is able to navigate to Operations in Stack page
When The user clicks Operations in Stack link
Then The user should be redirected to Operations in Stack page

Scenario: Verify that user is able to navigate to try Editor page
When The user clicks Try Here button in Operations in Stack page
Then The user should be redirected to operations in stack assessment page

	Scenario Outline: verift user able to enter python code and execute it for operations assessment
 	Given user needs to read python code from excelfile sheet  "<Sheet1>" and <rowNumber> for operations in stack
  When user clicks run button to test python code for operations in stack assessment
  Then user able to see output in console and alert message for operations in stack assessment
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |   

Scenario: Verify that user is able to navigate to Implementation of stack page
When The user clicks Implementation link on stack
Then The user should be redirected to Implementation of stack 


Scenario: Verify that user is able to navigate to assessment page of implementation
When The user clicks Try Here button in Implementation page of stack
Then The user should be redirected to assessment page of stack implementation 

Scenario Outline: verift user able to enter python code and execute it for  implementation assessment
 	Given user needs to read python code from excelfile sheet  "<Sheet1>" and <rowNumber> for implementation
  When user clicks run button to test python code for implementation assessment
  Then user able to see output in console and alert message for implementation in stack assessment
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |   


Scenario: Verify that user is able to navigate to Applications page
When The user clicks Applications link on stack
Then The user should be redirected to Applications page

Scenario: Verify that user is able to navigate to assessment page of applications
When The user clicks Try Here button in Applications page
Then The user should be redirected to applictions assessment page

Scenario Outline: verift user able to enter python code and execute it for applications assessment
 	Given user needs to read python code from excelfile sheet  "<Sheet1>" and <rowNumber> for applications assessment
  When user clicks run button to test python code for applications assessment
  Then user able to see output in console and alert message for applications assessment
     Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |   
            
Scenario: Verify that user is able to navigate to Practice Questions page for stack
   Given The user is in the applications page of stack
   When The user clicks practice Questions button on applications page
   Then The user should be redirected to Practice Questions of stack  page
   
   Scenario: verify user able to see practice questions links for stack
   When user is on practice questions page of stack
   Then user should see practice question on stack assessment page     
