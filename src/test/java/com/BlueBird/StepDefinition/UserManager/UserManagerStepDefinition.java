package com.BlueBird.StepDefinition.UserManager;



import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.Helper.PropertyHelper;
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

	@And("^I enter Account Email$")
	public void i_enter_Account_Email() throws Throwable {
	   usermanagerPage.enterAccountEmail();
	    
	}

	@And("^I enter First Name$")
	public void i_enter_First_Name() throws Throwable {
		usermanagerPage.enterFirstName();
	    
	}

	@And("^I enter Last Name$")
	public void i_enter_Last_Name() throws Throwable {
		usermanagerPage.enterLastName();
	    
	}

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
		System.out.println("User is Created");
		usermanagerPage.pUserpopup();
	    
	}
	
	@And("^I search existing \"(.*)\"$")
	public void i_search_existing_user(String primaryuseremail) throws Throwable {
		usermanagerPage.SearchUser(primaryuseremail);
	    
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
	    
	}
	
	@And("^I find storedPrimaryUser name$")
	public void I_find_storedPrimaryUser_name() throws Throwable {
		usermanagerPage.StoredpUserName();
	}

}
