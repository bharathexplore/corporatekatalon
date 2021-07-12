import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Region_Cookie)

WebUI.click(findTestObject('Object Repository/Page_Cengage Admin Tools/button_Go To US Site'))

WebUI.navigateToUrl(GlobalVariable.Home + Page)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

def sourcecode = driver.getPageSource()

if (sourcecode.contains('GTM-MRSTRZ3')) {
	
	
    print('PASS:GTM-MRSTRZ3 is found ')
	return 1 ;
} else {

    print('fail:GTM-MRSTRZ3 is not found')
	return 0 ;
}

if (sourcecode.contains('<script>(function(w,d,s,l,i)')) {
    print('<script>(function(w,d,s,l,i): Exists')
	return 1 ;
} else {
    print('fail:<script>(function(w,d,s,l,i) doesnot exist')
	return 0 ;
}

if (sourcecode.contains('<iframe src="https://www.googletagmanager.com/ns.html?id=GTM-MRSTRZ3"')) {
    print('src=https://www.googletagmanager.com/ns.html?id=GTM-5ZZ9XQ9 : Exists')
	
	return 1 ;
} else {
    print('fail:<noscript><iframe src=https://www.googletagmanager.com/ns.html?id=GTM-5ZZ9XQ9 doesnot exist')
	return 0 ;
}

WebUI.closeBrowser()

