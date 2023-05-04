import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.openqa.selenium.Keys as Keys


class PolicyDemo {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User Login to DC application using username (.*) and password (.*)")
	def User_Login_to_DC_application(String username, String password) {

		//		WebUI.callTestCase(findTestCase('BDD Test Modules/LoginToDCPolicy'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.openBrowser('')

		println(GlobalVariable.URL)

		WebUI.navigateToUrl(GlobalVariable.URL)

		WebUI.maximizeWindow()

		WebUI.setText(findTestObject('Object Repository/Login/Page_Duck Creek Technologies/input_Username__username'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Duck Creek Technologies/input_Password__password'),password)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Login/Page_Duck Creek Technologies/a_Login'))

	}

	@And("User clicks on New Quote and select the quote for product (.*)")
	def User_clicks_on_New_Quote_and_select_the_quote_for_product(String product) {
		WebUI.waitForElementVisible(findTestObject('NewQuote_Page/Page_Duck Creek Policy/span_Home'), GlobalVariable.ExplicitWait)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/NewQuote_Page/Page_Duck Creek Policy/span_New Quote'))

		WebUI.waitForElementVisible(findTestObject('NewQuote_Page/Page_Duck Creek Policy/input__f_r3DD2E6831B214154B14D61FA4853FA075_f0e583'),
				GlobalVariable.ExplicitWait)

		WebUI.enhancedClick(findTestObject('Object Repository/NewQuote_Page/Page_Duck Creek Policy/input__f_r3DD2E6831B214154B14D61FA4853FA075_f0e583'))

		WebUI.sendKeys(findTestObject('NewQuote_Page/input_Product'), product)

		WebUI.sendKeys(findTestObject('NewQuote_Page/input_Product'), Keys.chord(Keys.TAB))

		WebUI.waitForElementClickable(findTestObject('NewQuote_Page/Page_Duck Creek Policy/span_Start'), GlobalVariable.ExplicitWait)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/NewQuote_Page/Page_Duck Creek Policy/span_Start'))
	}

	@When("User fills the applicant info with basic details - firstname (.*) lastname (.*) email (.*) address (.*) city (.*)")
	def User_fills_the_applicant_info_with_basic_details(String firstname,String lastname,String email, String address, String city) {
		WebUI.waitForElementVisible(findTestObject('ApplicantInfo/Page_Duck Creek Policy/input__firstName'), GlobalVariable.ExplicitWait)

		WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input__firstName'), firstname)

		WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input__lastName'), lastname)

		WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input_emailAddress'), email)

		WebUI.click(findTestObject('ApplicantInfo/Page_Duck Creek Policy/input_DOB'))

		WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input_DOB'), "01121991")

		WebUI.setText(findTestObject('ApplicantInfo/Page_Duck Creek Policy/input_Address1'), address)

		WebUI.setText(findTestObject('ApplicantInfo/Page_Duck Creek Policy/input_City'), city)

		WebUI.setText(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/input__postalCode'), "120021")

		WebUI.takeFullPageScreenshot()

		WebUI.scrollToElement(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/a_Next'))

		WebUI.waitForElementClickable(findTestObject('Object Repository/ApplicantInfo/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

		WebUI.delay(3)
	}

	@And("User fills Policy term and Driver Details with Maritial Status (.*)")
	def User_fills_Policy_term_and_Driver_Details_with_Maritial_Status(String status) {
		WebUI.waitForElementPresent(findTestObject('Object Repository/DriverOR/Page_Duck Creek Policy/div_Policy Term'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('Object Repository/DriverOR/Page_Duck Creek Policy/a_Next'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/DriverOR/Page_Duck Creek Policy/div_Driver(s)'), GlobalVariable.ExplicitWait)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/DriverOR/Page_Duck Creek Policy/radio_GenderM'))

		WebUI.clearText(findTestObject('Object Repository/DriverOR/Page_Duck Creek Policy/input_MaritalStatus'))

		WebUI.sendKeys(findTestObject('DriverOR/Page_Duck Creek Policy/input_MaritalStatus'), status)

		WebUI.takeFullPageScreenshot()

		WebUI.scrollToElement(findTestObject('DriverOR/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('Object Repository/DriverOR/Page_Duck Creek Policy/a_Next'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/DriverOR/Page_Duck Creek Policy/div_Driver History'), GlobalVariable.ExplicitWait)

		WebUI.scrollToElement(findTestObject('DriverOR/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('Object Repository/DriverOR/Page_Duck Creek Policy/a_Next'))
	}

	@And("User fills the Vehicle Details (.*) (.*) (.*) (.*) and Hit Next Button")
	def User_fills_the_Vehicle_Details_and_Hit_Next_Button(String modelYear,String make, String model,String financed) {
		WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input__modelYear'), modelYear)

		WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input__make'), make)

		WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input__model'), model)

		WebUI.setText(findTestObject('RiskSchedule/Page_Duck Creek Policy/input__description'), 'FLEX SEL, UTL4X24D, 3.5L, 6Cyl, R [31,23,38]')

		WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input_kilometer'), '1000')

		WebUI.setText(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/input_financed'), financed)

		WebUI.takeFullPageScreenshot()

		WebUI.scrollToElement(findTestObject('RiskSchedule/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/a_Next'))

		WebUI.waitForElementVisible(findTestObject('RiskSchedule/Page_Duck Creek Policy/header_DriverInfo'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/a_Next'))

		WebUI.waitForElementVisible(findTestObject('RiskSchedule/header_coveragePackage'), GlobalVariable.ExplicitWait)

		WebUI.scrollToElement(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/a_Next'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('Object Repository/RiskSchedule/Page_Duck Creek Policy/a_Next'))
	}

	@Then("Users Bind the quote using payment method and get the Policy Number")
	def Users_Bind_the_quote_and_get_the_Policy_Number() {
		WebUI.waitForElementVisible(findTestObject('Pricing/Header_Pricing'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('RiskSchedule/Page_Duck Creek Policy/a_Next'))

		WebUI.waitForElementClickable(findTestObject('Pricing/input_CollectionMethod'), GlobalVariable.ExplicitWait)

		WebUI.setText(findTestObject('Pricing/input_CollectionMethod'), "Paper")

		WebUI.delay(2)

		WebUI.setText(findTestObject('Pricing/input_PaymentPlan'), "Full Pay (STD)")

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('RiskSchedule/Page_Duck Creek Policy/a_Next'))

		WebUI.waitForElementVisible(findTestObject('Pricing/Header_InstallmentSchedule'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('button_completeApplication'))

		WebUI.waitForElementClickable(findTestObject('button_Bind'), GlobalVariable.ExplicitWait)

		WebUI.scrollToElement(findTestObject('button_Bind'), GlobalVariable.ExplicitWait)

		WebUI.click(findTestObject('button_Bind'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForElementVisible(findTestObject('label_policyNumber'), GlobalVariable.ExplicitWait)

		String PolicyNumber = WebUI.getText(findTestObject('label_policyNumber'))

		println(PolicyNumber)

		WebUI.takeFullPageScreenshot()
	}
}