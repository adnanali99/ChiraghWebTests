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
import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.delay(3)

if (RC.getExecutionProfile() == 'default') {
    WebUI.click(findTestObject('property by name/Page_Chiragh/h2_Burj Khalifa 3214 Dubai mai'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('view property/Page_Chiragh/div_Exit VR (1)'), 3)

    WebUI.closeBrowser()
} else {
    WebUI.click(findTestObject('property by name/Page_Chiragh/h2_Project 51468 Penthouse wit'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('view property/Page_Chiragh/div_Exit VR (1)'), 3)

    WebUI.closeBrowser()
}

