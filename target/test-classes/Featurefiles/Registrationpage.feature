Feature: Title of your feature
     open the DS-Algo-portal Registrationpage
     
     Background:
       Given user is on homepage
       When user clicks register button on homepage
       Then user redirected to registration page
       
     	Scenario: verify  user will able to see alert when required fields blank
     	When user name and passsword filed will be empty and then click on register
     	Then user should see alert on required empty field	
     	
     Scenario: verify user recieve error message when password mismatch
       When      user enters mismatch password in cofirm password field and click on registration field
       Then      user should see error message password mismatched
    
    Scenario: verify Registration fails with an already taken username
    When      user enter existing creadentials and enter register button
    Then      user should see error message existing account	
    									
    Scenario: verify user is able to navigate to login page	
    When      user enters login button on registration page
    Then      user should redirected to login page			
    
   Scenario: Verify that user receives error message for invalid password field during registration
    When     user clicks Register button after entering a password with numeric data
    Then     user is  able to see error msg after entering invalid data
    
    Scenario: Verify password length validation
    When user enters a password less than 8 characters and clicks Register
    Then user should see an error "Password must be at least 8 characters"
    
    
    Scenario Outline: Verify that the user receives an error message for invalid username formats during registration
       When          user clicks the Register button after entering a username <username>
       Then         user should see an error message indicating that the username <error_message>
    Examples:
       |   username	             |        error_message                     |
       |"username with spaces"   |	 "Username cannot contain spaces"       |
       | "username@!invalid"	   |   "Username contains invalid characters" |
       |"toolongusername1234567" |   "Username exceeds the character limit" |
       |   "username#special"	   |    "Username contains invalid characters"|
     
        
    Scenario: verify Successful registration with valid details
    When     user clicks Register button after entering  with valid username, password and password confirmation in related textboxes 
    Then     user should be redirected to Home Page of DS Algo with message "New Account Created You are logged in as "
            
            

       











    
    																				
     
     
     																																																																																																																						