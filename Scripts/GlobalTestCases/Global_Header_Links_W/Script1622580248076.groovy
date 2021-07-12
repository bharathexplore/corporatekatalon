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

WebUI.navigateToUrl(GlobalVariable.Home)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Page_Homepage/button_Contact Us'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Homepage/button_Contact Us'), 5)

WebUI.verifyElementText(findTestObject('Page_Homepage/button_Contact Us'), 'Contact Us')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'), 'Student/Educators')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Homepage/h3_Cengage Contact Us'), 0)

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_Contact Us'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/a_Contact Overview'), 'Contact Overview')

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_Contact Us'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/a_Locations'), 'Locations')

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/h3_Cengage StudentEducators'), 'Cengage Student/Educators')

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/a_ed2go (1)'), 'ed2go')

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/a_Gale (1)'), 'Gale')

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/a_Higher Ed (International) (1)'), 'Higher Ed (International)')

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/a_Higher Ed (U.S.) (1)'), 'Higher Ed (U.S.)')

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/a_Milady (1)'), 'Milady')

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/a_National Geographic Learning - K12 (1)'), 'National Geographic Learning - K12')

WebUI.click(findTestObject('Object Repository/Page_Homepage/button_StudentEducators'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Homepage/a_National Geographic Learning - ELT (1)'), 'National Geographic Learning - ELT')

WebUI.closeBrowser()

