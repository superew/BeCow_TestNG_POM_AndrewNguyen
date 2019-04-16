package com.becow.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.becow.ui.SellerPageUI;

import CommonPage.commonFunction;

public class SellerPage extends commonFunction {
	public SellerPage(WebDriver driver) {
		super(driver);
	}

	public void clickUploadProduct() {
		waitVisible(SellerPageUI.UPLOAD_PRODUCT);
		click(SellerPageUI.UPLOAD_PRODUCT);
	}

	public void clickPostProductBTN() {
		waitVisible(SellerPageUI.POST_BTN);
		click(SellerPageUI.POST_BTN);
	}

	public void clickUpLoadIMG() {
		waitVisible(SellerPageUI.IMG_UPLOAD);
		click(SellerPageUI.IMG_UPLOAD);
	}

	public void uploadIMG(String value) {
		waitVisible(SellerPageUI.IMG_UPLOAD);
		uploadBySendKeys(SellerPageUI.IMG_UPLOAD, value);
	}

	public void inputProductName(String value) {
		waitVisible(SellerPageUI.PROD_NAME);
		input(SellerPageUI.PROD_NAME, value);
	}

	public void clickCat1() {
		waitVisible(SellerPageUI.CAT1);
		click(SellerPageUI.CAT1);
		waitVisible(SellerPageUI.CAT1_DROPDOWN);
	}
}
