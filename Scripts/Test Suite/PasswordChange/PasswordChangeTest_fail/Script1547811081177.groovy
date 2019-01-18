import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-34-195-236-81.compute-1.amazonaws.com:8081/MUBA/')

WebUI.setText(findTestObject('Page_Home/input_Log in_username'), 'ainhoa')

WebUI.setText(findTestObject('Page_Home/input_Log in_password'), '1234')

WebUI.click(findTestObject('Page_Home/button_Log in'))

WebUI.click(findTestObject('Page_Home/a_Account'))

WebUI.setText(findTestObject('Page_Account/input_Edit password_oldPass'), '1234')

WebUI.setText(findTestObject('Page_Account/input_Edit password_newPass'), '1234')

WebUI.setText(findTestObject('Page_Account/input_Edit password_reNewPass'), '123432')

WebUI.click(findTestObject('Page_Account/button_Save'))

WebDriver myDriver = DriverFactory.getWebDriver()

ArrayList<WebElement> alert = myDriver.findElements(By.className("alert-danger"))

if(alert.size() == 0){
	KeywordUtil.markFailed("Test failed")
}else{
	KeywordUtil.markPassed("Password change wasn't archived")
}

WebUI.closeBrowser()