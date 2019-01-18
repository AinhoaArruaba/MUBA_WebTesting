import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-34-195-236-81.compute-1.amazonaws.com:8081/MUBA/')

WebUI.setText(findTestObject('Page_Home/input_Log in_username'), 'asdf')

WebUI.setText(findTestObject('Page_Home/input_Log in_password'), 'asdf')

WebUI.click(findTestObject('Page_Home/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_Home/button_Log out'), 0)

WebDriver myDriver = DriverFactory.getWebDriver()

ArrayList<WebElement> alert = myDriver.findElements(By.className("alert-danger"))

if(alert == null){
	KeywordUtil.markWarning("Test failed")
}else{
	KeywordUtil.markPassed("Login wasn't archived")
}
WebUI.closeBrowser()