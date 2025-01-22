Feature: Linked list module
Open Linked list module in DS-algo portal
  
  Background: The user sign in to dsAlgo Portal 
  
  Scenario: Verify that user is able to navigate to Linked list page 
  Given The user is in the Home page after Sign in
  When The user select Linked list item from the drop down menu
  Then The user will be redirected to Linked list Page 
   
  Scenario: Verify that user is able to navigate to Introduction page
  Given The user is in the Linked list page after Sign in
  When The user clicks the Introduction button
  Then The user should be redirected to Introduction page 
  
  
  Scenario: Verify that user is able to navigate to tryEditor page from Introduction page
  Given The user is on the Introduction page
  When The user clicks Try Here button in the Introduction page 
  Then The user should be redirected to a page having a tryEditor with a Run button to test 
  
  Scenario: Verify that user receives an error when click on Run button without entering code for Introduction page	
  Given The user is in the Try Editor page 
  When The user clicks the Run button without entering any code in the editor	
  Then User should able to see an error message in the alert window 
  
  Scenario: Verify that user receives error for invalid python code for Introduction page
  Given The user is in the Try Editor page
  When The user click the Run button entering invalid code in the editor
  Then User should able to see error message in alert window 
  
  Scenario: Verify that user is able to see output for valid python code for Introduction page
  Given The user is in the Try Editor page
  When The user click Run button entering a valid python code in the Editor 
  Then The user should able to see an output in the console 
  
  
 	Scenario: Verify that user is able to navigate to Creating Linked list page from Introduction page	
 	Given The user is in the Linked list page after Sign in	
 	When The user click Creating linked List button	
 	Then The user should be redirected to Creating Linked List page 
 	
 	Scenario: Verify that user is able to navigate to Try Editor page for Creating Linked List page	
 	Given The user is on the Creating Linked List page	
	When The user click Try Here button in Creating Linked List page	
	Then The user should be redirected to a page having a try Editor with a Run button to test 
	
	Scenario: Verify that user receives an error when click on Run button without entering code for Creating Linked List page	
	Given The user is in the Try Editor page	
	When The user clicks the Run button without entering the code in the Editor	
	Then User should able to see error message in alert window
  
  Scenario: Verify that user receives error for invalid python code for Creating Linked List page	
 	Given The user is in the Try Editor page	
 	When The user click the Run button entering invalid code in the editor
  Then User should able to see error message in alert window

	Scenario: Verify that user is able to see output for valid python code for Creating Linked List page
 	Given The user in the Try Editor page
	When The user click Run button enter a valid python code in the Editor
	Then The user should able to see output in the console
	
	
	Scenario: Verify that user is able to navigate to Types of linked list page from Creating Linked List page
 	Given The user is in the Linked list page after Sign in	
	When The user click Types of linked List button	
	Then The user should be redirected to Types of linked List page 
	
	Scenario: Verify that user is able to navigate to Try Editor page from Types of linked List page	
	Given The user is on the Types of linked List page 
	When The user click Try Here button in Types of linked List page	
	Then The user should be redirected to a page having a try Editor with a Run button to test
	
	Scenario: Verify that user receives an error when click on Run button without entering code for Types of linked List page	
	Given The user is in the Try Editor page	
	When The user clicks the Run button without entering the code in the Editor	
	Then User should able to see error message in alert window 
	
	Scenario: Verify that user receives error for invalid python code for Types of linked List page
 	Given The user is in the Try Editor page	
	When The user click the Run button entering invalid code in the editor	
  Then User should able to see error message in alert window 
  
  Scenario: Verify that user is able to see output for valid python code for Types of linked List page	
  Given The user in the Try Editor page 
  When The user click Run button enter a valid python code in the Editor 
  Then The user should able to see output in the console 
  
  
  Scenario: Verify that user is able to navigate to Implement Linked List in Python page from Types of linked List page 
 	Given The user is in the Implement Linked List in Python page after Sign in	
 	When The user click Implement Linked List in Python button 
 	Then The user should be redirected to Implement Linked List in Python page 
 	
 	Scenario: Verify that user is able to navigate to Implement Linked List in Python page from Types of linked List page 
 	Given The user is in the Implement Linked List in Python page after Sign in	
 	When The user click Implement Linked List in Python button 
 	Then The user should be redirected to Implement Linked List in Python page
 
 	Scenario: Verify that user receives an error when clicking on Run button without entering code for Implement Linked List in Python page	
 	Given The user is in the Try Editor page 
 	When The user clicks the Run button without entering the code in the Editor	
 	Then User should able to see error message in alert window 

	Scenario: Verify that user receives error for invalid python code for Implement Linked List in Python page	
	Given The user is in the Try Editor page 
	When The user click the Run button entering invalid code in the editor	
	Then User should able to see error message in alert window 

	Scenario: Verify that user is able to see output for valid python code for Implement Linked List in Python page	
	Given The user in the Try Editor page 
	When The user click Run button enter a valid python code in the Editor 
	Then The user should able to see output in the console 


	Scenario: Verify that user is able to navigate to Traversal page from Implement Linked List in Python page 
	Given The user is in the Traversal page after Sign in	
	When The user click Traversal button 
	Then The user should be redirected to Traversal page 
 
 	Scenario: Verify that user is able to navigate to Try Editor page from Traversal page 
 	Given The user is on the Traversal page
	When The user click Try Here button in Traversal page	
	Then The user should be redirected to a page having a try Editor with a Run button to test 

	Scenario: Verify that user receives an error when click on Run button without entering code for Traversal page	
	Given The user is in the Try Editor page	
	When The user clicks the Run button without entering the code in the Editor	
	Then User should able to see error message in alert window

	Scenario: Verify that user receives error for invalid python code for Traversal page 
	Given The user is in the Try Editor page 
	When The user click the Run button entering invalid code in the editor 
	Then User should able to see error message in alert window 

	Scenario: Verify that user is able to see output for valid python code for Traversal page	
	Given The user in the Try Editor page	
	When The user click Run button enter a valid python code in the Editor	
	Then The user should able to see output in the console 


	Scenario: Verify that user is able to navigate to Insertion page from Traversal page 
	Given The user is in the Insertion page after Sign in	
	When The user click Insertion button 
	Then The user should be redirected to Insertion page 
 
 	Scenario: Verify that user is able to navigate to Try Editor page from Insertion page	
 	Given The user is on the Insertion page	
 	When The user click Try Here button in Insertion page	
 	Then The user should be redirected to a page having a try Editor with a Run button to test 

	Scenario: Verify that user receives an error when click on Run button without entering code for Insertion page	
	Given The user is in the Try Editor page	
	When The user clicks the Run button without entering the code in the Editor	
	Then User should able to see error message in alert window

 	Scenario: Verify that user receives error for invalid python code for Insertion page	
	Given The user is in the Try Editor page	
 	When The user click the Run button entering invalid code in the editor	
 	Then User should able to see error message in alert window

	Scenario: Verify that user is able to see output for valid python code for Insertion page	
	Given The user in the Try Editor page	
	When The user click Run button enter a valid python code in the Editor	
	Then The user should able to see output in the console 


	Scenario: Verify that user is able to navigate to Deletion page from Insertion page	
	Given The user is in the Deletion page after Sign in	
	When The user click Deletion button	
	Then The user should be redirected to Deletion page
 
	Scenario: Verify that user is able to navigate to Try Editor page from Deletion page	
 	Given The user is on the Deletion page	
 	When The user click Try Here button in Deletion page	
 	Then The user should be redirected to a page having a try Editor with a Run button to test 

	Scenario: Verify that user receives an error when click on Run button without entering code for Deletion page	
	Given The user is in the Try Editor page	
	When The user clicks the Run button without entering the code in the Editor	
	Then User should able to see error message in alert window 

	Scenario: Verify that user receives error for invalid python code for Deletion page	
	Given The user is in the Try Editor page 
	When The user click the Run button entering invalid code in the editor	
	Then User should able to see error message in alert window 

	Scenario: Verify that user is able to see output for valid python code for Deletion page 
	Given The user in the Try Editor page	
	When The user click Run button enter a valid python code in the Editor	
	Then The user should able to see output in the console 


	Scenario: Verify that user is able to navigate to Practice Questions page	
	Given The user is in the Linked List page 	
	When The user clicks on Practice Questions Link	
	Then The user be directed to Practice Questions page
	
