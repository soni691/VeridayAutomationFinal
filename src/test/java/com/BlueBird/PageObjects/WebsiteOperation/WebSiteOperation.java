package com.BlueBird.PageObjects.WebsiteOperation;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WaitHelper;
import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.BasePage;
import com.BlueBird.PageObjects.UserOperation.UserOperation;
import com.BlueBird.Util.Variables;

import junit.framework.Assert;

public class WebSiteOperation extends BasePage {
	private WaitHelper waithelper;
	private UserOperation useropr;

	public WebSiteOperation(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		waithelper= new WaitHelper(driver);
		PageFactory.initElements(driver, this);}
		
		String currenturl=driver.getCurrentUrl();
	
		/** identify update option */
		@FindBy(xpath = "//a[normalize-space()='Updates']")
		private WebElement UpdateOption;
		public void clickonUpdateOption() throws InterruptedException {	
				webElementHelper.scrollToElement(UpdateOption);
				webElementHelper.click(UpdateOption);		
		}

		/** identify create update button */
		@FindBy(xpath = "//button[normalize-space()='Update']")
		private WebElement CreateUpdate;
		public void clickonCreateUpdate() throws InterruptedException {	
				webElementHelper.click(CreateUpdate);		
		}
		
		/** identify update title textbox */
		@FindBy(xpath = "//input[@id='da-marketing-update-name']")
		private WebElement UpdateTitle;
		public void clickonUpdateTitle() throws InterruptedException {	
				webElementHelper.click(UpdateTitle);		
		}
		
