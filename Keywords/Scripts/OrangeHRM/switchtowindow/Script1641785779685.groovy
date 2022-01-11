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

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dbmosaj-trials73.orangehrmlive.com/auth/login')

WebUI.getWindowTitle()

WebUI.getWindowIndex()

WebUI.setText(findTestObject('Object Repository/OrangeHRM-login/Page_OrangeHRM/input_Login_txtUsername'), findTestData('HRMcredentials/idPWD').getValue(
        1, 1))

WebUI.setText(findTestObject('Object Repository/OrangeHRM-login/Page_OrangeHRM/input_Login_txtPassword'), findTestData('HRMcredentials/idPWD').getValue(
        2, 1))

WebUI.click(findTestObject('Object Repository/OrangeHRM-login/Page_OrangeHRM/button_Login'))

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('https://www.random.org/integers/')

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Dashboard/span_Leave'))

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Dashboard/span_Apply'))

not_run: WebUI.setText(findTestObject('OrangeHRM-login/spy/window/Page_Apply Leave/textarea_Required_comment'), '')

not_run: WebUI.click(findTestObject('OrangeHRM-login/spy/window/Page_Dashboard/span_My Shortcuts'))

not_run: WebUI.click(findTestObject('OrangeHRM-login/spy/window/Page_Dashboard/a_Buzz'))

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.getWindowIndex()

not_run: WebUI.getWindowTitle()

not_run: WebUI.switchToWindowIndex(0)

not_run: WebUI.delay(2)

not_run: WebUI.switchToWindowTitle('OrangeBuzz')

not_run: WebUI.delay(2)

not_run: WebUI.switchToWindowUrl('https://dbmosaj-trials73.orangehrmlive.com/client/#/dashboard')

