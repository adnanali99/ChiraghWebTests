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

WebUI.click(findTestObject('Page_Chiragh/Page_Chiragh/div_Login or Register'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/form_Sign In User Name is requ'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/a_Forgot Password'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/form_Forgot PasswordFollow the'))

WebUI.setText(findTestObject('Object Repository/Page_Chiragh/input_Follow instructions ment'), 'newuser01')

WebUI.click(findTestObject('Object Repository/Page_Chiragh/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/snack-bar-container_See your e'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/span_See your email for passwo'))

WebUI.click(findTestObject('Object Repository/Page_Chiragh/div_Forgot PasswordFollow thes'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_Continue to Gmail_identi'), 'fatimazaidi1995@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Gmail/content_Next'))

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Page_Gmail/input_Too many failed attempts'), 'GT0PhHqn7MN+Jmsb7gVpSA==')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.click(findTestObject('Page_Inbox (835) - fatimazaidi1995g/Page_Inbox (839) - fatimazaidi1995g/span_Chiragh Reset Password'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Page_Chiragh Reset Password - fatim/a_httpdev-chiragh.surge.shauth'), 5)
WebUI.click(findTestObject('Object Repository/Page_Chiragh Reset Password - fatim/Page_Chiragh Reset Password - fatim/a_httpdev-chiragh.surge.shauth'))

WebUI.switchToWindowTitle('Chiragh')

WebUI.click(findTestObject('Object Repository/Page_Chiragh/form_Reset Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Chiragh/input__userPassword'), 'RigbBhfdqOBDK95asqKeHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Chiragh/input__userConfirmPassword'), 'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Page_Chiragh/button_Reset Password'))

