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

WebUI.verifyElementPresent(findTestObject('home-page/user-icon'), 0)

WebUI.click(findTestObject('home-page/user-icon'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('home-page/login-modal/username-field'), GlobalVariable.username)

WebUI.setText(findTestObject('home-page/login-modal/password-field'), GlobalVariable.password)

WebUI.click(findTestObject('home-page/login-modal/signin-btn'))

WebUI.verifyTextPresent(GlobalVariable.username, false)

WebUI.click(findTestObject('home-page/headphone-sec'))

WebUI.click(findTestObject('headphone-sec-page/product'))

WebUI.click(findTestObject('product-detail/plus'))

WebUI.click(findTestObject('product-detail/add2cart-btn'))

WebUI.delay(5)

WebUI.click(findTestObject('home-page/cart-icon'))

WebUI.click(findTestObject('cart-page/checkout-btn'))

WebUI.click(findTestObject('payment-page/next-btn'))

WebUI.click(findTestObject('payment-page/mastercard-radiobtn'))

//WebUI.setText(findTestObject('payment-page/cardnumber-field'), CustomKeywords.'web.keyword.randomInt'(16))
//
//WebUI.setText(findTestObject('payment-page/cvv-field'), CustomKeywords.'web.keyword.randomInt'(4))
//
//WebUI.setText(findTestObject('payment-page/cardholder-field'), CustomKeywords.'web.keyword.randomStr'(8))

//WebUI.click(findTestObject('payment-page/rememberCC-checkbox'))

WebUI.click(findTestObject('payment-page/paynow-btn'))

WebUI.verifyTextPresent('Thank you for buying with Advantage', false)

WebUI.delay(2)

//WebUI.click(findTestObject('home-page/user-icon'))
//
//WebUI.click(findTestObject('home-page/signout-btn'))
WebUI.closeBrowser()

