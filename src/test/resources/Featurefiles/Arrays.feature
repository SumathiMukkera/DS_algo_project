@Array
Feature: Arrays Data structure module
    open Araays module in DS-algo portal

Background: 
  Given The user is in the Homepage after logged in
   When  The user clicks on Get Started button of Arrays
   Then The user should land in Arrays page
   
   Scenario: Verify that user navigate to Arrays in Python  page
   Given  The user is in the Arrays page 
   When The user clicks the Arrays in Python button
   Then The user should be redirected to Arrays in python page
   
   Scenario: Verify that user navigate to TryEditor page for Arrays in Python page
   Given The user is on the Arrays in Python page
   When The user clicks TryHere button in Arrays in Python page
   Then The user should be redirected to TryEditor with a Run button to test
   
   
    Scenario Outline:  Navigate through Arrays in Python and execute Python code
    Given user have to fetch python code from Excel file from sheet "<sheetName>" and <rowNumber> 
    When The user clicks the "Run" button
    Then user execute the Python code and validate the result for Arrays in Python

    Examples:
      | sheetName | rowNumber |
      | Try Editor | 0        |
      | Try Editor | 1        |
      | Try Editor | 2         |
      
   Scenario: Verify that user navigate to Array Using List  page
   Given  The user is on the Arrays page
   When The user clicks the Arrays Using List button
   Then The user should be redirected to Arrays Using List page
      
    Scenario: Verify that user navigate to TryEditor page for Arrays Using List page
    Given The user is on the Arrays Using List  page
   When The user clicks TryHere button in Arrays Using List page
   Then The user should  redirected to TryEditor with a Run button to test
   
    Scenario Outline: user navigate through Arrays Using List page and excute python code 
    Given user have  fetch python code from Excel file from sheet "<sheetName>" and <rowNumber> 
    When The user click the "Run" button
    Then user execute the Python code and validate the result for Arrays Using List Pge

    Examples:
     | sheetName | rowNumber |
     | Try Editor | 0         |
     | Try Editor | 1        |
     | Try Editor  | 2       |
      
     Scenario: Verify that user navigate to Basic Operations in Lists page 
     Given The user  on the Arrays Using List page 
     When The user clicks the Basic Operations in Lists button 
     Then The user should be redirected to Basic Operations in Lists page 
      
    Scenario: Verify that user navigate to TryEditor page for Basic OPerations in Lists page  
    Given  The user is on the Basic Operations in Lists page
    When The user click TryHere button in Basic Operations in Lists page
    Then user should be redirected to TryEditor with a Run button to test
    
    Scenario Outline: user navigate through Basic Operations in Lists page and excute python code 
    Given The User have to fetch python code from Excel file from sheet "<sheetName>" and <rowNumber> 
    When user clicks the "Run" button
    Then user execute the Python code and validate the result for Basic Operations in Lists page

    Examples:
      | sheetName | rowNumber |
      | Try Editor   | 0        |
      | Try Editor   | 1        |
      | Try Editor   | 2        |
      
    Scenario: Verify that user navigate to Applications of Array page    
    Given The user on the Basic Operations in Lists page
    When  The user click Applications of Array button
    Then  The user should be redirected to Applications of Array page
    
    Scenario: Verify that user navigate to TryEditor page for Applications of Array page
    Given The user is on the Applications of Array page
    When The user click TryHere buton in Applications of Array page
    Then The user should be redirected to TryEditor with a Run button to test the python code
    
    Scenario Outline: verify that user able to run with nocode and valid and invalid python code 
    Given The user have to fetch python code from Excel file from sheet "<sheetName>" and <rowNumber> 
    When The user clicks the "Run" buton
    Then user execute the Python code and validate the result for Applicatins of Array page

    Examples:
      | sheetName | rowNumber |
      | Try Editor | 0         |
      | Try Editor | 1        |
      | Try Editor | 2         |
      
    Scenario: Verify that user navigate to Practice Questions Page  
    Given The user on Applications of Array page
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice page
    
    Scenario: Verify that user navigate to Search the array Page from Practice questions page 
    Given The user is on the practice Questions page
    When  The user clicks the Search the array link
    Then The user should be redirected to Questions page contains a question,and TryEditor with Run and Submit buttons
    
     Scenario Outline: Verify user able to land on Search the array page
    Given user will get python code from excel "<Sheet>" and <rownumber> print it in editor 
    When click run button to see output in console on search the array page 
    Then click submit button to see submit success or not for search the array page 
    
    Examples:
    |     Sheet       | rownumber   |
    |    Arrays PQ    |   0         |  
    |    Arrays PQ    |   1         |
    |    Arrays PQ    |   2         |
      
    
    Scenario: Verify that user navigate to Max Consecutive Ones page from Practice question page 
    When  The user clicks the Max Consecutive Ones page
    Then The user should be redirected to Max Consecutive Ones page contains a question,and TryEditor with Run and Submit buttons
    
   Scenario Outline: Verify user able to land on Max Consecutive Ones page
    Given user get python code from excel "<Sheet>" and <rownumber> print it in editor 
    When click run button to see output in console on Max Consecutive Ones page
    Then click submit button to see submit success or not for Max Consecutive Ones 
    
    Examples:
    |     Sheet       | rownumber   |
    |    Arrays PQ    |   0         |  
    |    Arrays PQ    |   1         |
    |    Arrays PQ    |   2         |
    
    
    Scenario: Verify that user is able to navigate to Find Numbers with even numbers of digits page from Practice questions page 
    When  The user clicks the Find Numbers with even numbers of digits page
    Then The user should be redirected to Find Numbers with even numbers of digits page contains a question,and TryEditor with Run and Submit buttons
    
    Scenario Outline: Verify user able to land on Find Numbers with even numbers of digits
    Given The user will get python code from excel "<Sheet>" and <rownumber> print it in editor 
    When click run button to see output in console on  Find Numbers with even numbers of digits
    Then click submit button to see submit success or not for Find Numbers with even numbers of digits
    
    Examples:
    |     Sheet       | rownumber   |
    |    Arrays PQ    |   0         |  
    |    Arrays PQ    |   1         |
    |    Arrays PQ    |   2         |
     
     
   Scenario: Verify that user navigate to Squares of a Sorted Array page from Practice questions page 
    When  The user clicks the Squares of a Sorted Array page
    Then The user should be redirected to Squares of a Sorted Array page contains a question,and TryEditor with Run and Submit buttons
    
    Scenario Outline: Verify user able to land on Squares of a Sorted Array
    Given Users will get python code from excel "<Sheet>" and <rownumber> print it in editor 
    When click run button to see output in console on  Squares of a Sorted Array
    Then click submit button to see submit success or not for Squares of a Sorted Array
    
    Examples:
    |     Sheet       | rownumber   |
    |    Arrays PQ    |   0         |  
    |    Arrays PQ    |   1         |
    |    Arrays PQ    |   2         |
     
    
