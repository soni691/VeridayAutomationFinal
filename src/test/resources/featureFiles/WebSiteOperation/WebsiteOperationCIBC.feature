Feature: WebSiteOperation.feature - To prepare test cases to add web contents in CIBC website

Background: 
	Given the web application is open
	
@smoke1 @RegressionTest1
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
	And I click on Publish Update button
	
	Then I should see New Update is created
	
	
@smoke1 @RegressionTest1
Scenario: Create new Event scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on User Manager option
	And I click on Search user textbox
	And I enter User Name
	And I click on Search User button
	And I click on GoUser button
	And I click on Event option
	And I click on Create New Event button
	And I enter Event name "AutomationEvent"
	And I enter Event description "AutomationEventDescription"
	And I enter Event link "http://www.automationevents.com/"
	And I select Event End date
	And I click on Submit For Approval button
	
	Then I should see New Event is created
	
@smoke1 @RegressionTest1
Scenario: Create new Blog scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on User Manager option
	And I click on Search user textbox
	And I enter User Name
	And I click on Search User button
	And I click on GoUser button
	And I click on Blog option
	And I click on Activate your blog now button
	And I click on Add new Blog button
	And I enter Blog title "AutomationBlog"
	And I enter Blog description "AutomationBlogDescription"
	And I select category Estate planning
	And I click on Submit For Approval button
	
@smoke @RegressionTest
Scenario: Create new Team Member scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on User Manager option
	And I click on Search user textbox
	And I enter User Name 
	And I click on Search User button
	And I click on GoUser button
	And I click on My Profile option
	And I click on Team Members option
	And I click on Add Team Member button
	And I enter Team Member email
	And I enter Team Member First Name "Automation"
	And I enter Team Member Last Name "TeamMember"
	And I enter member Job Title
	And I select Provincial Licenses
	And I click on Submit For Approval button
	
@smoke1 @RegressionTest1
Scenario: Create new web page on website scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on User Manager option
	And I click on Search user textbox
	And I enter User Name
	And I click on Search User button
	And I click on GoUser button
	And I click on Settings option
	And I click on Add Page button
	And I enter navigation label "AutomationPage"
	And I enter Page Title "AutomationPageTitle"
	And I enter Page URL "AutomationPageURL"
	And I click on SavethisPage button
	
@smoke1 @RegressionTest1
Scenario: Add web content on website scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on User Manager option
	And I click on Search user textbox
	And I enter User Name
	And I click on Search User button
	And I click on GoUser button
	And I click on MyWebsite option
	And I click on Browse button
	And I click on Web Gadgets option
	And I click on Updates option
	And I click on WebGadget Add button
	And I enter Update Title on website "AutomationWebsiteUpdateTitle"
	And I select Display All Updates option
	And I click on Update Save button
	And I click on Browse button
	And I click on Web Gadgets option
	And I click on Latest Blog Posts option
	And I click on WebGadget Add button
	And I click on Blog Save button
	And I click on Add WebContent button
	And I click on Team Member Profile
	And I select Team Member from user dropdown list
	And I click on Team Member Save button