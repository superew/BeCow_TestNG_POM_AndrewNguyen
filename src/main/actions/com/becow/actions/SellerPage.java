package com.becow.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.becow.ui.SellerPageUI;

import CommonPage.commonFunction;

public class SellerPage extends commonFunction {
	public SellerPage(WebDriver driver) {
		super(driver);
	}
	
	HomePage homePage;

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

//	public void clickCat1() {
//		waitVisible(SellerPageUI.CAT1);
//		click(SellerPageUI.CAT1);
//		waitVisible(SellerPageUI.CAT1_DROPDOWN);
//	}

	public void clickRandomCat1() {
		waitVisible(SellerPageUI.CAT1);
		click(SellerPageUI.CAT1);
		waitVisible(SellerPageUI.CAT1_DROPDOWN);
		clickRandomCombobox(SellerPageUI.CAT1_DROPDOWN);
	}

//	public void clickCat2() {
//		waitVisible(SellerPageUI.CAT2);
//		click(SellerPageUI.CAT2);
//		waitVisible(SellerPageUI.CAT2_DROPDOWN);
//	}

	public void clickRandomCat2() {
		waitVisible(SellerPageUI.CAT2);
		click(SellerPageUI.CAT2);
		waitVisible(SellerPageUI.CAT2_DROPDOWN);
		clickRandomCombobox(SellerPageUI.CAT2_DROPDOWN);
	}

	public void clickRandomCat2_Not_Other() {
		waitVisible(SellerPageUI.CAT2_DROPDOWN_NOT_OTHER);
		clickRandomCombobox(SellerPageUI.CAT2_DROPDOWN_NOT_OTHER);
	}

	public void clickRandomCat2_Other() {
		waitVisible(SellerPageUI.CAT2_DROPDOWN_OTHER);
		clickRandomCombobox(SellerPageUI.CAT2_DROPDOWN_OTHER);
	}

	public void clickRandomCat3() {
		if (verifyElement()) {
			waitVisible(SellerPageUI.CAT3);
			click(SellerPageUI.CAT3);
			waitVisible(SellerPageUI.CAT3_DROPDOWN);
			clickRandomCombobox(SellerPageUI.CAT3_DROPDOWN);
		}
	}

	public void clickViewList() {
		waitVisible(SellerPageUI.VIEW_LIST_BTN);
		click(SellerPageUI.VIEW_LIST_BTN);
	}

	public void clickViewDetail() {
		waitVisible(SellerPageUI.VIEW_EDIT_DETAIL2_BTN);
		click(SellerPageUI.VIEW_EDIT_DETAIL2_BTN);
	}
	
	public void clickViewDetailProd() {
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
	
	public void clickEditQty() {
		waitVisible(SellerPageUI.QTY_EDIT_BTN);
		click(SellerPageUI.QTY_EDIT_BTN);
	}
	
	public void clickConfirmQty() {
		waitVisible(SellerPageUI.QTY_CONFIRM_BTN);
		click(SellerPageUI.QTY_CONFIRM_BTN);
	}
	
	public void clickUpdateProduct() {
		waitVisible(SellerPageUI.UPDATE_BTN);
		click(SellerPageUI.UPDATE_BTN);
	}
	
	public void clickViewDetailProduct() {
		waitVisible(SellerPageUI.VIEW_DETAIL_PROD);
		click(SellerPageUI.VIEW_DETAIL_PROD);
	}
	
	public void inputQtyEdit(String value) {
		waitVisible(SellerPageUI.QTY_EDIT_TXT);
		clear(SellerPageUI.QTY_EDIT_TXT);
		input(SellerPageUI.QTY_EDIT_TXT, value);
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

	public void inputPrice(int value) {
		waitVisible(SellerPageUI.PRICE_TXT);
		clear(SellerPageUI.PRICE_TXT);
		inputNum(SellerPageUI.PRICE_TXT, value);
	}
	
	public void inputDiscount(int value) {
		waitVisible(SellerPageUI.DISCOUNT_TXT);
		clear(SellerPageUI.DISCOUNT_TXT);
		inputNum(SellerPageUI.DISCOUNT_TXT, value);
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
	
	public String getTextWeightOutRangeMSG() {
		waitVisible(SellerPageUI.WEIGHT_OUT_RANGE_MSG);
		return getText(SellerPageUI.WEIGHT_OUT_RANGE_MSG);
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
	
	public String getTextUpdateSucessMSG() {
		waitVisible(SellerPageUI.UPDATE_SUCESS_MSG);
		return getText(SellerPageUI.UPDATE_SUCESS_MSG);
	}

	public String getTextProductNameLbl() {
		waitVisible(SellerPageUI.PRODUCT_NAME_LBL);
		return getText(SellerPageUI.PRODUCT_NAME_LBL);
	}

	public String getTextCat3Txt() {
		waitVisible(SellerPageUI.CAT3_TXT);
		return getText(SellerPageUI.CAT3_TXT);
	}

	// Get text in Edit Product

	public String getTextDynamicJquery(String js) throws InterruptedException {
		Thread.sleep(1000);
		return getTextjQuery(js);
	}
	
	public String getTextDesEdit() {
		waitVisible(SellerPageUI.DES_EDIT);
		return getText(SellerPageUI.DES_EDIT);
	}
	
	public String getTextDiscountEdit() {
		waitVisible(SellerPageUI.DISCOUNT_EDIT);
		return getText(SellerPageUI.DISCOUNT_EDIT);
	}
	
	public String gettextNewPriceEdit() {
		waitVisible(SellerPageUI.NEWPRICE_EDIT);
		return getText(SellerPageUI.NEWPRICE_EDIT);
	}
	
	public String gettextWeightEdit() {
		waitVisible(SellerPageUI.WEIGHT_EDIT);
		return getText(SellerPageUI.WEIGHT_EDIT);
	}
	
	public String gettextDetailSoldout() {
		waitVisible(SellerPageUI.DETAIL_SOLDOUT);
		return getText(SellerPageUI.DETAIL_SOLDOUT);
	}
	
	public void inputInfo(String pathDataImage, String productName) {
		uploadIMG(pathDataImage);
		inputProductName(productName);
		clickRandomCat1();
		clickRandomCat2();
		clickRandomCat3();
	}
	
	public void clickViewDetailAfterCreate(String productName) {
		String abc = SellerPageUI.VIEW_EDIT_DETAIL2_BTN.replace("{productname}", productName);
		waitVisible(abc);
		click(abc);
	}

	public void delProd(String productName) throws InterruptedException {
		driver.get("https://www.beecow.com/market");
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickSellerPage();
		
		String aaa = SellerPageUI.HOVER_PRODUCT_NAME.replace("{productname}", productName);
		Thread.sleep(2000);
		waitVisible(aaa);
		hoverProductName(aaa);
		
		String abc = SellerPageUI.VIEW_EDIT_DETAIL2_BTN.replace("{productname}", productName);
		Thread.sleep(2000);
		waitVisible(abc);
		click(abc);
		
		clickDelProduct();
		clickDelProduct_Confirm();
		Thread.sleep(2000);
	}
	
	public String getProductName(String productName) {
		String abc = SellerPageUI.PRODUCT_NAME_LBL_2.replace("{productname}", productName);
		waitVisible(abc);
		return getText(abc);
	}

}
