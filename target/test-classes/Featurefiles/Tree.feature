Feature: DsAlgo Tree feature-functionality

Background: Verify if User navigates to Tree page after login
     Given User is in home page
     When Userclicks Get Started of Tree in Home Page.
     Then User should navigate to tree Page with title "Tree"

##############################  overView of Trees ##################################################
Scenario: Verify if User navigates to OverView of Trees page
    When User clicks in OverView of Trees Page .
    Then User should navigate to OverView of Trees page with title "OverView of Trees"
    
Scenario: Verify if User navigates to TryEditor Page from OverView of Trees page
   When User clicks on TryHere link of OverView of Trees page .
   Then User should navigate to TryEditor page from OverView of Trees with title "Assessment"
