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

WebUI.click(findTestObject('Object Repository/signUpPage/Page_STORE/a_Sign up'))

long timestamp = System.currentTimeMillis()
String randomNumber = timestamp.toString().substring(7) // Ambil bagian akhir timestamp

WebUI.setText(findTestObject('Object Repository/signUpPage/Page_STORE/input_Username_sign-username'), 'andy'+randomNumber)

WebUI.setEncryptedText(findTestObject('Object Repository/signUpPage/Page_STORE/input_Password_sign-password'), 'yvDz2Q+es/0=')

WebUI.click(findTestObject('Object Repository/signUpPage/Page_STORE/button_Sign up'))

WebUI.waitForAlert(1)

alertMessage = WebUI.getAlertText()

WebUI.verifyEqual(alertMessage, 'Sign up successful.')

WebUI.closeBrowser()

