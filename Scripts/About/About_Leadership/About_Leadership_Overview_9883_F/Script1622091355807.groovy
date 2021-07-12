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

WebUI.maximizeWindow()

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Contact/button_Accept'))

WebUI.navigateToUrl(GlobalVariable.About_Leadership)

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/h2_Leadership'), 'Leadership')

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Leadership_c-media-block_img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Read Bio_c-media-block_img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Read Bio_c-media-block_img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Read Bio_c-media-block_img_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/h3_Michael E. Hansen'), 'Michael E. Hansen')

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/div_Chief Executive Officer'))

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/div_Chief Executive Officer'), 
    'Chief Executive Officer')

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/a_Read Bio'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Read Bio_c-media-block_img'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/h3_Fernando Bleichmar'), 'Fernando Bleichmar')

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/div_General Manager, Higher Education and Skills'), 
    'Executive Vice President and General Manager of U.S. Higher Education')

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/a_Read Bio_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Read Bio_c-media-block_img_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/h3_Alexander Broich'), 'Alexander Broich')

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/div_President of Cengage Global Businesses'), 
    'President of Cengage Global Business, General Manager for English Language Teaching')

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/a_Read Bio_1_2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Read Bio_c-media-block_img_1_2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/h3_Kermit Cook'), 'Kermit Cook')

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/div_Chief Operating Officer'), 
    'Chief Operating Officer')

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/a_Read Bio_1_2_3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Read Bio_c-media-block_img_1_2_3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/h3_George Moore'), 'George Moore')

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/div_Chief Technology Officer'), 
    'Chief Technology Officer')

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/a_Read Bio_1_2_3_4'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Read Bio_c-media-block_img_1_2_3_4'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/h3_Bob Munro'), 'Bob Munro')

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/div_Chief Financial Officer'), 
    'Chief Financial Officer')

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/a_Read Bio_1_2_3_4_5'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/img_Read Bio_c-media-block_img_1_2_3_4_5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/h3_Laura Stevens'), 'Laura Stevens')

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/div_Chief Legal Officer'), 'Executive Vice President and General Counsel')

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/a_Read Bio_1_2_3_4_5_6'), 
    0)

WebUI.closeBrowser()

