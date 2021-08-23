package com.Veriday.StepDefinition;

import com.Veriday.Cucumber.TestContext;
import com.Veriday.PageObjects.HomePage;

/**
 * The Class LandingPageStepDefinition.
 */
public class LandingPageStepDefinition {

	/** The home page. */
	private HomePage homePage;

	/**
	 * Instantiates a new landing page step definition.
	 *
	 * @param testContext
	 *            the test context
	 */
	public LandingPageStepDefinition(TestContext testContext) {
		homePage = testContext.getHomePage();
	}

	
}
