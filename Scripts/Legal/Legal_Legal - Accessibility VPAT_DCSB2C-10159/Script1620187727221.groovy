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

WebUI.callTestCase(findTestCase('Reusable_Methods/Set Cookie'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.Legal_VPAT)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Permissions Inquiries - VPAT/span_Permissions Inquiries - VPAT'), 
    'Permissions Inquiries - VPAT')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Permissions Inquiries - VPAT/h3_Voluntary Product Accessibility Template_1991af'), 
    'Voluntary Product Accessibility Templates (VPAT)')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Permissions Inquiries - VPAT/h5_Select your products VPAT'), 
    'Select your product\'s VPAT:')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_4LTR Press'), 
    'https://p.widencdn.net/ezhopg/VPAT_4ltr.pdf')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Aplia'), 'https://p.widencdn.net/2x5rlf/VPAT_Aplia.pdf')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_CengageBrain'), 
    'https://p.widencdn.net/ej8f4q/VPAT_CengageBrain-201411')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_CengageNOWv2'), 
    'https://embed.widencdn.net/pdf/plus/cengage/in6tk8wqkk/cnowv2-voluntary-product-accessibility-template-w180000585367.pdf?u=lpaabn')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Cengage Unlimited'), 
    'http://embed.widencdn.net/pdf/plus/cengage/llf5ob1nea/cengage-unl%E2%80%A6udent-dashboard-vpat-2018-09-828689.pdf')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_CourseMate'), 
    'https://p.widencdn.net/mx51u3/VPAT_CourseMate.pdf')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Diet and Wellness Plus in MindTap'), 
    'http://embed.widencdn.net/pdf/plus/cengage/y3ec5zsad9/Diet-and-Wellness-Plus-in-MindTap-2019.08.15-VPAT-V2.3.pdf?u=nvxn01')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Ed2go Career Training Programs'), 
    'https://p.widencdn.net/ug4pc7/VPAT_Ed2Go.pdf')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Gale eBooks'), 
    'http://embed.widencdn.net/pdf/plus/cengage/839aihzjoh/Gale-eBooks-VPAT.pdf?u=nvxn01')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Gale OneFile'), 
    'http://embed.widencdn.net/pdf/plus/cengage/r0f1lxhcd5/Gale-OneFile-Products-VPAT-2_2.pdf?')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Gale Primary Sources'), 
    'https://p.widencdn.net/rtefge/Gale-Primary-Sources-VPAT')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Gale In Context Products'), 
    'http://embed.widencdn.net/pdf/plus/cengage/ozukyntokj/Gale-In-Context-Products-VPAT-2_2.pdf?')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Gale Literary Sources'), 
    'http://embed.widencdn.net/pdf/plus/cengage/bftxgm7jre/gale-literature-family-vpat-2-w180000514049.pdf?u=lpaabn')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_iLRN Quia You Book 2016'), 
    'https://p.widencdn.net/hil7hi/VPAT_ilrn.pdf')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Learning Objects, Learner Experience'), 
    'http://embed.widencdn.net/pdf/plus/cengage/fjtgfbwbae/vpat-learning-objects-learner-experience-744819.pdf?u=lpaabn')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_MindTap'), 'https://p.widencdn.net/1wduzu/mindtap-voluntary-product-accessibility-template-M180000314452')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_OWLv2'), 'https://p.widencdn.net/eqhmax/owlv2-compliance-statement-w180000370899')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_SAM 2016'), 
    'https://p.widencdn.net/q7u6eq/SAM2016_CengageVPAT.pdf')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_SAM 2019'), 
    'http://embed.widencdn.net/pdf/plus/cengage/ptob4l5e17/SAM2019-2019.08-VPAT-V2.31.pdf?u=nvxn01')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_WebAssign'), 
    'https://p.widencdn.net/d0znzn/VPAT_webassign.pdf')

CustomKeywords.'general.Corporatesite.verifylink'(findTestObject('Legal/Page_Permissions Inquiries - VPAT/a_Download the latest version of Adobe Reader'), 
    'http://get.adobe.com/reader/')

WebUI.verifyElementText(findTestObject('Object Repository/Legal/Page_Permissions Inquiries - VPAT/p_Having trouble viewing PDF documentsDownl_b39815'), 
    'Having trouble viewing PDF documents? Download the latest version of Adobe Reader.')

WebUI.closeBrowser()

