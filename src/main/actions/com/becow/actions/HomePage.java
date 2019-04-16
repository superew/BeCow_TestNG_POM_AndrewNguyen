package com.becow.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.becow.ui.HomePageUI;

import CommonPage.commonFunction;

public class HomePage extends commonFunction {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickLoginMenu() {
		waitVisible(HomePageUI.LOGIN_MENU_LINK);
		click(HomePageUI.LOGIN_MENU_LINK);

	}
	
	public void inputUsername(String value) {
		waitVisible(HomePageUI.USER_NAME);
		input(HomePageUI.USER_NAME, value);
	}
	
	public void inputPass(String value) {
		waitVisible(HomePageUI.PASS);
		input(HomePageUI.PASS, value);
	}
	
	public HomePage clickLoginBTN() {
		waitVisible(HomePageUI.LOGIN_BTN);
		click(HomePageUI.LOGIN_BTN);
		return PageFactory.initElements(driver, HomePage.class);
	}
	
	public String getTextErrorMsg() {
		waitVisible(HomePageUI.ERROR_MSG);
		return getText(HomePageUI.ERROR_MSG);
	}
	
	public String getTextIncorrectMsg() {
		waitVisible(HomePageUI.INCORRECT_MSG);
		return getText(HomePageUI.INCORRECT_MSG);
	}
	
	public String getTextPhoneMsg() {
		waitVisible(HomePageUI.PHONE_MSG);
		return getText(HomePageUI.PHONE_MSG);
	}
	
	public String getTextEmailMsg() {
		waitVisible(HomePageUI.EMAIL_MSG);
		return getText(HomePageUI.EMAIL_MSG);
	}
	
	public String getTextPassMsg() {
		waitVisible(HomePageUI.PASS_MSG);
		return getText(HomePageUI.PASS_MSG);
	}
	
	public String getTextUser() throws InterruptedException {
		Thread.sleep(2000);
		waitVisible(HomePageUI.USER);
		return getText(HomePageUI.USER);
	}
	
	public SellerPage clickSellerPage() {
		waitVisible(HomePageUI.SELLER_LINK);
		click(HomePageUI.SELLER_LINK);
		return PageFactory.initElements(driver, SellerPage.class);
	}
	
	

}
