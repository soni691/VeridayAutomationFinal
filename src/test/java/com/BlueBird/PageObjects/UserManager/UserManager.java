package com.BlueBird.PageObjects.UserManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.BasePage;
import com.BlueBird.Util.Variables;
import com.BlueBird.Helper.WaitHelper;

public class UserManager extends BasePage {
	private WaitHelper waithelper;
	
	public UserManager(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		waithelper= new WaitHelper(driver);
		PageFactory.initElements(driver, this);
	}
	
	String currenturl=driver.getCurrentUrl();
	
	/** click on User Manager button */
	@FindBy(xpath = "//a[@href='/user-manager']")
	private WebElement UserManager;
	public void clickonUserManager() throws InterruptedException {	
			webElementHelper.click(UserManager);		
	}
	
	
	/** click on User Manager button */
	@FindBy(xpath = "//button[contains(text(),'Create Single User')]")
	private WebElement createsingleuser;
	public void clickonCreateSingleUser() {
		webElementHelper.click(createsingleuser);
	}
	
	/** the input email id */
	@FindBy(xpath = "//input[@id='emailField']")
	private WebElement AccountEmail;
	
	/**
	 * Enter Account Email.
	 *
	 * @param userName
	 *            the user name
	 */
	public void enterAccountEmail() {
		Variables.pUserName =generateData.generateEmail(14);	
		webElementHelper.TypeInto(AccountEmail,Variables.pUserName);
	}
	/** the input first name */
	@FindBy(xpath = "//input[@id='firstNameField']")
	private WebElement Firstname;
	
	/**
	 * Enter First Name
	 */
	public void enterFirstName() {
		webElementHelper.TypeInto(Firstname, generateData.generateRandomString(5));
	}
	
	@FindBy(xpath = "//input[@id='lastNameField']")
	private WebElement Lastname;
	public void enterLastName() {
		webElementHelper.TypeInto(Lastname, generateData.generateRandomString(5));
	}
	
	@FindBy(xpath = "//input[@id='user-title-filter']")
	private WebElement Jobtitle;
	public void enterJobTitle1() {
		webElementHelper.TypeInto(Jobtitle, generateData.generateRandomString(5));
	}
	
	@FindBy(xpath = "//input[@id='user-title-filter1']")
	private WebElement Jobtitle2;
	public void enterJobTitle2() {
		webElementHelper.TypeInto(Jobtitle2, generateData.generateRandomString(5));
	}
	
	@FindBy(xpath = "//select[@id='branchSelector']")
	private WebElement Location;
	@FindBy(xpath = "//option[contains(text(),'  Niagara Financial Centre - Corporate Park')]")
	private WebElement LocationNiagra;
	
	@FindBy(xpath = "//option[contains(text(),'  Veriday Inc')]")
	private WebElement LocationDemoQA;
	
	public void enterLocation() throws InterruptedException {
		webElementHelper.click(Location);
		System.out.println(currenturl);
		if(currenturl.contains("demo.qa")) {
			webElementHelper.click(LocationDemoQA);
			webElementHelper.click(Location);
		}
		else if(currenturl.contains("clic.qa"))
		{
			Thread.sleep(2000);
			webElementHelper.click(LocationNiagra);
			webElementHelper.click(Location);
		}
		
	}
	
	@FindBy(xpath = "//input[@id='provincial-list']")
	private WebElement StatesofRegistration;
	
	@FindBy(xpath = "//input[@value='AB']")
	private WebElement AddPLicenseAB;
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement AddP;
	
	public void enterPLincense() throws InterruptedException {
		System.out.println(currenturl);
		if(currenturl.contains("demo.qa")) {
			webElementHelper.TypeInto(StatesofRegistration, generateData.generateRandomNumber(5));
		}
		else if(currenturl.contains("clic.qa"))
		{
			Thread.sleep(2000);
			waithelper.WaitForElementVisible(StatesofRegistration);
		 	webElementHelper.click(StatesofRegistration);
			webElementHelper.click(AddPLicenseAB);
			webElementHelper.click(AddP);
		}
		
	}
	@FindBy(xpath = "//input[@class='bfh-phone da-phone-number-input phone-number']")
	private WebElement Phone;
	public void enterPhone() {
		waithelper.WaitForElementToBeClickable(Phone);
		webElementHelper.TypeInto(Phone, generateData.generateRandomNumber(10));
	}
	
