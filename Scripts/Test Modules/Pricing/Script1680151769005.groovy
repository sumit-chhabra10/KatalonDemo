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

WebUI.waitForElementVisible(findTestObject('Pricing/Header_Pricing'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('RiskSchedule/Page_Duck Creek Policy/a_Next'))

WebUI.waitForElementClickable(findTestObject('Pricing/input_CollectionMethod'), GlobalVariable.ExplicitWait)

WebUI.setText(findTestObject('Pricing/input_CollectionMethod'), CollectionMethod)

WebUI.setText(findTestObject('Pricing/input_PaymentPlan'), PaymentPlan)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('RiskSchedule/Page_Duck Creek Policy/a_Next'))

WebUI.waitForElementVisible(findTestObject('Pricing/Header_InstallmentSchedule'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('button_completeApplication'))

WebUI.waitForElementClickable(findTestObject('button_Bind'), GlobalVariable.ExplicitWait)

WebUI.scrollToElement(findTestObject('button_Bind'), GlobalVariable.ExplicitWait)

WebUI.click(findTestObject('button_Bind'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('label_policyNumber'), GlobalVariable.ExplicitWait)

PolicyNumber = WebUI.getText(findTestObject('label_policyNumber'))

println(PolicyNumber)

WebUI.takeFullPageScreenshot()

