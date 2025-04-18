
Feature: DsAlgo Tree feature-functionality

Background: Verify if user able to login successfully
   Given User is in landing page
   When User clicks on getStarted button in landing page and SignIn button in Home Page
   And User enters valid credentials for login and Clicks Submit in Login Page
   Then User should navigate to home Page with title "NumpyNinja"
   
  #############################  Tree Page ################################################## 
  Scenario: Verify is user is able to navigate to Tree Page
   Given User is in Home Page
   When User Clicks in Get Started of Tree Page
   Then User should navigate to Tree page with title "Tree"
   
   
 ###########################  Overview of Trees Page ######################################

  Scenario: Verify is user is able to navigate to Overview of Trees Page
   Given User is in Tree Page
   When User Clicks in Overview of Trees Page
   Then User should navigate to Overview of Trees Page with title "Overview of Trees"
      
  Scenario: Verify is user is able to navigate to TryHere page from Overview of Trees Page
   Given User is in Overview of Tree Page
   When User Clicks in  try here from Overview of Trees Page
   Then User should navigate to Try Here Page with title "Assessment"
   
   

 Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Overview of Trees page
   When User eenters valid python code in the textBox from the given sheet name "<Sheetname>" and  <RowNumber>
   And User clicks on Run Button
   Then User should see the output in the console of try editor page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box after navigating to tryEditor page from Overview of Trees page
    When User enters invalid python code in the textBox from the given sheet name "<Sheetname>" and  <RowNumber>
    And User clicks on Run Button of python page
    Then User should see alert error message of try editor page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    | TryEditor  |     2     |
    
 ############################### Terminologies  of Tree Page #######################################
 
 Scenario: Verify is user is able to navigate to Terminologies of Trees Page
   When User Clicks in Terminologies of Trees Page
   Then User should navigate to Terminologies of Trees Page with title "Terminologies"
  
  Scenario: Verify is user is able to navigate to Try here from Terminologies of Trees Page
   When User Clicks in Try here from Terminologies of Trees Page
   Then User navigates to Try here editor with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Terminologies of Trees page
   When User enters valid python code in the textBox from the sheet name "<Sheetname>" and  <RowNumber> of Terminologies page
   And User click1 on run button
   Then User sees the output in the console of try editor page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box after navigating to tryEditor page from Terminologies of Trees page
    When User enters invalid python code in the textBox from the given sheet name "<Sheetname>" and  <RowNumber> to tryEditor page from Terminologies of Trees page
    And User clicks on RunButton of try editor 
    Then User should see alert error message of try editor page from terminologies.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
 
  #################### Types of Trees ######################
  
 Scenario: Verify is user is able to navigate to Types of Trees of Trees Page
   When User Clicks in Types of Trees Page
   Then User should navigate to Types of Trees Page with title "Types of Trees"
  
  Scenario: Verify if user is able to navigate to Try here from Types of Trees Page
   When User Clicks in Try here from Types of Trees of Trees Page
   Then User navigates to Try here editor from Types of Trees with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Types of Trees page
   When User enters valid python code in the textBox from the "<Sheetname>" and  <RowNumber> of Types of Trees page
   And User click on run button from Types of Trees Page
   Then User sees the output in the console of try editor from Types of Trees of page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box after navigating to tryEditor page from Types of Trees page
    When User enters invalid python code in the textBox from the given sheet  "<Sheetname>" and  <RowNumber> to tryEditor page from Types of Trees page page
    And User clicks on RunButton of try editor from Types of Trees page
    Then User should see alert error message of try editor page from Types of Trees page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
    ####################  Tree Traversals ######################
  
 Scenario: Verify is user is able to navigate to Tree Traversals Page
   When User Clicks in Tree Traversals Page
   Then User should navigate to Tree Traversals Page with title "Tree Traversals"
  
  Scenario: Verify if user is able to navigate to Try here from Tree Traversals page
   When User Clicks in Try here from Tree Traversals Page
   Then User navigates to Try here editor from Tree Traversals with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Tree Traversals page
   When User enters valid python code in the textBox from the "<Sheetname>" and  <RowNumber> of Tree Traversals page
   And User click on run button from Tree Traversals Page
   Then User sees the output in the console of try editor from Tree Traversals page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box after navigating to tryEditor page from Types of Trees page
    When User enters invalid python code in the textBox from the given sheet  "<Sheetname>" and  <RowNumber> to tryEditor page from Tree Traversals page
    And User clicks on RunButton of try editor from Tree Traversals page
    Then User should see alert error message of try editor page from Tree Traversals page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
  ################Traversals-Illustration page #############################  
   Scenario: Verify is user is able to navigate to Traversals-Illustration Page
   When User Clicks in Traversals-Illustration Page
   Then User should navigate to Traversals-Illustration Page with title "Traversals-Illustration"
  
  Scenario: Verify if user is able to navigate to Try here from Traversals-Illustration page
   When User Clicks in Try here from Traversals-Illustration Page
   Then User navigates to Try here editor from Traversals-Illustration with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Traversals-Illustration page
   When User enters valid python code in the textBox "<Sheetname>" and  <RowNumber> of Traversals-Illustration page
   And User click on run button from Traversals-Illustration Page
   Then User sees the output in the console of try editor from Traversals-Illustration page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box after navigating to tryEditor page from Traversals-Illustration page
    When User enters invalid python code in the textBox from the  "<Sheetname>" and  <RowNumber> to tryEditor page from Traversals-Illustration page
    And User clicks on RunButton of try editor from Traversals-Illustration page
    Then User should see alert error message of try editor page from Traversals-Illustration page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
     ################ Binary Trees page #############################  
    
   Scenario: Verify is user is able to navigate to Binary Trees Page
   When User Clicks in Binary Trees Page
   Then User should navigate to Binary TreesPage with title "Binary Trees"
  
  Scenario: Verify if user is able to navigate to Try here from Binary Trees page
   When User Clicks in Try here from Binary Trees Page
   Then User navigates to Try here editor from Binary Trees with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Binary Trees page
   When User enters valid python code in the textBox "<Sheetname>" and  <RowNumber> of Binary Trees page
   And User click on run button from Binary Trees Page
   Then User sees the output in the console of try editor from Binary Trees page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box after navigating to tryEditor page from Binary Trees page
    When User enters invalid python code in the textBox from the  "<Sheetname>" and  <RowNumber> to tryEditor page from Binary Trees page
    And User clicks on RunButton of try editor from Binary Trees page
    Then User should see alert error message of try editor page from Binary Trees page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
 ###################### Types of Binary Trees ###########################################
 
 Scenario: Verify is user is able to navigate to Types of Binary Trees Page
   When User Clicks in Types of Binary Trees Page
   Then User should navigate to Types of Binary Trees with title "Types of Binary Trees"
  
  Scenario: Verify if user is able to navigate to Try here from Types of Binary Trees page
   When User Clicks in Try here from Types of Binary Trees Page
   Then User navigates to Try here editor from Types of Binary Trees with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Types of Binary Trees page
   When User enters valid python code in the textBox "<Sheetname>" and  <RowNumber> of Types of Binary Trees page and clicks Run button.
   Then User sees the output in the console of try editor from Types of Binary Trees.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box after navigating to tryEditor page from Types of Binary Trees page
    When User enters invalid python code in the textBox from the  "<Sheetname>" and  <RowNumber> to tryEditor page from Types of Binary Trees page and clicks on run button
    Then User should see alert error message of try editor page from Types of Binary Trees page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
    ###################### Implementation in Python ###########################################
  Scenario: Verify is user is able to navigate to Implementation in Python Page
   When User Clicks in Implementation in Python Page
   Then User should navigate to Implementation in Python page with title "Implementation in Python"
  
  Scenario: Verify if user is able to navigate to Try here from Implementation in Python page
   When User Clicks in Try here from Implementation in Python page
   Then User navigates to Try here editor from Implementation in Python page with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Implementation in Python page 
   When User enters valid python code in the textBox "<Sheetname>" and  <RowNumber> of Implementation in Python page and clicks Run button.
   Then User sees the output in the console of try editor from Implementation in Python page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box after navigating to tryEditor page from Implementation in Python  page
    When User enters invalid python code in the textBox from the  "<Sheetname>" and  <RowNumber> to tryEditor page from Implementation in Python page and clicks on run button
    Then User should see alert error message of try editor page from Implementation in Python page
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
   #################### Binary Tree Traversals ################# 
     Scenario: Verify is user is able to navigate to Binary Tree Traversals Page
   When User Clicks in Binary Tree Traversals Page
   Then User should navigate to Binary Tree Traversals page with title "Binary Tree Traversals"
  
  Scenario: Verify if user is able to navigate to Try here from Binary Tree Traversals page
   When User Clicks in Try here from Binary Tree Traversals page
   Then User navigates to Try here editor from Binary Tree Traversals page with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Binary Tree Traversals page 
   When User enters valid python code in the textBox "<Sheetname>" and  <RowNumber> of Binary Tree Traversals page and clicks Run button.
   Then User sees the output in the console of try editor from Binary Tree Traversals in Python page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box after navigating to tryEditor page from Binary Tree Traversals  page
    When User enters invalid python code in the textBox from "<Sheetname>" and  <RowNumber> to tryEditor page from Binary Tree Traversals page and clicks on run button
    Then User should see alert error message of try editor page from Binary Tree Traversals in Python page
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
  
    #################### Implementation of Binary Trees ################# 
     Scenario: Verify is user is able to navigate to Implementation of Binary Trees Page
   When User Clicks in Implementation of Binary Trees Page
   Then User should navigate to Implementation of Binary Trees page with title "Implementation of Binary Trees"
  
  Scenario: Verify if user is able to navigate to Try here from Implementation of Binary Trees page
   When User Clicks in Try here from Implementation of Binary Trees page
   Then User navigates to Try here editor from Implementation of Binary Trees page with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box after navigating  from Implementation of Binary Trees page 
   When User enters valid python code in the textBox "<Sheetname>" and  <RowNumber> of Implementation of Binary Trees page and clicks Run button.
   Then User sees the output in the console of try editor from Implementation of Binary Trees in Python page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box  from Implementation of Binary Trees page
    When User enters invalid python code in the textBox from "<Sheetname>" and  <RowNumber> to tryEditor page from Implementation of Binary Trees page and clicks on run button
    Then User should see alert error message of try editor page from Implementation of Binary Trees page
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
    
    #################### Applications of Binary trees ################# 
   Scenario: Verify if user is able to navigate to Applications of Binary trees Page
   When User Clicks in Applications of Binary trees Page
   Then User should navigate to Applications of Binary trees page with title "Applications of Binary trees"
  
  Scenario: Verify if user is able to navigate to Try here from Applications of Binary trees page
   When User Clicks in Try here from Applications of Binary trees page
   Then User navigates to Try here editor from Applications of Binary trees page with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box from Applications of Binary trees page 
   When User enters valid python code in the textBox "<Sheetname>" and  <RowNumber> of Applications of Binary trees page and clicks Run button.
   Then User sees the output in the console of try editor from Applications of Binary trees page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box from Applications of Binary trees page
    When User enters invalid python code in the textBox from "<Sheetname>" and  <RowNumber> to tryEditor page from Applications of Binary trees and clicks on run button
    Then User should see alert error message of try editor page from Applications of Binary trees page
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
    #################### Binary Search Trees ################# 
   Scenario: Verify if user is able to navigate to Binary Search Trees Page
   When User Clicks in Binary Search Trees Page
   Then User should navigate to Binary Search Trees page with title "Binary Search Trees"
  
  Scenario: Verify if user is able to navigate to Try here from Binary Search Trees page
   When User Clicks in Try here from Binary Search Trees page
   Then User navigates to Try here editor from Binary Search Trees page with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box page from Binary Search Trees page 
   When User enters valid python code in the textBox "<Sheetname>" and  <RowNumber> of Binary Search Trees page and clicks Run button.
   Then User sees the output in the console of try editor from Binary Search Trees in Python page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box  from Binary Search Trees  page
    When User enters invalid python code in the textBox from "<Sheetname>" and  <RowNumber> to tryEditor page from Binary Search Trees page and clicks on run button
    Then User should see alert error message of try editor page from Binary Search Trees in Python page
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
    ##################### Implementation Of BST ################# 
    
     Scenario: Verify is user is able to navigate to Implementation Of BST Page
   When User Clicks in Implementation Of BST Page
   Then User should navigate to Implementation Of BST page with title "Implementation Of BST"
  
  Scenario: Verify if user is able to navigate to Try here from Implementation Of BST page
   When User Clicks in Try here from Implementation Of BST page
   Then User navigates to Try here editor from Implementation Of BST page with Title "Assessment"
   
  Scenario Outline: Verify if User gets output upon giving valid python code in Editor box from Implementation Of BST page 
   When User enters valid python code in the textBox "<Sheetname>" and  <RowNumber> of Implementation Of BST page and clicks Run button.
   Then User sees the output in the console of try editor from Implementation Of BST in Python page.
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     0     |
    
    
 Scenario Outline: Verify if User sees error message upon giving invalid python code in Editor box  from Implementation Of BST  page
    When User enters invalid python code in the textBox from "<Sheetname>" and  <RowNumber> to tryEditor page from Implementation Of BST page and clicks on run button
    Then User should see alert error message of try editor page from Implementation Of BST  page
   
   Examples:
   
    | Sheetname  | RowNumber |
    | TryEditor  |     1     |
    
    