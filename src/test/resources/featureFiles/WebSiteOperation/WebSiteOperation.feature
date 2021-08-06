Feature: WebSiteOperation.feature - To prepare test cases to add web contents in website

Background: 
	Given the web application is open
	
@smoke @RegressionTest
Scenario: Create new Update scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on User Manager option
	And I click on Search user textbox
	And I enter User Name
	And I click on Search User button
	And I click on GoUser button
	And I click on Update option
	And I click on Create New Update button
	And I enter Update title "AutomationUpdate"
	And I click on SaveChanges button