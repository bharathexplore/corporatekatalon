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

WebUI.navigateToUrl(GlobalVariable.Legal_alternate_format_requests)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/span_Accessibility Alternate Format Request'), 
    'Accessibility Alternate Format Request')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/h2_Alternate Format Requests for Students a_471f61'), 
    'Alternate Format Requests for Students and Instructors with Disabilities')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/h3_Overview'), 
    'Overview')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/h3_Alternate Format Requests'), 
    'Alternate Format Requests')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/h3_Frequently Asked Questions'), 
    'Frequently Asked Questions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/button_When will I receive my files'), 
    0)

WebUI.click(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/button_When will I receive my files'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/p_Files requested via the ATN or Cengage sh_47a179'), 
    0)

WebUI.click(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/button_How will the files be sent to me'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/p_You may receive files by one of the follo_74eac0'), 
    'You may receive files by one of the following methods:')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Accessibility Alternate Format Request/h3_Additional Resources  Support'), 
    'Additional Resources & Support')

