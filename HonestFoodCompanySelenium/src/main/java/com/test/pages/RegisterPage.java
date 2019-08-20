package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.TestBase;
import com.test.utils.TestUtil;

public class RegisterPage extends TestBase {

	static WebDriver driver;

	public RegisterPage(WebDriver driver) {
		RegisterPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = RegistrationPage.firstName_Xpath)
	public WebElement firstName;

	@FindBy(how = How.XPATH, using = RegistrationPage.lastName_Xpath)
	public WebElement lastName;

	@FindBy(how = How.XPATH, using = RegistrationPage.newUserEmail_Xpath)
	public WebElement newUserEmail;

	@FindBy(how = How.XPATH, using = RegistrationPage.dobDay_Xpath)
	public WebElement dobDay;

	@FindBy(how = How.XPATH, using = RegistrationPage.dobMonth_Xpath)
	public WebElement dobMonth;

	@FindBy(how = How.XPATH, using = RegistrationPage.dobYear_Xpath)
	public WebElement dobYear;

	@FindBy(how = How.XPATH, using = RegistrationPage.genderMale_Xpath)
	public WebElement genderMale;

	@FindBy(how = How.XPATH, using = RegistrationPage.genderFemale_Xpath)
	public WebElement genderFemale;

	@FindBy(how = How.XPATH, using = RegistrationPage.continueButton_Xpath)
	public WebElement continueButton;

	@FindBy(how = How.XPATH, using = RegistrationPage.stepOneCompleted_Xpath)
	public WebElement stepOneCompleted;

	// Method to enter first name
	public void enterFirstName(String userFirstName) {

		try {
			sendKeys(userFirstName, firstName, "Enter first Name");
		} catch (Exception e) {
			log.info("Exception occured while entering first name :: " + e);
		}
	}

	// Method to enter Last name
	public void enterLastName(String userLastName) {

		try {
			sendKeys(userLastName, lastName, "Enter Last Name");
		} catch (Exception e) {
			log.info("Exception occured while entering last name :: " + e);
		}
	}

	// Method to enter Email address
	public void enterNewUserEmail(String userEmail) {

		try {
			sendKeys(userEmail, newUserEmail, "Enter new user email");
		} catch (Exception e) {
			log.info("Exception occured while entering new user email :: " + e);
		}
	}

	// Method to select DOM
	public void selectDOB(String birthDate) {

		try {
			TestUtil.selectByVisibleTextFromDropDown(dobDay, birthDate);
		} catch (Exception e) {
			log.info("Exception occured while selecting DOB :: " + e);
		}
	}

	// Method to select DOB
	public void selectDOM(String birthMonth) {

		try {
			TestUtil.selectByVisibleTextFromDropDown(dobMonth, birthMonth);
		} catch (Exception e) {
			log.info("Exception occured while selecting DOM :: " + e);
		}
	}

	// Method to select DOY
	public void selectDOY(String birthYear) {

		try {
			TestUtil.selectByVisibleTextFromDropDown(dobYear, birthYear);
		} catch (Exception e) {
			log.info("Exception occured while selecting DOY :: " + e);
		}
	}

	// Method to select Gender
	public void selectGenderMale() {

		try {
			genderMale.click();
		} catch (Exception e) {
			log.info("Exception occured while selecting Gender Male :: " + e);
		}
	}

	// Method to select Gender
	public void selectGenderFemale() {

		try {
			genderFemale.click();
		} catch (Exception e) {
			log.info("Exception occured while selecting Gender Female :: " + e);
		}
	}

	// Method to click on Continue
	public void clickOnContinueButton() {

		try {
			continueButton.click();
		} catch (Exception e) {
			log.info("Exception occured while clicking on Continue :: " + e);
		}
	}

	// Method to check step one completed
	public boolean checkStepOneCompleted() {
		
		boolean status = false;
		try {
			status = stepOneCompleted.isDisplayed();
		} catch (Exception e) {
			log.info("Exception occured while checking step one completed :: " + e);
		}
		return status;
	}
}
