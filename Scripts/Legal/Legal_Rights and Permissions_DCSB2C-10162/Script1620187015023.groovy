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

WebUI.callTestCase(findTestCase('Reusable_Methods/Set Cookie'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.RightsPermissions)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Rights  Permissions/h2_Rights and Permissions'), 'Rights and Permissions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Rights  Permissions/a_Copyright Clearance Center (CCC)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Rights  Permissions/a_Cengage online request form'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Rights  Permissions/a_Cengage support team'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Rights  Permissions/a_Help is here'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Rights  Permissions/span_Rights  Permissions'), 'Rights & Permissions')

WebUI.closeBrowser()

