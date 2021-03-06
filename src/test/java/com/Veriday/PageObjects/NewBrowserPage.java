package com.Veriday.PageObjects;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Veriday.Factory.DriverFactory;
import com.Veriday.Helper.PropertyHelper;
import com.Veriday.Helper.WebElementHelper;
import com.Veriday.Util.Constants;

/**
 * The Class NewBrowserPage.
 */
public class NewBrowserPage {

	/** The driver. */
	protected WebDriver driver = null;

	/** The config. */
	protected Properties CONFIG = null;

	/** The web element helper. */
	protected WebElementHelper webElementHelper = null;

	/**
	 * Instantiates a new new browser page.
	 */
	public NewBrowserPage() {
		this.driver = DriverFactory.getDriver2();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		CONFIG = PropertyHelper.getConfig(Constants.CONFIG_PROPERTY);
		this.webElementHelper = new WebElementHelper(driver);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Launch home page.
	 */
	public void launchHomePage() {
		driver.get(CONFIG.getProperty("application.url"));
	}

	/**
	 * Close browser.
	 */
	public void closeBrowser() {
		DriverFactory.tearDownDriver2();
	}

}
