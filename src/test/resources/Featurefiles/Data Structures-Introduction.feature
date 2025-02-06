@DS_Introduction
Feature: Data-Structure Intrudoction module
   open Data Structure Intoduction module in DS-algo portal
   
   Background: Verify user able to navigate Data Structures - Introduction page
   Given The user is in the Home page after logged in for datastructures
   When The user clicks on Get Started button Data Structures - Introduction
   Then The user should land in Data Structures- Introduction Page
   
   
   Scenario: Verify that user is able to navigate to Time Complexity page
   When  The user clicks Time Complexity button on Data Structures- Intoduction page
   Then  The user should be redirected to Time Complexity of Data structures-Introduction
   
   Scenario: Verify that user is able to navigate to try Editor page 
   Given The user is in the Time Complexity page
   When  the user clicks Try here button on Time Complexity page
   Then The user should be redirected to a page having an try Editor with a Run button to test
   
   Scenario Outline: Navigate through data structures and execute Python code for datastructures
    Given user have to fetch python code from Excel file from sheet "<Sheet1>" and <rowNumber> for datastructure module
    When  click run button for datastructures
    Then user execute the Python code and validate the result for datastructures
   
    Examples:
            |  Sheet1    | rowNumber |
            | Try Editor | 0         |
            | Try Editor | 1         |
            | Try Editor | 2         |
      
 
   Scenario: Verify that user is able to navigate to Practice Questions page   
   Given The user is in the Time Complexity page
   When The user clicks practice Questions button in datastructures page
   Then The user should be redirected to Practice Questions of Data structures-Introduction
   
   Scenario: verify user able to see practice questions links in datastructurespage
   When user is on practice questions page of datastructurespage
   Then user should see practice question on datastructurespage assessment page      