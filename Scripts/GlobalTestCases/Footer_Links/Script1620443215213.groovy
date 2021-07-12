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

//WebUI.callTestCase(findTestCase('Reusable_Methods/Set Cookie'), [('Page') : '', ('Base') : GlobalVariable.Base], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Home)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Contact/button_Accept'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/h3_ABOUT'), 'ABOUT')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_About Cengage'), 'About Cengage')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_About Cengage'), 'about')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Leadership'), 'Leadership')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Leadership'), 'about/leadership')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Employee Experience'), 'Employee Experience')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Employee Experience'), 
    'about/employee-experience')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Education for Employment'), 'Education for Employment')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Education for Employment'), 
    'about/education-for-employment')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Inclusion  Diversity'), 'Inclusion & Diversity')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Inclusion  Diversity'), 
    'about/inclusion-and-diversity')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Our Brands'), 'Our Brands')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Our Brands'), 'about/our-brands')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/h3_NEWS'), 'NEWS')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_News Overview'), 'News Overview')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_News Overview'), 'news')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Press Releases'), 'Press Releases')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Press Releases'), 'news/press-releases')

WebUI.verifyElementText(findTestObject('Footer/Page_Homepage/Page_HOME PAGE hello - Cengage Corporate/a_Media Resources'), 
    'Media Resources')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/Page_HOME PAGE hello - Cengage Corporate/a_Media Resources'), 
    'news/media-resources')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_In the News'), 'In the News')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_In the News'), 'news/in-the-news')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Awards'), 'Awards')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Awards'), 'news/awards')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Perspectives'), 'Perspectives')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Perspectives'), 'news/perspectives')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/h3_INVESTORS'), 'INVESTORS')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Investors Overview'), 'Investors Overview')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Investors Overview'), 'investors')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Presentations'), 'Presentations')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Presentations'), 'investors/webcasts-presentations')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Call Replays'), 'Call Replays')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Call Replays'), 'investors/call-replays')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Current Reports'), 'Current Reports')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Current Reports'), 'investors/current-reports')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Annual Reports'), 'Quarterly & Annual Reports')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Annual Reports'), 'investors/quarterly-annual-reports')

/*WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Announcements'), 'Announcements')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Announcements'), 'investors/announcements')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Shareholder Info'), 'Shareholder Info')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Shareholder Info'), 'investors/shareholder-info') */
WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/h3_CAREERS'), 'CAREERS')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Careers Overview'), 'Careers Overview')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Careers Overview'), 'careers')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_FAQs'), 'FAQs')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_FAQs'), 'careers/careers-faq')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Search Jobs'), 'Search Jobs')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Search Jobs'), 'careers')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/h3_LEGAL'), 'LEGAL')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Accessibility'), 'Accessibility')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Accessibility'), 'accessibility')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Permissions'), 'Rights and Permissions')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Permissions'), 'permissions')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Privacy'), 'Privacy')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Privacy'), 'privacy')

WebUI.verifyElementText(findTestObject('Footer/Page_Homepage/a_Piracy'), 'Piracy')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Piracy'), 'piracy')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Terms of Use'), 'Terms of Use')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Terms of Use'), 'legal')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Do Not Sell'), 'Do Not Sell')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/Page_Homepage/a_Do Not Sell'), 'https://info.cengage.com/LP=5633')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/h3_CONTACT US'), 'CONTACT US')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Contact Overview'), 'Contact Overview')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Contact Overview'), 'contact')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Support'), 'Support')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Footer/Page_Homepage/a_Support'), 'https://support.cengage.com/')

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Homepage/a_Locations'), 'Locations')

CustomKeywords.'general.Corporatesite.verifyabsolutepath'(findTestObject('Footer/Page_Homepage/a_Locations'), 'contact/locations')

WebUI.closeBrowser()

