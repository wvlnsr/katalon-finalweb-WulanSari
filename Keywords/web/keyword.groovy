package web

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

public class keyword {

	@Keyword
	def randomStr(Integer length) {
		org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(length)
	}

	@Keyword
	def randomInt(Integer length) {
		org.apache.commons.lang3.RandomStringUtils.randomNumeric(length)
	}

	@Keyword
	def randomEmail(Integer strLength, Integer numLength) {
		String randomString = randomStr(strLength)
		String randomNumber = randomInteger(numLength)
		String email = randomString + randomNumber + "@example.com"
		return email
	}

	@Keyword
	def randomPassword() {
		int length = 12  // Panjang total string
		int minLower = 1  // Minimal 1 huruf kecil
		int minUpper = 1  // Minimal 1 huruf besar
		int minDigit = 1  // Minimal 1 angka
		int remaining = length - (minLower + minUpper + minDigit)  // Karakter sisa yang akan diisi

		String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz"
		String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		String digitChars = "0123456789"
		String allChars = lowerCaseChars + upperCaseChars + digitChars

		Random rand = new Random()
		StringBuilder sb = new StringBuilder()

		// Tambahkan minimal 1 huruf kecil
		for (int i = 0; i < minLower; i++) {
			sb.append(lowerCaseChars.charAt(rand.nextInt(lowerCaseChars.length())))
		}

		// Tambahkan minimal 1 huruf besar
		for (int i = 0; i < minUpper; i++) {
			sb.append(upperCaseChars.charAt(rand.nextInt(upperCaseChars.length())))
		}

		// Tambahkan minimal 1 angka
		for (int i = 0; i < minDigit; i++) {
			sb.append(digitChars.charAt(rand.nextInt(digitChars.length())))
		}

		// Tambahkan karakter yang tersisa secara acak dari semua karakter (huruf besar, kecil, angka)
		for (int i = 0; i < remaining; i++) {
			sb.append(allChars.charAt(rand.nextInt(allChars.length())))
		}

		// Acak urutan karakter
		List<Character> charList = sb.toString().toCharArray().toList()
		java.util.Collections.shuffle(charList)

		// Gabungkan kembali menjadi string
		return charList.collect { it.toString() }.join('')
	}
}
