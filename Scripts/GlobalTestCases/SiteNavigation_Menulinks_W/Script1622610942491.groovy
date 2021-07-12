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

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Cengage Corporate/button_ABOUT'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Cengage Corporate/a_About Cengage'), 'About Cengage')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Cengage Corporate/a_About Cengage'), 
    'about')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_About Cengage/button_ABOUT'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_About Cengage/a_Leadership'), 'Leadership')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_About Cengage/a_Leadership'), 
    'about/leadership')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Leadership/button_ABOUT'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Homepage/a_Employee Experience'), 'Employee Experience')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_Employee Experience'), 
    'about/employee-experience')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Employee Experience/button_ABOUT'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Employee Experience/a_Education for Employment'), 'Education for Employment')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Employee Experience/a_Education for Employment'), 
    'about/education-for-employment')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Education for Employment/button_ABOUT'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Education for Employment/a_Inclusion  Diversity'), 'Inclusion & Diversity')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Education for Employment/a_Inclusion  Diversity'), 
    'about/inclusion-and-diversity')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Inclusion  Diversity/button_ABOUT'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Homepage/a_Our Brands'), 'Our Brands')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_Our Brands'), 
    'about/our-brands')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Our Brands/button_NEWS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Homepage/a_News Overview'), 'News Overview')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_News Overview'), 
    'news')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_News/button_NEWS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Homepage/a_Media Resources'), 'Media Resources')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_Media Resources'), 
    'news/media-resources')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Media Resources/button_NEWS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Homepage/a_Press Releases'), 'Press Releases')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_Press Releases'), 
    'news/press-releases')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_/button_NEWS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_/a_In the News'), 'In the News')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_/a_In the News'), 'news/in-the-news')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_/button_NEWS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_/a_Perspectives'), 'Perspectives')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_/a_Perspectives'), 'news/perspectives')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_/button_NEWS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_/a_Awards'), 'Awards')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_/a_Awards'), 'news/awards')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_/button_INVESTORS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Homepage/a_Investor Overview'), 'Investor Overview')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_Investor Overview'), 
    'investors')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Investors/button_INVESTORS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Homepage/a_Presentations'), 'Presentations')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_Presentations'), 
    'investors/webcasts-presentations')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Webcasts  Presentations/button_INVESTORS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Homepage/a_Call Replays'), 'Call Replays')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_Call Replays'), 
    'investors/call-replays')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Call Replays/button_INVESTORS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Call Replays/a_Current Reports'), 'Current Reports')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Call Replays/a_Current Reports'), 
    'investors/current-reports')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Current Reports/button_INVESTORS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Current Reports/a_Annual Reports'), 'Quarterly & Annual Reports')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Current Reports/a_Annual Reports'), 
    'investors/quarterly-annual-reports')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Quarterly  Annual Reports/button_INVESTORS'))

/*WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Homepage/a_Announcements'), 'Announcements')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_Announcements'), 
    'investors/announcements')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Announcements/button_INVESTORS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Announcements/a_Shareholder Info'), 'Shareholder Info')
CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Announcements/a_Shareholder Info'), 
    'investors/shareholder-info') */
WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Shareholder Info/button_CAREERS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Shareholder Info/a_Careers Overview'), 'Careers Overview')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Homepage/a_Careers Overview'), 
    'careers')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Careers FAQ/button_CAREERS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Careers/a_Careers FAQ'), 'FAQs')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Careers/a_Careers FAQ'), 
    'careers/careers-faq')

WebUI.click(findTestObject('Object Repository/Site_Navigation/Page_Careers FAQ/button_CAREERS'))

WebUI.verifyElementText(findTestObject('Site_Navigation/Page_Careers FAQ/a_Search Jobs'), 'Search Jobs')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Site_Navigation/Page_Careers FAQ/a_Search Jobs'), 
    'careers')

WebUI.closeBrowser()