		private String uappend;
		/** enter update title name*/
		public String setUpdateTitle(String utitle) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());
				//String append;
				Variables.storedUpdatename= uappend = utitle+newDate;
			    utitle=uappend;
			    webElementHelper.TypeInto(UpdateTitle, utitle);
				return utitle;			
		}
		
		/**store newly created update name*/
		
		public boolean storedUpdateName() {
			ThreadSleep(3000);
			String xpath = String.format("//td[text()='%s']",Variables.storedUpdatename);
			String formtext=webElementHelper.getElementText(webElementHelper.getElement(By.xpath(xpath)));
			if(formtext.contains(Variables.storedUpdatename)) {
				return true;
			}
			else
			{
				return false;
			}
		}
		
		/** identify forms option */
		@FindBy(xpath = "//img[@alt='Forms']")
		private WebElement Form;
		public void clickonFormOption() throws InterruptedException {	
				webElementHelper.click(Form);		
		}
		
		/** identify create new form button */
		@FindBy(xpath = "//a[normalize-space()='New Form']")
		private WebElement CreateForm;
		public void clickonCreateForm() throws InterruptedException {		
				waithelper.WaitForElementToBeClickable(CreateForm);
				webElementHelper.click(CreateForm);
				ThreadSleep(2000);
		}
		
		/** identify form title textbox */
		@FindBy(xpath = "//input[@id='da-form-name']")
		private WebElement FormTitle;
		public void clickonFormTitle() throws InterruptedException {	
				webElementHelper.click(FormTitle);		
		}
		
		private String fappend;
		/** enter form title name*/
		public String setFormTitle(String ftitle) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());
				//String append;
				fappend = ftitle+newDate;
			    Variables.storedFormname= ftitle=fappend;
			    webElementHelper.TypeInto(FormTitle, ftitle);
				return ftitle;			
		}
		
		/**store newly created form name*/		
		public boolean storedFormName() {
			ThreadSleep(3000);
			String xpath = String.format("//td[text()='%s']",Variables.storedFormname);
			String formtext=webElementHelper.getElementText(webElementHelper.getElement(By.xpath(xpath)));
			if(formtext.contains(Variables.storedFormname)) {
				return true;
			}
			else
			{
				return false;
			}
		}
		
		/** identify form description textbox */
		@FindBy(xpath = "//textarea[@id='da-form-description']")
		private WebElement FormDesc;
		public void clickonFormDesc() throws InterruptedException {	
				webElementHelper.click(FormDesc);		
		}
		
		private String fdappend;
		/** enter form description*/
		public String setFormDescription(String fdesc) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());
				//String append;
				fdappend = fdesc+newDate;
			    fdesc=fappend;
			    webElementHelper.TypeInto(FormDesc, fdesc);
				return fdesc;			
		}
		
		/** identify next step button */
		@FindBy(xpath = "//button[contains(text(),'Next Step')]")
		private WebElement NextStep;
		public void clickonNextStep() throws InterruptedException {	
				webElementHelper.click(NextStep);		
		}
		
		/** identify email form response */
		//String aemail = Variables.accountemail;
		//@FindBy(xpath = "//input[@id="+ aemail +"])
		//private WebElement EmailFormResponse;
		public void clickonEmailFormResponse() throws InterruptedException {
				String xpath = String.format("//input[@id='%s']", Variables.pUserName);
				webElementHelper.click(webElementHelper.getElement(By.xpath(xpath)));		
		}
		
		/** identify add Email button */
		@FindBy(xpath = "//a[@data-field-type='email']")
		private WebElement AddEmail;
		public void clickonAddEmail() throws InterruptedException {	
				webElementHelper.click(AddEmail);		
		}
		
		/** identify label textbox */
		@FindBy(xpath = "//input[@data-rv-input='model.label']")
		private WebElement EnterLabel;
		public void clickonEnterLabel() throws InterruptedException {	
				webElementHelper.click(EnterLabel);		
		}
		
		/** Enter email id of Form*/
		public void setFormEmail(String femail) {
			webElementHelper.TypeInto(EnterLabel, femail);
		}
		
		/** click on Add new field button */
		@FindBy(xpath = "//a[normalize-space()='Add new field']")
		private WebElement AddNewField;
		public void clickonAddNewField() throws InterruptedException {	
				webElementHelper.click(AddNewField);		
		}
		
		/** click on form checkbox option */
		@FindBy(xpath = "//span[normalize-space()='Checkboxes']")
		private WebElement AddFormCheckbox;
		public void clickonAddFormCheckbox() throws InterruptedException {	
				webElementHelper.click(AddFormCheckbox);		
		}
		
		/**Enter checkbox Label*/
		public void setFormCheckboxlabel(String fcbox) {
			webElementHelper.TypeInto(EnterLabel, fcbox);
		}
		
		/** click & enter checkbox option1 */
		@FindBy(xpath = "//*[@id=\"editField\"]/div/div/div[4]/input[2]")
		private WebElement option1;
		public void setCheckboxlabel1(String fcoption1) throws InterruptedException {	
				webElementHelper.click(option1);		
				webElementHelper.TypeInto(option1, fcoption1);
		}
		
		/** click & enter checkbox option2 */
		@FindBy(xpath = "//*[@id=\"editField\"]/div/div/div[5]/input[2]")
		private WebElement option2;
		public void setCheckbox2label2(String fcoption2) throws InterruptedException {	
				webElementHelper.click(option2);
				webElementHelper.TypeInto(option2, fcoption2);
		}
		
		/** click on Form dropdown option */
		@FindBy(xpath = "//span[normalize-space()='Dropdown']")
		private WebElement FormDropDown;
		public void clickonFormDropdown() throws InterruptedException {	
				webElementHelper.click(FormDropDown);		
		}
		
		public void setFormDrodownLabel(String fdrplabel) {
			webElementHelper.TypeInto(EnterLabel, fdrplabel);
		}
		
		/**enter dropdown option1*/
		public void setDropdownoption1(String fdoption1) {
			webElementHelper.click(option1);
			webElementHelper.TypeInto(option1, fdoption1);
		}
		
		/**identify include blank option of dropdown*/
		@FindBy(xpath="//input[@data-rv-checked='model.field_options.include_blank_option']")
		private WebElement DropdownBlank;
		
		/** enter dropdown option2*/
		public void setDropdownoption2(String fdoption2) {
			webElementHelper.click(option2);
			webElementHelper.TypeInto(option2, fdoption2);
			webElementHelper.click(DropdownBlank);
		}
		
		/** identify Submit for Approval option */
		@FindBy(xpath = "//button[normalize-space()='Submit for Approval']")
		private WebElement SubmitForm;
		public void clickonSubmitForm() throws InterruptedException {	
				webElementHelper.click(SubmitForm);		
		}
		
		/** identify event option */
		@FindBy(xpath = "//img[@alt='Events']")
		private WebElement Events;
		public void clickonEventsOption() throws InterruptedException {	
				webElementHelper.click(Events);		
		}
		
		/** identify create new Event button */
		@FindBy(xpath = "//a[normalize-space()='Add Event']")
		private WebElement CreateEvent;
		public void clickonCreateEvent() throws InterruptedException {		
				waithelper.WaitForElementToBeClickable(CreateEvent);
				webElementHelper.click(CreateEvent);
		}
		
		/** identify Event title textbox */
		@FindBy(xpath = "//input[@id='da-event-name']")
		private WebElement EventTitle;
		public void clickonEventTitle() throws InterruptedException {	
				webElementHelper.click(EventTitle);		
		}
		
		private String eappend;
		/** enter event title name*/
		public String setEventTitle(String evtitle) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());
				//String append;
				Variables.storedEventsname= eappend = evtitle+newDate;
				evtitle=eappend;
			    webElementHelper.TypeInto(EventTitle, evtitle);
				return evtitle;			
		}
		
		/**store newly created event name*/
		
		public boolean storedEventName() {
			ThreadSleep(3000);
			String xpath = String.format("//td[text()='%s']",Variables.storedEventsname);
			String formtext=webElementHelper.getElementText(webElementHelper.getElement(By.xpath(xpath)));
			if(formtext.contains(Variables.storedEventsname)) {
				return true;
			}
			else
			{
				return false;
			}
		}

		
		/** identify event description textbox */
		@FindBy(xpath = "//iframe[@title='Rich Text Editor, da-event-description']")
		private WebElement EventDesc;
		@FindBy(xpath="//body//p")
		private WebElement Eventdesc1;
		public void clickonEventDesc() throws InterruptedException {
				driver.switchTo().frame(EventDesc);
				webElementHelper.click(Eventdesc1);
		}
		
		private String edescappend;
		/** enter event description*/
		public String setEventDescription(String evdesc) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());
				//String append;
				edescappend = evdesc+newDate;
			    evdesc=edescappend;
			    webElementHelper.TypeInto(Eventdesc1, evdesc);
			    driver.switchTo().defaultContent();
				return evdesc;	
		}
		
		/** identify event link textbox */
		@FindBy(xpath = "//input[@id='da-event-url']")
		private WebElement EventLink;
		public void clickonEventlink() throws InterruptedException {	
				webElementHelper.click(EventLink);		
		}
		
		private String evlinkappend;
		/** enter form link*/
		public String setEventLink(String elinkdesc) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());
				//String append;
				evlinkappend = elinkdesc+newDate;
			    elinkdesc=evlinkappend;
			    webElementHelper.TypeInto(EventLink, elinkdesc);
			    return elinkdesc;
		}
		
		/** identify event end date textbox */
		@FindBy(xpath = "//input[@id='da-event-enddatepicker']")
		private WebElement EventEndDate;
		public void clickonEventEndDate() throws InterruptedException {	
			 	webElementHelper.scrollToElement(EventEndDate);
				webElementHelper.click(EventEndDate);		
		}
		
		/** enter event end date*/
		public void setEndDate() {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm zzz");
			//Getting current date
			Calendar cal = Calendar.getInstance();
			//Number of Days to add
		    cal.add(Calendar.DAY_OF_MONTH, 2);
			//Date after adding the days to the current date
			String newDate = sdf.format(cal.getTime());
			webElementHelper.TypeInto(EventEndDate, newDate);
		}
		
		/** identify event end date done button */
		@FindBy(xpath = "//button[normalize-space()='Done']")
		private WebElement EventDateDone;
		public void clickonDone() throws InterruptedException {	
				webElementHelper.click(EventDateDone);		
		}
		
		/** identify publish update button */
		@FindBy(xpath = "//i[@class='icon-ok icon-white']")
		private WebElement PublishUpdae;
		public void clickonPublishUpdate() throws InterruptedException {	
				webElementHelper.click(PublishUpdae);		
		}
		
		/** identify poll option */
		@FindBy(xpath = "//img[@alt='Polls']")
		private WebElement PollOption;
		public void clickonPollOption() throws InterruptedException {	
				webElementHelper.click(PollOption);		
		}
		
		/** identify create new poll button */
		@FindBy(xpath = "//a[normalize-space()='Add Poll']")
		private WebElement CreatePoll;
		public void clickonCreatePoll() throws InterruptedException {	
				webElementHelper.click(CreatePoll);		
		}
		
		/** identify poll name textbox */
		@FindBy(xpath = "//input[@id='da-poll-name']")
		private WebElement PollTitle;
		public void clickonPollTitle() throws InterruptedException {	
				webElementHelper.click(PollTitle);		
		}
		
		private String pappend;
		/** enter poll description*/
		public String setPollTitle(String ptitle) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());
				//String append;
				Variables.storedPollsname= pappend = ptitle+newDate;
			    ptitle=pappend;
			    webElementHelper.TypeInto(PollTitle, ptitle);
				return ptitle;			
		}
		
		/**store newly created poll name*/
		
		public boolean storedPollName() {
			ThreadSleep(3000);
			String xpath = String.format("//td[text()='%s']",Variables.storedPollsname);
			String formtext=webElementHelper.getElementText(webElementHelper.getElement(By.xpath(xpath)));
			if(formtext.contains(Variables.storedPollsname)) {
				return true;
			}
			else
			{
				return false;
			}
		}
		
		/** identify add poll answer button */
		@FindBy(xpath = "//button[normalize-space()='Add Answer']")
		private WebElement AddPollAnswer;
		public void clickonAddPollAnswer() throws InterruptedException {	
				webElementHelper.click(AddPollAnswer);		
		}
		/** identify poll description textbox */
		@FindBy(xpath = "//textarea[@id='da-poll-description']")
		private WebElement PollDesc;
		public void clickonPollsDesc() throws InterruptedException {	
				webElementHelper.click(PollDesc);		
		}
		
		private String pdappend;
		/** enter form description*/
		public String setPollDescription(String pdesc) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());
				//String append;
				pdappend = pdesc+newDate;
			    pdesc=pappend;
			    webElementHelper.TypeInto(PollDesc, pdesc);
				return pdesc;			
		}
		
		/** click & enter poll answer1 textbox */
		@FindBy(xpath = "(//input[@placeholder='Answers'])[1]")
		private WebElement PollAnswer1;
		public void setPoll1Answer1(String panswer1) throws InterruptedException {	
				webElementHelper.click(PollAnswer1);		
				webElementHelper.TypeInto(PollAnswer1, panswer1);
		}
		
		/** click & enter poll answer2 textbox */
		@FindBy(xpath = "(//input[@placeholder='Answers'])[2]")
		private WebElement PollAnswer2;
		public void setPoll1Answer2(String panswer2) throws InterruptedException {	
				webElementHelper.click(PollAnswer2);		
				webElementHelper.TypeInto(PollAnswer2, panswer2);
		}
		
		/** identify mywebsite option */
		@FindBy(xpath = "//img[@alt='My Website']")
		private WebElement MyWebsite;
		public void clickonMyWebsite() throws InterruptedException {	
				webElementHelper.click(MyWebsite);	
				ThreadSleep(5000);
		}
		
		/** identify add web content button */
		@FindBy(xpath = "//a[@id='da-app-add-dropdown']")
		private WebElement AddWebContent;
		public void clickonAddwebcontent() throws InterruptedException {	
				webElementHelper.click(AddWebContent);	
				ThreadSleep(2000);
				
		}
		
		/** identify Add form on website option */
		@FindBy(xpath = "//a[normalize-space()='Forms']")
		private WebElement WebsiteForm;
		public void clickonWebsiteform() throws InterruptedException {	
				webElementHelper.click(WebsiteForm);		
		}
		
		/**identify rgmp webcontent save button*/
		@FindBy(xpath="//a[normalize-space()='Save']")
		private WebElement RGMPWebcontentSave;	
		
		public void clickonMemberSave() {
			//webElementHelper.scrollToElement(RGMPWebcontentSave);
			webElementHelper.click(RGMPWebcontentSave);
			ThreadSleep(5000);
		}
		
		/** identify canada life webcontent save button */
		@FindBy(xpath = "//button[normalize-space()='Save']")
		private WebElement SaveWebContent;
		public void clickonSaveWebcontent() throws InterruptedException {
			String currentURL=driver.getCurrentUrl();
			if(currentURL.contains("clic.qa")) {
				webElementHelper.scrollToElement(SaveWebContent);
				webElementHelper.click(SaveWebContent);		
		}	else if(currentURL.contains("rgmp.qa")) {
			webElementHelper.scrollToElement(RGMPWebcontentSave);
			webElementHelper.click(RGMPWebcontentSave);
			ThreadSleep(2000);
		}
		}
		
		public void clickonPollSave() {
			webElementHelper.click(SaveWebContent);
			ThreadSleep(2000);
		}
		
		public void clickonUpdateSave() {
			//webElementHelper.scrollToElement(RGMPWebcontentSave);
			webElementHelper.click(RGMPWebcontentSave);
			ThreadSleep(14000);
		}
		
		/** identify add events on website option */
		@FindBy(xpath = "//a[normalize-space()='Events']")
		private WebElement WebsiteEvent;
		public void clickonWebsiteevent() throws InterruptedException {	
				webElementHelper.click(WebsiteEvent);		
		}
		
		/** identify add polls on website option */
		@FindBy(xpath = "//a[normalize-space()='Polls']")
		private WebElement WebsitePoll;
		public void clickonWebsitepoll() throws InterruptedException {	
				webElementHelper.click(WebsitePoll);		
		}
		
		/** click on add web gadget button */
		@FindBy(xpath = "//button[normalize-space()='Add']")
		private WebElement AddWebGadget;
		public void clickonAddWebGagdet() {
			webElementHelper.click(AddWebGadget);
			ThreadSleep(12000);
		}
		
		/** click on website browse button */
		@FindBy(xpath = "//*[@id=\"da-app-menu\"]/div[3]/a")
		private WebElement WebsiteBrowse;
		public void clickonWebsiteBrowse() {
			webElementHelper.click(WebsiteBrowse);
		}
		
		/** click on Web Gadget button */
		@FindBy(xpath = "//a[normalize-space()='Web Gadgets']")
		private WebElement WebGadget;
		public void clickonWebGadget() {
			webElementHelper.click(WebGadget);
		}
		
		/** click on web gadget update option */
		@FindBy(xpath = "//a[normalize-space()='Updates']")
		private WebElement UpdateGadget;
		public void clickonUpdateGadget() {
			webElementHelper.click(UpdateGadget);
		}
		
		/** identify Blog option */
		@FindBy(xpath = "//img[@alt='Blog']")
		private WebElement BlogOption;
		public void clickonBlogOption() throws InterruptedException {	
				webElementHelper.click(BlogOption);	
		}
		
		/** identify activate your blog button */
		@FindBy(xpath = "//a[normalize-space()='Activate your blog now!']")
		private WebElement ActivateBlog;
		public void clickonActivateBlog() throws InterruptedException {	
				ThreadSleep(2000);
				webElementHelper.click(ActivateBlog);		
		}
		
		/** identify create new blog button */
		@FindBy(xpath = "//a[normalize-space()='Add Blog Post']")
		private WebElement CreateBlog;
		public void clickonCreateBlog() throws InterruptedException {
			ThreadSleep(2000);
				webElementHelper.click(CreateBlog);		
		}
		
		/** click & enter blog title textbox */
		@FindBy(xpath = "//input[@id='da-blog-title']")
		private WebElement BlogTitle;
		public void setBlogTitle(String btitle) throws InterruptedException {	
				webElementHelper.click(BlogTitle);		
				webElementHelper.TypeInto(BlogTitle, btitle);
		}
		
		/** identify blog description textbox */
		@FindBy(xpath = "//iframe[@title='Rich Text Editor, ckeditor-edit-widget']")
		private WebElement BlogDesc;
		@FindBy(xpath="//html//body")
		private WebElement Blogdesc1;
		public void clickonBlogDesc() throws InterruptedException {
				driver.switchTo().frame(BlogDesc);
				webElementHelper.click(Blogdesc1);
		}
		
		private String blogdescappend;
		/** enter blog description*/
		public String setBlogDescription(String blgdesc) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
				//Getting current date
				Calendar cal = Calendar.getInstance();
				//Number of Days to add
			    cal.add(Calendar.DAY_OF_MONTH, 0);
				//Date after adding the days to the current date
				String newDate = sdf.format(cal.getTime());
				//String append;
				blogdescappend = blgdesc+newDate;
			    blgdesc=blogdescappend;
			    webElementHelper.TypeInto(Blogdesc1, blgdesc);
			    driver.switchTo().defaultContent();
				return blgdesc;	
		}
		
		/** identify estate planning category */
		@FindBy(xpath = "//label[normalize-space()='Estate planning']")
		private WebElement EstatePlaningCat;
		public void clickonEstatePLaningCat() throws InterruptedException {	
				webElementHelper.click(EstatePlaningCat);		
		}
		
		/** click on web gadget Latest blog post option */
		@FindBy(xpath = "//a[normalize-space()='Latest Blog Posts']")
		private WebElement BlogGadget;
		public void clickonBlogGadget() {
			webElementHelper.click(BlogGadget);
		}
		
		/**click on blog save button*/
		public void clickonBlogSave() {
			//webElementHelper.scrollToElement(RGMPWebcontentSave);
			webElementHelper.click(RGMPWebcontentSave);
			ThreadSleep(2000);
		}
		
		/** identify event saved confirmation message */
		@FindBy(xpath = "//p[contains(text(),'Event saved')]")
		private WebElement EventSavedConfirmation;

		public void newEventCreated() {
			// TODO Auto-generated method stub
			//return(webElementHelper.isElementDisplayedQuicker(EventSavedConfirmation));		
		}
		
		/** identify My Profile option */
		@FindBy(xpath = "//img[@alt='My Profile']")
		private WebElement MyProfileOption;
		public void clickonMyProfileOption() throws InterruptedException {	
				webElementHelper.click(MyProfileOption);
				ThreadSleep(3000);
		}
		
		/** identify Team member option */
		@FindBy(xpath = "//a[normalize-space()='Team Members']")
		private WebElement TeamMemberOption;
		public void clickonTeamMemberOption() throws InterruptedException {	
				ThreadSleep(3000);
				webElementHelper.click(TeamMemberOption);		
		}
		
		/** identify create TeamMember button */
		@FindBy(xpath = "//button[normalize-space()='Add Team Member']")
		private WebElement CreateTeamMember;
		public void clickonCreateTeamMember() throws InterruptedException {	
				webElementHelper.click(CreateTeamMember);		
		}
		
		/** click & enter team member email */
		@FindBy(xpath = "//input[@id='member-email']")
		private WebElement MemberEmail;
		public void setTeamMemberEmail() {
			webElementHelper.click(MemberEmail);
			webElementHelper.TypeInto(MemberEmail,generateData.generateEmail(14));
		}
		
		/** click & enter team member first name*/
		@FindBy(xpath = "//input[@id='member-first-name']")
		private WebElement MemberFirstName;
		public String mappend;
		public String setMemberFirstName(String membername) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
			//Getting current date
			Calendar cal = Calendar.getInstance();
			//Number of Days to add
		    cal.add(Calendar.DAY_OF_MONTH, 0);
			//Date after adding the days to the current date
			String newDate = sdf.format(cal.getTime());
			//String append;
			Variables.teammemberfirstname= mappend = membername+newDate;
			webElementHelper.TypeInto(MemberFirstName, mappend);
			return membername;
		}
		
		/** click & enter team member last name*/
		@FindBy(xpath = "//input[@id='member-last-name']")
		private WebElement MemberLastName;
		public String mlappend;
		public String setMemberLastName(String memberlname) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
			//Getting current date
			Calendar cal = Calendar.getInstance();
			//Number of Days to add
		    cal.add(Calendar.DAY_OF_MONTH, 0);
			//Date after adding the days to the current date
			String newDate = sdf.format(cal.getTime());
			//String append;
			Variables.teammemberlastname= mlappend = memberlname+newDate;
			webElementHelper.TypeInto(MemberLastName, mlappend);
			return memberlname;
		}
		
		/** click on Team Member profile option on website */
		@FindBy(xpath = "//a[contains(text(),'Team Member Profile')]")
		private WebElement clickonWebsiteTeam;
		public void clickonWebsiteTeamProfile() {
			webElementHelper.click(clickonWebsiteTeam);
		}
		
		/** identify dropdown of tem member profile*/
		@FindBy(xpath = "//*[@class=\"configure-biography__form-select\"]/select")
		private WebElement TeamMemberDrodown;
		public void clickonTeamMemberDropdown() throws InterruptedException {	
				webElementHelper.click(TeamMemberDrodown);		
		}
		
		/** click on newly created team member */
		@FindBy(xpath = "//*[@class=\"configure-biography__form-select\"]/select/option[2]")
		private WebElement Member1;
		public void clickonCreatedTeamMember() {
			waithelper.WaitForElementToBeClickable(Member1);
			webElementHelper.click(Member1);
		}
		
		@FindBy(xpath = "//*[@class='configure-update__title']/input")
		private WebElement WebsiteUpdateTitle;
		/**Enter update title on website*/
		public void setWebsiteUpdateTitle(String wutitle) {
			webElementHelper.TypeInto(WebsiteUpdateTitle, wutitle);
		}
		
		/** click on display all updates option */
		@FindBy(xpath = "//*[@class='configure-update__display']/label[1]")
		private WebElement DisplayAllUpdates;
		public void clickonDisplayallupdate() throws InterruptedException {	
				webElementHelper.click(DisplayAllUpdates);		
		}
		
		/** click on Setting option */
		@FindBy(xpath = "//a[normalize-space()='Settings']")
		private WebElement SettingsOption;
		public void clickonSettings() throws InterruptedException {	
				webElementHelper.click(SettingsOption);		
		}
		
		/** click on Add new page button */
		@FindBy(xpath = "//a[contains(text(),'Add Page')]")
		private WebElement CreatePage;
		public void clickonCreatePage() throws InterruptedException {	
				webElementHelper.click(CreatePage);		
		}
		
		/** click & enter page navigation label name */
		@FindBy(xpath = "//input[@id='page-name']")
		private WebElement PageNavLabel;
		public void setPagenavlabel(String pnavoption) throws InterruptedException {	
				webElementHelper.TypeInto(PageNavLabel, pnavoption);
		}
		
		/** click & enter new page title */
		@FindBy(xpath = "//input[@id='page-title']")
		private WebElement PageTitle;
		public void setPageTitle(String pgtitle) throws InterruptedException {			
				webElementHelper.TypeInto(PageTitle, pgtitle);
		}
		
		/** click & enter new page url */
		@FindBy(xpath = "//input[@id='page-url']")
		private WebElement PageUrl;
		public void setPageURL(String purl) throws InterruptedException {	
				webElementHelper.click(PageUrl);		
				webElementHelper.TypeInto(PageUrl, purl);
		}
		
		/** click on Save this page button */
		@FindBy(xpath = "//button[contains(text(),'Save this page')]")
		private WebElement SavePage;
		public void clickonSavePage() throws InterruptedException {	
				webElementHelper.scrollToElement(SavePage);
				webElementHelper.click(SavePage);		
		}
}
