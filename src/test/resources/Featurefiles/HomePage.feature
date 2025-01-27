Feature: Title of your feature
     I want to open the URL of DS-algo-portal inside a Homepage
     	
     	Scenario: Verify the Home page for an user without Sign in	
     	Given The user is on the DS Algo Portal
     	When The user clicks the Get Started button	
     	Then The user should be navigated to the Data Structure Introduction page, which displays the "Register" and "Sign in" links.
    
     		
     Scenario: Verify that user is able to view options for "Data Structures" dropdown on home page without Sign in	
     Given The user is on the Home page	
     When The user clicks the Data Structures dropdown 
     Then The user should able to see 7 options  in dropdown menu	
     
    Scenario Outline: Verify user is on home page and click on dropdown "<option>"without sign in	
    Given The user is on the Home page	
    When The user clicks on dropdown "<option>"
    Then The user get warning message "You are not logged in"
      Examples:
       |option |
       |Arrays |
       |Linked List|
       |Stack |
       |Queue |
       |Tree  |
       |Graph |
       
    Scenario: Verify that user able to see warning message on clicking Get Started buttons of Data Structures-Introduction on the home page without Sign in	
    Given The user is on the Home page	
    When The user clicks Get Started buttons of Data Structures-Introduction on the homepage without Sign in	
    Then The user should able to see an warning message "You are not logged in"	
    
    
    Scenario: Verify that user able to see warning message on clicking Get Started buttons of Array on the home page without Sign in	
    Given The user is on the Home page	
    When The user clicks Get Started buttons of Array on the homepage without Sign in	
    Then The user should able to see an warning message "You are not logged in"	
    
   Scenario: Verify that user able to see warning message on clicking Get Started buttons of Linked List on the home page without Sign in	
   Given The user is on the Home page	
   When The user clicks Get Started buttons of Linked List on the homepage without Sign in	
   Then The user should able to see an warning message "You are not logged in"		
   
   Scenario: Verify that user able to see warning message on clicking Get Started buttons of Stack on the home page without Sign in	
   Given The user is on the Home page	
   When The user clicks Get Started buttons of Stack on the homepage without Sign in	
   Then The user should able to see an warning message "You are not logged in"																																																																																																																
    
    Scenario: Verify that user able to see warning message on clicking Get Started buttons of Queue on the home page without Sign in	
    Given The user is on the Home page	
    When The user clicks Get Started buttons of Queue on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"		
    
    Scenario: Verify that user able to see warning message on clicking Get Started buttons of Tree on the home page without Sign in	
    Given The user is on the Home page
    When The user clicks Get Started buttons of Tree on the homepage without Sign in	
    Then The user should able to see an warning message "You are not logged in"																																																							
    																																																																																																																																		
    Scenario: Verify that user able to see warning message on clicking Get Started buttons of Graph on the home page without Sign in	
    Given The user is on the Home page	
    When The user clicks Get Started buttons of Graph on the homepage without Sign in	
    Then The user should able to see an warning message "You are not logged in"			
    
    Scenario: verify user able to navigate registration page
       Given user is in homepage
       When user clicks register button on homepage
       Then user redirected to registration page
       
