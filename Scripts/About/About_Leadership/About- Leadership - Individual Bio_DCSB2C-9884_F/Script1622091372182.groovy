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

WebUI.navigateToUrl(GlobalVariable.About_Leadership)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Leadership/h2_Leadership'), 'Leadership')

WebUI.click(findTestObject('Object Repository/Legal/Page_Leadership/h3_Michael E. Hansen'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Leadership/h3_Michael E. Hansen'), 'Michael E. Hansen')

WebUI.click(findTestObject('Object Repository/Legal/Page_Leadership/a_Read Bio'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Michael E Hansen/h2_Michael E. Hansen'), 'Michael E. Hansen')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Michael E Hansen/p_Chief Executive Officer'), 'Chief Executive Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Michael E Hansen/h1_Michael became CEO of Cengage in Septemb_d35e60'), 
    'Michael became CEO of Cengage in September of 2012.')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Michael E Hansen/div_Connect With Michael'), 'Connect With Michael')

WebUI.verifyElementPresent(findTestObject('About_Leadership/Page_Michael E Hansen/svg_linkedIn'), 0)

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('About_Leadership/Page_Michael E Hansen/path_linkedin_Fill-7'), 
    'https://www.linkedin.com/in/michaelhansencengage')

//WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Michael E Hansen/p_Under Michaels leadership, Cengage has tr_a5ea42'), 
   // 'Michael E. Hansen became Chief Executive Officer of Cengage in September of 2012 and has been a Director of Cengage since March 2014. He leads the strategy, performance and ongoing evolution of the global business')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Michael E Hansen/span_Michael E Hansen'), 'Michael E Hansen')

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Michael E Hansen/a_Leadership'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Michael E Hansen/a_About Cengage'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Michael E Hansen/a_Home'))

WebUI.click(findTestObject('Object Repository/Legal/Page_Michael E Hansen/a_Back to Leadership'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Leadership/h3_Fernando Bleichmar'), 'Fernando Bleichmar')

WebUI.click(findTestObject('Object Repository/Legal/Page_Leadership/a_Read Bio_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/h2_Fernando Bleichmar'), 'Fernando Bleichmar')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/p_General Manager, Higher Education and Skills'), 
    'General Manager, Higher Education and Skills')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/h1_TBD'), 'TBD')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/div_Connect With Fernando'), 'Connect With Fernando')

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/svg_linkedIn'), 0)

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('About_Leadership/Page_Fernando Bleichmar/href_Fernando Bleichmar'), 
    'https://www.linkedin.com/in/fernandobleichmarcengage/')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/p_Fernando Bleichmar is General Manager of _e6bd9f'), 
    'Fernando Bleichmar is General Manager of U.S. Higher Education and Skills for Cengage. In this role, Fernando leads a cross-functional team focused on delivering affordable quality learning for students and driving the continued success of Cengage Unlimited – the industry’s first-of-its-kind subscription service for college textbooks and course materials. He also serves as an executive co-sponsor for the MOSAIC Employee Resource Group at Cengage, an employee-led group focused on empowering employees of color.')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/span_Fernando Bleichmar'), 'Fernando Bleichmar')

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/a_Leadership'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/a_About Cengage'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/a_Home'))

WebUI.click(findTestObject('Object Repository/Legal/Page_Fernando Bleichmar/a_Back to Leadership'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Leadership/h3_Alexander Broich'), 'Alexander Broich')

WebUI.click(findTestObject('Object Repository/Legal/Page_Leadership/a_Read Bio_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Alexander Broich/h2_Alexander Broich'), 'Alexander Broich')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Alexander Broich/p_President of Cengage Global Businesses'), 
    'President of Cengage Global Businesses')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Alexander Broich/h1_TBD'), 'TBD')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Alexander Broich/div_Connect With Alexander'), 'Connect With Alexander')

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Alexander Broich/svg_linkedIn'), 0)

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('About_Leadership/Page_Alexander Broich/a_href_Alaxender Broich'), 
    'https://www.linkedin.com/in/abroich/')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Alexander Broich/p_Alexander Broich is the President of Ceng_8123ab'), 
    'Alexander Broich is the President of Cengage Global Businesses for Cengage. He is responsible for the growth and development of the company’s International Higher Ed, International School, English Language Teaching and Library & Reference businesses. He also serves as an executive co-sponsor for the MOSAIC Employee Resource Group at Cengage, an employee-led group focused on empowering employees of color.')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Alexander Broich/span_Alexander Broich'), 'Alexander Broich')

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Alexander Broich/a_Leadership'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Alexander Broich/a_About Cengage'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Alexander Broich/a_Home'))

