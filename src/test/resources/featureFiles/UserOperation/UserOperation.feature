Feature: UserOperation.feature - To prepare test cases for User Operation

Background: 
	Given the web application is open
	
@smoke @RegressionTest
Scenario: Create new Site scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on User Manager option
	And I click on Search user textbox
	And I enter User Name
	And I click on Search User button
	And I click on Go button
	And I click on Settings option
	And I click on Get Started button
	And I click on Skip this step button
	And I click on Skip Confirm button
	And I click on Theme Activate button
	And I enter SiteURL 
	And I enter WebsiteTitle 
	And I click on SiteGenerate button
	And I click on Start your digital journey button
	
	