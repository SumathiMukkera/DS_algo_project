Feature: Title of your feature
     open the DS-Algo-portal Registrationpage
     
Scenario:	verify  user will able to see alert when required fields blank
Given user is on the registrationpage.	
When user name and passsword filed will be empty and then click on register
Then User should see alert on required empty field	
     	
 Scenario: verify Successful registration with valid details
   Given 	user is on the registrationpage
   When 	The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes 
   Then 	The user should be redirected to Home Page of DS Algo with message new Account Created. You are logged in as <ID>
    
    Scenario: verify user recieve error message when password mismatch
    Given user is on the registrationpage	
    When user enters mismatch password in cofirm password field and click on registration field
    Then User should see error message password mismatched
    
    Scenario: verify Registration fails with an already taken username
    Given user is on the registrationpage
    When user enter existing creadentials and enter register button
    Then User should see error message existing account										
    
    Scenario: verify user is able to navigate to login page	
    Given user is on the registrationpage
    When 	user enters login button on registration page
    Then 	User should redirected to login page			
    
   Scenario: Verify that user receives error message for invalid password field during registration
    Given The user is on the user registration page 
    When The user clicks Register button after entering a password with numeric data
    Then The user is not able to see error msg after entering invalid data
    
    Scenario: Verify that user receives error message for invalid username field during registration
    Given The user is on the user registrationpage 
    When The user clicks Register button after entering a username with spacebar characters other than digits and @/./+/-/_
    Then The user is not able to see error msg after entering invalid data"
     
     
    Scenario: Verify that user enter less than 8 character in password field
    Given The user is on the user registrationpage 
    When The user clicks Register button after entering lessthan 8 characters  in password field 
    Then The user is not able to see error msg after entering invalid msg"																				
     
     
     																																																																																																																						
