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

WebUI.navigateToUrl('http://dev.chiragh.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Chiragh/div_Login or Register'))

WebUI.click(findTestObject('Object Repository/upload profile picture/Page_Chiragh/a_Login'))

WebUI.setText(findTestObject('Object Repository/upload profile picture/Page_Chiragh/input_Sign In_userName'), 'newuser01')

WebUI.setEncryptedText(findTestObject('Object Repository/upload profile picture/Page_Chiragh/input_Sign In_userPassword'),
	'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/upload profile picture/Page_Chiragh/button_Sign In'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_Chiragh/div_Login or Register'))

WebUI.click(findTestObject('Object Repository/upload profile picture/Page_Chiragh/a_Profile'))

WebUI.verifyElementPresent(findTestObject('upload profile picture/Page_Chiragh/div_Personal InfoPersonal Deta'), 5)

WebUI.uploadFile(findTestObject('upload profile picture/Page_Chiragh/div_Personal InfoPersonal Deta'), 'C:\\Users\\HP\\Katalon Studio\\register\\Include\\images\\800px_COLOURBOX5609690.jpg')

WebUI.verifyElementPresent(findTestObject('Object Repository/upload profile picture/Page_Chiragh/snack-bar-container_Profile im'),
	7)

WebUI.verifyElementPresent(findTestObject('Object Repository/upload profile picture/Page_Chiragh/span_Profile image uploaded su'),
	7)

WebUI.closeBrowser()


