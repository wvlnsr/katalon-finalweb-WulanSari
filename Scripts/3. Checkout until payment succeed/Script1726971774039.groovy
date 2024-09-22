import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('home-page/headphone-category'), 0)

WebUI.click(findTestObject('home-page/headphone-category'))

WebUI.verifyElementPresent(findTestObject('headphone-product-list-page/header'), 0)

WebUI.click(findTestObject('headphone-product-list-page/product'))

WebUI.click(findTestObject('detail-product-page/plus'))

WebUI.click(findTestObject('detail-product-page/add2cart-btn'))

WebUI.delay(5)

WebUI.click(findTestObject('detail-product-page/cart-icon'))

WebUI.click(findTestObject('cart-page/checkout-btn'))

WebUI.click(findTestObject('payment-page/register-btn'))

WebUI.setText(findTestObject('register-page/username-field'), 'hasbullah6')

WebUI.setText(findTestObject('register-page/email-field'), 'hasbullah@test.com')

WebUI.setText(findTestObject('register-page/password-field'), 'T3st')

WebUI.setText(findTestObject('register-page/cnf-password-field'), 'T3st')

WebUI.scrollToElement(findTestObject('register-page/state-field'), 0)

WebUI.click(findTestObject('register-page/snk-checkbox'))

WebUI.click(findTestObject('register-page/submit-btn'))

WebUI.click(findTestObject('payment-page/next-btn'))

WebUI.click(findTestObject('payment-page/master-radiobtn'))

WebUI.setText(findTestObject('payment-page/cardNo-field'), '1234 5678 9012')

WebUI.setText(findTestObject('payment-page/cvv-field'), '1234')

WebUI.selectOptionByValue(findTestObject('payment-page/mm-field'), 'string:03', false)

WebUI.selectOptionByValue(findTestObject('payment-page/yy-field'), 'string:2025', false)

WebUI.setText(findTestObject('payment-page/cardholder-field'), 'Nani')

WebUI.click(findTestObject('payment-page/paynow-btn'))

WebUI.verifyTextPresent('Thank you for buying with Advantage', false)

WebUI.closeBrowser()

