Feature: Queue
  To Open Queue data structure module in DS-algo Portal
  
  
Scenario: Verify user able to navigate "Queue" page
Given The user is in the Home page after logged in
When The user clicks on Get Started button for "Queue" Module
Then The user should land in "Queue" Page
    
Scenario: Verify that user is able to navigate to "Implementation of Queue in Python" page
Given The user is in the "Queue" page after sign in
When The user clicks "Implementation of Queue in Python" link
Then The user should be redirected to "Implementation of Queue in Python " page

Scenario: Verify that all links on the "Implimentation of Queue in the Python" are working
Given The user is in the "Implimentation of Queue in the Python" page
When I get all the links on the page
Then each link should be clickable and lead to a valid page

Scenario: Verify that user is able to navigate to "try Editor" page for arrays in Python page
Given The user is in the "Implementation of Queue in Python" page
When The user clicks "Try Here" button in "Implimentation of Queue in Python" page
Then The user should be redirected to a page having an try Editor with a Run button to test 
 
 
 Scenario: Verify that user receives error when click on Run button without entering code for "try Editor" page
Given The user is in the "tryEditor" page
When The user clicks the Run Button without entering the code in the Editor
Then The user should able to see an error message in alert window

 
Scenario Outline: Verify user is able to run with valid and invalid python code
Given I have the excel file "<filePath>" and sheet "<sheetName>"
When I fetch the Python code from row "<rowNumber>"
Then I execute the Python code and validate the result

    Examples: 
      | filePath | SheetName | rowNumber|
      | TestData.xlsx | Queue| 1 |
      | TestData.xlsx | Queue| 2 |     
      | TestData.xlsx | Queue| 3 |
 
    
Scenario: Verify that user is able to navigate to "Implementation using collections.deque" page
Given The user is in the "Queue" page after Sign in
When The user clicks "Implementation using collections.deque" link
Then The user should be redirected to "Implementation using collections.deque " page     
   
Scenario: Verify that all links on the "Implementation using collections.deque" are working
Given The user is in the "Implementation using collections.deque" page
When I get all the links on the page
Then each link should be clickable and lead to a valid page  

Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using collections.deque" page
Given The user is in the "Implementation using collections.deque" page
When The user clicks "Try Here" button 
Then The user should be redirected to a page having an try Editor with a Run button to test 
 
 
Scenario: Verify that user receives error when click on Run button without entering code for "try Editor" page
Given The user is in the tryEditor page
When The user clicks the Run Button without entering the code in the Editor
Then The user should able to see an error message in alert window


Scenario Outline: Verify user is able to run with valid and invalid python code
Given I have the excel file "<filePath>" and sheet "<sheetName>"
When I fetch the Python code from row "<rowNumber>"
Then I execute the Python code and validate the result

    Examples: 
      | filePath | SheetName | rowNumber|
      | TestData.xlsx | Queue| 1 |
      | TestData.xlsx | Queue| 2 |     
      | TestData.xlsx | Queue| 3 |
 

Scenario: Verify that user is able to navigate to "Implementation using Array" page
Given The user is in the "Queue" page after sign in
When The user clicks "Implementation using Array" link
Then The user should be redirected to "Implementation using Array" page

Scenario: Verify that all links on the "Implementation using Array" are working
Given The user is in the "Implementation using Array" page
When I get all the links on the page
Then each link should be clickable and lead to a valid page  
   

Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Implementation using Array" page
When The user clicks "Try Here" button in Implimentation of Queue in Python page
Then The user should be redirected to a page having an try Editor with a Run button to test 
 
 
Scenario: Verify that user receives error when click on Run button without entering code for "try Editor" page
Given The user is in the tryEditor page
When The user clicks the Run Button without entering the code in the Editor
Then The user should able to see an error message in alert window


Scenario Outline: Verify user is able to run with valid and invalid python code
Given I have the excel file "<filePath>" and sheet "<sheetName>"
When I fetch the Python code from row "<rowNumber>"
Then I execute the Python code and validate the result

    Examples: 
      | filePath | SheetName | rowNumber|
      | TestData.xlsx | Queue| 1 |
      | TestData.xlsx | Queue| 2 |     
      | TestData.xlsx | Queue| 3 |


Scenario: Verify that user is able to navigate to "Queue Operations" page
Given The user is in the "Queue" page after sign in
When The user clicks "Queue Operations" link
Then The user should be redirected to "Queue Operations" page

Scenario: Verify that all links on the "Queue Operations" are working
Given The user is in the "Queue Operations" page
When I get all the links on the page
Then each link should be clickable and lead to a valid page  
   
Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Implementation using Array" page
When The user clicks "Try Here" button in Implimentation of Queue in Python page
Then The user should be redirected to a page having an try Editor with a Run button to test 
 

Scenario: Verify that user receives error when click on Run button without entering code for "try Editor" page
Given The user is in the tryEditor page
When The user clicks the Run Button without entering the code in the Editor
Then The user should able to see an error message in alert window


Scenario Outline: Verify user is able to run with valid and invalid python code
Given I have the excel file "<filePath>" and sheet "<sheetName>"
When I fetch the Python code from row "<rowNumber>"
Then I execute the Python code and validate the result

    Examples: 
      | filePath | SheetName | rowNumber|
      | TestData.xlsx | Queue| 1 |
      | TestData.xlsx | Queue| 2 |     
      | TestData.xlsx | Queue| 3 |
