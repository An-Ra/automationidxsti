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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.click(findTestObject('Object Repository/endtoend/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/endtoend/Page_STORE/input_Username_loginusername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/endtoend/Page_STORE/input_Password_loginpassword'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/endtoend/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/endtoend/Page_STORE/a_Monitors'))

WebUI.verifyElementPresent(findTestObject('Object Repository/endtoend/Page_STORE/a_Apple monitor 24'), 0)

WebUI.click(findTestObject('Object Repository/endtoend/Page_STORE/a_Apple monitor 24'))

WebUI.rightClick(findTestObject('Object Repository/endtoend/Page_STORE/strong_Product description'))

WebUI.verifyElementText(findTestObject('Object Repository/endtoend/Page_STORE/strong_Product description'), 'Product description')

WebUI.click(findTestObject('Object Repository/endtoend/Page_STORE/a_Add to cart'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/endtoend/Page_STORE/a_Cart'))

totalPrice = WebUI.getText(findTestObject('Object Repository/endtoend/Page_STORE/h3_400'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/endtoend/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/endtoend/Page_STORE/input_Name_name'), name)

WebUI.setText(findTestObject('Object Repository/endtoend/Page_STORE/input_Country_country'), country)

WebUI.setText(findTestObject('Object Repository/endtoend/Page_STORE/input_City_city'), city)

WebUI.setText(findTestObject('Object Repository/endtoend/Page_STORE/input_Credit card_card'), creditCard)

WebUI.setText(findTestObject('Object Repository/endtoend/Page_STORE/input_Month_month'), month)

WebUI.setText(findTestObject('Object Repository/endtoend/Page_STORE/input_Year_year'), year)

WebUI.click(findTestObject('Object Repository/endtoend/Page_STORE/button_Purchase'))

WebUI.verifyElementVisible(findTestObject('Object Repository/endtoend/Page_STORE/div_Thank you for your purchase    Id 21418_20fc75'))

successMessage = WebUI.getText(findTestObject('endtoend/Page_STORE/p_Id 2141820Amount 400 USDCard Number 0003N_e1c863'))

WebUI.delay(1)

boolean containsName = successMessage.contains(name)

boolean containsAmount = successMessage.contains(totalPrice)

boolean containsCreditCard = successMessage.contains(creditCard)

//WebUI.verifyEqual(containsName, true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(containsAmount, true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(containsCreditCard, true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/endtoend/Page_STORE/button_OK'))

WebUI.closeBrowser()


