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

WebUI.navigateToUrl(GlobalVariable.About)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Page_About Cengage/span_About Cengage'), 'About Cengage')

WebUI.verifyElementText(findTestObject('Object Repository/Page_About Cengage/h3_About Cengage'), 'About Cengage')

WebUI.verifyElementText(findTestObject('Object Repository/Page_About Cengage/h2_Our History'), 'Our History')

CustomKeywords.'general.Corporatesite.verifytextcontains'(findTestObject('Object Repository/Page_About Cengage/h4_Diversifying Ideas             Through t_5ba454'), 
    'Diversifying Ideas')

CustomKeywords.'general.Corporatesite.verifytextcontains'(findTestObject('Object Repository/Page_About Cengage/h4_Diversifying Ideas             Through t_5ba454'), 
    'Crossing the Digital')

CustomKeywords.'general.Corporatesite.verifytextcontains'(findTestObject('Object Repository/Page_About Cengage/h4_Amid Challenges, A New             Compa_d25cc8'), 
    'Amid Challenges,')

CustomKeywords.'general.Corporatesite.verifytextcontains'(findTestObject('Object Repository/Page_About Cengage/h4_Digital-First Innovation              Ac_5473c3'), 
    'Digital-First Innovation')

WebUI.verifyElementText(findTestObject('Object Repository/Page_hello world - About Cengage/h3_So, what will tomorrow bring'), 
    'So, what will tomorrow bring?')

WebUI.click(findTestObject('Object Repository/Page_hello world - About Cengage/a_Meet Our Leadership'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SITE TITLE - Leadership/h2_Leadership'), 'Leadership')

WebUI.click(findTestObject('Object Repository/Page_SITE TITLE - Leadership/a_About Cengage'))

WebUI.closeBrowser()

