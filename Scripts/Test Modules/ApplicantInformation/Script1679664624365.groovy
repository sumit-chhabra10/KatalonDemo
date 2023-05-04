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

WebUI.waitForElementVisible(findTestObject('ApplicantInfo/Page_Duck Creek Policy/input__firstName'), GlobalVariable.ExplicitWait)

WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input__firstName'), FirstName)

WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input__lastName'), LastName)

WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input_emailAddress'), Email)

WebUI.click(findTestObject('ApplicantInfo/Page_Duck Creek Policy/input_DOB'))

WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input_DOB'), DOB)

WebUI.setText(findTestObject('ApplicantInfo/Page_Duck Creek Policy/input_Address1'), '23B, Street 2')

WebUI.setText(findTestObject('ApplicantInfo/Page_Duck Creek Policy/input_City'), 'Boston')

WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input__postalCode'), Pincode)

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/a_Next'))

WebUI.waitForElementClickable(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/a_Next'))

