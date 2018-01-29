Feature: Login into User's account with valid User Name and Password. 

Scenario: Login into User's account with valid credentials.

	Given User navigate to stackoverflow.com.
	And User click on the login button on Home Page.
	And User enters valid User Name.
	And User enters valid password.
	When User clicks on the login button.
	Then User should be taken to successful login page. 
	
	
	