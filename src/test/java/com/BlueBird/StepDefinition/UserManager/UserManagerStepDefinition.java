package com.BlueBird.StepDefinition.UserManager;



import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.Helper.PropertyHelper;
import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.Login.LoginPage;
import com.BlueBird.PageObjects.UserManager.UserManager;
import com.BlueBird.Util.Constants;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserManagerStepDefinition {
	
	private UserManager usermanagerPage;
	
	/**
	 * Instantiates a new login step definition.
	 *
	 * @param testContext
	 *            the test context
	 */
	public UserManagerStepDefinition(TestContext testContext) {
		usermanagerPage = testContext.getUserManagerPage();
	}
	
	@And("^I click on User Manager option$")
	public void i_click_on_User_Manager_option() throws Throwable {
		usermanagerPage.clickonUserManager();		
	}

	@And("^I click on Create Single User button$")
	public void i_click_on_Create_Single_User_button() throws Throwable {
		usermanagerPage.clickonCreateSingleUser();
	    
	}
	
	@And("^I click on Create Team User button$")
	public void i_click_on_Create_Team_User_option() throws Throwable {
		usermanagerPage.clickonTeamUseroption();		
	}
	
	@And("^I enter Team Name \"([^\"]*)\"$")
	public void I_enter_TeamName(String tname) throws Throwable {
		usermanagerPage.setTeamName(tname);
	    
	}


	@And("^I enter Account Email$")
	public void i_enter_Account_Email() throws Throwable {
	   usermanagerPage.enterAccountEmail();
	    
	}
	@And("^I enter First Name \"([^\"]*)\"$")
	public void I_enter_First_Name(String fname) throws Throwable {
		usermanagerPage.setFName(fname);
	    
	}

//	@And("^I enter First Name$")
//	public void i_enter_First_Name() throws Throwable {
//		usermanagerPage.enterFirstName();
//	    
//	}
	@And("^I enter Last Name \"([^\"]*)\"$")
	public void I_enter_Last_Name(String lname) throws Throwable {
		usermanagerPage.setLName(lname);
	    
	}

//	@And("^I enter Last Name$")
//	public void i_enter_Last_Name() throws Throwable {
//		usermanagerPage.enterLastName();
//	    
//	}

	@And("^I enter JobTitle1$")
	public void i_enter_JobTitle1() throws Throwable {
		usermanagerPage.enterJobTitle1();
	    
	}
	@And("^I enter JobTitle2$")
	public void i_enter_JobTitle2() throws Throwable {
		usermanagerPage.enterJobTitle2();
	    
	}

	@And("^I enter Location$")
	public void i_enter_Location() throws Throwable {
		//String location = CONFIG.getProperty("demo.location");
		usermanagerPage.enterLocation();	    
	}

	@And("^I enter PhoneNumber$")
	public void i_enter_PhoneNumber() throws Throwable {		
		usermanagerPage.enterPhone();
	}
	
	@And("^I enter StateRegistration$")
	public void i_enter_StateRegistration() throws Throwable {		
		usermanagerPage.enterPLincense();
	}
	

	@And("^I click on Save&Activate button$")
	public void i_click_on_Save_Activate_button() throws Throwable {
		usermanagerPage.clickSave();
	    
	}

	@Then("^A new Primary User is created$")
	public void A_new_Primary_User_is_created() throws Throwable {
		System.out.println("Primary User is Created");
		usermanagerPage.pUserpopup();
	    
	}
	
	@Then("^A new Team User is created$")
	public void A_new_Team_User_is_created() throws Throwable {
		System.out.println("Team User is Created");
		usermanagerPage.pUserpopup();
	    
	}
	
	@And("^I search existing \"([^\"]*)\" or \"([^\"]*)\"$")
	public void i_search_existing_user(String primaryuseremail, String secondemail) throws Throwable {
		usermanagerPage.SearchUser(primaryuseremail,secondemail);
	    
	}

	@And("^I click on Go button$")
	public void i_click_on_Go_button() throws Throwable {
		usermanagerPage.ClickGo();
	}

	@And("^I click on Settings options$")
	public void i_click_on_Settings_options() throws Throwable {
		usermanagerPage.ClickSetting();
	}

	@And("^I click on DigitalWorkspace option$")
	public void i_click_on_DigitalWorkspace_option() throws Throwable {
		usermanagerPage.ClickonbackDW();
	}

	@And("^I click on MyWebsite options$")
	public void i_click_on_MyWebsite_options() throws Throwable {
		usermanagerPage.ClickonMyWebsite();
		
	}

	@And("^I click on Blog options$")
	public void i_click_on_Blog_options() throws Throwable {
		usermanagerPage.ClickonBlog();
	}

	@And("^I click on Forms options$")
	public void i_click_on_Forms_options() throws Throwable {
		usermanagerPage.ClickonForms();
	}

	@And("^I click on Events options$")
	public void i_click_on_Events_options() throws Throwable {
		usermanagerPage.ClickonEvents();
	}

	@And("^I click on Polls options$")
	public void i_click_on_Polls_options() throws Throwable {
		usermanagerPage.ClickonPolls();
	}

	@And("^I click on RecycleBin options$")
	public void i_click_on_RecycleBin_options() throws Throwable {
		usermanagerPage.ClickonRecycleBin();
	}

	@And("^I click on MyProfile options$")
	public void i_click_on_MyProfile_options() throws Throwable {
		usermanagerPage.ClickonMyProfile();
	}

	@And("^I click on Updates options$")
	public void i_click_on_Updates_options() throws Throwable {
		usermanagerPage.ClickonUpdates();
	}

	@And("^I click on CampaignManager options$")
	public void i_click_on_CampaignManager_options() throws Throwable {
		usermanagerPage.ClickonCampaignManager();
	}

	@And("^I click on ContentCollections options$")
	public void i_click_on_ContentCollections_options() throws Throwable {
		usermanagerPage.ClickonContentCollection();
	}

	@And("^I click on Dashboard options$")
	public void i_click_on_Dashboard_options() throws Throwable {
		usermanagerPage.ClickonDashboard();
	}

	@And("^I click on Dashboard(\\d+) options$")
	public void i_click_on_Dashboard_options(int arg1) throws Throwable {
		usermanagerPage.ClickonDashboard2();
	}

	@And("^I click on FileManager options$")
	public void i_click_on_FileManager_options() throws Throwable {
		usermanagerPage.ClickonFileManager();
	}
	
	@And("^I find storedPrimaryUser name$")
	public void I_find_storedPrimaryUser_name() throws Throwable {
		usermanagerPage.StoredpUserName();
	}
	
	@And("^I click on Create Reviewer user button$")
	public void i_click_on_create_reviewer_user_button() throws Throwable{
		usermanagerPage.ClickonReviewer();
	}

	@And("^I enter Queue Name \"([^\"]*)\"$")
	public void i_enter_queue_name(String qname) {
		usermanagerPage.setQueueName(qname);
	}
	
	@And("^I click on Queue add button$")
	public void i_click_on_queue() {
		usermanagerPage.clickQueueAdd();
	}
	
	@Then("^A new Reviewer User is created$")
	public void A_new_Reviewer_User_is_created() throws Throwable {
		System.out.println("Reviewer User is Created");
		usermanagerPage.pUserpopup();    
	}
	
	@And("^I enter Marketing Queue Name \"([^\"]*)\"$")
	public void i_enter_marketing_queue_name(String mqname) throws Throwable {
		usermanagerPage.setMarketingQueue(mqname);
	}
	
	@And("^I click on Marketing Queue add button$")
	public void I_click_on_Marketing_Queue_add_button() throws Throwable {
		usermanagerPage.ClickonMarketingQueue();
	}
	
	@Then("^A new Marketing User is created$")
	public void A_new_Marketing_User_is_created() throws Throwable {
		System.out.println("Marketing User is Created");
		usermanagerPage.pUserpopup();    
	}
	
	@And("^I click on Create Marketing User button$")
	public void I_click_on_Create_Marketing_User_button() throws Throwable {
		usermanagerPage.ClickonMarketing();;
	}
	
}