package com.BlueBird.PageObjects.WebsiteOperation;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WaitHelper;
import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.BasePage;
import com.BlueBird.Util.Variables;

public class WebSiteOperation extends BasePage {
	private WaitHelper waithelper;

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
}
