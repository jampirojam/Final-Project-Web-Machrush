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

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Object Repository/Create Account/Page_Kotakoki  Welcome to my Website/span_Register Now'))

WebUI.setText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Username_user_login-297'), 
    'jampirojam')

WebUI.setText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_E-mail Address_user_email-297'), 
    'jampirojam@ojam.id')

WebUI.setText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Phone Number_phone_number-297'), 
    '08987654321')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Password_user_password-297'), 
    '6EN5vQ+d8o9WHzALFComCw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Confirm Password_confirm_user_password-297'), 
    '6EN5vQ+d8o9WHzALFComCw==')

WebUI.setText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Address_Relative_adress-297'), 
    'Katalona 45, Groovy')

WebUI.click(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Only fill in if you are not human_um-_fc91b5'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/td_UsernameThe username you entered is inco_fe26ce'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.setText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Username_user_login-297'), 
        (Math.round(Math.random()) + 'randacc') + Math.round(Math.abs((((Math.round(Math.random() * 9) * Math.random()) * 
                9) + (Math.random() * 7)) - (Math.random() * 9))))

    WebUI.doubleClick(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_E-mail Address_user_email-297'))

    WebUI.setText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_E-mail Address_user_email-297'), 
        Math.abs(Math.round(Math.random() * 8) * 5 + 6) + 'rando'+ Math.abs(Math.round(Math.random() * 2) * 9 + 6) +'aa@ojam.id')

    WebUI.click(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/div_PasswordYour password must contain at l_f495ce'))

    WebUI.setEncryptedText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Password_user_password-297'), 
        'Ljp9ziZ+BWOiHHjJfV8jLg==')

    WebUI.setEncryptedText(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Confirm Password_confirm_user_password-297'), 
        'Ljp9ziZ+BWOiHHjJfV8jLg==')
}

WebUI.click(findTestObject('Object Repository/Create Account/Page_Register Now  Kotakoki/input_Only fill in if you are not human_um-_fc91b5'))