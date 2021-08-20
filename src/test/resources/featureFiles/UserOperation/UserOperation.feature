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
	And I click on GoUser button
	And I click on Settings option
	And I click on Get Started button
	And I click on Skip this step button
	And I click on Skip Confirm button
	And I click on Theme Activate button
	And I enter SiteURL 
	And I enter WebsiteTitle 
	And I click on SiteGenerate button
	And I click on Start your digital journey button
	
@smoke1 @RegressionTest1
Scenario: Turn Workflow on scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on AdminHQ button
	And I enter Hub Email
	And I click on SearchHub button
	And I click on Action button
	And I click on Turn Workflow on option
	And I enter text "WORKFLOWON"
	And I click on YesturnOnWorkflow button

@smoke @RegressionTest
Scenario: Turn Website on scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on AdminHQ button
	And I enter Hub Email
	And I click on SearchHub button
	And I click on Action button
	And I click on Turn Website on option
	And I enter Website text "ONLINE"
	And I click on YesSetWebsiteOnline button