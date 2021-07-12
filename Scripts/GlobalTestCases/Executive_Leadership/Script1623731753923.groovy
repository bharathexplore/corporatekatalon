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

WebUI.navigateToUrl(GlobalVariable.Home)

//WebUI.navigateToUrl('https://qa-corporate.cengage.com/newszs/')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Contact/button_Accept'))

WebUI.click(findTestObject('Object Repository/Page_HOME PAGE - Homepage/button_ABOUT'))

WebUI.click(findTestObject('Object Repository/Page_HOME PAGE - Homepage/a_Leadership'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/h2_Leadership'), 'Leadership')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/h3_Michael E. Hansen'), 'Michael E. Hansen')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/div_Chief Executive Officer'), 'Chief Executive Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/h3_Fernando Bleichmar'), 'Fernando Bleichmar')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_TEST - Leadership/div_Executive Vice President and General Ma_3a76e5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/h3_Alexander Broich'), 'Alexander Broich')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/div_President of Cengage Global Business, G_53073d'), 
    'President of Cengage Global Business, General Manager for English Language Teaching')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/h3_Kermit Cook'), 'Kermit Cook')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/div_Chief Operating Officer'), 'Chief Operating Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/h3_George Moore'), 'George Moore')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/div_Chief Technology Officer'), 'Chief Technology Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/h3_Bob Munro'), 'Bob Munro')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/div_Chief Financial Officer'), 'Chief Financial Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/h3_Laura Stevens'), 'Laura Stevens')

WebUI.verifyElementText(findTestObject('Object Repository/Page_TEST - Leadership/div_Executive Vice President and General Counsel'), 
    'Executive Vice President and General Counsel')

WebUI.click(findTestObject('Object Repository/Page_TEST - Leadership/a_Read Bio'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Michael E Hansen/h2_Michael E. Hansen'), 'Michael E. Hansen')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Michael E Hansen/span_Michael E Hansen'), 'Michael E Hansen')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Michael E Hansen/p_Chief Executive Officer'), 'Chief Executive Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Michael E Hansen/h1_Michael became CEO of Cengage in Septemb_d35e60'), 
    'Michael became CEO of Cengage in September of 2012.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Michael E Hansen/div_Connect With Michael'), 'Connect With Michael')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Michael E Hansen/svg_linkedIn'), 0)

WebUI.click(findTestObject('Object Repository/Page_Michael E Hansen/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_TEST - Leadership/a_Read Bio_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Fernando Bleichmar/h2_Fernando Bleichmar'), 'Fernando Bleichmar')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Fernando Bleichmar/p_Executive Vice President and General Mana_845058'), 
    'Executive Vice President and General Manager of U.S. Higher Education')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Fernando Bleichmar/div_Connect With Fernando'), 'Connect With Fernando')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fernando Bleichmar/svg_linkedIn'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Fernando Bleichmar/span_Fernando Bleichmar'), 'Fernando Bleichmar')

WebUI.click(findTestObject('Object Repository/Page_Fernando Bleichmar/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_TEST - Leadership/a_Read Bio_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Alexander Broich/h2_Alexander Broich'), 'Alexander Broich')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Alexander Broich/p_President of Cengage Global Business, Gen_343f7f'), 
    'President of Cengage Global Business, General Manager for English Language Teaching')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Alexander Broich/div_Connect With Alexander'), 'Connect With Alexander')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Michael E Hansen/svg_linkedIn'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Alexander Broich/span_Alexander Broich'), 'Alexander Broich')

WebUI.click(findTestObject('Object Repository/Page_Alexander Broich/a_Back to Leadership'))

WebUI.waitForElementVisible(findTestObject('Legal/Page_Leadership/a_Read Bio_1_2_3'), 0)

WebUI.click(findTestObject('Object Repository/Page_TEST - Leadership/a_Read Bio_1_2_3'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kermit Cook/h2_Kermit Cook'), 'Kermit Cook')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kermit Cook/p_Chief Operating Officer'), 'Chief Operating Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kermit Cook/div_Connect With Kermit'), 'Connect With Kermit')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kermit Cook/svg_linkedIn'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kermit Cook/span_Kermit Cook'), 'Kermit Cook')

WebUI.click(findTestObject('Object Repository/Page_Kermit Cook/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_TEST - Leadership/a_Read Bio_1_2_3_4'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_George Moore/h2_George Moore'), 'George Moore')

WebUI.verifyElementText(findTestObject('Object Repository/Page_George Moore/p_Chief Technology Officer'), 'Chief Technology Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_George Moore/div_Connect With George'), 'Connect With George')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_George Moore/svg_linkedIn'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_George Moore/span_George Moore'), 'George Moore')

WebUI.click(findTestObject('Object Repository/Page_George Moore/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_TEST - Leadership/a_Read Bio_1_2_3_4_5'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Bob Munro/h2_Bob Munro'), 'Bob Munro')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Bob Munro/p_Chief Financial Officer'), 'Chief Financial Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Bob Munro/div_Connect With Bob'), 'Connect With Bob')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Michael E Hansen/svg_linkedIn'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Bob Munro/span_Bob Munro'), 'Bob Munro')

WebUI.click(findTestObject('Object Repository/Page_Bob Munro/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_TEST - Leadership/a_Read Bio_1_2_3_4_5_6'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Laura Stevens/h2_Laura Stevens'), 'Laura Stevens')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Laura Stevens/p_Executive Vice President and General Counsel'), 
    'Executive Vice President and General Counsel')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Laura Stevens/div_Connect With Laura'), 'Connect With Laura')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Laura Stevens/svg_linkedIn'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Laura Stevens/span_Laura Stevens'), 'Laura Stevens')

WebUI.click(findTestObject('Object Repository/Page_Laura Stevens/a_Back to Leadership'))

WebUI.closeBrowser()

