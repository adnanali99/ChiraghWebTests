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

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/a_Sell'))

// Sign In Page
WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Sign In_userName'), GlobalVariable.userName)

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Sign In_userPassword'), GlobalVariable.passWord)

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/button_Sign In'))

// Owner Details Form
WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_First Name_userFirstName'), 'first')

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Middle Name_userMiddleNa'), 'abc')

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Last Name_userLastName'), 'owner')

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/span_Emirati'))

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Soon_select2-search__fie'), 'Emirati')

WebUI.sendKeys(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Soon_select2-search__fie'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Passport Number_passport'), '45454545')

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/mat-form-field_Passport Expiry'))

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/button_Passport Expiry Date_ma'))

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/div_30'))

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_ID Card Number_idCardNo'), '56565656')

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/div_ID Card Expiry Date_mat-fo'))

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/button_ID Card Expiry Date_mat'))

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/td_29'))

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/span_(228) Togo'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), '971')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Phone Number_telephone'), '7667565656')

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/span_(971) United Arab Emirate'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), '971')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Mobile Number_mobile'), '67565656')

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Email_email'), '3@gmail.com')

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Address_userAddress'), 'sharjah, United Arab Emirates')

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/span_United Arab Emirates'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), 'Arab E')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/span_Sharjah'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), 'SH')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_P.O.Box_pobox'), '76676767676')

WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/individual owner/div_jpg png pdf accepted with'), 
    3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/individual owner/div_jpg png pdf accepted with'), 
    5)

//WebUI.click(findTestObject('Property(owner)/individual owner/div_Upload_upload-doc-div'))
WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/individual owner/div_Upload_upload-doc-div'), 'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

WebUI.delay(5)

//WebUI.verifyElementPresent(findTestObject('Property(owner)/individual owner/div_(UAE or country of origin)'), 5)
//WebUI.click(findTestObject('Property(owner)/individual owner/div_Upload_upload-doc-div1'))
//WebUI.uploadFile(findTestObject('Property(owner)/individual owner/div_Upload_upload-doc-div1'), 'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned ID Copy.jpg')
//WebUI.click(findTestObject('Property(owner)/individual owner/div_(UAE or country of origin)'))
//WebUI.click(findTestObject('Property(owner)/individual owner/div_Scanned ID Copy(UAE or cou'))
//WebUI.click(findTestObject('Property(owner)/individual owner/div_Other_doc-upload'))
//WebUI.click(findTestObject('Property(owner)/individual owner/div_Upload'))
WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/button_Next'))

// ***********POA Form**************
WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/individual owner/snack-bar-container_Data  Save'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/individual owner/span_Data  Saved Successfully'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/form_POA Details POA StatusSel'), 
    5)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/button_Close'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/mat-select_Select One'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/span_Yes'), 5)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/span_Yes'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_First Name_userFirstName'), 'POA')

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Middle Name_userMiddleNa'), 'ONE')

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Last Name_userLastName'), 'ONE')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/nationality/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/nationality/Page_Chiragh/input__select2-search__field'), 
    'Pakistani')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/poa/nationality/Page_Chiragh/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Passport Number_passport'), '676765545555')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/div_Passport Expiry Date_mat-f'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/button_Passport Expiry Date_ma'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/button_JAN 2019'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/div_2021'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/div_DEC'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/div_27'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_ID Card Number_idCardNo'), '5343434345')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/mat-form-field_ID Card Expiry'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/button_ID Card Expiry Date_mat'))

//WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/table_SMTWTFSJAN12345678910111'))
WebUI.click(findTestObject('Object Repository/Property(owner)/poa/id card expiry/Page_Chiragh/button_JAN 2019'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/id card expiry/Page_Chiragh/div_20162017201820192020202120'), 
    5)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/id card expiry/Page_Chiragh/div_2021'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/id card expiry/Page_Chiragh/div_SEP'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/id card expiry/Page_Chiragh/div_16'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/Page_Chiragh/input__select2-search__field'), 
    '971')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/Page_Chiragh/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Phone Number_telephone'), '45454544555')

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Mobile Number/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Mobile Number/Page_Chiragh/input__select2-search__field'), 
    '971')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/poa/Mobile Number/Page_Chiragh/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Mobile Number_mobile'), '45454555555')

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Email_email'), 'E@GMAIL.COM')

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Address_userAddress'), 'SHARJAH   ')

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/country/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/country/Page_Chiragh/input__select2-search__field'), 
    'ARAB E')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/poa/country/Page_Chiragh/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/city/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/city/Page_Chiragh/input__select2-search__field'), 'SHA')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/poa/city/Page_Chiragh/input__select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_P.O.Box_pobox'), '45455555557')

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_POA Number_poaNumber'), '6565656566')

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/poa expiry date/Page_Chiragh/div_POA Expiry Date_mat-form-f'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/poa expiry date/Page_Chiragh/button_POA Expiry Date_mat-ico'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/poa expiry date/Page_Chiragh/button_JAN 2019'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/poa expiry date/Page_Chiragh/div_2021'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/poa expiry date/Page_Chiragh/div_AUG'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/poa expiry date/Page_Chiragh/div_11'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/mat-select_Select One_1'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/mat-option_Individual Property'))

