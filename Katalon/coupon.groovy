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
selenium.open("http://demoshop24.com/index.php?route=product/search&category_id=34")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='$ US Dollar'])[1]/following::span[2]")
selenium.click("link=Login")
selenium.type("id=input-email", "Hetajogidasani@live.in")
selenium.type("id=input-password", "cypher")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Forgotten Password'])[1]/following::input[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Checkout'])[1]/following::button[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='View Cart'])[1]/following::strong[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='SAM1'])[1]/following::i[2]")
selenium.click("link=Use Coupon Code")
selenium.click("id=input-coupon")
selenium.type("id=input-coupon", "8888")
selenium.click("id=button-coupon")
selenium.click("id=input-coupon")
selenium.type("id=input-coupon", "8880")
selenium.click("id=button-coupon")
selenium.type("id=input-coupon", "1111")
selenium.click("id=button-coupon")
selenium.click("link=Continue Shopping")
