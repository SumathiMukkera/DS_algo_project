
Feature: Stack Feature
   To Open 

Scenario: Verify user able to navigate "Stack" page
   Given The user is in the Home page after logged in
   When The user clicks on Get Started button "Stack"
   Then The user should land in "Stack" Page

Scenario: Verify that user is able to navigate to "Operations in Stack" page
Given The user is in the "Stack" page after sign in
When The user clicks "Operations in Stack" link
Then The user should be redirected to "Operations in Stack" page

Scenario: Verify that User is able to navigate to "Operations in Stack" page
Given The user is in the "Operations in Stack" page
When The user clicks "Operations in Stack" link
Then The user should be redirected to "Operations in Stack" page

Scenario: Verify that User is able to navigate to "Implementation" Page
Given The user is in the "Operations in Stack" page
When The user clicks "Implementaion" link
Then The user should be redirected to "Implementation" page

Scenario: Verify that User is able to navigate to "Applications" Page
Given The user is in the "Operations in Stack" page
When The user clicks "Applications" link
Then The user should be redirected to "Applications" page

Scenario: Verify that User is able to navigate to "Practice Questions" Page
Given The user is in the "Operations in Stack" page
When The user clicks "Practice Questions" link
Then The user should be redirected to "Practice Questions" page

Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Operations in Stack" page
When The user clicks "Try Here" button in "Operations in Stack" page
Then The user should be redirected to a page having an try Editor with a Run button to test 
 
 
 Scenario: Verify that user receives error when click on Run button without entering code for "try Editor" page
 Given The user is in the tryEditor page
 When The user clicks the Run Button without entering the code in the Editor
 Then The user should able to see an error message in alert window


Scenario: Verify that user is able to see output for valid python code 
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console
    

Scenario: Verify that user is able to see output for valid python code 
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console 

Scenario: Verify that user is able to navigate to "Implementation" page
Given The user is in the "Stack" page after sign in
When The user clicks "Implementation" link
Then The user should be redirected to "Implementation" page

Scenario: Verify that User is able to navigate to "Operations in Stack" page
Given The user is in the "Implementation" page
When The user clicks "Operations in Stack" link
Then The user should be redirected to "Operations in Stack" page

Scenario: Verify that User is able to navigate to "Implementation" Page
Given The user is in the "Implementation" page
When The user clicks "Implementaion" link
Then The user should be redirected to "Implementation" page

Scenario: Verify that User is able to navigate to "Applications" Page
Given The user is in the "Implementation" page
When The user clicks "Applications" link
Then The user should be redirected to "Applications" page

Scenario: Verify that User is able to navigate to "Practice Questions" Page
Given The user is in the "Implementation" page
When The user clicks "Practice Questions" link
Then The user should be redirected to "Practice Questions" page

Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Implementation" page
When The user clicks "Try Here" button in "Implementation" page
Then The user should be redirected to a page having an try Editor with a Run button to test 
 
 
 Scenario: Verify that user receives error when click on Run button without entering code for "try Editor" page
 Given The user is in the tryEditor page
 When The user clicks the Run Button without entering the code in the Editor
 Then The user should able to see an error message in alert window


Scenario: Verify that user is able to see output for valid python code 
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console
    

Scenario: Verify that user is able to see output for valid python code 
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console 


Scenario: Verify that user is able to navigate to "Applications" page
Given The user is in the "Stack" page after sign in
When The user clicks "Applications" link
Then The user should be redirected to "Applications" page

Scenario: Verify that User is able to navigate to "Operations in Stack" page
Given The user is in the "Applications" page
When The user clicks "Operations in Stack" link
Then The user should be redirected to "Operations in Stack" page

Scenario: Verify that User is able to navigate to "Implementation" Page
Given The user is in the "Applications" page
When The user clicks "Implementaion" link
Then The user should be redirected to "Implementation" page

Scenario: Verify that User is able to navigate to "Applications" Page
Given The user is in the "Applications" page
When The user clicks "Applications" link
Then The user should be redirected to "Applications" page

Scenario: Verify that User is able to navigate to "Practice Questions" Page
Given The user is in the "Applications" page
When The user clicks "Practice Questions" link
Then The user should be redirected to "Practice Questions" page

Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Applications" page
When The user clicks "Try Here" button in "Applications" page
Then The user should be redirected to a page having an try Editor with a Run button to test 
 
 
 Scenario: Verify that user receives error when click on Run button without entering code for "try Editor" page
 Given The user is in the tryEditor page
 When The user clicks the Run Button without entering the code in the Editor
 Then The user should able to see an error message in alert window


Scenario: Verify that user is able to see output for valid python code 
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console
    

Scenario: Verify that user is able to see output for valid python code 
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
