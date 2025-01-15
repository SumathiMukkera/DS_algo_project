Feature: Data-Structure Intrudoction module
   open Data Structure Intoduction module in DS-algo portal
   
   Background: The user sign in to dsAlgo Portal 
   
   Scenario: Verify user able to navigate Data Structures - Introduction page
   Given The user is in the Home page after logged in
   When The user clicks on Get Started button Data Structures - Introduction
   Then The user should land in Data Structures- Introduction Page
   
   Scenario: Verify that user is able to navigate to Time Complexity page
   Given The user is in the Data Structures - Introduction page after sign in
   When  The user clicks Time Complexity button on Data Structures- Intoduction page
   Then  The user should be redirected to Time Complexity of Data structures-Introduction
   
   Scenario: Verify that user is able to navigate to try Editor page
   Given The user is in the Time Complexity page
   When  the user clicks Try here button on Time Complexity page
   Then The user should be redirected to a page having an try Editor with a Run button to test
   
   Scenario Outline: verify user able to run with valid and invalid python code 
    Given I have the Excel file "<filePath>" and sheet "<sheetName>"
    When I fetch the Python code from row "<rowNumber>"
    Then I execute the Python code and validate the result

    Examples:
      | filePath           | sheetName | rowNumber |
      | TestData.xlsx      | PythonCode | 1         |
      | TestData.xlsx      | PythonCode | 2         |
      | TestData.Xlsx      | pythoncode |3          |
      
   
   Scenario: Verify that user is able to navigate to Practice Questions page
   Given The user is in the Time Complexity page
   When The user clicks practice Questions Button
   Then The user should be redirected to Practice Questions of Data structures-Introduction