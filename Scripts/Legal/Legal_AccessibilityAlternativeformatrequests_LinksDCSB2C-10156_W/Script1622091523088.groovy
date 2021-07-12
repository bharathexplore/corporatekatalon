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

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_Association of            American Publishers'), 
    'http://www.publisherlookup.org/')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_AccessText            Network'), 
    'https://www.accesstext.org/')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_online request form'), 
    'http://permission.cengage.com/permissions/action/step1')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_National Instructional Materials Access C_996247'), 
    'http://www.nimac.us/')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_Australias            online alternate fo_a361e5'), 
    'http://cengage.com.au/corporate-home/accessibility/accessibility-form')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_AccessText            Network'), 
    'https://www.accesstext.org/')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_LearningAlly'), 
    'http://www.learningally.org/')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_American Printing                            House for the Blind'), 
    'http://www.aph.org/')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_Accessible                            Textbook Finder'), 
    'https://www.accesstext.org/accessible-textbook-finder')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_National Instructional Materials Access C_996247'), 
    'http://www.nimac.us/')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_Foxit'), 
    'https://www.foxitsoftware.com/products/pdf-reader/')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Accessibility Alternate Format Request/a_Apple Preview'), 
    'https://support.apple.com/en-us/HT201740')

