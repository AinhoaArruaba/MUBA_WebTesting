import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-34-195-236-81.compute-1.amazonaws.com:8081/MUBA/')

WebUI.click(findTestObject('Page_Home/button_Register'))

WebUI.setText(findTestObject('Page_Register/input_Username_regUserInfo'), 'ainhoa_test')

WebUI.setText(findTestObject('Page_Register/input_Password_regUserInfo'), 'test')

WebUI.setText(findTestObject('Page_Register/input_Team name_regTeamName'), 'Onyarbi')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_1'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_2'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_3'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_4'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_5'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_6'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_7'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_8'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_9'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_10'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_11'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_12'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_13'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_14'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_15'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_16'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_17'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_18'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_19'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_20'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_21'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_22'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_23'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_24'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_25'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_26'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_27'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_28'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_29'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_30'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_31'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_32'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_33'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_34'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_35'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_36'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Player information_regPl_37'), 'a')

WebUI.click(findTestObject('Page_Register/button_Register'))

WebDriver myDriver = DriverFactory.getWebDriver()

ArrayList<WebElement> alert = myDriver.findElements(By.className("alert-info"))

if(alert.size() == 0){
	KeywordUtil.markFailed("Register was not completed")
}else{
	//KeywordUtil.markPassed("Login performed successfuly")
	WebUI.setText(findTestObject('Page_Home/input_Log in_username'), 'ainhoa_test')
	
	WebUI.setText(findTestObject('Page_Home/input_Log in_password'), 'test')
	
	WebUI.click(findTestObject('Page_Home/button_Log in'))
	
	alert = myDriver.findElements(By.className("alert-success"))
	if(alert.size() == 0){
		KeywordUtil.markFailed("Login with new user couldn't be performed")
	}else{
		KeywordUtil.markPassed("Login and register performed correctly")
	}
}

WebUI.closeBrowser()