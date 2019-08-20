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

public class HomeScreenSearchPage extends TestBase {

	static WebDriver driver;

	public HomeScreenSearchPage(WebDriver driver) {
		HomeScreenSearchPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = HomeScreen.SearchPage.searchBar_Xpath)
	public WebElement searchBar;

	@FindBy(how = How.XPATH, using = HomeScreen.SearchPage.keywordDataList_Xpath)
	public List<WebElement> keywordDataList;

	// Method to get data into list
	public List<String> checkKeywordInResponse() {

		List<String> dataList = new ArrayList<String>();
		try {
			for (int i = 0; i < keywordDataList.size(); i++) {
				dataList.add(keywordDataList.get(i).getText());
			}
		} catch (Exception e) {
			log.info("Exception occured in checkKeywordInResponse method :: " + e);
		}
		return dataList;
	}
	
	// Method to get enter data in search
	public void enterDataInSearchButton(String newSearchKeyword) {
		try {
			sendKeys(newSearchKeyword, searchBar, "Search in blog");
			sendKeysFromKeyBoard(Keys.ENTER, searchBar, "Search in blog");
		} catch (Exception e) {
			log.info("Exception occured while entering data in Search in blog :: " + e);
		}
	}
}
