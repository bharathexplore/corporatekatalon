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

WebUI.navigateToUrl(GlobalVariable.Legal_Privacy)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Privacy K-12/span_Privacy K-12'), 'Privacy: K-12')

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Privacy K-12/h2_K-12 Student Policy Data Statements'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Privacy K-12/strong_DOWNLOAD AS A PDF VERSION'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Privacy K-12/h4_Policy Statements'), 'Policy Statements:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Privacy K-12/h4_Definitions'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Privacy K-12/strong_Other Disclosures'), 'Other Disclosures')

WebUI.closeBrowser()

