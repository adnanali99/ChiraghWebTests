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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Chiragh/div_Login or Register'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Chiragh/input_First Name_userFirstName'), 'new')

WebUI.setText(findTestObject('Object Repository/Page_Chiragh/input_Last Name_userLastName'), 'user')

WebUI.setText(findTestObject('Object Repository/Page_Chiragh/input_Create Username_userName'), GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Chiragh/input_Create Password_userPass'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Chiragh/input_Confirm Password_userCon'), 'RigbBhfdqOBGNlJIWM1ClA==')

def email = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

WebUI.setText(findTestObject('Object Repository/Page_Chiragh/input_Your Email_userEmail'), email + '@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Chiragh/span_XXX'))

WebUI.setText(findTestObject('Object Repository/Page_Chiragh/input_Soon_select2-search__fie'), '971')

WebUI.sendKeys(findTestObject('Object Repository/Page_Chiragh/input_Soon_select2-search__fie'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Chiragh/input_Mobile Number_mobileNo'), '454544554')

WebUI.click(findTestObject('Object Repository/Page_Chiragh/span_Accept Terms  Conditions_'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/button_Register'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/button_Register'))

WebUI.delay(3)

if (WebUI.verifyTextPresent('Username already exist. Try a different one.', true)) {
    def username = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    WebUI.setText(findTestObject('Object Repository/Page_Chiragh/input_Create Username_userName'), username)

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_Chiragh/button_Register'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Chiragh/div_We have sent you a verific'), 5)

    WebUI.closeBrowser()
} else {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Chiragh/div_You are almost there'), 5)

    WebUI.closeBrowser()
}

