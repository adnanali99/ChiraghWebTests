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

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/sell/Page_Chiragh/Page_Chiragh/a_Sell'))

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('sell/Page_Chiragh/Page_Chiragh/form_Sign In'), 5) == true) {
	
	
    WebUI.setText(findTestObject('sell/Page_Chiragh/input_Sign In_userName'), GlobalVariable.userName)

    WebUI.setText(findTestObject('sell/Page_Chiragh/input_Sign In_userPassword'), GlobalVariable.passWord)

    WebUI.click(findTestObject('Page_Chiragh/button_Sign In'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('sell/Page_Chiragh/Page_Chiragh/form_Owner Details'), 3)
} else {
    WebUI.verifyElementPresent(findTestObject('sell/Page_Chiragh/Page_Chiragh/form_Owner Details'), 3)
}

WebUI.closeBrowser()

