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

//WebUI.callTestCase(findTestCase('Reusable_Methods/Set Cookie'), [('Page') : '', ('Base') : GlobalVariable.Base], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Home)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Contact/button_Accept'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home_Page/Page_Homepage/svg_Cengage Logo'), 0)

WebUI.click(findTestObject('Object Repository/Home_Page/Page_Homepage/svg_Cengage Logo'))

CustomKeywords.'general.Corporatesite.verifyURL'(GlobalVariable.Base)

WebUI.verifyElementPresent(findTestObject('Object Repository/Home_Page/Page_Homepage/svg_Cengage Logo                           _99959f'), 
    0)

WebUI.click(findTestObject('Object Repository/Home_Page/Page_Homepage/a_Cengage                            Cengag_532f7d'))

CustomKeywords.'general.Corporatesite.verifyURL'(GlobalVariable.Base)

WebUI.closeBrowser()

