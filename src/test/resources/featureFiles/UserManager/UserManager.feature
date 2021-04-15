Feature: UserManager.feature - To prepare test cases to create new Primary User
Background: 
	Given I do login with admin user
	

#Scenario: Create new Primary User scenario
#	When I click on User Manager option
#	And I click on Create Single User button
#	And I enter Account Email
#	And I enter First Name
#	And I enter Last Name
#	And I enter JobTitle1
#	And I enter JobTitle2
#	And I enter StateRegistration
#	And I enter Location
#	And I enter PhoneNumber
#	And I click on Save&Activate button
#	
#	Then A new Primary User is created
	
Scenario: Validate user Manager option validations
    When I click on User Manager option
    And I search existing "alisha.new@veriday.com" or "alisha.new@veriday.com" 
    And I click on Go button
    And I click on Settings options
    And I click on DigitalWorkspace option
    And I click on MyWebsite options
    And I click on DigitalWorkspace option
    And I click on Blog options
    And I click on DigitalWorkspace option
    And I click on Forms options
    And I click on DigitalWorkspace option
    And I click on Events options
    And I click on DigitalWorkspace option
    And I click on Polls options
    And I click on DigitalWorkspace option
    And I click on RecycleBin options
    And I click on DigitalWorkspace option
    And I click on MyProfile options
    And I click on DigitalWorkspace option
    And I click on Updates options
    And I click on DigitalWorkspace option
    And I click on CampaignManager options
    And I click on DigitalWorkspace option
    And I click on ContentCollections options
    And I click on DigitalWorkspace option
    And I click on Dashboard options
    And I click on DigitalWorkspace option
    And I click on Dashboard2 options
    And I click on DigitalWorkspace option
    And I click on FileManager options