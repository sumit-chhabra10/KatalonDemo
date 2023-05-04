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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input__modelYear'), ModelYear)

not_run: WebUI.click(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/label_Make'))

WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input__make'), Make)

not_run: WebUI.click(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/label_Model'))

WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input__model'), Model)

not_run: WebUI.click(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/label_Description'))

WebUI.setText(findTestObject('RiskSchedule/Page_Duck Creek Policy/input__description'), 'FLEX SEL, UTL4X24D, 3.5L, 6Cyl, R [31,23,38]')

WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input_kilometer'), '1000')

WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input_financed'), Financed)

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('RiskSchedule/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/a_Next'))

WebUI.waitForElementVisible(findTestObject('RiskSchedule/Page_Duck Creek Policy/header_DriverInfo'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/a_Next'))

WebUI.waitForElementVisible(findTestObject('RiskSchedule/header_coveragePackage'), GlobalVariable.ExplicitWait)

WebUI.scrollToElement(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/a_Next'))

