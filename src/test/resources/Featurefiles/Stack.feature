<<<<<<< HEAD

Feature: Stack Feature
   To Open Stack data structure module in DS-algo portal

Scenario: Verify user able to navigate "Stack" page
   Given The user is in the Home page after logged in
   When The user clicks on Get Started button "Stack"
   Then The user should land in "Stack" Page

Scenario: Verify that user is able to navigate to "Operations in Stack" page
Given The user is in the "Stack" page after sign in
When The user clicks "Operations in Stack" link
Then The user should be redirected to "Operations in Stack" page

Scenario: Verify that all links on the "Operations in Stack" page are working
Given The user is in the "Operations in Stack" page
When I get all the links on the page
Then each link should be clickable and lead to a valid page 

Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Operations in Stack" page
When The user clicks "Try Here" button in "Operations in Stack" page
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

Scenario: Verify that user is able to navigate to "Implementation" page
Given The user is in the "Stack" page after sign in
When The user clicks "Implementation" link
Then The user should be redirected to "Implementation" page

Scenario: Verify that all links on the "Implementation" are working
Given The user is in the "implementation" page
When I get all the links on the page
Then each link should be clickable and lead to a valid page 

Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Implementation" page
When The user clicks "Try Here" button in "Implementation" page
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


Scenario: Verify that user is able to navigate to "Applications" page
Given The user is in the "Stack" page after sign in
When The user clicks "Applications" link
Then The user should be redirected to "Applications" page

Scenario: Verify that all links on the "Applications" are working
Given The user is in the "Apllications" page
When I get all the links on the page
Then each link should be clickable and lead to a valid page 

Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Applications" page
When The user clicks "Try Here" button in "Applications" page
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
=======
>>>>>>> branch 'Master' of https://github.com/SumathiMukkera/DS_algo_project.git
