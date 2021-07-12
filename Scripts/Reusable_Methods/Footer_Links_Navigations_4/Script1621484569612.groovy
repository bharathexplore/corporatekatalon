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

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_About Cengage'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_About Cengage/h3_About Us'), 'About Us')

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Leadership'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Leadership/h2_Leadership'), 'Leadership')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Leadership/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Employee Experience'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Employee Experience/h2_Employee Experience'), 'Employee Experience')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Employee Experience/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Education for Employment'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Education for Employment/h2_Education for Employment'), 
    'Education for Employment')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Education for Employment/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Inclusion  Diversity'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Inclusion  Diversity/h2_Our Commitment'), 'Our Commitment')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Inclusion  Diversity/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/footer_Cengage                            C_7b3ac7'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Our Brands'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Our Brands/h2_Our Brands'), 'Our Brands')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Our Brands/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_News Overview'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_News/h2_News'), 'News')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_News/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Press Releases'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Press Releases/span_Press Releases'), 'Press Releases')

WebUI.takeFullPageScreenshot()

WebUI.doubleClick(findTestObject('Object Repository/Footer/Page_Homepage/div'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_In the News'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_In the News/span_In the News'), 'In the News')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_In the News/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Awards'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Awards/span_Awards'), 'Awards')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Awards/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Perspectives'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Perspectives/span_Perspectives'), 'Perspectives')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Perspectives/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Investors Overview'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Investors/h2_Investors'), 'Investors')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Investors/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Presentations'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_/h3_Webcasts  Presentations'), 'Webcasts & Presentations')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Call Replays'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_/h3_Call Replays'), 'Call Replays')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Current Reports'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_/h3_Current Reports'), 'Current Reports')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Annual Reports'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_/h3_Quarterly  Annual Reports'), 'Quarterly & Annual Reports')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Announcements'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_/h3_Announcements'), 'Announcements')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Shareholder Info'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Shareholder Info/h2_Shareholder Info'), 'Shareholder Info')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Shareholder Info/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Careers Overview'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Careers/h2_Careers'), 'Careers')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Careers/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_FAQs'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Careers FAQ/h2_Frequently Asked Questions'), 'Frequently Asked Questions')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Careers FAQ/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Search Jobs'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Careers/h2_Careers'), 'Careers')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Careers/li_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Accessibility'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Accessibility/h2_Accessibility'), 'Accessibility')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Accessibility/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Permissions'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Rights  Permissions/h2_Rights and Permissions'), 'Rights and Permissions')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Rights  Permissions/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Privacy'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Privacy Overview/h2_Cengage Privacy Overview'), 'Cengage Privacy Overview')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Privacy Overview/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Piracy'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Piracy/h2_Piracy'), 'Piracy')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Piracy/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Terms of Use'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Terms of Use/h2_Terms of Use'), 'Terms of Use')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Terms of Use/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Contact Overview'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Contact/h2_Contact'), 'Contact')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Contact/a_Home'))

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Locations'))

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Locations/h2_Locations'), 'Locations')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Footer/Page_Locations/a_Home'))

WebUI.switchToWindowTitle('Homepage')

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Do Not Sell'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Important Information for California R_be5079/h1_Important Information for California Residents'), 
    'Important Information for California Residents')

WebUI.switchToWindowTitle('Homepage')

WebUI.click(findTestObject('Object Repository/Footer/Page_Homepage/a_Support'))

WebUI.switchToWindowIndex(2)

WebUI.verifyElementText(findTestObject('Object Repository/Footer/Page_Login/h1_How can we help you'), 'How can we help you?')

