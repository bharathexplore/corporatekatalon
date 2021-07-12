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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://int-corporate.cengage.com/')

WebUI.click(findTestObject('Object Repository/General/Page_HOME PAGE hello - Cengage Corporate/a_Piracy'))

WebUI.click(findTestObject('Object Repository/General/Page_Piracy/a_Report Piracy'))

WebUI.verifyElementText(findTestObject('Object Repository/General/Page_Report Piracy/h1_Report Piracy'), 'Report Piracy')

WebUI.verifyElementText(findTestObject('Object Repository/General/Page_Report Piracy/h3_Report Suspected Piracy Form'), 
    'Report Suspected Piracy Form')

WebUI.verifyElementText(findTestObject('Object Repository/General/Page_Report Piracy/label_Physical Piracy'), 'Physical Piracy')

WebUI.verifyElementText(findTestObject('Object Repository/General/Page_Report Piracy/label_Online Piracy'), 'Online Piracy')

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/input_What type of Piracy are you reporting_657341'))

WebUI.verifyElementText(findTestObject('Object Repository/General/Page_Report Piracy/legend_Physical Piracy'), 'Physical Piracy')

WebUI.setText(findTestObject('Object Repository/General/Page_Report Piracy/input_Seller - Person or business selling t_5ed4b9'), 
    'Seller')

WebUI.setText(findTestObject('Object Repository/General/Page_Report Piracy/input_Address or location of the infringing_3b1146'), 
    'Test Address')

WebUI.setText(findTestObject('Object Repository/General/Page_Report Piracy/input_Description - Name, title or descript_399fd4'), 
    'Description')

WebUI.setText(findTestObject('Object Repository/General/Page_Report Piracy/input_First Name_first'), 'First Name')

WebUI.setText(findTestObject('Object Repository/General/Page_Report Piracy/input_Last Name_last'), 'Last Name')

WebUI.setText(findTestObject('Object Repository/General/Page_Report Piracy/input_Email Address_email'), 'testpiracy@mailinator.com')

WebUI.setText(findTestObject('Object Repository/General/Page_Report Piracy/input_Phone_phone'), '4138880987')

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/input_Phone_optin'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/img_traffic lights_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/img_traffic lights_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/img_traffic lights_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/div_traffic lights_rc-imageselect-checkbox'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/div_traffic lights_rc-imageselect-checkbox'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/div_traffic lights_rc-imageselect-checkbox_1'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/img_traffic lights_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/div_traffic lights_rc-imageselect-checkbox_1_2'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/img_traffic lights_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/img_traffic lights_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/button_Verify'))

WebUI.click(findTestObject('Object Repository/General/Page_Report Piracy/button_Report Piracy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/General/Page_Report Piracy/div_Success Message has been sent'), 
    0)

