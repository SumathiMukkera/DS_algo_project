				Feature: Title of your feature
     I want to open DS-Algo-project 
  	Background:
       Given user is on Homepage
       When user clicks signin button on homepage
       Then user redirected to signin page
       
    Scenario: Verify that user navigate to registationpage
   	Given The user is on the LoginPage	
   	When The user clicks register button 	
   	Then The user should redirected to registerpage	
   	
   Scenario: Verify that user receives error message for empty Password field during Login
   Given user is on LoginPage	
   When The user clicks login button after entering the "Username" only	
   Then The error message Please fill out this field appears below Password textbox	
   
   Scenario: Verify that user receives error message for empty Username field during Login	
   Given The user on LoginPage
    When The user click login button after entering the "Password" only	
   Then The error message Please fill out this field appears below Username textbox
   	
   	Scenario: Verify that user receives error message for invalid Username field during Login	
   	When The user clicks login button after entering invalid username and valid password	
   	Then The user should able to see an error message "Invalid Username and Password"
   	
   	Scenario Outline: User on loginpage and login with  valid inputs from Excel "<SheetName>" and<RowNumber>
    When The user enter sheetname "<SheetName>" and rownumber <RowNumber>
    Then click login button
    And user can see alert user is logged in or not
          Examples:
        | SheetName    | RowNumber |
        | Logindetails |        0  |
        | Logindetails |        1  |
        
  




																																																																																																																																																																																																																																																																																																							
