import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-34-195-236-81.compute-1.amazonaws.com:8081/MUBA/')

WebUI.setText(findTestObject('Page_Home/input_Log in_username'), 'ainhoa')

WebUI.setEncryptedText(findTestObject('Page_Home/input_Log in_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Page_Home/button_Log in'))

WebUI.click(findTestObject('Page_Home/a_Team'))

WebDriver myDriver = DriverFactory.getWebDriver()

Select element_1 = new Select(myDriver.findElement(By.id("position1Id")))
Select element_2 = new Select(myDriver.findElement(By.id("position2Id")))
Select element_3 = new Select(myDriver.findElement(By.id("position3Id")))
Select element_4 = new Select(myDriver.findElement(By.id("position4Id")))
Select element_5 = new Select(myDriver.findElement(By.id("position5Id")))


element_1.selectByIndex(3)
element_2.selectByIndex(4)
element_3.selectByIndex(2)
element_4.selectByIndex(1)
element_5.selectByIndex(0)

WebUI.click(findTestObject('Page_Team/button_Save positions'))

ArrayList<WebElement> alert = myDriver.findElements(By.className("alert-success"))

if(alert.size() == 0){
	KeywordUtil.markWarning("Test failed")
}else{
	KeywordUtil.markPassed("Initial five change success")
}

WebUI.closeBrowser()