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
def ownerfirst = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_First Name_userFirstName'), ownerfirst)

def ownermiddle = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Middle Name_userMiddleNa'), ownermiddle)

def ownerlast = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Last Name_userLastName'), ownerlast)

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/span_Emirati'))

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Soon_select2-search__fie'), 'Emirati')

WebUI.sendKeys(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Soon_select2-search__fie'), Keys.chord(
        Keys.ENTER))

def ownerpassport = org.apache.commons.lang.RandomStringUtils.randomNumeric(7)

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_Passport Number_passport'), ownerpassport)

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/mat-form-field_Passport Expiry'))

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/button_Passport Expiry Date_ma'))

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/div_30'))

def owneridcard = org.apache.commons.lang.RandomStringUtils.randomNumeric(7)

WebUI.setText(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/input_ID Card Number_idCardNo'), owneridcard)

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/div_ID Card Expiry Date_mat-fo'))

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/button_ID Card Expiry Date_mat'))

WebUI.click(findTestObject('Property(owner)/individual owner/owner/Page_Chiragh/td_29'))

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/span_(228) Togo'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), '971')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), Keys.chord(
        Keys.ENTER))

def ownerphno = org.apache.commons.lang.RandomStringUtils.randomNumeric(8)

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Phone Number_telephone'), ownerphno)

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/span_(971) United Arab Emirate'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), '971')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), Keys.chord(
        Keys.ENTER))

def ownermobno = org.apache.commons.lang.RandomStringUtils.randomNumeric(8)

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Mobile Number_mobile'), ownermobno)

def owneremail = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3)

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Email_email'), owneremail + '@gmail.com')

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Address_userAddress'), 'sharjah, United Arab Emirates')

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/span_United Arab Emirates'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), 'Arab E')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/span_Sharjah'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), 'SH')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/individual owner/input_JAN 2021_select2-search_'), Keys.chord(
        Keys.ENTER))

def ownerpobox = org.apache.commons.lang.RandomStringUtils.randomNumeric(6)

WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_P.O.Box_pobox'), ownerpobox)

WebUI.scrollToElement(findTestObject('Object Repository/Property(owner)/individual owner/div_jpg png pdf accepted with'), 
    3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/individual owner/div_jpg png pdf accepted with'), 
    5)

//WebUI.click(findTestObject('Property(owner)/individual owner/div_Upload_upload-doc-div'))
WebUI.uploadFile(findTestObject('Object Repository/Property(owner)/individual owner/div_Upload_upload-doc-div'), 'C:\\Users\\HP\\git\\ChiraghWebTests\\Include\\images\\Scanned Passport Copy.png')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/button_Next'))

//WebUI.delay(5)
// ***********POA Form**************
WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/individual owner/snack-bar-container_Data  Save'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/individual owner/span_Data  Saved Successfully'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/form_POA Details POA StatusSel'), 
    5)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/button_Close'))

WebUI.delay(2)

WebUI.click(findTestObject('Property(owner)/poa/Page_Chiragh/mat-select_Select One'))

WebUI.delay(2)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/span_Yes'), 5)
WebUI.click(findTestObject('Property(owner)/poa/Page_Chiragh/span_Yes'))

def poafirst = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_First Name_userFirstName'), poafirst)

def poamiddle = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Middle Name_userMiddleNa'), poamiddle)

def poalast = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Last Name_userLastName'), poalast)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/nationality/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/nationality/Page_Chiragh/input__select2-search__field'), 
    'Pakistani')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/poa/nationality/Page_Chiragh/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

def poapassport = org.apache.commons.lang.RandomStringUtils.randomNumeric(7)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Passport Number_passport'), poapassport)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/div_Passport Expiry Date_mat-f'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/button_Passport Expiry Date_ma'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/button_JAN 2019'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/div_2021'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/div_DEC'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/div_27'), FailureHandling.STOP_ON_FAILURE)

def poaidcard = org.apache.commons.lang.RandomStringUtils.randomNumeric(7)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_ID Card Number_idCardNo'), poaidcard)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/mat-form-field_ID Card Expiry'))

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/button_ID Card Expiry Date_mat'))

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

def poaphno = org.apache.commons.lang.RandomStringUtils.randomNumeric(7)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Phone Number_telephone'), poaphno)

WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Mobile Number/Page_Chiragh/span_Select'))

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Mobile Number/Page_Chiragh/input__select2-search__field'), 
    '971')

WebUI.sendKeys(findTestObject('Object Repository/Property(owner)/poa/Mobile Number/Page_Chiragh/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

def poamobno = org.apache.commons.lang.RandomStringUtils.randomNumeric(7)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Mobile Number_mobile'), poamobno)

def poaemail = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_Email_email'), poaemail + '@GMAIL.COM')

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

def poapobox = org.apache.commons.lang.RandomStringUtils.randomNumeric(7)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_P.O.Box_pobox'), poapobox)

def poaNo = org.apache.commons.lang.RandomStringUtils.randomNumeric(7)

WebUI.setText(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/input_POA Number_poaNumber'), poaNo)

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

WebUI.delay(2)

// submitt Poa form
WebUI.click(findTestObject('Object Repository/Property(owner)/poa/Page_Chiragh/span_General POA not accepted_'))

WebUI.delay(5)

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

def propertystatus = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Property Status/Page_Chiragh/input_Other_propertyStatusOthe'), 
    propertystatus)

WebUI.delay(3)

def titledeed = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Title Deed Number_titlDe'), 
    titledeed)

def oqoodiNo = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Oqoodi Number_oqoodiNo'), oqoodiNo)

def makaniNo = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Makani Number_makaniNo'), makaniNo)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property(owner)/property/Type of Area/Page_Chiragh/mat-select_Select One'), 
    7)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Type of Area/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Type of Area/Page_Chiragh/span_Lease Hold'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Type of Property/Page_Chiragh/mat-select_Select One'))

