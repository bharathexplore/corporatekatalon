import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//print("title"+WebUI.getWindowTitle)
WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_StudentEducators'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Homepage/h3_Cengage StudentEducators'), 'Cengage Student/Educators')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_StudentEducators'))

//WebUI.switchToWindowIndex(0)
WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_ed2go'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Navigation/Page_Online Courses and Certification Prep _8349ad/img'), 
    0)

CustomKeywords.'general.Corporatesite.verifyURL'('https://www.ed2go.com/')

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_StudentEducators'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Gale'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Navigation/Page_Scholarly Resources for Learning and R_baaefe/img_Toggle Navigation_img-responsive'), 
    0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_StudentEducators'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Higher Ed (International)'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Navigation/Page_Instructors  Cengage/img'), 0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_StudentEducators'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Higher Ed (U.S.)'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Navigation/Page_Instructors  Cengage/img'), 0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_StudentEducators'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Milady'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Navigation/Page_Driving Successful Beauty Careers Sinc_35232c/img_Milady Training_logo-main scale-with-grid'), 
    0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_StudentEducators'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_National Geographic Learning - K12'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Navigation/Page_K12 School Digital and Curricular Clas_466f11/img_Grades K-12_NGLSchoolImg'), 
    0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_StudentEducators'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_National Geographic Learning - ELT'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Navigation/Page_National Geographic Learning  English _2ad64e/a_National Geographic Learning'), 
    0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_Contact Us'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Homepage/h3_Cengage Contact Us'), 'Cengage Contact Us')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_Contact Us'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Contact Overview'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Contact/h2_Contact'), 'Contact Us')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Contact/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_Contact Us'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Support'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site_Navigation/Page_Login/div_Skip to Main Content_logoImage'), 
    0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_Contact Us'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Locations'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Locations/h2_Locations'), 'Locations')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Locations/a_Home'))

