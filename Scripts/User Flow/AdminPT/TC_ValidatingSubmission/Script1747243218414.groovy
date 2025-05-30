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

WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/a_Validasi Berkas'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_report - Simikro/input_VALID_laprak'), 0)

WebUI.click(findTestObject('Object Repository/Page_report - Simikro/input_VALID_laprak'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_report - Simikro/input_VALID_sertifikat'), 0)

WebUI.click(findTestObject('Object Repository/Page_report - Simikro/input_VALID_sertifikat'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_report - Simikro/input_VALID_dokumentasi'), 0)

WebUI.click(findTestObject('Object Repository/Page_report - Simikro/input_VALID_dokumentasi'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_report - Simikro/input_NILAI REKOMENDASI PROGRAM_nilai_sertifikat'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_report - Simikro/input_NILAI REKOMENDASI PROGRAM_nilai_sertifikat'), 
    '90')

WebUI.scrollToElement(findTestObject('Object Repository/Page_report - Simikro/input_VALID_tes_mikroskill'), 0)

WebUI.click(findTestObject('Object Repository/Page_report - Simikro/input_VALID_tes_mikroskill'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_report - Simikro/input_TIDAK                                _1c4649'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_report - Simikro/input_TIDAK                                _1c4649'), 
    '90')

WebUI.scrollToElement(findTestObject('Object Repository/Page_report - Simikro/input_MAKSIMAL SKS_maks_sks'), 0)

WebUI.setText(findTestObject('Object Repository/Page_report - Simikro/input_MAKSIMAL SKS_maks_sks'), '20')

WebUI.scrollToElement(findTestObject('Object Repository/Page_report - Simikro/textarea_KOMENTAR_feedback'), 0)

WebUI.setText(findTestObject('Object Repository/Page_report - Simikro/textarea_KOMENTAR_feedback'), 'Okay')

WebUI.scrollToElement(findTestObject('Object Repository/Page_report - Simikro/button_Save'), 0)

WebUI.click(findTestObject('Object Repository/Page_report - Simikro/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Report - Simikro/span_MENUNGGU PENILAIAN'), 'MENUNGGU PENILAIAN')

WebUI.takeFullPageScreenshot()

