Feature: Title of your feature
     I want to open DS-Algo-project Loginpage
     
     	BackGround:
   Scenario: Verify that user is able to land on Login Page	
    Given The user is on the DS Algo Home Page	
    When The user should click the Login link	
    Then The user should be redirected to login page
    
    
   Scenario: Verify that user navigate to registationpage
   	Given:	The user is on the DS Algo Login Page	
   	When:The user clicks register button 	
   	Then:The user should redirected to registationpage	
   	
   Scenario: Verify that user receives error message for empty Password field during Login	
   Given The user is on the DS Algo Login Page	
   When The user clicks login button after entering the "Username" and leaves "Password" textbox empty	
   Then The error message "Please fill out this field." appears below Password textbox	
   
   Scenario: Verify that user receives error message for empty Username field during Login	
   Given The user is on the DS Algo Sign in Page	
   When The user clicks login button after entering the Password only	
   Then The error message "Please fill out this field." appears below Username textbox	
   
   	Scenario: Verify that user receives error message for invalid Username field during Login	
   	Given The user is on the DS Algo Sign in Page	
   	When The user clicks login button after entering invalid username and valid password	
   	Then The user should able to see an error message "Invalid username and password".
   	
   	Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and 
       <RowNumber>
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button
    
          Examples: 
        | Sheetname | RowNumber |
        | Sheet1    |         0 |
        | Sheet1    |         1 |
        | Sheet1    |         2 |
        | Sheet1    |        3 |
   	
   	
   	Scenario:Verify that user able to land on Home page after entering valid Username and Password fields
   	Given:	The user is on the DS Algo Sign in Page	
   	When:The user clicks login button after entering valid username and valid password	
   	Then:The user should land in Data Structure Home Page with message "You are logged in"
   	
   																																																																																																																																													