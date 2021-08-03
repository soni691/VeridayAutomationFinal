package com.BlueBird.StepDefinition.UserOperation;

import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.PageObjects.UserOperation.UserOperation;

import cucumber.api.java.en.And;

public class UserOperationStepDefinition {
	
	private UserOperation useropepage;
	
	public UserOperationStepDefinition(TestContext testContext) {
		useropepage = testContext.getUserOperation();
	}
	
	@And("^I click on Search user textbox$")
	public void I_click_on_Search_user_textbox() throws Throwable {
		useropepage.clickonSearchUserBox();	
	}
	
	@And("^I enter User Name$")
	public void Ienter_User_Name() throws Throwable {
		useropepage.setSearchUser();
	}
	
	@And("^I click on Search User button$")
	public void I_click_on_Search_User_button() throws Throwable {
		useropepage.clickonSearchUserButton();
	}
	
	/*
	 * @And("^I click on Go button$") public void I_click_on_Go_button() throws
	 * Throwable { useropepage.clickonGo(); }
	 */
	
	@And("^I click on Settings option$")
	public void I_click_on_Settings_option() throws Throwable {
		useropepage.clickonSettings();	
	}
	
	@And("^I click on Get Started button$")
	public void I_click_on_Get_Started_button() throws Throwable {
		useropepage.clickonGetStarted();
	}
	
	@And("^I click on Skip this step button$")
	public void I_click_on_Skip_this_step_button() throws Throwable {
		useropepage.clickonSkipStep();
	}
	
	@And("^I click on Skip Confirm button$")
	public void I_click_on_Skip_Confirm_button() throws Throwable {
		useropepage.clickonConfirmSkipStep();
	}
	
	@And("^I click on Theme Activate button$")
	public void I_click_on_Theme_Activate_button() throws Throwable {
		useropepage.clickonThemeActivate();
	}
	
	@And("^I enter SiteURL$")
	public void I_enter_SiteURL() throws Throwable {
		useropepage.setSiteURL();
	}
	
	@And("^I enter WebsiteTitle$")
	public void I_enter_WebsiteTitle() throws Throwable {
		useropepage.setSiteTitle();
	}
	
	@And("^I click on SiteGenerate button$")
	public void I_click_on_SiteGenerate_button() throws Throwable {
		useropepage.clickonSiteGenerate();
	}
	
	@And("^I click on Start your digital journey button$")
	public void I_click_on_Start_your_digital_journey_button() throws Throwable {
		useropepage.clickonStartJourney();
	}
	
}
