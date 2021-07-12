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

WebUI.navigateToUrl('https://int-www.cengage.com/regioncookie/')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Cengage Admin Tools/button_Go To US Site'))

WebUI.navigateToUrl(GlobalVariable.Home)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Our Brands/button_ABOUT'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Our Brands/a_About Cengage'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_About Cengage/h3_About Us'), 'About Us')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_About Cengage/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Our Brands/button_ABOUT'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Leadership'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Leadership/h2_Leadership'), 'Leadership')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Leadership/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_ABOUT'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Employee Experience'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Employee Experience/h2_Employee Experience'), 
    'Employee Experience')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Employee Experience/button_ABOUT'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Employee Experience/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_ABOUT'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Education for Employment'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Education for Employment/h2_Education for Employment'), 
    'Education for Employment')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Education for Employment/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_ABOUT'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Inclusion  Diversity'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Inclusion  Diversity/h2_Our Commitment'), 
    'Our Commitment')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Inclusion  Diversity/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_ABOUT'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Our Brands'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Our Brands/h2_Our Brands'), 'Our Brands')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Inclusion  Diversity/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Our Brands/button_NEWS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Our Brands/a_News Overview'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_News/h2_News'), 'News')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_News/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_NEWS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Media Resources'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Media Resources/h2_Media Resources'), 'Media Resources')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Media Resources/button_NEWS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Media Resources/a_Press Releases'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Press Releases/span_Press Releases'), 'Press Releases')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Press Releases/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_NEWS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_In the News'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_In the News/span_In the News'), 'In the News')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_In the News/button_NEWS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_In the News/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_NEWS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Perspectives'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Perspectives/span_Perspectives'), 'Perspectives')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Perspectives/button_NEWS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Perspectives/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_NEWS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Awards'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Awards/span_Awards'), 'Awards')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Awards/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_INVESTORS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Investor Overview'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Investors/h2_Investors'), 'Investors')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Investors/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_INVESTORS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Presentations'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_/h3_Webcasts  Presentations'), 'Webcasts & Presentations')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_INVESTORS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Call Replays'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_/h3_Call Replays'), 'Call Replays')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_INVESTORS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Current Reports'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_/h3_Current Reports'), 'Current Reports')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_INVESTORS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Annual Reports'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_/h3_Quarterly  Annual Reports'), 'Quarterly & Annual Reports')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_INVESTORS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Announcements'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_/h3_Announcements'), 'Announcements')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_INVESTORS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Shareholder Info'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Shareholder Info/h2_Shareholder Info'), 'Shareholder Info')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Shareholder Info/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_CAREERS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Careers Overview'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Careers/h2_Careers'), 'Careers')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Careers/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_CAREERS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Careers FAQ'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Careers FAQ/h2_Frequently Asked Questions'), 
    'Frequently Asked Questions')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Careers FAQ/a_Home'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_CAREERS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/button_CAREERS'))

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Homepage/a_Search Jobs'))

WebUI.verifyElementText(findTestObject('Object Repository/Site_Navigation/Page_Careers/h2_Careers'), 'Careers')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Careers/a_Home'))

