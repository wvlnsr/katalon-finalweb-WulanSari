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

WebUI.verifyElementPresent(findTestObject('cart-page/checkout-btn'), 0)

WebUI.closeBrowser()

not_run: WebUI.click(findTestObject('cart-page/checkout-btn'))

not_run: WebUI.click(findTestObject('payment-page/register-btn'))

not_run: WebUI.setText(findTestObject('register-page/username-field'), 'hasbullah5')

not_run: WebUI.setText(findTestObject('register-page/email-field'), 'hasbullah@test.com')

not_run: WebUI.setText(findTestObject('register-page/password-field'), 'T3st')

not_run: WebUI.setText(findTestObject('register-page/cnf-password-field'), 'T3st')

not_run: WebUI.scrollToElement(findTestObject('register-page/state-field'), 0)

not_run: WebUI.click(findTestObject('register-page/snk-checkbox'))

not_run: WebUI.click(findTestObject('register-page/submit-btn'))

not_run: WebUI.click(findTestObject('payment-page/next-btn'))

not_run: WebUI.click(findTestObject('payment-page/master-radiobtn'))

not_run: WebUI.setText(findTestObject('payment-page/cardNo-field'), '1234 5678 9012')

not_run: WebUI.setText(findTestObject('payment-page/cvv-field'), '1234')

not_run: WebUI.selectOptionByValue(findTestObject('payment-page/mm-field'), 'string:03', false)

not_run: WebUI.selectOptionByValue(findTestObject('payment-page/yy-field'), 'string:2025', false)

not_run: WebUI.setText(findTestObject('payment-page/cardholder-field'), 'Nani')

not_run: WebUI.click(findTestObject('payment-page/paynow-btn'))

not_run: WebUI.verifyTextPresent('Thank you for buying with Advantage', false)

not_run: WebUI.closeBrowser()

