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

WebUI.navigateToUrl(GlobalVariable.About_Leadership)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Leadership/a_Read Bio'))

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Michael E Hansen/h2_Michael E. Hansen'), 
    'Michael E. Hansen')

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Michael E Hansen/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Leadership/a_Read Bio_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Fernando Bleichmar/h2_Fernando Bleichmar'), 
    0)

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Fernando Bleichmar/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Leadership/a_Read Bio_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Alexander Broich/h2_Alexander Broich'), 
    'Alexander Broich')

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Alexander Broich/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Leadership/a_Read Bio_1_2_3'))

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Kermit Cook/h2_Kermit Cook'), 
    'Kermit Cook')

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Kermit Cook/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Leadership/a_Read Bio_1_2_3_4'))

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_George Moore/h2_George Moore'), 
    'George Moore')

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_George Moore/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Leadership/a_Read Bio_1_2_3_4_5'))

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Bob Munro/h2_Bob Munro'), 
    'Bob Munro')

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Bob Munro/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Leadership/a_Read Bio_1_2_3_4_5_6'))

WebUI.verifyElementText(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Laura Stevens/h2_Laura Stevens'), 
    'Laura Stevens')

WebUI.click(findTestObject('Object Repository/About_Leadership/Page_Leadership/Page_Laura Stevens/a_Back to Leadership'))

WebUI.closeBrowser()

