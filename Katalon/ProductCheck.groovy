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
selenium.open("http://demoshop24.com/index.php?route=product/search&search=mice")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Checkout'])[1]/following::img[1]")
selenium.click("link=Baks (3)")
selenium.click("link=Tablets (1)")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Show:'])[1]/following::img[1]")
selenium.click("link=Reviews (0)")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Continue'])[1]/following::button[1]")
selenium.click("link=Software")
selenium.click("link=Laptops & Notebooks (5)")
selenium.click("link=Phones & PDAs")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Show:'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='lorem ipsum'])[1]/following::p[1]")
selenium.click("link=Reviews (0)")
selenium.click("link=Desktops")
selenium.click("link=PC (2)")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Show:'])[1]/following::img[1]")
selenium.click("link=Components")
selenium.click("link=Phones & PDAs")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Malm Treo Pro'])[1]/following::img[3]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[1]/following::button[2]")
selenium.click("//div[2]/div")
selenium.click("id=input-quantity")
selenium.click("id=button-cart")
selenium.click("link=MP3 Players")
selenium.click("link=MP3 Players")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Show All MP3 Players'])[1]/following::a[2]")
selenium.click("link=Cameras (2)")
selenium.click("link=Mamoth D300")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Show All MP3 Players'])[1]/following::a[2]")
selenium.click("link=MP3 Players (4)")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Show:'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='o-Pod Classic'])[1]/following::img[3]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[1]/following::button[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[1]/following::button[2]")
selenium.doubleClick("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[1]/following::button[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='o-Pod Classic'])[1]/preceding::button[1]")
selenium.click("link=Reviews (0)")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Ex Tax: 100.00€'])[1]/following::div[2]")
selenium.click("id=input-quantity")
selenium.type("id=input-quantity", "12")
selenium.click("id=button-cart")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Show All MP3 Players'])[1]/following::a[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[2]/following::img[1]")
selenium.click("id=input-quantity")
selenium.type("id=input-quantity", "11")
selenium.click("id=button-cart")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::i[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::i[3]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::i[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::p[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::i[3]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::i[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[1]/following::i[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Show All MP3 Players'])[1]/following::a[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Refine Search'])[1]/following::a[1]")
selenium.click("link=Cameras (2)")
selenium.click("link=Laptops & Notebooks (5)")
selenium.click("link=Desktops (11)")
selenium.click("link=Appricot Cinema 30\"")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Checkbox'])[1]/preceding::input[2]")
selenium.click("name=option[223][]")
selenium.click("id=input-option208")
selenium.click("id=input-option217")
selenium.select("id=input-option217", "label=Blue (+3.00€)")
selenium.click("id=input-option217")
selenium.click("id=input-option209")
selenium.click("id=input-option219")
selenium.click("id=input-option221")
selenium.click("id=input-option220")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::button[1]")
selenium.click("id=input-quantity")
selenium.click("id=button-cart")
selenium.click("id=input-option209")
selenium.type("id=input-option209", "aa")
selenium.click("id=button-cart")
selenium.click("id=input-quantity")
selenium.click("id=button-upload222")
selenium.type("name=file", "C:\\fakepath\\ws_Work_Hard_Stay_Humble_1440x900.jpg")
assertEquals("Your file was successfully uploaded!", selenium.getAlert());
selenium.click("id=button-cart")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='×'])[1]/following::img[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[1]/following::button[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[1]/following::button[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[1]/following::button[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[1]/following::button[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)=concat('Appricot Cinema 30', '\"', '')])[1]/preceding::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='×'])[1]/following::ul[2]")
selenium.click("link=Specification")
selenium.click("link=Reviews (0)")
selenium.click("link=Description")
