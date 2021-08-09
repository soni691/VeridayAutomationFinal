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
	
@smoke @RegressionTest
Scenario: Create new Form scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on User Manager option
	And I click on Search user textbox
	And I enter User Name
	And I click on Search User button
	And I click on GoUser button
	And I click on Forms option
	And I click on Create New form button
	And I enter Form title "AutomationForm"
	And I enter Form description "AutomationFormDescription"
	And I select form response email
	And I click on NextStep button
	And I click on Email field
	And I enter Email label "AutomationFormEmail"
	And I click on Add new field option
	And I click on Checkbox option
	And I enter Checkbox label "AutomationFormCheckbox"
	And I enter Checkbox Option1 "AutomationFormChekbox1"
	And I enter Checkbox Option2 "AutomationFormCheckbox2"
	And I click on Add new field option
	And I click on Dropdown option
	And I enter Dropdown label "AutomationFormDropdown"
	And I enter Dropdown1 option "AutomationFormDropdown1"
	And I enter Dropdown2 option "AutomationFormDropdown2"
	And I click on NextStep button
	And I click on NextStep button
	And I click on Submit For Approval button
	