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

WebUI.comment('Login to CURA HEALTHCARE SERVICES ')

WebUI.comment('Given that the user has the valid login information')

WebUI.verifyElementClickable(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), GlobalVariable.Username)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), GlobalVariable.Password)

WebUI.comment('When he logins to CURA system')

WebUI.verifyElementClickable(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.comment('Then he should be able to login successfully')

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Make Appointment'), 0)

WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    2)

WebUI.check(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.verifyElementChecked(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'), 
    30)

WebUI.uncheck(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.check(findTestObject('Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.delay(2)

WebUI.delay(4)

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), '31/07/2023')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment_comment'), 'HELLO DOCTOR')

WebUI.verifyElementClickable(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/h2_Appointment Confirmation'))

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/CheckpointC'), false)

