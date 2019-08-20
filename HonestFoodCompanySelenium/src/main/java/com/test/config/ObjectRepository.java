package com.test.config;

/**
 * @author Mohitesh.B.Kumar
 *This is Object Class where all the web locators are declared.
 */
public class ObjectRepository {
	
	// This class contains locators of the Home Screen.
	protected static class HomeScreen {
		
		public static final String registerButton_Xpath = "//span[contains(text(),'Register')]";
		
		public static final String continueWithoutBonus_Xpath = "//*[contains(text(),'Continue Without Special Bonus')]";
		public static final String acceptCookies_Xpath = "//a[@id='CybotCookiebotDialogBodyButtonAccept']";
		
		public static final String searchIcon_Xpath = "//*[@class = 'rI41o9BAj8cGhB9n0sKTJ'][2]";
		public static final String searchInBlog_Xpath = "//input[@placeholder='Search in blog']";
		
		public static final String keywordDataList_Xpath = "//*[@class=\"_2yltr7pih7eh3s3dI8W38D fCHCBFtkPyRWGPuYIZgtM\"]";
		
		public static class SearchPage{
			
			public static final String searchBar_Xpath = "//input[@class='_3Hr3qONzU09D2EpcszWrzd']";
			public static final String keywordDataList_Xpath = "//*[@class=\"_2yltr7pih7eh3s3dI8W38D fCHCBFtkPyRWGPuYIZgtM\"]";
			
		}
		
	}
	// This class contains locators of the Menu Screen.
	protected static class RegistrationPage {
		
		public static final String firstName_Xpath = "//input[@id='firstName']";
		public static final String lastName_Xpath = "//input[@id='lastName']";
		public static final String newUserEmail_Xpath = "//input[@id='email']";
		
		public static final String dobDay_Xpath = "//select[@name='day']";
		public static final String dobMonth_Xpath = "//select[@name='month']";
		public static final String dobYear_Xpath = "//select[@name='year']";
		
		public static final String genderMale_Xpath = "//li[@class='form-view form-view-1']//li[1]//label[1]//span[1]";
		public static final String genderFemale_Xpath = "//li[@class='field-row field-row-default-hidden']//li[2]//label[1]//span[1]";
		
		public static final String continueButton_Xpath = "//li[@class='form-view form-view-1']//button[@name='continue-registration'][contains(text(),'Continue')]";
		
		public static final String stepOneCompleted_Xpath = "//a[@class='form-nav-link valid']";
		
	}

}