//  Scanned Passport Copy  //
WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/poa/Scanned Passport Copy/Page_Chiragh/div_jpg png pdf accepted with'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/Scanned Passport Copy/Page_Chiragh/div_jpg png pdf accepted with'), 
    5)

WebUI.delay(6)

WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/poa/Scanned Passport Copy/Page_Chiragh/div_Scanned Passport Copy_doc-'), 
    'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

//  Scanned Notarized POA  //
WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/poa/Scanned Notarized POA/Page_Chiragh/div_Upload_upload-doc-div'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/Scanned Notarized POA/Page_Chiragh/div_Upload_upload-doc-div'), 
    5)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/poa/Scanned Notarized POA/Page_Chiragh/div_(International POA should'), 
    'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

// submitt Poa form
WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/span_General POA not accepted_'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/button_Next'))

//*****************************Property Form****************************************//
WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/snack-bar-container_Data  Save'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/span_Data  Saved Successfully'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/div_Property DetailsArea Detai'), 
    5)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Property Status/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Property Status/Page_Chiragh/span_Other'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Property Status/Page_Chiragh/input_Other_propertyStatusOthe'), 
    'in progress')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Title Deed Number_titlDe'), 
    '7878787863')

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Oqoodi Number_oqoodiNo'), '4545454545')

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Makani Number_makaniNo'), '23232323')

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/property/Type of Area/Page_Chiragh/mat-select_Select One'), 
    7)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Type of Area/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Type of Area/Page_Chiragh/span_Lease Hold'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Type of Property/Page_Chiragh/mat-select_Select One'))

WebUI.delay(3)

//WebUI.scrollToElement('Object Repository/Property(owner)/property/Type of Property/Page_Chiragh/Page_Chiragh/span_Other')
WebUI.click(findTestObject('Object Repository/Property(owner)/property/Type of Property/Page_Chiragh/Page_Chiragh/span_Other'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Type of Property/Page_Chiragh/input_Other_typePropertyOther'), 
    'Hotel')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Project Name_projectName'), 
    'Fort Hotel')

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Plot Number_plotNo'), '6565656666')

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Building Name_bulidingNa'), 
    'Hatta Fort')

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Building Number_buliding'), 
    '56565655')

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_FlatOffice No._officeNo'), '454A')

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Gross Area/Page_Chiragh/input_Gross Area_grossArea'), 
    '5000')

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Gross Area/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Gross Area/Page_Chiragh/span_sqm'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Net Area/Page_Chiragh/input_Net Area_netArea'), 
    '5000')

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Net Area/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Net Area/Page_Chiragh/span_sqft'))

//WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Address_address'), 'Hatta      ')

WebUI.click(findTestObject('Object Repository/Property(owner)/property/country/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/country/Page_Chiragh/input__select2-search__field'), 
    'ARAB E')

WebUI.sendKeys(findTestObject('Property(owner)/property/country/Page_Chiragh/input__select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Property(owner)/property/city/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('Property(owner)/property/city/Page_Chiragh/input__select2-search__field'), 'Hatta')

WebUI.sendKeys(findTestObject('Property(owner)/property/city/Page_Chiragh/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/map/Page_Chiragh/input_View_searchAddress'), 'Hatta')

WebUI.click(findTestObject('Property(owner)/property/map/Page_Chiragh/div_HattaDubai - United Arab E'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/property/map/Page_Chiragh/div_Map DataMap data 2019 Goog'), 
    5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Property(owner)/property/map/Page_Chiragh/button_'), 5)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/map/Page_Chiragh/button_'))

WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Property(owner)/property/map/Page_Chiragh/span_'))
WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Developer Name_developer'), 'developers')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Owner Association Number'), '54545343434')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Community Number_communi'), '56756546')

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Present Use/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Present Use/Page_Chiragh/span_Commercial'))

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Property Approx. Age_pro'), '3 Years')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Bedrooms_noOfBedrooms'), '30')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Bathrooms_noOfBaths'), '20')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Car Parks_carParks'), '2')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Kitchens_kitchens'), '5')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Floor No._floorNo'), '1')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Unit No._noUnits'), '1')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_No. of Floors_noOfFloors'), '4')

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_No. of Shops_noShops'), '1')

