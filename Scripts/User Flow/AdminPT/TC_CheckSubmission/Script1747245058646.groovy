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

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Simikro/span_Pengajuan Konversi'))

WebUI.click(findTestObject('Page_Report - Simikro/td_Teknik Informatika'))

WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/td_Eko Prasetyo'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/a_Rincian'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Report - Simikro/h2_Rincian        Laporan Akhir'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/i_Berkas Laporan_fas fa-file-pdf'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Report - Simikro/i_Berkas Laporan_fas fa-file-pdf'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/i_Berkas Sertifikat_fas fa-file-pdf'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Report - Simikro/i_Berkas Sertifikat_fas fa-file-pdf'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/i_Berkas Dokumentasi_fas fa-file-pdf'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Report - Simikro/i_Berkas Dokumentasi_fas fa-file-pdf'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Report - Simikro/a_Back'), 0)

WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/a_Back'))

WebUI.navigateToUrl(GlobalVariable.DashboardPage_TestEnv)

