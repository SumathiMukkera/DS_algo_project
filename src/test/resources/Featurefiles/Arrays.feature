Feature: Arrays Data structure module
    open Araays module in DS-algo portal

Background: The user sign in to dsAlgo Portal 


Scenario: Verify user able to navigate Arrays page
   Given The user is in the Home page after logged in
   When  The user clicks on Get Started button of Arrays or select Arrays option in datastructure dropdown
   Then The user should land in Arrays page
   
   Scenario: Verify that user is able to navigate to Array in Python  page
   Given  The user is in the Arrays page after Sign in
   When The user clicks the Array in Python button
   Then The user should be redirected to Array in python page
   
   Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page
   Given The user is on the Arrays in Python page
   When The user clicks Try Here button in Arrays in Python page
   Then The user should be redirected to a page having an try Editor with a Run button to test
   
    Scenario Outline: verify user able to run with valid and invalid python code 
    Given I have the Excel file "<filePath>" and sheet "<sheetName>"
    When I fetch the Python code from row "<rowNumber>"
    Then I execute the Python code and validate the result

    Examples:
      | filePath           | sheetName | rowNumber |
      | TestData.xlsx      | Arrays    | 1         |
      | TestData.xlsx      | Arrays    | 2         |
      | TestData.Xlsx      | Araaays   | 3         |
      
   Scenario: Verify that user is able to navigate to Array Using List  page
   Given  The user is in the Arrays page after Sign in
   When The user clicks the Arrays Using List button
   Then The user should be redirected to Arrays Using List page
      
    Scenario: Verify that user is able to navigate to Try Editor page for Arrays Using List page
    Given The user is on the Arrays in Python page
   When The user clicks Try Here button in Arrays in Python page
   Then The user should be redirected to a page having an try Editor with a Run button to test
   
    Scenario Outline: verify user able to run with valid and invalid python code 
    Given I have the Excel file "<filePath>" and sheet "<sheetName>"
    When I fetch the Python code from row "<rowNumber>"
    Then I execute the Python code and validate the result

    Examples:
      | filePath           | sheetName | rowNumber |
      | TestData.xlsx      | Arrays    | 1         |
      | TestData.xlsx      | Arrays    | 2         |
      | TestData.Xlsx      | Araays    | 3         |
      
     Scenario: Verify that user is able to navigate to Basic Operations in Lists page for Array in python page
     Given The user is on the Arrays Using List page 
     Then The user clicks the Basic Operations in Lists button 
     When The user should be redirected to Basic Operations in Lists page 
      
    Scenario: Verify that user is able to navigate to Try Editor page for Basic OPerations in Lists page  
    Given  The user is on the Basic Operations in Lists page
    Then The user click Try Here button in Basic Operations in Lists page
    When The user should be redirected to a page having an try Editor with a Run button to test
    
    Scenario Outline: verify user able to run with valid and invalid python code 
    Given I have the Excel file "<filePath>" and sheet "<sheetName>"
    When I fetch the Python code from row "<rowNumber>"
    Then I execute the Python code and validate the result

    Examples:
      | filePath           | sheetName | rowNumber |
      | TestData.xlsx      | Arrays    | 1         |
      | TestData.xlsx      | Arrays    | 2         |
      | TestData.Xlsx      | Araays    | 3         |
      
    Scenario: Verify that user is able to navigate to Applications of Array page for Array in python page   
    Given The user is on the Basic Operations page after Sign in
    When  The user click Applications of Array button
    Then  The user should be redirected to Applications of Array page
    
    Scenario: Verify that user is able to navigate to Try Editor page for Applications of Array page
    Given The user is on the Applications of Array page
    When The user click Try Here buton in Applications of Array page
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
    Scenario Outline: verify user able to run with valid and invalid python code 
    Given I have the Excel file "<filePath>" and sheet "<sheetName>"
    When I fetch the Python code from row "<rowNumber>"
    Then I execute the Python code and validate the result

    Examples:
      | filePath           | sheetName | rowNumber |
      | TestData.xlsx      | Arrays    | 1         |
      | TestData.xlsx      | Arrays    | 2         |
      | TestData.Xlsx      | Araays    | 3         |
      
    Scenario: Verify that user is able to navigate to Practice Questions Page  
    Given The user is on Applications of Array page
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice page
    
    Scenario: Verify that user is able to navigate to Search the array Page from Practice question page 
    Given The user is on the practice questions page
    When  The user clicks the Search the array link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons
    
    Scenario: Verify user able to run with no code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see alert message
    
    Scenario: Verify user able to run with invalid code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see alert box with syntax error message
    
    
    Scenario: Verify user able to run with valid code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see output in console
    
    Scenario: Verify user able to submit with no code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Error occurred during submission message
    
    Scenario: Verify user able to submit with invalid code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Error occurred during submission message
    
    Scenario: Verify user able to submit with valid code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Submission Successful message in console
    
    Scenario: Verify that user is able to navigate to Max Consecutive Ones page from Practice question page 
    Given The user is on the practice questions page
    When  The user clicks the Max Consecutive Ones page
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons
    
    Scenario: Verify user able to run with no code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see alert message
    
    Scenario: Verify user able to run with invalid code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see alert box with syntax error message
    
    
    Scenario: Verify user able to run with valid code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see output in console
    
    Scenario: Verify user able to submit with no code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Error occurred during submission message in console
    
    Scenario: Verify user able to submit with invalid code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Error occurred during submission message in console
    
    Scenario: Verify user able to submit with valid code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Submission Successful message in console
    
    Scenario: Verify that user is able to navigate to Find Numbers with even numbers of digits page from Practice question page 
    Given The user is on the practice questions page
    When  The user clicks the Find Numbers with even numbers of digits page
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons
    
    Scenario: Verify user able to run with no code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see alert message
    
    Scenario: Verify user able to run with invalid code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see alert box with syntax error message
    
    
    Scenario: Verify user able to run with valid code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see output in console
    
    Scenario: Verify user able to submit with no code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Error occurred during submission message in console
    
    Scenario: Verify user able to submit with invalid code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Error occurred during submission message in console
    
    Scenario: Verify user able to submit with valid code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Submission Successful message in console
    
    Scenario: Verify that user is able to navigate to Squares of Sorted Array page from Practice question page 
    Given The user is on the practice questions page
    When  The user clicks the Squares of Sorted Array page
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons
    
    Scenario: Verify user able to run with no code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see alert message
    
    Scenario: Verify user able to run with invalid code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see alert box with syntax error message
    
    
    Scenario: Verify user able to run with valid code 
    Given The User in on Questions page
    When   user clicks run button
    Then  user able to see output in console
    
    Scenario: Verify user able to submit with no code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Error occurred during submission message in console
    
    Scenario: Verify user able to submit with invalid code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Error occurred during submission message in console
    
    Scenario: Verify user able to submit with valid code 
    Given The User in on Questions page
    When   user clicks submit button
    Then  user able to see Submission Successful message in console
    
  
      
      
    
    
    
    
    
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      