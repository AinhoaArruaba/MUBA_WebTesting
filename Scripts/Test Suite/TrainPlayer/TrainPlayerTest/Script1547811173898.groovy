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

WebUI.setEncryptedText(findTestObject('Page_Home/input_Log in_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Page_Home/button_Log in'))

WebUI.click(findTestObject('Page_Home/a_Team'))

WebUI.click(findTestObject('Page_Team/button_Train'))

WebUI.click(findTestObject('Object Repository/Page_PlayerTrain/button_Train for900000'))

WebDriver myDriver = DriverFactory.getWebDriver()

ArrayList<WebElement> alert = myDriver.findElements(By.className("alert-success"))

if(alert.size() == 0){
	KeywordUtil.markFailed("Test failed")
}else{
	KeywordUtil.markPassed("Trainig success")
}

WebUI.click(findTestObject('Object Repository/Page_PlayerTrain/button_Train for850000'))

alert = myDriver.findElements(By.className("alert-success"))

if(alert.size() == 0){
	KeywordUtil.markFailed("Test failed")
}else{
	KeywordUtil.markPassed("Trainig success")
}

WebUI.click(findTestObject('Object Repository/Page_PlayerTrain/button_Train for710000'))

alert = myDriver.findElements(By.className("alert-success"))

if(alert.size() == 0){
	KeywordUtil.markFailed("Test failed")
}else{
	KeywordUtil.markPassed("Trainig success")
}

WebUI.click(findTestObject('Object Repository/Page_PlayerTrain/button_Train for820000'))

alert = myDriver.findElements(By.className("alert-success"))

if(alert.size() == 0){
	KeywordUtil.markFailed("Test failed")
}else{
	KeywordUtil.markPassed("Trainig success")
}

WebUI.click(findTestObject('Object Repository/Page_PlayerTrain/button_Train for870000'))

alert = myDriver.findElements(By.className("alert-success"))

if(alert.size() == 0){
	KeywordUtil.markFailed("Test failed")
}else{
	KeywordUtil.markPassed("Trainig success")
}

WebUI.closeBrowser()

