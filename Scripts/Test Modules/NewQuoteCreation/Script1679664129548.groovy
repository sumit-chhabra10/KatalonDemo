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

WebUI.waitForElementVisible(findTestObject('NewQuote_Page/Page_Duck Creek Policy/span_Home'), GlobalVariable.ExplicitWait)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/NewQuote_Page/Page_Duck Creek Policy/span_New Quote'))

WebUI.waitForElementVisible(findTestObject('NewQuote_Page/Page_Duck Creek Policy/input__f_r3DD2E6831B214154B14D61FA4853FA075_f0e583'), 
    GlobalVariable.ExplicitWait)

WebUI.enhancedClick(findTestObject('Object Repository/NewQuote_Page/Page_Duck Creek Policy/input__f_r3DD2E6831B214154B14D61FA4853FA075_f0e583'))

WebUI.sendKeys(findTestObject('NewQuote_Page/input_Product'), Product)

WebUI.sendKeys(findTestObject('NewQuote_Page/input_Product'), Keys.chord(Keys.TAB))

not_run: WebUI.click(findTestObject('Object Repository/NewQuote_Page/Page_Duck Creek Policy/li_AUS Personal Lines Motor (1.0.0.0)'))

WebUI.waitForElementClickable(findTestObject('NewQuote_Page/Page_Duck Creek Policy/span_Start'), GlobalVariable.ExplicitWait)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/NewQuote_Page/Page_Duck Creek Policy/span_Start'))

