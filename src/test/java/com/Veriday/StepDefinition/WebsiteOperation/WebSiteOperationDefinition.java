package com.Veriday.StepDefinition.WebsiteOperation;

import org.junit.Assert;

import com.Veriday.Cucumber.TestContext;
import com.Veriday.PageObjects.WebsiteOperation.WebSiteOperation;
import com.Veriday.Util.Variables;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

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
		websiteoperation.clickonCreateForm();
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
	
	@And("^I click on Publish Update button$")
	public void I_click_on_publish_update() throws Throwable {
		websiteoperation.clickonPublishUpdate();;	
	}
	
	@And("^I click on Poll option$")
	public void I_click_on_poll_option() throws Throwable {
		websiteoperation.clickonPollOption();;	
	}
	
	@And("^I click on Create New Poll button$")
	public void I_click_on_create_new_poll() throws Throwable {
		websiteoperation.clickonCreatePoll();	
	}
	
	@And("^I enter Poll name \"([^\"]*)\"$")
	public void I_enter_poll_name(String pollname) throws Throwable {
		websiteoperation.setPollTitle(pollname);	
	}
	
	@And("^I enter Poll description \"([^\"]*)\"$")
	public void I_enter_poll_description(String polldesc) throws Throwable {
		websiteoperation.clickonPollsDesc();
		websiteoperation.setPollDescription(polldesc);	
	}
	
	@And("^I click on Add Answer button$")
	public void I_click_on_add_answer_button() throws Throwable {
		websiteoperation.clickonAddPollAnswer();
	}
	
	@And("^I enter Poll Answer1 \"([^\"]*)\"$")
	public void I_enter_poll_answer1(String pollanswer1) throws Throwable {
		websiteoperation.setPoll1Answer1(pollanswer1);	
	}
	
	@And("^I enter Poll Answer2 \"([^\"]*)\"$")
	public void I_enter_poll_answer2(String ftitle) throws Throwable {
		websiteoperation.setPoll1Answer2(ftitle);	
	}
	
	@And("^I click on MyWebsite option$")
	public void I_click_on_mywebsite_option() throws Throwable {
		websiteoperation.clickonMyWebsite();	
	}
	
	@And("^I click on Add WebContent button")
	public void I_click_on_add_webcontent() throws Throwable {
		websiteoperation.clickonAddwebcontent();
	}
	
	@And("^I click on Add Forms option$")
	public void I_click_on_add_forms_option() throws Throwable {
		websiteoperation.clickonWebsiteform();
	}
	
	@And("^I click on Webcontent Save button$")
	public void I_click_on_webcontent_save() throws Throwable {
		websiteoperation.clickonSaveWebcontent();	
	}
	
	@And("^I click on Add Events option$")
	public void I_click_on_add_events_option() throws Throwable {
		websiteoperation.clickonWebsiteevent();	
	}
	
	@And("^I click on Polls option$")
	public void I_click_on_polls_option() throws Throwable {
		websiteoperation.clickonWebsitepoll();	
	}
	
	@And("^I click on Poll Save button$")
	public void I_click_on_poll_save() throws Throwable {
		websiteoperation.clickonPollSave();;	
	}
	
	@And("^I click on Browse button$")
	public void I_click_on_browse() throws Throwable {
		websiteoperation.clickonWebsiteBrowse();	
	}
	
	@And("^I click on Web Gadgets option$")
	public void I_click_on_web_gadgets() throws Throwable {
		websiteoperation.clickonWebGadget();	
	}
	
	@And("^I click on Updates option$")
	public void I_click_on_updates_option() throws Throwable {
		websiteoperation.clickonUpdateOption();	
	}
	
	@And("^I click on WebGadget Add button$")
	public void I_click_on_web_gadget_add() throws Throwable {
		websiteoperation.clickonAddWebGagdet();	
	}
	
	@And("^I click on Update Save button$")
	public void I_click_on_update_save() throws Throwable {
		websiteoperation.clickonSaveWebcontent();	
	}
	
	@And("^I click on Blog option$")
	public void I_click_on_blog_option() throws Throwable {
		websiteoperation.clickonBlogOption();	
	}
	
	@And("^I click on Activate your blog now button$")
	public void I_click_on_activate_blog() throws Throwable {
		websiteoperation.clickonActivateBlog();	
	}
	
	@And("^I click on Add new Blog button$")
	public void I_click_on_add_blog() throws Throwable {
		websiteoperation.clickonCreateBlog();	
	}
	
	@And("^I enter Blog title \"([^\"]*)\"$")
	public void I_enter_blog_title(String btitle) throws Throwable {
		websiteoperation.setBlogTitle(btitle);	
	}
	
	@And("^I enter Blog description \"([^\"]*)\"$")
	public void I_enter_blog_description(String bdesc) throws Throwable {
		websiteoperation.clickonBlogDesc();
		websiteoperation.setBlogDescription(bdesc);	
	}
	
	@And("^I select category Estate planning$")
	public void I_select_estate_category() throws Throwable {
		websiteoperation.clickonCategory();	
	}
	
	@And("^I click on Latest Blog Posts option$")
	public void I_click_on_latest_blog_option() throws Throwable {
		websiteoperation.clickonBlogGadget();	
	}
	
	@And("^I click on Blog Save button$")
	public void I_click_on_blog_save() throws Throwable {
		websiteoperation.clickonSaveWebcontent();	
	}
	
	 @And("^I click on My Profile option$")
	 public void i_click_on_my_profile_option() throws Throwable {
	        websiteoperation.clickonMyProfileOption();
	 }
	 
	 @And("^I click on Team Members option$")
	    public void i_click_on_team_members_option() throws Throwable {
	        websiteoperation.clickonTeamMemberOption();
	    }
	 
	 @And("^I click on Add Team Member button$")
	    public void i_click_on_add_team_member_button() throws Throwable {
	        websiteoperation.clickonCreateTeamMember();
	    }
	 
	 @And("^I enter Team Member email$")
	    public void i_enter_team_member_email() throws Throwable {
	       websiteoperation.setTeamMemberEmail();
	    }
	 
	 @And("^I enter Team Member First Name \"([^\"]*)\"$")
	    public void i_enter_team_member_first_name_something(String strArg1) throws Throwable {
	       websiteoperation.setMemberFirstName(strArg1);
	    }
	 
	 @And("^I enter Team Member Last Name \"([^\"]*)\"$")
	    public void i_enter_team_member_last_name_something(String strArg2) throws Throwable {
	        websiteoperation.setMemberLastName(strArg2);
	    }
	 
	 @And("^I click on Team Member Profile$")
	    public void i_click_on_team_member_profile() throws Throwable {
	       websiteoperation.clickonWebsiteTeamProfile();
	    }
	 
	 @And("^I select Team Member from user dropdown list$")
	    public void i_select_team_member_from_user_dropdown_list() throws Throwable {
	        websiteoperation.clickonTeamMemberDropdown();
	        websiteoperation.clickonCreatedTeamMember();
	    }
	 
	 @And("^I click on Team Member Save button$")
	    public void i_click_on_team_member_save_button() throws Throwable {
	        websiteoperation.clickonSaveWebcontent();
	    }
	 
	 @Then("^I should see New Form is created$")
	    public void i_should_see_new_form_is_created() throws Throwable {
		 Assert.assertTrue("Form name is not displayed",websiteoperation.storedFormName());
	      
	    }
	 
	 @Then("^I should see New Event is created$")
	    public void i_should_see_new_event_is_created() throws Throwable {
	        Assert.assertTrue("Event name is not displayed",websiteoperation.storedEventName());
	    }
	 
	 @Then("^I should see New Update is created$")
	    public void i_should_see_new_update_is_created() throws Throwable {
		 Assert.assertTrue("Form name is not displayed",websiteoperation.storedUpdateName());
	    }
	 
	 @Then("^I should see New Poll is created$")
	    public void i_should_see_new_poll_is_created() throws Throwable {
		 Assert.assertTrue("Form name is not displayed",websiteoperation.storedPollName());
	    }
	 
	 @And("^I enter Update Title on website \"([^\"]*)\"$")
	    public void i_enter_update_title_on_website_something(String strArg1) throws Throwable {
	       websiteoperation.setWebsiteUpdateTitle(strArg1);
	    }
	 
	 @And("^I select Display All Updates option$")
	    public void i_select_display_all_updates_option() throws Throwable {
	        websiteoperation.clickonDisplayallupdate();
	    }
	 

	    @And("^I click on Add Page button$")
	    public void i_click_on_add_page_button() throws Throwable {
	        websiteoperation.clickonCreatePage();
	    }

	    @And("^I enter navigation label \"([^\"]*)\"$")
	    public void i_enter_navigation_label_something(String strArg1) throws Throwable {
	       websiteoperation.setPagenavlabel(strArg1);
	    }

	    @And("^I enter Page Title \"([^\"]*)\"$")
	    public void i_enter_page_title_something(String strArg1) throws Throwable {
	        websiteoperation.setPageTitle(strArg1);
	    }

	    @And("^I enter Page URL \"([^\"]*)\"$")
	    public void i_enter_page_url_something(String strArg1) throws Throwable {
	        websiteoperation.setPageURL(strArg1);
	    }

	    @And("^I click on SavethisPage button$")
	    public void i_click_on_savethispage_button() throws Throwable {
	       websiteoperation.clickonSavePage();
	    }
	    
	    @And("^I enter member Job Title$")
	    public void i_enter_member_job_title1() throws Throwable {
	       websiteoperation.setMemberTitle();
	    }


	    @And("^I select Provincial Licenses$")
	    public void i_select_provincial_licenses() throws Throwable {
	        websiteoperation.setMemberLicense();
	    }

}
