/*
 * 
 */
package com.Veriday.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Veriday.Factory.DriverFactory;
import com.Veriday.Helper.WaitHelper;
import com.Veriday.Helper.WebElementHelper;
import com.Veriday.PageObject.adminHQ.AdminHQ;
import com.Veriday.PageObjects.CalendarPage;
import com.Veriday.PageObjects.CommonPage;
import com.Veriday.PageObjects.HomePage;
import com.Veriday.PageObjects.DigitalWorkSpace.DigitalWorkSpace;
import com.Veriday.PageObjects.Login.LoginPage;
import com.Veriday.PageObjects.OrganizationGroups.OrganizationalGroups;
import com.Veriday.PageObjects.UserManager.UserManager;
import com.Veriday.PageObjects.UserOperation.UserOperation;
import com.Veriday.PageObjects.WebsiteOperation.WebSiteOperation;
import com.Veriday.Util.Constants;
import com.Veriday.Util.DriverDetail;

/**
 * The Class TestContext.
 */
public class TestContext {

	/** The driver. */
	private WebDriver driver;

	/** The web element helper. */
	private WebElementHelper webElementHelper;

	/** The driver factory. */
	private DriverFactory driverFactory;

	/** The login page. */
	private LoginPage loginPage;

	/** The home page. */
	private HomePage homePage;

	/** The common page. */
	private CommonPage commonPage;
	
	private CalendarPage calendarPage; 
	
	private UserManager usermanagerPage;
	
	private OrganizationalGroups organizationalgroupsPage;
	
	private DigitalWorkSpace digitalworkspacePage;
	
	private WaitHelper WaitHelperPage;
	
	private AdminHQ adminHQPage;
	
	private UserOperation UserOperationPage;
	
	private WebSiteOperation webSiteOperation;
	/**
	 * Instantiates a new test context.
	 */
	public TestContext() {

		WebDriver dr = DriverDetail.getUnoccupiedDriver();

		if (dr != null) {
			this.driver = dr;
		} else {
			driverFactory = new DriverFactory();
			this.driver = driverFactory.getDriver();
		}

		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		this.webElementHelper = new WebElementHelper(driver);
	}

	/**
	 * Tear down driver.
	 */
	public void tearDownDriver() {
		DriverDetail.PushUnoccupiedDriver(this.driver);
	}

	/**
	 * Gets the login page.
	 *
	 * @return the login page
	 */
	public LoginPage getLoginPage() {
		loginPage = new LoginPage(this.driver, this.webElementHelper);
		return loginPage;
	}

	/**
	 * Gets the home page.
	 *
	 * @return the home page
	 */
	public HomePage getHomePage() {
		homePage = new HomePage(this.driver, this.webElementHelper);
		return homePage;
	}
	/**
	 * Gets the home page.
	 *
	 * @return the home page
	 */
	public UserManager getUserManagerPage() {
		usermanagerPage = new UserManager(this.driver, this.webElementHelper);
		return usermanagerPage;
	}
	
	public OrganizationalGroups getOrganizationalGroupsPage() {
		organizationalgroupsPage = new OrganizationalGroups(this.driver, this.webElementHelper);
		return organizationalgroupsPage;
	}
	
	public DigitalWorkSpace getDigitalWorkspacePage() {
		digitalworkspacePage = new DigitalWorkSpace(this.driver, this.webElementHelper);
		return digitalworkspacePage;
	}
	
	public AdminHQ getadminHQPage() {
		adminHQPage = new AdminHQ(this.driver, this.webElementHelper);
		return adminHQPage;
	}
	/**
	 * Gets the common page.
	 *
	 * @return the common page
	 */
	public CommonPage getCommonPage() {
		commonPage = new CommonPage(this.driver, this.webElementHelper);
		return commonPage;
	}

	public CalendarPage getCalendarPage() {
		calendarPage =new CalendarPage(this.driver, this.webElementHelper);
		return calendarPage;
	}
	
	public UserOperation getUserOperation() {
		UserOperationPage =new UserOperation(this.driver, this.webElementHelper);
		return UserOperationPage;
	}
	
	public WebSiteOperation getWebsiteOperation() {
		webSiteOperation =new WebSiteOperation(this.driver, this.webElementHelper);
		return webSiteOperation;
	}
}
