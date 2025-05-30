package utils

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

public class takeMikroskillTest {

	@Keyword
	def answarAllQuestions() {

//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyampaikan materi dengan _4e1275'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyampaikan materi dengan _4e1275'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan mendengarkan aktif saat _67cc67'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan mendengarkan aktif saat _67cc67'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menggunakan bahasa yang efe_ffe254'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menggunakan bahasa yang efe_ffe254'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyesuaikan gaya komunikas_728114'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyesuaikan gaya komunikas_728114'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan menulis laporan atau cat_4ecc16'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan menulis laporan atau cat_4ecc16'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengambil inisiatif dalam k_8bcb9a'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengambil inisiatif dalam k_8bcb9a'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan membimbing dan menginspiras_5dfbc1'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan membimbing dan menginspiras_5dfbc1'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan bekerja sama dan mengoor_8aa691'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan bekerja sama dan mengoor_8aa691'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan memberi motivasi dan memban_022ee0'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan memberi motivasi dan memban_022ee0'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Keberanian mengambil keputusan dalam _2030a3'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Keberanian mengambil keputusan dalam _2030a3'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengatur jadwal antara meng_58469a'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengatur jadwal antara meng_58469a'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Efisiensi dalam menyusun rencana pemb_90b206'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Efisiensi dalam menyusun rencana pemb_90b206'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Prioritas dalam menyelesaikan tugas d_b9c1d6'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Prioritas dalam menyelesaikan tugas d_b9c1d6'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Fleksibilitas dalam menyesuaikan jadw_919947'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Fleksibilitas dalam menyesuaikan jadw_919947'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyelesaikan pekerjaan tan_a3c11e'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyelesaikan pekerjaan tan_a3c11e'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menganalisis permasalahan p_8e622e'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menganalisis permasalahan p_8e622e'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kreativitas dalam mencari solusi alte_749f5c'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kreativitas dalam mencari solusi alte_749f5c'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyelesaikan konflik antar_790524'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyelesaikan konflik antar_790524'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Daya tahan dalam menghadapi kendala p_68faf5'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Daya tahan dalam menghadapi kendala p_68faf5'))
//
//		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengevaluasi efektivitas so_5e98de'), 0)
//		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengevaluasi efektivitas so_5e98de'))
		
		// Scroll until the specified objects are found and click each element with 0 second waiting time
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyampaikan materi dengan _4e1275'), 0)
		// Scrolls to the first specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyampaikan materi dengan _4e1275'))
		// Clicks the first specified object

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan mendengarkan aktif saat _67cc67'), 0)
		// Scrolls to the second specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan mendengarkan aktif saat _67cc67'))
		// Clicks the second specified object

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menggunakan bahasa yang efe_ffe254'), 0)
		// Scrolls to the third specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menggunakan bahasa yang efe_ffe254'))
		// Clicks the third specified object

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyesuaikan gaya komunikas_728114'), 0)
		// Scrolls to the fourth specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyesuaikan gaya komunikas_728114'))
		// Clicks the fourth specified object

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan menulis laporan atau cat_4ecc16'), 0)
		// Scrolls to the fifth specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan menulis laporan atau cat_4ecc16'))
		// Clicks the fifth specified object

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengambil inisiatif dalam k_8bcb9a'), 0)
		// Scrolls to the sixth specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengambil inisiatif dalam k_8bcb9a'))
		// Clicks the sixth specified object

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan membimbing dan menginspiras_5dfbc1'), 0)
		// Scrolls to the seventh specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan membimbing dan menginspiras_5dfbc1'))
		// Clicks the seventh specified object

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan bekerja sama dan mengoor_8aa691'), 0)
		// Scrolls to the eighth specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Keterampilan bekerja sama dan mengoor_8aa691'))
		// Clicks the eighth specified object

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan memberi motivasi dan memban_022ee0'), 0)
		// Scrolls to the ninth specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan memberi motivasi dan memban_022ee0'))
		// Clicks the ninth specified object

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Keberanian mengambil keputusan dalam _2030a3'), 0)
		// Scrolls to the tenth specified object with no wait time
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Keberanian mengambil keputusan dalam _2030a3'))
		// Clicks the tenth specified object

		// Scroll until the specified elements are found and click each of them with 0 second waiting time
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengatur jadwal antara meng_58469a'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengatur jadwal antara meng_58469a'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Efisiensi dalam menyusun rencana pemb_90b206'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Efisiensi dalam menyusun rencana pemb_90b206'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Prioritas dalam menyelesaikan tugas d_b9c1d6'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Prioritas dalam menyelesaikan tugas d_b9c1d6'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Fleksibilitas dalam menyesuaikan jadw_919947'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Fleksibilitas dalam menyesuaikan jadw_919947'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyelesaikan pekerjaan tan_a3c11e'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyelesaikan pekerjaan tan_a3c11e'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menganalisis permasalahan p_8e622e'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menganalisis permasalahan p_8e622e'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kreativitas dalam mencari solusi alte_749f5c'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kreativitas dalam mencari solusi alte_749f5c'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyelesaikan konflik antar_790524'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyelesaikan konflik antar_790524'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Daya tahan dalam menghadapi kendala p_68faf5'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Daya tahan dalam menghadapi kendala p_68faf5'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengevaluasi efektivitas so_5e98de'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan mengevaluasi efektivitas so_5e98de'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyesuaikan diri dengan li_d9f793'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menyesuaikan diri dengan li_d9f793'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menghadapi perubahan metode_956a94'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan menghadapi perubahan metode_956a94'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kesiapan bekerja dalam kondisi keterb_40c5ae'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kesiapan bekerja dalam kondisi keterb_40c5ae'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Fleksibilitas dalam menyesuaikan stra_a5a052'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Fleksibilitas dalam menyesuaikan stra_a5a052'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan memahami dan menghormati bu_bdd22d'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Report - Simikro/input_Kemampuan memahami dan menghormati bu_bdd22d'))
	}
}