// Features //
WebUI.click(findTestObject('Object Repository/Property(owner)/property/Features/Page_Chiragh/span_Community View_check mr-2'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Features/Page_Chiragh/span_Covered Parking_check mr-'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Features/Page_Chiragh/span_Fully Fitted Kitchen_chec'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Features/Page_Chiragh/span_Fully Furnished_check mr-'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Features/Page_Chiragh/span_Intercom_check mr-2'))

// facilities //
WebUI.click(findTestObject('Object Repository/Property(owner)/property/Facilities/Page_Chiragh/span_Basket Ball Court_check m'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Facilities/Page_Chiragh/span_Children Play Area_check'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Facilities/Page_Chiragh/span_Business Center_check mr-'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Facilities/Page_Chiragh/span_Facilities_check mr-2'))

// Neighbourhood Information //
WebUI.click(findTestObject('Object Repository/Property(owner)/property/Neighbourhood Information/Page_Chiragh/span_Beaches_check mr-2'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Neighbourhood Information/Page_Chiragh/span_Medical Centers_check mr-'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Neighbourhood Information/Page_Chiragh/span_Mosques_check mr-2'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Neighbourhood Information/Page_Chiragh/span_Park_check mr-2'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Neighbourhood Information/Page_Chiragh/span_Schools_check mr-2'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Neighbourhood Information/Page_Chiragh/span_Super Markets_check mr-2'))

// description //
WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/textarea_Description_propertyD'), 
    'property for sale')

// Scanned Title Deed //
WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/property/Scanned Title Deed/Page_Chiragh/div_jpg png pdf accepted with'), 
    5)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/property/Scanned Title Deed/Page_Chiragh/div_Scanned Title Deed_doc-upl') , 5)
WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/property/Scanned Title Deed/Page_Chiragh/div_Scanned Title Deed_doc-upl'), 
    'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

// SPA //
WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/property/SPA/Page_Chiragh/div_Upload_upload-doc-div'), 
    5)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/property/SPA/Page_Chiragh/Page_Chiragh/div_(Sale purchase agreement)_'), 
    'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/button_Next'))

WebUI.delay(3)

//**********************mortgage form*************//
WebUI.click(findTestObject('Property(owner)/mortgage/Mortgage Status/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Property(owner)/mortgage/Mortgage Status/Page_Chiragh/span_Yes'))

WebUI.setText(findTestObject('Property(owner)/mortgage/Page_Chiragh/input_Mortgage Number_morgageR'), '2323244444')

WebUI.setText(findTestObject('Property(owner)/mortgage/Page_Chiragh/input_Mortgage Initial Amount_'), '76676777')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/mortgage/Mortgage Start Date/Page_Chiragh/mat-form-field_Mortgage Start'))

WebUI.click(findTestObject('Object Repository/Property(owner)/mortgage/Mortgage Start Date/Page_Chiragh/button_Mortgage Start Date_mat'))

WebUI.click(findTestObject('Object Repository/Property(owner)/mortgage/Mortgage Start Date/Page_Chiragh/button_JAN 2019'))

WebUI.click(findTestObject('Object Repository/Property(owner)/mortgage/Mortgage Start Date/Page_Chiragh/div_2022'))

WebUI.click(findTestObject('Object Repository/Property(owner)/mortgage/Mortgage Start Date/Page_Chiragh/div_NOV'))

WebUI.click(findTestObject('Object Repository/Property(owner)/mortgage/Mortgage Start Date/Page_Chiragh/div_17'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Property(owner)/mortgage/Mortgage Period/Page_Chiragh/mat-select_Year'))

WebUI.click(findTestObject('Property(owner)/mortgage/Mortgage Period/Page_Chiragh/span_3'))

WebUI.click(findTestObject('Property(owner)/mortgage/Mortgage Period/Page_Chiragh/mat-select_Month'))

WebUI.click(findTestObject('Property(owner)/mortgage/Mortgage Period/Page_Chiragh/span_1'))

WebUI.setText(findTestObject('Property(owner)/mortgage/Page_Chiragh/input_Outstanding Amount_outst'), '4534343444')

WebUI.setText(findTestObject('Property(owner)/mortgage/Page_Chiragh/input_Monthly Mortgage payment'), '343434444')

WebUI.click(findTestObject('Property(owner)/mortgage/Financing/Page_Chiragh/span_Select Bank'))

WebUI.setText(findTestObject('Property(owner)/mortgage/Financing/Page_Chiragh/input__select2-search__field'), 'Other')

WebUI.sendKeys(findTestObject('Property(owner)/mortgage/Financing/Page_Chiragh/input__select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Property(owner)/mortgage/Financing/Page_Chiragh/input_Other_otherBank'), 'UAE Bank')

//Scanned NOC Form//
WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/mortgage/Scanned NOC Form/Page_Chiragh/div_jpg png pdf accepted with'), 
    5)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/mortgage/Scanned NOC Form/Page_Chiragh/div_(Mortgage Company)_doc-upl'), 
    'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

//other//
WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/mortgage/other/Page_Chiragh/div_Upload_upload-doc-div'), 
    5)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/mortgage/other/Page_Chiragh/div_Other_doc-upload'), 'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