WebUI.click(findTestObject('Object Repository/Legal/Page_Alexander Broich/a_Back to Leadership'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Leadership/h3_Kermit Cook'), 0)

WebUI.click(findTestObject('Object Repository/Legal/Page_Leadership/a_Read Bio_1_2_3'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Kermit Cook/h2_Kermit Cook'), 'Kermit Cook')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Kermit Cook/p_Chief Operating Officer'), 'Chief Operating Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Kermit Cook/h1_TBD'), 'TBD')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Kermit Cook/div_Connect With Kermit'), 'Connect With Kermit')

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Kermit Cook/svg_linkedIn'), 0)

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('About_Leadership/Page_Kermit Cook/href_Kermit Cook'), 
    'https://www.linkedin.com/in/kermitjcook/')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Kermit Cook/p_Kermit Cook is Chief Operating Officer fo_62acd9'), 
    'Kermit Cook is Chief Operating Officer for Cengage. In this role, Kermit is responsible for leading critical, transformative functions and projects across the organization, including Supply Chain & Distribution, Human Resources and Cengage’s COVID-19 Planning & Response team. Kermit is also responsible for Cengage’s U.S. K-12 business.')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Kermit Cook/span_Kermit Cook'), 'Kermit Cook')

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Kermit Cook/a_Leadership'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Kermit Cook/a_About Cengage'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Kermit Cook/a_Home'))

WebUI.click(findTestObject('Object Repository/Legal/Page_Kermit Cook/a_Back to Leadership'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Leadership/h3_George Moore'), 'George Moore')

WebUI.click(findTestObject('Object Repository/Legal/Page_Leadership/a_Read Bio_1_2_3_4'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_George Moore/h2_George Moore'), 'George Moore')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_George Moore/p_Chief Technology Officer'), 'Chief Technology Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_George Moore/h1_TBD'), 'TBD')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_George Moore/div_Connect With George'), 'Connect With George')

WebUI.verifyElementPresent(findTestObject('About_Leadership/Page_George Moore/svg_linkedIn'), 0)

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('About_Leadership/Page_George Moore/href_George Moore'), 
    'https://www.linkedin.com/in/mooregeorge/')

WebUI.verifyElementText(findTestObject('Legal/Page_George Moore/p_George Moore is Chief Technology Officer _7d1437'), 'George Moore is Chief Technology Officer for Cengage. In this role, he is responsible for shaping Cengage’s long-term technology vision and driving innovation across the company. George also serves as an executive co-sponsor for the Women in Technology (WiT) Employee Resource Group at Cengage.')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_George Moore/span_George Moore'), 'George Moore')

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_George Moore/a_Leadership'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_George Moore/a_About Cengage'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_George Moore/a_Home'))

WebUI.click(findTestObject('Object Repository/Legal/Page_George Moore/a_Back to Leadership'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Leadership/h3_Bob Munro'), 'Bob Munro')

WebUI.click(findTestObject('Object Repository/Legal/Page_Leadership/a_Read Bio_1_2_3_4_5'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Bob Munro/h2_Bob Munro'), 'Bob Munro')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Bob Munro/p_Chief Financial Officer'), 'Chief Financial Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Bob Munro/h1_TBD'), 'TBD')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Bob Munro/div_Connect With Bob'), 'Connect With Bob')

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Bob Munro/svg_linkedIn'), 0)

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('About_Leadership/Page_Bob Munro/href_Bob Munro'), 'https://www.linkedin.com/in/bob-munro-7b22854/')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Bob Munro/p_Bob Munro is Chief Financial Officer for _2a43d3'), 
    'Bob Munro is Chief Financial Officer for Cengage. In this role, Bob is responsible for leading all parts of the company’s finance function, including financial planning and analysis, financial reporting, accounting and control, treasury, tax, internal audit and investor relations. Bob also serves as an executive co-sponsor for the PRIDE Employee Resource Group at Cengage, an employee-led organization representing LGBTQIA+ employees and allies.')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Bob Munro/span_Bob Munro'), 'Bob Munro')

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Bob Munro/a_Leadership'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Bob Munro/a_About Cengage'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Bob Munro/a_Home'))

WebUI.click(findTestObject('Object Repository/Legal/Page_Bob Munro/a_Back to Leadership'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Leadership/h3_Laura Stevens'), 'Laura Stevens')

WebUI.click(findTestObject('Object Repository/Legal/Page_Leadership/a_Read Bio_1_2_3_4_5_6'))

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Laura Stevens/h2_Laura Stevens'), 'Laura Stevens')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Laura Stevens/p_Chief Legal Officer'), 'Chief Legal Officer')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Laura Stevens/h1_TBD'), 'TBD')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Laura Stevens/div_Connect With Laura'), 'Connect With Laura')

WebUI.verifyElementPresent(findTestObject('Object Repository/Legal/Page_Laura Stevens/svg_linkedIn'), 0)

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('About_Leadership/Page_Laura Stevens/href_Laura Stevens'), 
    'https://www.linkedin.com/in/laura-stevens-attorney/')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Laura Stevens/p_Laura Stevens is the Chief Legal Officer _9feb3a'), 
    'Laura Stevens is the Chief Legal Officer for Cengage. In this role, she is responsible for providing legal support for Cengage\'s business operations, and she oversees the company’s Global Anti-Piracy program and Intellectual Property Acquisitions and Granting functions. Laura and her team provide legal advice, contract negotiation support, dispute management and legal operational support for Cengage\'s content licensing and acquisition activities.')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Laura Stevens/span_Laura Stevens'), 'Laura Stevens')

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Laura Stevens/a_Leadership'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Laura Stevens/a_About Cengage'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Legal/Page_Laura Stevens/a_Home'))

WebUI.click(findTestObject('Object Repository/Legal/Page_Laura Stevens/a_Back to Leadership'))

