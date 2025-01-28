Feature: Title of your feature
     open the DS-Algo-portal Registrationpage
     
     Background:
       Given user is on homepage
       When user clicks register button on homepage
       Then user redirected to registration page

        	Scenario: verify  user will able to see alert when required fields blank
     	When user name and passsword filed will be empty and then click on register
     	Then user should see alert on required empty field	
     	
     Scenario: verify user recieve error message when password mismatch
       When      user enters mismatch password in cofirm password field and click on registration field
       Then      user should see error message password mismatched
    
       

 
   
   
  
    
     
     
  
     																																																																																																																						
