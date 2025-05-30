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

WebUI.click(findTestObject('Object Repository/Page_Mata Kuliah - Simikro/span_Pengajuan Konversi'))

WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/td_Eko Prasetyo'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Report - Simikro/span_MENUNGGU PENILAIAN'), 'MENUNGGU PENILAIAN')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Report - Simikro/i_Eko Prasetyo_fas fa-file-pdf_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Report - Simikro/i_Eko Prasetyo_fas fa-file-pdf_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Report - Simikro/i_Eko Prasetyo_fas fa-file-pdf'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/a_Mulai Penilaian'))

WebUI.rightClick(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/label_Nilai Rekomendasi Program            _79c0da'))

WebUI.click(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/button_Pilih Mata Kuliah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/select_Pilih Mata Kuliah                   _9d5dd4'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/input_Aksi_nilai'), '90')

WebUI.click(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/button_Tambah Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/select_Pilih Mata Kuliah                   _72d249'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/input_Aksi_nilai_1'), '85')

WebUI.click(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/button_Tambah Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/select_Pilih Mata Kuliah                   _72d249_1'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/input_Aksi_nilai_1_2'), '80')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/button_Simpan'), 0)

WebUI.click(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/a_Terbitkan'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Penilaian MBKM - Simikro/a_Hasil Penilaian'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.navigateToUrl(GlobalVariable.DashboardPage_TestEnv)

