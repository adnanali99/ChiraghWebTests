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

WebUI.verifyElementPresent(findTestObject('load more/Page_Chiragh/div_property id 51556 (1)'), 7)

attribute2 = WebUI.getText(findTestObject('load more/Page_Chiragh/div_property id 51556 (1)'))

WebUI.click(findTestObject('Object Repository/test/Page_Chiragh/button_LOAD MORE'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('load more/Page_Chiragh/div_property id 51466'), 7)

attribute1 = WebUI.getText(findTestObject('load more/Page_Chiragh/div_property id 51466'))

WebUI.verifyNotMatch('attribute2', 'attribute1', false)

WebUI.closeBrowser()

