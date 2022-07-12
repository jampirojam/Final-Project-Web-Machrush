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

WebUI.click(findTestObject('Object Repository/Check Out/Page_0sirojjam15  Kotakoki/span_Shop'))

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/shop-2/')

WebUI.click(findTestObject('Object Repository/Check Out/Page_Products  Kotakoki/img_New_attachment-woocommerce_thumbnail si_3f99c3'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Album  Kotakoki/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Album  Kotakoki/span_Shop'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Products  Kotakoki/img_New_attachment-woocommerce_thumbnail si_3f99c3'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Beanie with Logo  Kotakoki/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Beanie with Logo  Kotakoki/span_Shop'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Products  Kotakoki/img_New_attachment-woocommerce_thumbnail si_3f99c3'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Cap  Kotakoki/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Cap  Kotakoki/i_Rp_thehanger-icons-shopping-bag'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Cart  Kotakoki/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/input__billing_first_name'), 'Aliy')

WebUI.setText(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/input__billing_last_name'), 'Aliy')

WebUI.setText(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/input_(optional)_billing_company'), 'Aliy Corp')

WebUI.click(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/span_Indonesia'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/div_Checkout    Have a coupon Click here to_b41672'))

WebUI.setText(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/input__billing_address_1'), 'Katalona 45, Groovy')

WebUI.setText(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/input__billing_city'), 'Groovy')

WebUI.setText(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/input__billing_address_1'), 'Katalona 45')

WebUI.setText(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/input__billing_postcode'), '6969')

WebUI.setText(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/input__billing_phone'), '089765172112')

WebUI.click(findTestObject('Object Repository/Check Out/Page_Checkout  Kotakoki/button_Place order'))

WebUI.click(findTestObject('Object Repository/Check Out/Page_Checkout woocommerce-xendit-487/button_Klik disini untuk simulasi pembayara_0d60dc'))

