import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Alert
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-34-195-236-81.compute-1.amazonaws.com:8081/MUBA/')

WebUI.setText(findTestObject('Page_Home/input_Log in_username'), USERNAME)

WebUI.setText(findTestObject('Page_Home/input_Log in_password'), PASSWORD)

WebUI.click(findTestObject('Page_Home/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_Home/button_Log out'), 0)

WebDriver myDriver = DriverFactory.getWebDriver()

ArrayList<WebElement> alert = myDriver.findElements(By.className("alert-success"))

if(alert.size() == 0){
	KeywordUtil.markWarning("No login performed with database data")
}else{
	//KeywordUtil.markPassed("Login performed successfuly")
	WebUI.click(findTestObject('Object Repository/Page_Home/button_Log out'))
	alert = myDriver.findElements(By.className("alert-success"))
	if(alert.size() == 0){
		KeywordUtil.markWarning("Logout couldn't be performed")
	}else{
		KeywordUtil.markPassed("Login and logout performed correctly")
	}
}

WebUI.closeBrowser()