WebUI.delay(3)

//WebUI.scrollToElement('Object Repository/Property(owner)/property/Type of Property/Page_Chiragh/Page_Chiragh/span_Other')
WebUI.click(findTestObject('Object Repository/Property(owner)/property/Type of Property/Page_Chiragh/Page_Chiragh/span_Other'))

def propertytype = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Type of Property/Page_Chiragh/input_Other_typePropertyOther'), 
    propertytype)

WebUI.delay(3)

def projectname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Project Name_projectName'), 
    projectname)

def plotno = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Plot Number_plotNo'), plotno)

def buildingname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Building Name_bulidingNa'), 
    buildingname)

def buildingno = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Building Number_buliding'), 
    buildingno)

def officeno = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_FlatOffice No._officeNo'), officeno)

def grossarea = org.apache.commons.lang.RandomStringUtils.randomNumeric(3)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Gross Area/Page_Chiragh/input_Gross Area_grossArea'), 
    grossarea)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Gross Area/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Gross Area/Page_Chiragh/span_sqm'))

WebUI.delay(3)

def netarea = org.apache.commons.lang.RandomStringUtils.randomNumeric(3)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Net Area/Page_Chiragh/input_Net Area_netArea'), 
    netarea)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Net Area/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Net Area/Page_Chiragh/span_sqft'))

//WebUI.delay(3)
def propertyaddress = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(9)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/input_Address_address'), propertyaddress)

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
def developername = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(5)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Developer Name_developer'), developername)

def associationnumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(4)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Owner Association Number'), associationnumber)

def communitynumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(4)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Community Number_communi'), communitynumber)

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Present Use/Page_Chiragh/mat-select_Select One'))

WebUI.click(findTestObject('Object Repository/Property(owner)/property/Present Use/Page_Chiragh/span_Commercial'))

def approxage = org.apache.commons.lang.RandomStringUtils.randomNumeric(1)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Property Approx. Age_pro'), approxage + 'Years')

def beds = org.apache.commons.lang.RandomStringUtils.randomNumeric(1)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Bedrooms_noOfBedrooms'), beds)

def baths = org.apache.commons.lang.RandomStringUtils.randomNumeric(1)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Bathrooms_noOfBaths'), baths)

def carParks = org.apache.commons.lang.RandomStringUtils.randomNumeric(1)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Car Parks_carParks'), carParks)

def kitchens = org.apache.commons.lang.RandomStringUtils.randomNumeric(1)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Kitchens_kitchens'), kitchens)

def floorNo = org.apache.commons.lang.RandomStringUtils.randomNumeric(1)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Floor No._floorNo'), floorNo)

def noUnits = org.apache.commons.lang.RandomStringUtils.randomNumeric(1)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_Unit No._noUnits'), noUnits)

def noOfFloors = org.apache.commons.lang.RandomStringUtils.randomNumeric(1)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_No. of Floors_noOfFloors'), noOfFloors)

def noShops = org.apache.commons.lang.RandomStringUtils.randomNumeric(1)

WebUI.setText(findTestObject('Property(owner)/property/Page_Chiragh/input_No. of Shops_noShops'), noShops)

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
def Description = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(10)

WebUI.setText(findTestObject('Object Repository/Property(owner)/property/Page_Chiragh/textarea_Description_propertyD'), 
    Description)

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

def Number_morgage = org.apache.commons.lang.RandomStringUtils.randomNumeric(6)

WebUI.setText(findTestObject('Property(owner)/mortgage/Page_Chiragh/input_Mortgage Number_morgageR'), Number_morgage)

def mortgageinitialamount = org.apache.commons.lang.RandomStringUtils.randomNumeric(6)

WebUI.setText(findTestObject('Property(owner)/mortgage/Page_Chiragh/input_Mortgage Initial Amount_'), mortgageinitialamount)

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

def outstandingAmount = org.apache.commons.lang.RandomStringUtils.randomNumeric(6)

WebUI.setText(findTestObject('Property(owner)/mortgage/Page_Chiragh/input_Outstanding Amount_outst'), outstandingAmount)

def mortgagepayment = org.apache.commons.lang.RandomStringUtils.randomNumeric(6)

WebUI.setText(findTestObject('Property(owner)/mortgage/Page_Chiragh/input_Monthly Mortgage payment'), mortgagepayment)

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

def ejarinumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(6)

WebUI.setText(findTestObject('Property(owner)/rent/Page_Chiragh/input_Ejari Number_rentalEjari'), ejarinumber)

def tenantName = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(6)

WebUI.setText(findTestObject('Property(owner)/rent/Page_Chiragh/input_Tenant Name_tenantName'), tenantName)

def annualrentamount = org.apache.commons.lang.RandomStringUtils.randomNumeric(6)

WebUI.setText(findTestObject('Property(owner)/rent/Page_Chiragh/input_Annual Rent Amount_renta'), annualrentamount)

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

