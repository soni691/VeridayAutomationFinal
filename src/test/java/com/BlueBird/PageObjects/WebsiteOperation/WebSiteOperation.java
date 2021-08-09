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

public class WebSiteOperation extends BasePage {
	private WaitHelper waithelper;
	private UserOperation useropr;

	public WebSiteOperation(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		waithelper= new WaitHelper(driver);
		PageFactory.initElements(driver, this);}
		
		String currenturl=driver.getCurrentUrl();
	
		/** identify update option */
		@FindBy(xpath = "//img[@alt='Updates']")
		private WebElement UpdateOption;
		public void clickonUpdateOption() throws InterruptedException {	
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
				uappend = utitle+newDate;
			    utitle=uappend;
			    webElementHelper.TypeInto(UpdateTitle, utitle);
				return utitle;			
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
			    ftitle=fappend;
			    webElementHelper.TypeInto(FormTitle, ftitle);
				return ftitle;			
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
		
		/** enter dropdown option2*/
		public void setDropdownoption2(String fdoption2) {
			webElementHelper.click(option2);
			webElementHelper.TypeInto(option2, fdoption2);
		}
		
		/** identify Submit for Approval option */
		@FindBy(xpath = "//button[normalize-space()='Submit for Approval']")
		private WebElement SubmitForm;
		public void clickonSubmitForm() throws InterruptedException {	
				webElementHelper.click(SubmitForm);		
		}
}
