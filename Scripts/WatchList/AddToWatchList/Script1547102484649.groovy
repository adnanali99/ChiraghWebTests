//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling as FailureHandling
//import com.kms.katalon.core.testcase.TestCase as TestCase
//import com.kms.katalon.core.testdata.TestData as TestData
//import com.kms.katalon.core.testobject.TestObject as TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import internal.GlobalVariable as GlobalVariable
//
//WebUI.openBrowser('')
//
//CustomKeywords.'com.chiraghmethods.util.loginMethod.Login'(GlobalVariable.userName, GlobalVariable.passWord)
//
//WebUI.delay(3)
//
//def text1 = WebUI.getText(findTestObject('property by name/Page_Chiragh/h2_Burj Khalifa 3214 Dubai mai'))
//
//WebUI.click(findTestObject('Page_Chiragh/img_Time Remaining 22  36  33_'))
//
//WebUI.delay(2)
//
//WebUI.scrollToPosition(0, 0)
//
//WebUI.scrollToElement(findTestObject('WatchList/Page_Chiragh/div_Profile or Signout'), 3)
//
//WebUI.click(findTestObject('WatchList/Page_Chiragh/div_Profile or Signout'))
//
//WebUI.waitForElementVisible(findTestObject('WatchList/Page_Chiragh/a_Profile'), 3)
//
//WebUI.click(findTestObject('WatchList/Page_Chiragh/a_Profile'))
//
//WebUI.waitForPageLoad(3)
//
//WebUI.click(findTestObject('WatchList/Page_Chiragh/a_Activity'))
//
////def text = WebUI.getText(findTestObject('WatchList/Page_Chiragh/div_Burj Khalifa 3214 Dubai ma'))
//
//def text = WebUI.getText(findTestObject('WatchList/Page_Chiragh/div_Burj Khalifa 3214 Dubai ma'))
//
//if (text1==text) {
//    //your code here
//    WebUI.delay(3)
//
//    WebUI.click(findTestObject('WatchList/Page_Chiragh/button_Remove'))
//
//    WebUI.delay(4)
//
//    WebUI.verifyElementText(findTestObject('Page_Chiragh/div_Properties you have added'), 'Properties you have added into your Watch List will be shown here.')
//}
//
////if ( WebUI.getText(findTestObject('property by name/Page_Chiragh/h2_Burj Khalifa 3214 Dubai mai')) == WebUI.getText(findTestObject('WatchList/Page_Chiragh/div_Burj Khalifa 3214 Dubai ma'))) {
////}
////WebUI.verifyElementText(findTestObject('Page_Chiragh/span_Property has been added t'), 'Property has been added to your Watch List.')
///*WebUI.delay(3)
//
//WebUI.click(findTestObject('Page_Chiragh/img_Time Remaining 22  36  33_'))
//
//WebUI.delay(3)
//
//if (WebUI.verifyElementPresent(findTestObject('sell/Page_Chiragh/Page_Chiragh/form_Sign In'), 3) == true) {
//    WebUI.setText(findTestObject('sell/Page_Chiragh/input_Sign In_userName'), GlobalVariable.userName)
//
//    WebUI.setText(findTestObject('sell/Page_Chiragh/input_Sign In_userPassword'), GlobalVariable.passWord)
//
//    WebUI.click(findTestObject('Page_Chiragh/button_Sign In'))
//
//    WebUI.delay(3)
//
//    WebUI.click(findTestObject('WatchList/Page_Chiragh/img_Time Remaining 22  36  33_'))
//	
//    WebUI.verifyElementText(findTestObject('WatchList/Page_Chiragh/snack-bar-container_Property h'), 'Property has been added to your Watch List.')
//} else {
//    //WebUI.verifyElementPresent(findTestObject('WatchList/Page_Chiragh/span_Property has been removed'), 3)
//}*/
////WebUI.closeBrowser()
//
