package com.BlueBird.StepDefinition.WebsiteOperation;

import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.PageObjects.WebsiteOperation.WebSiteOperation;

import cucumber.api.java.en.And;

public class WebSiteOperationDefinition {
	
	private WebSiteOperation websiteoperation;
	
	public WebSiteOperationDefinition(TestContext testContext) {
		websiteoperation = testContext.getWebsiteOperation();
	}
	
	@And("^I click on Update option$")
	public void I_click_on_update_option() throws Throwable {
		websiteoperation.clickonUpdateOption();;	
	}
	
	@And("^I click on Create New Update button$")
	public void I_click_on_create_new_update() throws Throwable {
		websiteoperation.clickonCreateUpdate();	
	}
	
	@And("^I enter Update title \"([^\"]*)\"$")
	public void I_enter_update_title(String utitle) throws Throwable {
		websiteoperation.setUpdateTitle(utitle);	
	}
}
