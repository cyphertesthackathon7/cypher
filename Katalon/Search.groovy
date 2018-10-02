import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://demoshop24.com/index.php?route=product/search")
selenium.click("id=input-search")
selenium.type("id=input-search", "a")
selenium.click("name=category_id")
selenium.select("name=category_id", "label=regexp:\\s+Mice and Trackballs")
selenium.click("name=category_id")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Search Criteria'])[1]/following::label[1]")
selenium.click("id=button-search")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Search Criteria'])[1]/following::label[2]")
selenium.click("id=button-search")
selenium.click("name=category_id")
selenium.click("id=content")
selenium.click("name=sub_category")
selenium.click("id=description")
selenium.click("id=input-search")
selenium.type("id=input-search", "ba")
selenium.click("id=button-search")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Search Criteria'])[1]/following::p[1]")
selenium.click("name=category_id")
selenium.select("name=category_id", "label=Categories")
selenium.click("name=category_id")
selenium.click("id=button-search")
selenium.click("id=description")
selenium.click("name=category_id")
selenium.select("name=category_id", "label=Desktops")
selenium.click("name=category_id")
selenium.click("id=button-search")
selenium.click("id=input-search")
selenium.type("id=input-search", "bak")
selenium.click("id=button-search")
selenium.click("id=input-search")
selenium.type("id=input-search", "")
selenium.click("link=Phones & PDAs")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Checkout'])[1]/following::i[1]")
selenium.click("id=input-search")
selenium.click("name=category_id")
selenium.select("name=category_id", "label=Phones & PDAs")
selenium.click("name=category_id")
selenium.click("id=input-search")
selenium.click("id=button-search")
selenium.click("name=sub_category")
selenium.click("id=button-search")
selenium.click("id=input-search")
selenium.type("id=input-search", "a")
selenium.click("id=button-search")
selenium.click("id=input-search")
selenium.type("id=input-search", "ab")
selenium.click("id=button-search")
selenium.click("id=input-search")
selenium.type("id=input-search", "a")
selenium.click("id=button-search")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::button[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::div[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[2]/following::button[2]")
selenium.click("link=product comparison")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rating'])[1]/following::i[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rating'])[1]/following::i[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rating'])[1]/following::i[5]")
selenium.doubleClick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rating'])[1]/following::i[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rating'])[1]/following::i[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rating'])[1]/following::i[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rating'])[1]/following::i[1]")
selenium.doubleClick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rating'])[1]/following::i[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Summary'])[1]/following::td[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Remove'])[1]/following::input[1]")
selenium.click("link=Product Comparison")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Show All MP3 Players'])[1]/following::i[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Checkout'])[1]/following::button[1]")
selenium.click("name=category_id")
selenium.select("name=category_id", "label=Cameras")
selenium.click("name=category_id")
selenium.click("id=button-search")
selenium.click("name=category_id")
selenium.select("name=category_id", "label=Tablets")
selenium.click("name=category_id")
selenium.click("id=button-search")
selenium.click("name=category_id")
selenium.select("name=category_id", "label=MP3 Players")
selenium.click("name=category_id")
selenium.click("id=button-search")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Search'])[4]/following::p[1]")
