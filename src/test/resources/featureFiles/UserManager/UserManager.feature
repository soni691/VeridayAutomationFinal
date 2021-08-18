Feature: UserManager.feature - To prepare test cases to create new Primary User
Background: 
	Given I do login with admin user
	
@smoke @RegressionTest
Scenario: Create new Primary User scenario
	When I click on User Manager option
	And I click on Create Single User button
	And I enter Account Email
	And I enter First Name "Automation"
	And I enter Last Name "PrimaryUser"
	And I enter JobTitle1
	And I enter JobTitle2
	And I enter StateRegistration
	And I enter Location "Burlington" and "Manitoba Financial Center - Rosser"
	And I enter PhoneNumber
	And I click on Save&Activate button
	
	Then A new Primary User is created


Scenario: Create new Team User scenario
	When I click on User Manager option
	And I click on Create Single User button
	And I click on Create Team User button
	And I enter Account Email
	And I enter First Name "Automation"
	And I enter Last Name "TeamUser"
	And I enter JobTitle1
	And I enter JobTitle2
	And I enter StateRegistration
	And I enter Location "Burlington" and "Manitoba Financial Center - Rosser"
	And I enter PhoneNumber
	And I enter Team Name "AutomationTeam"
	And I click on Save&Activate button
	
	Then A new Team User is created
	

Scenario: Create new Reviewer User scenario
	When I click on User Manager option
	And I click on Create Single User button
	And I click on Create Reviewer user button
	And I enter Account Email
	And I enter First Name "Automation"
	And I enter Last Name "ReviewerUser"
	And I enter Queue Name "Portal Content Reviewer"
	And I click on Queue add button
	And I click on Save&Activate button
	
	Then A new Reviewer User is created
	

Scenario: Create new Marketing User scenario
	When I click on User Manager option
	And I click on Create Single User button
	And I click on Create Marketing User button
	And I enter Account Email
	And I enter First Name "Automation"
	And I enter Last Name "MarketingUser"
	And I enter Marketing Queue Name "DA Marketing"
	And I click on Marketing Queue add button
	And I click on Save&Activate button
	
	Then A new Marketing User is created


#Scenario: Validate user Manager option validations
#    When I click on User Manager option
#    And I search existing "alisha.new@veriday.com" or "alisha.new@veriday.com" 
#    And I click on Go button
#    And I click on Settings options
#    And I click on DigitalWorkspace option
#    And I click on MyWebsite options
#    And I click on DigitalWorkspace option
#    And I click on Blog options
#    And I click on DigitalWorkspace option
#    And I click on Forms options
#    And I click on DigitalWorkspace option
#    And I click on Events options
#    And I click on DigitalWorkspace option
#    And I click on Polls options
#    And I click on DigitalWorkspace option
#    And I click on RecycleBin options
#    And I click on DigitalWorkspace option
#    And I click on MyProfile options
#    And I click on DigitalWorkspace option
#    And I click on Updates options
#    And I click on DigitalWorkspace option
#    And I click on CampaignManager options
#    And I click on DigitalWorkspace option
#    And I click on ContentCollections options
#    And I click on DigitalWorkspace option
#    And I click on Dashboard options
#    And I click on DigitalWorkspace option
#    And I click on Dashboard2 options
#    And I click on DigitalWorkspace option
#    And I click on FileManager options