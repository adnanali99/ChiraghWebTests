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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.annotation.Keyword as Keyword
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.callTestCase(findTestCase('SellProperty/VerifySuccessLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('AddNewProperty/Page_Chiragh/a_Sell'))

WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_First Name_userFirstName'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_First Name_userFirstName'), 'FirstName')

WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_Middle Name_userMiddleNa'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Middle Name_userMiddleNa'), 'MiddleName')

WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_Last Name_userLastName'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Last Name_userLastName'), 'LastName')

WebUI.click(findTestObject('AddNewProperty/Page_Chiragh/span_Select Nationality_select'))

WebUI.setText(findTestObject('AddNewProperty/Page_Chiragh/input_Soon_select2-search__fie'), 'afghan', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('AddNewProperty/Page_Chiragh/span_Select Nationality_select'), Keys.chord(Keys.ENTER))

WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_Passport Number_passport'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Passport Number_passport'), '123123')

//WebUI.click(findTestObject('AddNewProperty/Page_Chiragh/button_Passport Expiry Date_ma'))
//WebUI.switchToWindowIndex(1)
//WebUI.click(findTestObject('null'))
//WebUI.switchToWindowIndex(0)
WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_ID Card Number_idCardNo'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_ID Card Number_idCardNo'), '1231231')

WebUI.click(findTestObject('AddNewProperty/Page_Chiragh/span_(228) Togo'))

WebUI.setText(findTestObject('AddNewProperty/Page_Chiragh/input__select2-search__field'), '(+676) Tonga')

WebUI.sendKeys(findTestObject('AddNewProperty/Page_Chiragh/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_Phone Number_telephone'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Phone Number_telephone'), '12312312')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_(971) United Arab Emirate'))

WebUI.setText(findTestObject('AddNewProperty/Page_Chiragh/input__select2-search__field'), '(+92) Pakistan')

WebUI.sendKeys(findTestObject('AddNewProperty/Page_Chiragh/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_Mobile Number_mobile'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Mobile Number_mobile'), '123123')

WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Email_email'), 'Adnan@gmail.com')

WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_Address_userAddress'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Address_userAddress'), 'Downtown, Dubai')

WebUI.clearText(findTestObject('AddNewProperty/Page_Chiragh/input_P.O.Box_pobox'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_P.O.Box_pobox'), '123123')

CustomKeywords.'com.upf.util.fileuploader.uploadFile'(findTestObject('AddNewProperty/Page_Chiragh/div_Scanned Passport Copy_doc-'), 
    'C:\\Users\\hp\\Dropbox\\Chiragh Documents\\Test Data\\Owner Details\\Scanned_ID.png')

WebUI.delay(4)

WebUI.uploadFile(findTestObject('AddNewProperty/Page_Chiragh/div_(UAE or country of origin)'), 'C:\\Users\\hp\\Dropbox\\Chiragh Documents\\Test Data\\Owner Details\\Scanned_ID.png')

WebUI.delay(4)

WebUI.uploadFile(findTestObject('AddNewProperty/Page_Chiragh/div_Other_doc-upload'), 'C:\\Users\\hp\\Dropbox\\Chiragh Documents\\Test Data\\Owner Details\\Scanned_ID.png')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/button_Next'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Select One_mat-select-arro'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Yes'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_First Name_userFirstName'), 'FirstPOA')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Middle Name_userMiddleNa'), 'FirstPOAMiddleN')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Last Name_userLastName'), 'FirstPOALast')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('AddNewProperty/Page_Chiragh/input__select2-search__field'), 'Pakistani')

