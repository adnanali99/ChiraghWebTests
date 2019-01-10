import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Page_Chiragh/img'))

WebUI.mouseOver(findTestObject('Page_Chiragh/h3_BID NOW'))

WebUI.mouseOver(findTestObject('Page_Chiragh/div_To place a bid you must   '))

WebUI.click(findTestObject('Page_Chiragh/a_Sign in'))

WebUI.click(findTestObject('Page_Chiragh/div_Sign In                   '))

WebUI.setText(findTestObject('Page_Chiragh/input_Sign In_userName'), GlobalVariable.userName)

WebUI.setText(findTestObject('Page_Chiragh/input_Sign In_userPassword'), GlobalVariable.passWord)

WebUI.click(findTestObject('Page_Chiragh/button_Sign In'))

WebUI.closeBrowser()

