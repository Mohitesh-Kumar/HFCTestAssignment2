package com.test.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.TestBase;

/**
 * @author Mohitesh.B.Kumar
 * 
 */
public class HomePage extends TestBase {

	static WebDriver driver;

	public HomePage(WebDriver driver) {
		HomePage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = HomeScreen.registerButton_Xpath)
	public WebElement registerButton;

	@FindBy(how = How.XPATH, using = HomeScreen.searchIcon_Xpath)
	public WebElement searchIcon;

	@FindBy(how = How.XPATH, using = HomeScreen.searchInBlog_Xpath)
	public WebElement searchInBlog;

	@FindBy(how = How.XPATH, using = HomeScreen.continueWithoutBonus_Xpath)
	public WebElement continueWithoutBonus;

	@FindBy(how = How.XPATH, using = HomeScreen.acceptCookies_Xpath)
	public WebElement acceptCookies;

	// Method to click on Register button
	public void clickOnRegisterButton() {

		try {
			registerButton.click();
		} catch (Exception e) {
			log.info("Exception occured while clicking on register button :: " + e);
		}
	}

	// Method to click on Search Icon
	public void clickOnSearchIcon() {

		try {
			searchIcon.click();
		} catch (Exception e) {
			log.info("Exception occured while clicking on Search Icon :: " + e);
		}
	}

	// Method to search on Blog page
	public void enterSearchKeyword(String searchKeyword) {

		try {
			sendKeys(searchKeyword, searchInBlog, "Search in blog");
			sendKeysFromKeyBoard(Keys.ENTER, searchInBlog, "Search in blog");
		} catch (Exception e) {
			log.info("Exception occured while entering data in Search in blog :: " + e);
		}
	}

	// Method to click on Accept cookies button
	public void clickOnAcceptCookies() {

		try {
			acceptCookies.click();
		} catch (Exception e) {
			log.info("Exception occured while clicking on Accept cookies button :: " + e);
		}
	}

	// Method to click on Search Icon
	public void clickOnContinueWithoutBonus() {

		try {
			continueWithoutBonus.click();
		} catch (Exception e) {
			log.info("Exception occured while clicking on continueWithoutBonus button :: " + e);
		}
	}

}
