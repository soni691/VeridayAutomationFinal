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
	
	@And("^I click on Forms option$")
	public void I_click_on_Forms_option() throws Throwable {
		websiteoperation.clickonFormOption();;	
	}
	
	@And("^I click on Create New form button$")
	public void I_click_on_Create_New_form_button() throws Throwable {
		websiteoperation.clickonCreateForm();;	
	}
	
	@And("^I enter Form title \"([^\"]*)\"$")
	public void I_enter_form_title(String ftitle) throws Throwable {
		websiteoperation.clickonFormTitle();
		websiteoperation.setFormTitle(ftitle);	
	}
	
	@And("^I enter Form description \"([^\"]*)\"$")
	public void I_enter_form_description(String fdesc) throws Throwable {
		websiteoperation.clickonFormDesc();
		websiteoperation.setFormDescription(fdesc);	
	}
	
	@And("^I select form response email$")
	public void I_select_form_response_email() throws Throwable {
		websiteoperation.clickonEmailFormResponse();		
	}
	
	@And("^I click on NextStep button$")
	public void I_click_on_nextstep() throws Throwable {
		websiteoperation.clickonNextStep();;	
	}
	
	@And("^I click on Email field$")
	public void I_click_on_Email_field() throws Throwable {
		websiteoperation.clickonAddEmail();;	
	}
	
	@And("^I enter Email label \"([^\"]*)\"$")
	public void I_enter_email_label(String elabel) throws Throwable {
		websiteoperation.setFormEmail(elabel);;	
	}
	
	@And("^I click on Add new field option$")
	public void I_click_on_addnewfield_option() throws Throwable {
		websiteoperation.clickonAddNewField();;	
	}
	
	@And("^I click on Checkbox option$")
	public void I_click_on_checkbox_option() throws Throwable {
		websiteoperation.clickonAddFormCheckbox();;	
	}
	
	@And("^I enter Checkbox label \"([^\"]*)\"$")
	public void I_enter_checkbox_label(String flabel) throws Throwable {
		websiteoperation.setFormCheckboxlabel(flabel);;	
	}
	
	@And("^I enter Checkbox Option1 \"([^\"]*)\"$")
	public void I_enter_checkbox_option1(String fcoption1) throws Throwable {
		websiteoperation.setCheckboxlabel1(fcoption1);	
	}
	
	@And("^I enter Checkbox Option2 \"([^\"]*)\"$")
	public void I_enter_Checkbox_option2(String fcoption2) throws Throwable {
		websiteoperation.setCheckbox2label2(fcoption2);	
	}
	
	@And("^I click on Dropdown option$")
	public void I_click_on_dropdown_option() throws Throwable {
		websiteoperation.clickonFormDropdown();;	
	}
	
	@And("^I enter Dropdown label \"([^\"]*)\"$")
	public void I_enter_dropdown_label(String fdrplabel) throws Throwable {
		websiteoperation.setFormDrodownLabel(fdrplabel);	
	}
	
	@And("^I enter Dropdown1 option \"([^\"]*)\"$")
	public void I_enter_dropdown1_option(String fdrpoption1) throws Throwable {
		websiteoperation.setDropdownoption1(fdrpoption1);	
	}
	
	@And("^I enter Dropdown2 option \"([^\"]*)\"$")
	public void I_enter_dropdown2_option(String fdroption2) throws Throwable {
		websiteoperation.setDropdownoption2(fdroption2);	
	}
	
	@And("^I click on Submit For Approval button$")
	public void I_click_on_submit_form() throws Throwable {
		websiteoperation.clickonSubmitForm();;	
	}
	
	@And("^I click on Event option$")
	public void I_click_on_event_option() throws Throwable {
		websiteoperation.clickonEventsOption();;	
	}
	
	@And("^I click on Create New Event button$")
	public void I_click_on_create_new_event() throws Throwable {
		websiteoperation.clickonCreateEvent();	
	}
	
	@And("^I enter Event name \"([^\"]*)\"$")
	public void I_enter_event_name(String evtitle) throws Throwable {
		websiteoperation.clickonEventTitle();
		websiteoperation.setEventTitle(evtitle);	
	}
	
	@And("^I enter Event description \"([^\"]*)\"$")
	public void I_enter_event_descrption(String evntdesc) throws Throwable {
		websiteoperation.clickonEventDesc();
		websiteoperation.setEventDescription(evntdesc);	
	}
	
	@And("^I enter Event link \"([^\"]*)\"$")
	public void I_enter_event_link(String evlink) throws Throwable {
		websiteoperation.clickonEventlink();
		websiteoperation.setEventLink(evlink);	
	}
	
	@And("^I select Event End date$")
	public void I_enter_event_end_date() throws Throwable {
		websiteoperation.clickonEventEndDate();
		websiteoperation.setEndDate();
		websiteoperation.clickonDone();
	}
}