	@FindBy(xpath = "//button[contains(text(),'Save & Activate')]")
	private WebElement Save;
	public void clickSave() {
		webElementHelper.click(Save);
	}
	
	/** identify serach user textbox */
	@FindBy(xpath = "//input[@id='searchUsers']")
	private WebElement SearchUser;
	
	/** identify serach user button */
	@FindBy(xpath = "//button[contains(text(),'Search Users')]")
	private WebElement SearchUserButton;
	
	public void StoredpUserName() throws InterruptedException {
		webElementHelper.TypeInto(SearchUser, Variables.pUserName);
	}
	
	/**
	 * Search User
	 */
	public void SearchUser(String primaryuseremail) {
		webElementHelper.TypeInto(SearchUser, primaryuseremail);
		webElementHelper.click(SearchUserButton);
	}
	
	/** identify Go button */
	@FindBy(xpath = "//*[text()='Go']")
	private WebElement GoButton;
	
	/**
	 * Click on Go button
	 */
	public void ClickGo() {
		webElementHelper.click(GoButton);
	}
	
	/** identify Settings option */
	@FindBy(xpath = "//a[@href='/digital-workspace/site']")
	private WebElement Setting;
	
	/**
	 * Click on Go button
	 */
	public void ClickSetting() {
		webElementHelper.click(Setting);
		webElementHelper.WaitForElementVisible(YourPages);
	}

	/** identify Your Pages label on Your Pages page */
	@FindBy(xpath = "//h1[normalize-space()='Your Pages']")
	private WebElement YourPages;
	
	/** identify Back to Digital Workspace button */
	@FindBy(xpath = "//a[normalize-space()='Back to Digital Workspace']")
	private WebElement BackDW;
	public void ClickonbackDW() {
		webElementHelper.click(BackDW);
	}
	
	/** identify My Website option */
	@FindBy(xpath = "//h3[contains(text(),'My Website')]")
	private WebElement MyWebsite;
	
	/** identify Add button on my website page */
	@FindBy(xpath = "//a[@id='da-app-add-dropdown']")
	private WebElement AddContent;
	
	public void ClickonMyWebsite() {
		webElementHelper.click(MyWebsite);
		webElementHelper.WaitForElementVisible(AddContent);
	}
	
	/** identify blog option */
	@FindBy(xpath = "//h3[contains(text(),'Blog')]")
	private WebElement Blog;
	
	/** identify blog Manager label */
	@FindBy(xpath = "//h1[normalize-space()='Blog Manager']")
	private WebElement BlogManager;
	
	public void ClickonBlog() {
		webElementHelper.click(Blog);
		webElementHelper.WaitForElementVisible(BlogManager);
	}
	
	/** identify Forms option */
	@FindBy(xpath = "//img[@alt='Forms']")
	private WebElement Forms;
	
	/** identify AddForms option */
	@FindBy(xpath = "//img[@alt='Forms']")
	private WebElement NewForms;
	
	public void ClickonForms() {
		webElementHelper.click(Forms);
		webElementHelper.isElementDisplayed(NewForms);
	}
	
	/** identify Primary user created popup */
	@FindBy(xpath = "//p[text()='Saved')]")
	private WebElement PUserCreatedpopup;
	public void pUserpopup() {

		webElementHelper.isElementDisplayed(PUserCreatedpopup);
	}
	
	/** identify Events option */
	@FindBy(xpath = "//a[@href='/digital-workspace/events']")
	private WebElement Events;
	
	/** identify Add Events button */
	@FindBy(xpath = "//a[normalize-space()='Add Event']")
	private WebElement AddEvents;
	public void ClickonEvents() {
		webElementHelper.click(Events);
		webElementHelper.isElementDisplayed(AddEvents);
	}
	
