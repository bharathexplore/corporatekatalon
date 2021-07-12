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

WebUI.click(findTestObject('Page_Contact/button_Accept'))

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/SocialMedia/Page_Webcasts  Presentations/a_Facebook            Facebook'), 
    'http://www.facebook.com/CengageLearningCorporate')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/SocialMedia/Page_Webcasts  Presentations/a_Youtube            YouTube'), 
    'http://www.youtube.com/user/CengageLearningCorp?feature=watch')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/SocialMedia/Page_Webcasts  Presentations/a_Twitter            twitter'), 
    'http://twitter.com/#!/CengageLearning')

//CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/SocialMedia/Page_Webcasts  Presentations/a_Pintrest            Pintrest'), 
// 'http://pinterest.com/cengagelearning')
CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/SocialMedia/Page_Webcasts  Presentations/a_linkedin            linkedIn'), 
    'http://www.linkedin.com/company/cengage-learning')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/SocialMedia/Page_Webcasts  Presentations/a_glassdoor            Glassdoor'), 
    'http://www.glassdoor.com/Overview/Working-at-Cengage-Learning-EI_IE20055.11,27.htm')

//CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/SocialMedia/Page_Webcasts  Presentations/a_RSS News Feed            RSS News Feed'), 
//'http://news.cengage.com/feed/')
CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/SocialMedia/Page_Webcasts  Presentations/a_Instagram            Instagram'), 
    'http://instagram.com/cengagelearning')

WebUI.closeBrowser()