WebUI.click(findTestObject('Property(owner)/mortgage/Page_Chiragh/button_Next'))

WebUI.delay(3)

// rent form //
//WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/mortgage/Page_Chiragh/snack-bar-container_Mortgage d'), 5)
//WebUI.click(findTestObject('Object Repository/Property(owner)/mortgage/Page_Chiragh/button_Close'))
WebUI.click(findTestObject('Property(owner)/rent/Property Rented/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Property(owner)/rent/Property Rented/Page_Chiragh/span_Yes'))

WebUI.setText(findTestObject('Property(owner)/rent/Page_Chiragh/input_Ejari Number_rentalEjari'), '343434344')

WebUI.setText(findTestObject('Property(owner)/rent/Page_Chiragh/input_Tenant Name_tenantName'), 'tenant')

WebUI.setText(findTestObject('Property(owner)/rent/Page_Chiragh/input_Annual Rent Amount_renta'), '40000000')

WebUI.delay(3)

WebUI.click(findTestObject('Property(owner)/rent/Payment Structure/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Property(owner)/rent/Payment Structure/Page_Chiragh/span_2'))

WebUI.click(findTestObject('Property(owner)/rent/Lease Start Date/Page_Chiragh/div_Lease Start Date_mat-form-'))

WebUI.click(findTestObject('Property(owner)/rent/Lease Start Date/Page_Chiragh/button_Lease Start Date_mat-ic'))

WebUI.click(findTestObject('Property(owner)/rent/Lease Start Date/Page_Chiragh/button_JAN 2019'))

WebUI.click(findTestObject('Property(owner)/rent/Lease Start Date/Page_Chiragh/div_2022'))

WebUI.click(findTestObject('Property(owner)/rent/Lease Start Date/Page_Chiragh/div_NOV'))

WebUI.click(findTestObject('Property(owner)/rent/Lease Start Date/Page_Chiragh/td_25'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Property(owner)/rent/Lease End Date/Page_Chiragh/div_Lease End Date_mat-form-fi'))

WebUI.click(findTestObject('Object Repository/Property(owner)/rent/Lease End Date/Page_Chiragh/button_Lease End Date_mat-icon'))

WebUI.click(findTestObject('Object Repository/Property(owner)/rent/Lease End Date/Page_Chiragh/button_JAN 2019'))

WebUI.click(findTestObject('Object Repository/Property(owner)/rent/Lease End Date/Page_Chiragh/div_2026'))

WebUI.click(findTestObject('Object Repository/Property(owner)/rent/Lease End Date/Page_Chiragh/div_NOV'))

WebUI.click(findTestObject('Object Repository/Property(owner)/rent/Lease End Date/Page_Chiragh/div_10'), FailureHandling.STOP_ON_FAILURE)

//Scanned Tenancy Contract//
WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/rent/Scanned Tenancy Contract/Page_Chiragh/div_jpg png pdf accepted with'), 
    5)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/rent/Scanned Tenancy Contract/Page_Chiragh/div_Scanned Tenancy Contract_d'), 
    'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

// other //
WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/rent/other/Page_Chiragh/div_Upload_upload-doc-div'), 
    5)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/rent/other/Page_Chiragh/Page_Chiragh/div_Other_doc-upload'), 
    'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

WebUI.click(findTestObject('Property(owner)/mortgage/Page_Chiragh/button_Next'))

WebUI.click(findTestObject('Property(owner)/Valuation/Page_Chiragh/span_INDEPENDENT REAL ESTATE V'))

WebUI.click(findTestObject('Property(owner)/Valuation/Page_Chiragh/h3_JLL'))

WebUI.click(findTestObject('Property(owner)/Valuation/Page_Chiragh/button_SUBMIT FOR VALUATION'))

WebUI.delay(2)

WebUI.closeBrowser()

