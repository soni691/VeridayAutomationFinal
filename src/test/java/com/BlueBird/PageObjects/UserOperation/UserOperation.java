package com.BlueBird.PageObjects.UserOperation;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WaitHelper;
import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.BasePage;
import com.BlueBird.PageObjects.UserManager.UserManager;
import com.BlueBird.Util.Variables;

public class UserOperation extends BasePage{
	private WaitHelper waithelper;
	private UserManager usermanager;

	public UserOperation(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		waithelper= new WaitHelper(driver);
		PageFactory.initElements(driver, this);	}
	
	String currenturl=driver.getCurrentUrl();
	
	/** identify Search user textbox */
	@FindBy(xpath = "//input[@id='searchUsers']")
	private WebElement SearchUserBox;
	public void clickonSearchUserBox() throws InterruptedException {	
			webElementHelper.click(SearchUserBox);		
	}

	public void setSearchUser() throws InterruptedException {	
			webElementHelper.TypeInto(SearchUserBox, Variables.pUserName);
	}
	

	/** identify Search user button */
	@FindBy(xpath = "//button[normalize-space()='Search Users']")
	private WebElement SearchUserButton;
	public void clickonSearchUserButton() throws InterruptedException {	
			waithelper.WaitForElementToBeClickable(SearchUserButton);
			webElementHelper.click(SearchUserButton);		
	}
	
	/** click on GOUser button */
	@FindBy(xpath = "//button[normalize-space()='Go']")
	private WebElement Go;
	public void clickonGo() throws InterruptedException {	
			ThreadSleep(3000);
			waithelper.WaitForElementToBeClickable(Go);
			//waithelper.WaitForElementEnabled(Go);
			webElementHelper.click(Go);	
	
	}
	/** click on Settings option */
	@FindBy(xpath = "//img[@alt='Settings']")
	private WebElement Settings;
	public void clickonSettings() throws InterruptedException {	
			webElementHelper.click(Settings);		
	}
	
	/** click on Get started option */
	@FindBy(xpath = "//a[normalize-space()='Get started!']")
	private WebElement GetStarted;
	public void clickonGetStarted() throws InterruptedException {	
			webElementHelper.click(GetStarted);		
	}
	
	/** click on SKip this step button */
	@FindBy(xpath = "//a[normalize-space()='Skip this step']")
	private WebElement SkipStep;
	public void clickonSkipStep() throws InterruptedException {	
			webElementHelper.click(SkipStep);		
	}
	
	/** click on Confirm skip step button */
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	private WebElement ConfirmSkipStep;
	public void clickonConfirmSkipStep() throws InterruptedException {	
			webElementHelper.click(ConfirmSkipStep);		
	}
	
	/** click on Theme Activate button */
	@FindBy(xpath = "//button[normalize-space()='Activate']")
	private WebElement ThemeActivate;
	public void clickonThemeActivate() throws InterruptedException {	
			webElementHelper.click(ThemeActivate);		
	}
	
	/** enter site url*/
	@FindBy(xpath = "//input[@id='websiteUrl']")
	private WebElement SiteURL;
	public void setSiteURL() throws InterruptedException {	
			webElementHelper.TypeInto(SiteURL, generateData.generateRandomString(3));		
	}
	
	/** enter site title */
	@FindBy(xpath = "//input[@id='websiteTitle']")
	private WebElement SiteTitle;
	public void setSiteTitle() throws InterruptedException {	
			webElementHelper.TypeInto(SiteTitle, generateData.generateRandomString(4));		
	}
	
	/** click on SIte Generate button */
	@FindBy(xpath = "//a[normalize-space()='Generate!']")
	private WebElement SiteGenerate;
	public void clickonSiteGenerate() throws InterruptedException {	
			webElementHelper.click(SiteGenerate);		
	}
	
	/** click on Start your digital journey button */
	@FindBy(xpath = "//a[normalize-space()='Start your Digital Journey']")
	private WebElement StartJourney;
	public void clickonStartJourney() throws InterruptedException {	
			webElementHelper.click(StartJourney);		
	}
	
	/** click on search hub textbox*/
	@FindBy(xpath = "//input[@id='searchSites']")
	private WebElement SearchHub;
	public void clickonSearchhub() throws InterruptedException {	
			webElementHelper.click(SearchHub);		
	}
	/**click on Search hub button*/
	@FindBy(xpath="//button[normalize-space()='Search for a Hub']")
	private WebElement SearchHubbutton;
	public void clickonSearchHubButton() {
		webElementHelper.click(SearchHubbutton);
	}
	
	public void setHubEmail() {
		webElementHelper.TypeInto(SearchHub, Variables.accountemail);
	}
	
	/** click on Action button */
	@FindBy(xpath = "//button[normalize-space()='Action']")
	private WebElement Action;
	public void clickonAction() throws InterruptedException {	
			webElementHelper.click(Action);		
	}
	
	/** click on Turn on workflow button */
	@FindBy(xpath = "//a[normalize-space()='Turn Workflow On']")
	private WebElement WorkflowOn;
	public void clickonWorkflow() throws InterruptedException {	
			webElementHelper.click(WorkflowOn);		
	}
	
	/** click on enter workflow textbox */
	@FindBy(xpath = "//input[@id='da-action-confirm-input']")
	private WebElement Workflowbox;
	public void clickonWorkflowbox() throws InterruptedException {	
			webElementHelper.click(Workflowbox);		
	}
	
	/** enter text WORKFLOWON*/
	public void setWorkflowText(String wflow) throws InterruptedException {	
		webElementHelper.TypeInto(Workflowbox, wflow);		
    }
	
	/** Click on Yesturn on workflow button */
	@FindBy(xpath = "//button[normalize-space()='Yes, turn ON Workflow']")
	private WebElement TurnonWorkflow;
	public void clickononWorkFlow() throws InterruptedException {	
			webElementHelper.click(TurnonWorkflow);		
	}
	

	/** click on Website on button */
	@FindBy(xpath = "//a[normalize-space()='Set Online']")
	private WebElement WebsiteOn;
	public void clickonWebsiteOn() throws InterruptedException {	
			webElementHelper.click(WebsiteOn);		
	}
	
	/** click on enter website ONLINE textbox */
	@FindBy(xpath = "//input[@id='da-action-confirm-input']")
	private WebElement SiteOnline;
	public void clickonSiteOnline() throws InterruptedException {	
			webElementHelper.click(SiteOnline);		
	}
	
	/** enter text ONLINE*/
	public void setWebsiteOnlineText(String wtext) throws InterruptedException {	
		webElementHelper.TypeInto(SiteOnline, wtext);		
    }
	
	/** Click on Yes set website on button */
	@FindBy(xpath = "//button[normalize-space()='Yes, set Website Online']")
	private WebElement TurnonWebsite;
	public void clickonTurnonWebsite() throws InterruptedException {	
			webElementHelper.click(TurnonWebsite);		
	}
}
