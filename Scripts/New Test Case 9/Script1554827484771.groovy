import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/a_Google'))

WebUI.setText(findTestObject('Page_ng nhp - Ti khon Google/input_sachmemvn_identifier'), 'thanhhungsky98@gmail.com')

WebUI.click(findTestObject('Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.setEncryptedText(findTestObject('Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), '+4Wj5QjyFPcebtHymcjpcg==')

WebUI.click(findTestObject('Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp 1'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Bi tp cui tun Ting Vit 1 Tp 1'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Assignment'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Chn lp hc_ng-input'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Test'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Chn nhm_ng-input'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_No items found'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Chn nhm_ng-input_1'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Thi gian lm bi (pht)_form-control ng-untouched ng-valid ng-dirty'), 
    '13')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Lu  Sch min ph bn c th giao bi v khng b mt im tng                                Description                                                        Class                        Chn lp hc                              '))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Description_form-control ng-untouched ng-valid ng-dirty'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_S ln lm li_form-control ng-untouched ng-valid ng-dirty'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Trn cu hi'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_S ln lm li_shuffle'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Trn cu hi_block_copy'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))

