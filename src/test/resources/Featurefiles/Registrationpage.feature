Feature: Title of your feature
     open the DS-Algo-portal Registrationpage
     
     Scenario: verify user able to navigate registration page
       Given user is in homepage
       When user clicks register button on homepage
       Then user redirected to registration page
       
     	Scenario: verify  user will able to see alert when required fields blank
     	Given user is on the registrationpage.	
     	When user name and passsword filed will be empty and then click on register
     	Then user should see alert on required empty field	
     	
     Scenario: verify user recieve error message when password mismatch
    Given user is on the registrationpage	
    When user enters mismatch password in cofirm password field and click on registration field
    Then User should see error message password mismatched
    
    Scenario: verify Registration fails with an already taken username
    Given user is on the registrationpage
    When user enter existing creadentials and enter register button
    Then user should see error message existing account	
    
    Scenario: verify Successful registration with valid details
   Given user is on the registrationpage
   When The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes 
   Then The user should be redirected to Home Page of DS Algo with message "New Account Created You are logged in as <ID>"
    									
    Scenario: verify user is able to navigate to login page	
    Given user is on the registrationpage
    When user enters login button on registration page
    Then user should redirected to login page			
    
   Scenario: Verify that user receives error message for invalid password field during registration
    Given The user is on the user registration page 
    When The user clicks Register button after entering a password with numeric data
    Then The user is not able to see error msg after entering invalid data
    
    Scenario Outline: Verify that the user receives an error message for invalid username formats during registration
       Given The user is on the user registration page
       When The user clicks the "Register" button after entering a username <username>
       Then The user should see an error message indicating that the username <error_message>
    Examples:
       |   username	            |        error_message                 |
       |"username with spaces"   |	 "Username cannot contain spaces"  |
       | "username@!invalid"	    |   "Username contains invalid characters"|
       |"toolongusername1234567"	|   "Username exceeds the character limit"|
        |   "username#special"	  |    "Username contains invalid characters"|
     
     Scenario Outline: Verify that the user receives an error message for entering a password with less than 8 characters
              Given The user is on the user registration page
              When The user clicks the "Registration" button after entering <password> in the password field
              Then The user should see an error message indicating <error_message>
          Example:
        | password	 |     error_message   |
        | "abc123"	 | "Password must be at least 8 characters" |
        | "1234567" | "Password must be at least 8 characters"  |
         | "pwd123" | "Password must be at least 8 characters"  | 
            
            

       











    
    																				
     
     
     																																																																																																																						