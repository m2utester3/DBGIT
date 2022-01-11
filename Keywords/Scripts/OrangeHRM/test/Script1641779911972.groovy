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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dbmosaj-trials73.orangehrmlive.com/auth/login')

for (def row = 1; row <= findTestData('HRMcredentials/idPWD').getRowNumbers(); row++) {
    WebUI.setText(findTestObject('Object Repository/OrangeHRM-login/Page_OrangeHRM/input_Login_txtUsername'), findTestData(
            'HRMcredentials/idPWD').getValue('UserID', row))

    WebUI.setText(findTestObject('Object Repository/OrangeHRM-login/Page_OrangeHRM/input_Login_txtPassword'), findTestData(
            'HRMcredentials/idPWD').getValue('Password', row))

    WebUI.click(findTestObject('Object Repository/OrangeHRM-login/Page_OrangeHRM/button_Login'))

   
    header = WebUI.getText(findTestObject('Object Repository/OrangeHRM-login/Page_Dashboard/li_Dashboard'), FailureHandling.CONTINUE_ON_FAILURE)

	if (WebUI.verifyEqual(header, homeHeader)) {
	
	
    //WebUI.verifyEqual(header, homeHeader)

    WebUI.click(findTestObject('Object Repository/OrangeHRM-login/Page_Dashboard/i_keyboard_arrow_down'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/OrangeHRM-login/Page_Dashboard/a_Logout'))

    not_run: WebUI.closeBrowser()
	}
	else {
		WebUI.navigateToUrl('https://www.dreamstime.com/simple-good-bye-im-simple-good-bye-image-image179807674')
	}
}

