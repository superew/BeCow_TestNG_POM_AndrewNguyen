package com.becow.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.becow.actions.HomePage;

import CommonPage.CommonTestCase;

public class LoginScript extends CommonTestCase {
	WebDriver driver;
	HomePage homePage;
	String email;
	String errorMsg, userPhoneIncorr, userEmailIncorr, phoneIncorrMsg, emailIncorrMsg, passAtLeast6CharMsg,
			passUnder6Char, passIncorr;
	String userCorrect, passCorrect, errorMsgIncorr, user;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void beforeClass(String browser, String version, String url) {

		driver = openMultiBrowser(browser, version, url);
//		homePage = PageFactory.initElements(driver, HomePage.class);
//		homePage.clickLoginMenu();

//		email = "andrew" + randomEmail() + "@gmail.com";
		errorMsg = "Hãy nhập email / số điện thoại và mật khẩu";
		errorMsgIncorr = "Sai email / số điện thoại hoặc mật khẩu";
		phoneIncorrMsg = "Số điện thoại không đúng";
		emailIncorrMsg = "Email không đúng";
		passAtLeast6CharMsg = "Tối thiểu 6 ký tự";

		userPhoneIncorr = "1234";
		userEmailIncorr = "1234abcd";
		userCorrect = "genymotionios@gmail.com";
		passUnder6Char = "123";
		passIncorr = "123456";
		passCorrect = "1234@abcd";
		user = "genymotionios";

	}

	@BeforeMethod
	public void beforeMethod() {
		homePage = PageFactory.initElements(driver, HomePage.class);
		driver.get("https://www.beecow.com/market");
		homePage.clickLoginMenu();
	}

	@Test
	public void TC_001() {
		homePage.clickLoginBTN();
		verifyEqual(homePage.getTextErrorMsg(), errorMsg);
	}

	@Test
	public void TC_002() {
		homePage.inputUsername(userPhoneIncorr);
		homePage.clickLoginBTN();
		verifyEqual(homePage.getTextPhoneMsg(), phoneIncorrMsg);
		verifyEqual(homePage.getTextErrorMsg(), errorMsg);
	}

	@Test
	public void TC_003() {
		homePage.inputUsername(userEmailIncorr);
		homePage.clickLoginBTN();
		verifyEqual(homePage.getTextEmailMsg(), emailIncorrMsg);
		verifyEqual(homePage.getTextErrorMsg(), errorMsg);
	}

	@Test
	public void TC_004() {
		homePage.inputUsername(userCorrect);
		homePage.clickLoginBTN();
		verifyEqual(homePage.getTextErrorMsg(), errorMsg);
	}

	@Test
	public void TC_005() {
		homePage.inputUsername(userCorrect);
		homePage.inputPass(passUnder6Char);
		homePage.clickLoginBTN();
		verifyEqual(homePage.getTextPassMsg(), passAtLeast6CharMsg);
		verifyEqual(homePage.getTextErrorMsg(), errorMsg);
	}

	@Test
	public void TC_006() {
		homePage.inputUsername(userCorrect);
		homePage.inputPass(passIncorr);
		homePage.clickLoginBTN();
		verifyEqual(homePage.getTextIncorrectMsg(), errorMsgIncorr);
	}

	@Test
	public void TC_007() throws InterruptedException {
		homePage.inputUsername(userCorrect);
		homePage.inputPass(passCorrect);
		homePage.clickLoginBTN();

		try {
			verifyEqual(homePage.getTextUser(), user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
	}
}