WebUI.sendKeys(findTestObject('AddNewProperty/Page_Chiragh/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Passport Number_passport'), '123123123')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Passport Expiry Date_mat-f'))
WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/button_Passport Expiry Date_ma'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Expiry/Page_Chiragh/button_JAN 2019'))
//WebUI.click(findTestObject('Object Repository/Expiry/Page_Chiragh/mat-calendar_2016  20392016201'))
//WebUI.click(findTestObject('Object Repository/Expiry/Page_Chiragh/span_JAN 2019'))
WebUI.click(findTestObject('Object Repository/Expiry/Page_Chiragh/div_20162017201820192020202120'))
WebUI.click(findTestObject('Object Repository/Expiry/Page_Chiragh/div_2022'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Expiry/Page_Chiragh/div_2022JANFEBMARAPRMAYJUNJULA'), 0)
WebUI.click(findTestObject('Object Repository/Expiry/Page_Chiragh/div_JAN'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Expiry/Page_Chiragh/table_SMTWTFSJAN12345678910111'), 0)
WebUI.click(findTestObject('Object Repository/Expiry/Page_Chiragh/div_20'))


WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/mat-calendar_JAN 2019SMTWTFSJA'))

//CustomKeywords.'com.javascriptclicker.util.jsclick.clickUsingJS'(findTestObject('Page_Chiragh/div_31'), 15)
WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_XXX'))

WebUI.setText(findTestObject('AddNewProperty/Page_Chiragh/input__select2-search__field'), 'Albania')

WebUI.sendKeys(findTestObject('AddNewProperty/Page_Chiragh/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Phone Number_telephone'), '123123123')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_XXX'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Mobile Number_mobile'), '3453453453')

WebUI.sendKeys(findTestObject('AddNewProperty/Page_Chiragh/input_Mobile Number_mobile'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Email_email'), 'aliadnan38@gmail.com')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Address_userAddress'), 'Liberty market lahore')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_P.O.Box_pobox'), '123123123')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_POA Number_poaNumber'), '123123566')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/button_POA Expiry Date_mat-ico'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AddNewProperty/Page_Chiragh/div_Select One_mat-select-arro'))

WebUI.click(findTestObject('Page_Chiragh/span_Individual Property'))

WebUI.uploadFile(findTestObject('AddNewProperty/Page_Chiragh/div_Scanned Passport Copy_doc-'), 'C:\\Users\\hp\\Dropbox\\Chiragh Documents\\Test Data\\Owner Details\\passport-scan-copy.jpg')

WebUI.uploadFile(findTestObject('AddNewProperty/Page_Chiragh/div_(International POA should'), 'C:\\Users\\hp\\Dropbox\\Chiragh Documents\\Test Data\\Owner Details\\Scanned_Notorized_POA.jpg')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_General POA not accepted_'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/button_Next'))

/*

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Other_mat-select-arrow-wra'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Completed'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Title Deed Number_titlDe'), '12312398')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Select One_mat-select-arro_2'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Non-Free Hold'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Other_mat-select-arrow-wra_1'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Pent House'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Project Name_projectName'), 'Burj Huraira')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Plot Number_plotNo'), '123123ASD')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Building Name_bulidingNa'), 'BuildingName')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Building Number_buliding'), '123')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_FlatOffice No._officeNo'), '45')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Gross Area_grossArea'), '122')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Select One_mat-select-arro_3'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_sqft'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Net Area_netArea'), '123')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Select One_mat-select-arro_4'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_sqft'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Address_address'), 'Dubai, al jumeria')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Location Map_searchAddre'), 'Dubai down')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Developer Name_developer'), 'Paramount')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Select One_mat-select-arro_5'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Industrial'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Bedrooms_noOfBedrooms'), '3')

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/input_Bathrooms_noOfBaths'), '4')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Property Details'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Community View_check mr-2'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Covered Parking_check mr-'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Fully Furnished_check mr-'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/label_24 Hours Maintenance'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_Bank ATM Facility_checkbo'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/label_Schools'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/label_Metros'))

WebUI.setText(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/textarea_Description_propertyD'), 'Lorem ipsem is a dummy text. Lorem ipsem is a dummy text. Lorem ipsem is a dummy text')

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Upload'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/button_Next'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Select One_mat-select-arro_6'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_No'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/button_Next'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Select One_mat-select-arro_7'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/span_No'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/button_Next'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/button_SUBMIT FOR FREE VALUATI'))

WebUI.click(findTestObject('Object Repository/AddNewProperty/Page_Chiragh/div_Your property details have_1')) */
WebUI.closeBrowser()