	/** identify Polls option */
	@FindBy(xpath = "//h3[contains(text(),'Polls')]")
	private WebElement Polls;
	
	/** identify Add Polls button */
	@FindBy(xpath = "//a[normalize-space()='Add Poll']")
	private WebElement AddPolls;
	public void ClickonPolls() {
		webElementHelper.click(Polls);
		webElementHelper.isElementDisplayed(AddPolls);
	}
	
	/** identify RecycleBin option */
	@FindBy(xpath = "//h3[contains(text(),'Recycle Bin')]")
	private WebElement RecycleBin;
	
	/** identify RecycleBin label */
	@FindBy(xpath = "//h1[normalize-space()='Recycle Bin']")
	private WebElement RBLabel;
	public void ClickonRecycleBin() {
		webElementHelper.click(RecycleBin);
		webElementHelper.isElementDisplayed(RBLabel);
	}
	
	/** identify MyProfile option */
	@FindBy(xpath = "//h3[contains(text(),'My Profile')]")
	private WebElement MyProfile;
	
	/** identify MyProfile label */
	@FindBy(xpath = "//h1[normalize-space()='My Profile']")
	private WebElement MPLabel;
	public void ClickonMyProfile() {
		webElementHelper.click(MyProfile);
		webElementHelper.isElementDisplayed(MPLabel);
	}
	
	/** identify Updates option */
	@FindBy(xpath = "//h3[contains(text(),'Updates')]")
	private WebElement Updates;
	
	/** identify Add Update button */
	@FindBy(xpath = "//button[normalize-space()='Update']")
	private WebElement AddUpdate;
	public void ClickonUpdates() {
		webElementHelper.click(Updates);
		webElementHelper.isElementDisplayed(MPLabel);
	}
	
	/** identify Campaign Manager option */
	@FindBy(xpath = "//h3[contains(text(),'Campaign Manager')]")
	private WebElement CampaignManager;
	
	/** identify Campaign Manager label */
	@FindBy(xpath = "//h1[normalize-space()='Campaign Manager']")
	private WebElement CMLabel;
	public void ClickonCampaignManager() {
		webElementHelper.click(CampaignManager);
		webElementHelper.isElementDisplayed(CMLabel);
	}
	
	/** identify Content Collection option */
	@FindBy(xpath = "//h3[contains(text(),'Content Collections')]")
	private WebElement ContentCollection;
	
	/** identify Add Content Collection buttoon */
	@FindBy(xpath = "//a[normalize-space()='Add Collection']")
	private WebElement AddCollection;
	public void ClickonContentCollection() {
		webElementHelper.click(ContentCollection);
		webElementHelper.isElementDisplayed(AddCollection);
	}
	
	/** identify Dashboard option */
	@FindBy(xpath = "//h3[(text()='Dashboard')]")
	private WebElement Dashboard;
	
	/** identify Dashboard label */
	@FindBy(xpath = "///h1[normalize-space()='Dashboard']")
	private WebElement Dlabel;
	public void ClickonDashboard() {
		webElementHelper.click(Dashboard);
		webElementHelper.isElementDisplayed(Dlabel);
	}
	
	/** identify Dashboard2 option */
	@FindBy(xpath = "//h3[normalize-space()='Dashboard 2.0 (Beta)']")
	private WebElement Dashboard2;
	
	/** identify Dashboard2 label */
	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	private WebElement Dlabel2;
	public void ClickonDashboard2() {
		webElementHelper.click(Dashboard2);
		webElementHelper.isElementDisplayed(Dlabel2);
	}
	
	/** identify FileManager option */
	@FindBy(xpath = "//h3[normalize-space()='File Manager']")
	private WebElement FileManager;
	
	/** identify FileManager label */
	@FindBy(xpath = "//div[contains(text(),'File Manager')]")
	private WebElement Fmanagerlabel;
	public void ClickonFileManager() {
		webElementHelper.click(FileManager);
		webElementHelper.isElementDisplayed(Fmanagerlabel);
	}
}
