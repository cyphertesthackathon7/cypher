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
selenium.open("http://demoshop24.com/index.php?route=checkout/checkout")
selenium.click("//body")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Step 1: Checkout Options'])[1]/following::div[4]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Step 1: Checkout Options'])[1]/following::div[4]")
selenium.click("link=Step 2: Billing Details")
selenium.click("link=Step 2: Billing Details")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Step 2: Billing Details'])[1]/following::label[2]")
selenium.click("id=input-payment-firstname")
selenium.type("id=input-payment-firstname", "sds")
selenium.click("id=input-payment-lastname")
selenium.click("id=input-payment-firstname")
selenium.type("id=input-payment-firstname", "Mitchell")
selenium.click("id=input-payment-lastname")
selenium.type("id=input-payment-lastname", "a")
selenium.click("id=input-payment-company")
selenium.type("id=input-payment-company", "CCC")
selenium.click("id=input-payment-address-1")
selenium.type("id=input-payment-address-1", "Kalku iela")
selenium.click("id=input-payment-city")
selenium.type("id=input-payment-city", "00")
selenium.click("id=input-payment-country")
selenium.click("id=content")
selenium.click("id=button-payment-address")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Region / State'])[2]/following::div[2]")
selenium.click("id=button-shipping-address")
selenium.click("name=comment")
selenium.type("name=comment", "urgent")
selenium.click("id=button-shipping-method")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add Comments About Your Order'])[2]/preceding::input[1]")
selenium.click("id=button-payment-method")
selenium.click("name=agree")
selenium.click("id=button-payment-method")
selenium.click("link=Step 3: Delivery Details")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Terms & Conditions'])[1]/following::h4[1]")
selenium.click("link=Step 6: Confirm Order")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Step 6: Confirm Order'])[1]/following::div[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Checkout'])[5]/following::h4[1]")
selenium.click("link=Step 3: Delivery Details")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Terms & Conditions'])[1]/following::div[2]")
selenium.click("link=Step 6: Confirm Order")
selenium.click("id=button-confirm")
selenium.click("link=Continue")
