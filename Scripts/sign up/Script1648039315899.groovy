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

WebUI.openBrowser('https://www.amazon.com/')

WebUI.click(findTestObject('Amazon_page/Hello_sign_in_button'))

WebUI.click(findTestObject('Page_Amazon Registration/create_button'))

WebUI.setText(findTestObject('Page_Amazon Registration/input_email'), 'apalah@apalah.com')

WebUI.setText(findTestObject('Page_Amazon Registration/input_name'), 'apalah')

WebUI.setText(findTestObject('Page_Amazon Registration/input_password'), 'apalah')

WebUI.setText(findTestObject('Page_Amazon Registration/input_re-enter_password'), 'apalah')

WebUI.click(findTestObject('Page_Amazon Registration/continue_button'))

WebUI.verifyElementVisible(findTestObject('Page_Authentication required/Solve_puzzle_page'))

WebUI.closeBrowser()

