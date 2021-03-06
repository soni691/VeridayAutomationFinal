/* Purpose: Contains Dynamic variables
 Created By: Dhruval Barmeda
 Created Date: 11th March 2018
 */
package com.Veriday.Util;

import java.io.File;
import java.util.HashMap;

/**
 * The Class Variables.
 */
public class Variables {

	public static String loggedInUserID;
	

	public static File reportFolderName;

	/** The shift start time. */
	public static String shiftStartTime;

	/** The shift end time. */
	public static String shiftEndTime;
	
	public static HashMap<String, String> paramData = new HashMap<String, String>();
	
	public static HashMap<String, Integer> nextShiftDay = new HashMap<String, Integer>();

	public static HashMap<String, String> nextShiftMonth = new HashMap<String, String>();

	public static HashMap<String, String> appPropertyValue = new HashMap<String, String>();

	public static ThreadLocal<String> myThreadLocal = new ThreadLocal<String>();

	public static String EMAILADDRESS;


	public static String groupName;
	
	public static String pUserName;
	
	public static String prmusername;
	
	public static String regionName;
	
	public static String branchName;
	
	public static String accountemail;
	
	public static String eventname;
	
	public static String teammemberfirstname;
	
	public static String teammemberlastname;
	
	public static String storedFormname;
	
	public static String storedUpdatename;
	
	public static String storedEventsname;
	
	public static String storedPollsname;
}
