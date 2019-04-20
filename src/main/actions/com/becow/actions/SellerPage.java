package com.becow.actions;

import org.openqa.selenium.WebDriver;

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

//	public void clickUpLoadIMG() {
//		waitVisible(SellerPageUI.IMG_UPLOAD);
//		click(SellerPageUI.IMG_UPLOAD);
//	}

	public void uploadIMG(String value) {
//		Thread.sleep(1000);
		uploadBySendKeys(SellerPageUI.IMG_UPLOAD, value);
	}

	public void inputProductName(String value) {
		waitVisible(SellerPageUI.PROD_NAME);
		clear(SellerPageUI.PROD_NAME);
		input(SellerPageUI.PROD_NAME, value);
	}

	public void clickCat1() {
		waitVisible(SellerPageUI.CAT1);
		click(SellerPageUI.CAT1);
		waitVisible(SellerPageUI.CAT1_DROPDOWN);
	}

	public void clickRandomCat1() {
		waitVisible(SellerPageUI.CAT1_DROPDOWN);
		clickRandomCombobox(SellerPageUI.CAT1_DROPDOWN);
	}

	public void clickCat2() {
		waitVisible(SellerPageUI.CAT2);
		click(SellerPageUI.CAT2);
		waitVisible(SellerPageUI.CAT2_DROPDOWN);
	}

	public void clickRandomCat2() {
		waitVisible(SellerPageUI.CAT2_DROPDOWN);
		clickRandomCombobox(SellerPageUI.CAT2_DROPDOWN);
	}

	public void clickCat3() {
		waitVisible(SellerPageUI.CAT3);
		click(SellerPageUI.CAT3);
		waitVisible(SellerPageUI.CAT3_DROPDOWN);
	}

	public void clickRandomCat3() {
		waitVisible(SellerPageUI.CAT3_DROPDOWN);
		clickRandomCombobox(SellerPageUI.CAT3_DROPDOWN);
	}

	public void clickViewList() {
		waitVisible(SellerPageUI.VIEW_LIST_BTN);
		click(SellerPageUI.VIEW_LIST_BTN);
	}

	public void clickViewDetail() {
		waitVisible(SellerPageUI.VIEW_EDIT_DETAIL_BTN);
		click(SellerPageUI.VIEW_EDIT_DETAIL_BTN);
	}

	public void clickDelProduct() {
		waitVisible(SellerPageUI.DEL_BTN);
		click(SellerPageUI.DEL_BTN);
	}

	public void clickDelProduct_Confirm() {
		waitVisible(SellerPageUI.DEL_CONFIRM_BTN);
		click(SellerPageUI.DEL_CONFIRM_BTN);
	}

	public void inputDes(String value) {
		waitVisible(SellerPageUI.DES_TXT);
		clear(SellerPageUI.DES_TXT);
		input(SellerPageUI.DES_TXT, value);
	}

	public void inputQty(String value) {
		waitVisible(SellerPageUI.QTY_TXT);
		clear(SellerPageUI.QTY_TXT);
		input(SellerPageUI.QTY_TXT, value);
	}

	public void inputPrice(String value) {
		waitVisible(SellerPageUI.PRICE_TXT);
		clear(SellerPageUI.PRICE_TXT);
		input(SellerPageUI.PRICE_TXT, value);
	}

	public void inputWeight(String value) {
		waitVisible(SellerPageUI.WEIGHT_TXT);
		clear(SellerPageUI.WEIGHT_TXT);
		input(SellerPageUI.WEIGHT_TXT, value);
	}

	public void inputWidth(String value) {
		waitVisible(SellerPageUI.WIDTH_TXT);
		clear(SellerPageUI.WIDTH_TXT);
		input(SellerPageUI.WIDTH_TXT, value);
	}

	public void inputLength(String value) {
		waitVisible(SellerPageUI.LENGTH_TXT);
		clear(SellerPageUI.LENGTH_TXT);
		input(SellerPageUI.LENGTH_TXT, value);
	}

	public void inputHeight(String value) {
		waitVisible(SellerPageUI.HEIGHT_TXT);
		clear(SellerPageUI.HEIGHT_TXT);
		input(SellerPageUI.HEIGHT_TXT, value);
	}
	
	public void inputSku(String value) {
		waitVisible(SellerPageUI.SKU_TXT);
		clear(SellerPageUI.SKU_TXT);
		input(SellerPageUI.SKU_TXT, value);
	}
	
	public void inputDiscount(String value) {
		waitVisible(SellerPageUI.DISCOUNT_TXT);
		clear(SellerPageUI.DISCOUNT_TXT);
		input(SellerPageUI.DISCOUNT_TXT, value);
	}

	public String getTextImgMSG() {
		waitVisible(SellerPageUI.IMG_MSG);
		return getText(SellerPageUI.IMG_MSG);
	}

	public String getTextProductNameMSG() {
		waitVisible(SellerPageUI.PROD_NAME_MSG);
		return getText(SellerPageUI.PROD_NAME_MSG);
	}

	public String getTextCatMSG() {
		waitVisible(SellerPageUI.CAT_MSG);
		return getText(SellerPageUI.CAT_MSG);
	}

	public String getTextDesMSG() {
		waitVisible(SellerPageUI.DES_MSG);
		return getText(SellerPageUI.DES_MSG);
	}

	public String getTextQtyMSG() {
		waitVisible(SellerPageUI.QTY_MSG);
		return getText(SellerPageUI.QTY_MSG);
	}

	public String getTextPriceMSG() {
		waitVisible(SellerPageUI.PRICE_MSG);
		return getText(SellerPageUI.PRICE_MSG);
	}

	public String getTextWeightMSG() {
		waitVisible(SellerPageUI.WEIGHT_MSG);
		return getText(SellerPageUI.WEIGHT_MSG);
	}

	public String getTextWidthMSG() {
		waitVisible(SellerPageUI.WIDTH_MSG);
		return getText(SellerPageUI.WIDTH_MSG);
	}

	public String getTextLengthMSG() {
		waitVisible(SellerPageUI.LENGTH_MSG);
		return getText(SellerPageUI.LENGTH_MSG);
	}

	public String getTextHeightMSG() {
		waitVisible(SellerPageUI.HEIGHT_MSG);
		return getText(SellerPageUI.HEIGHT_MSG);
	}

	public String getTextPostSucessMSG() {
		waitVisible(SellerPageUI.POST_SUCESS_MSG);
		return getText(SellerPageUI.POST_SUCESS_MSG);
	}

	public String getTextProductNameLbl() {
		waitVisible(SellerPageUI.PRODUCT_NAME_LBL);
		return getText(SellerPageUI.PRODUCT_NAME_LBL);
	}
	
	public String getTextCat3Txt() {
		waitVisible(SellerPageUI.CAT3_TXT);
		return getText(SellerPageUI.CAT3_TXT);
	}
}
