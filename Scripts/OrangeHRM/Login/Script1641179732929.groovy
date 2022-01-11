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

WebUI.callTestCase(findTestCase('OrangeHRM/HRM Login only script'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.takeScreenshot()

header = WebUI.getText(findTestObject('Object Repository/OrangeHRM-login/Page_Dashboard/li_Dashboard'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(header, homeHeader)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Dashboard/span_Leave'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Dashboard/span_Apply'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/spy/Page_Apply Leave/input__select-dropdown'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/spy/Page_Apply Leave/span_Work From Home - US'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/Page_Dashboard/i_keyboard_arrow_down'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/Page_Dashboard/a_Logout'))

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Dashboard/span_My Info'))

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/i_date_range'))

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/input__select-dropdown'))

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/span_1996'))

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/div_20'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/h4_Health'), 
    0)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/label_Yes'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/label_Gluten-Free'))

not_run: WebUI.closeBrowser()

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/span_Attachments'))

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/a_Add'))

not_run: WebUI.uploadFile(findTestObject('OrangeHRM-login/spy/Page_Personal Details/input_(Accepts up to 5MB)_filename'), 
    'C:\\Users\\00123955\\Desktop\\Katalon Tutorials\\Slides\\Wep applications\\test123.txt')

not_run: WebUI.click(findTestObject('Object Repository/OrangeHRM-login/cal,checkbox/Page_Personal Details/button_Save'))

not_run: WebUI.closeBrowser()

