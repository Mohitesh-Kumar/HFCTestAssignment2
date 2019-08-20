package com.test.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.pages.HomePage;
import com.test.pages.HomeScreenSearchPage;
import com.test.pages.RegisterPage;
import com.test.utils.TestBase;
import com.test.utils.TestUtil;

public class UbinetSampleTestCases extends TestBase {

	@Test(priority = 0)
	public void testCaseOne() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		HomeScreenSearchPage homeScreenSearchPage = new HomeScreenSearchPage(driver);
		homePage.clickOnContinueWithoutBonus();
		homePage.clickOnAcceptCookies();
		homePage.clickOnSearchIcon();
		TestUtil.waitForSometime(3);
		homePage.enterSearchKeyword("Cricket");
		TestUtil.waitForSometime(2);
		TestUtil.checkDataInResult(homeScreenSearchPage.checkKeywordInResponse(), "cricket");
	}
	
	@Test(dependsOnMethods = "testCaseOne", priority = 1)
	public void testCaseTwo() throws InterruptedException {

		HomeScreenSearchPage homeScreenSearchPage = new HomeScreenSearchPage(driver);
		homeScreenSearchPage.enterDataInSearchButton("Football");
		TestUtil.waitForSometime(3);
		TestUtil.checkDataInResult(homeScreenSearchPage.checkKeywordInResponse(), "football");
	}
	
	@Test(priority = 2)
	public void testCaseThree() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnRegisterButton();
		
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.enterFirstName("Moh");
		registerPage.enterLastName("Kumar");
		registerPage.enterNewUserEmail(TestUtil.getRandomEmail());
		registerPage.selectDOB("15");
		registerPage.selectDOM("March");
		registerPage.selectDOY("1991");
		registerPage.selectGenderMale();
		registerPage.clickOnContinueButton();
		Assert.assertEquals(registerPage.checkStepOneCompleted(), true, "Step one not completed.....");
		
	}
	
}
