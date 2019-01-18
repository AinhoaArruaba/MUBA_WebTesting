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

WebUI.click(findTestObject('Page_Home/a_League'))

WebUI.click(findTestObject('Object Repository/Page_LeagueList/button_Not started_1'))

WebDriver myDriver = DriverFactory.getWebDriver()

ArrayList<WebElement> leagues = myDriver.findElements(By.className('leagueItem'))

initialNotStartedLeagues = leagues.size()

WebUI.click(findTestObject('Object Repository/Page_LeagueList/button_New League'))

WebUI.setText(findTestObject('Page_newLeague/input_New League_leagueName'), 'KatalonLeague')

WebUI.setText(findTestObject('Page_newLeague/input_New League_leagueDesc'), 'Katalon test league creation')

WebElement radioBtn = myDriver.findElement(By.id('8teamRadio'))

radioBtn.click()

WebUI.click(findTestObject('Page_newLeague/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_LeagueList/button_Not started_1'))

leagues = myDriver.findElements(By.className('leagueItem'))

if ((initialNotStartedLeagues + 1) != leagues.size()) {
    KeywordUtil.markFailed('Test failed')
} else {
    KeywordUtil.markPassed('New league added successfuly')
}

WebUI.closeBrowser()


