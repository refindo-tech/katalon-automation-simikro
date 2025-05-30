package pageVerification

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class GoToWelcome {

	@Keyword
	def verifyWelcomePageIsDisplayed() {
		WebUI.verifyElementVisible(findTestObject('Page_Welcome - Simikro/img'))
		WebUI.verifyElementVisible(findTestObject('Page_Welcome - Simikro/h2_Simikro'))
		WebUI.verifyElementVisible(findTestObject('Page_Welcome - Simikro/p_Simikro adalah sistem digital inovatif yang dirancang untuk mempermudah evaluasi capaian microskill dalam program Merdeka Belajar Kampus Merdeka (MBKM). Dengan platform ini, mahasiswa dan dosen dapat mengakses, menilai'))
		WebUI.verifyElementVisible(findTestObject('Page_Welcome - Simikro/p_Mahasiswa dapat memantau hasil evaluasi secara real-time, memahami standar penilaian, serta mendapatkan umpan balik langsung dari dosen. Sementara itu, dosen dapat melakukan penilaian dengan lebih sistematis melalui fo'))
	}
}
