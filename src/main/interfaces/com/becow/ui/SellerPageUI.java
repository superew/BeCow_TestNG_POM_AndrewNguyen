package com.becow.ui;

public class SellerPageUI {
	public static final String UPLOAD_PRODUCT = "//li[@class='inner-menu-mobile']/a[contains(@beetranslate,'uploadProduct')]";
	public static final String POST_BTN = "//button[contains(@beetranslate,'action.post')]";
	
	public static final String IMG_UPLOAD = "//div[@id='upload-empty']//input[@name='qqfile']";
	public static final String IMG_MSG = "//label[contains(@beetranslate,'chooseImage')]/span";
	
	public static final String PROD_NAME = "//input[@id='name']";
	public static final String PROD_NAME_MSG = "//label[contains(@beetranslate,'productName')]/span";
	
	public static final String CAT1 = "//div[contains(@class,'category-left')]/button";
	public static final String CAT1_DROPDOWN = "//div[contains(@class,'category-left')]//li";
	
	public static final String CAT2 = "//div[contains(@class,'category-mid')]/button";
	public static final String CAT2_DROPDOWN = "//div[contains(@class,'category-mid')]//li";
	
	public static final String CAT3 = "//div[contains(@class,'category-right')]/button";
	public static final String CAT3_TXT = "//span[contains(@beetranslate,'selectCate')]/span";
	public static final String CAT3_DROPDOWN = "//div[contains(@class,'category-right')]//li";
	public static final String CAT_MSG = "//label[contains(@beetranslate,'error.category')]/span";
	
	public static final String DES_TXT = "//label[contains(@beetranslate,'description')]/following-sibling::div//div[contains(@class,'fr-view')]";
	public static final String DES_MSG = "//label[contains(@beetranslate,'error.description')]/span";
	
	public static final String QTY_TXT = "//input[@formcontrolname='totalItem']";
	public static final String QTY_MSG = "//label[contains(@beetranslate,'itemQty')]/span";
	
	public static final String PRICE_TXT = "//input[@formcontrolname='orgPrice']";
	public static final String PRICE_MSG = "//label[contains(@beetranslate,'error.price')]/span";
	
	public static final String WEIGHT_TXT = "//input[@formcontrolname='weight']";
	public static final String WEIGHT_MSG = "//label[contains(@beetranslate,'shipping.require')]/span";
	
	public static final String WIDTH_TXT = "//input[@formcontrolname='width']";
	public static final String WIDTH_MSG = "//label[contains(@beetranslate,'width')]/span";
	
	public static final String LENGTH_TXT = "//input[@formcontrolname='length']";
	public static final String LENGTH_MSG = "//label[contains(@beetranslate,'length')]/span";
	
	public static final String HEIGHT_TXT = "//input[@formcontrolname='height']";
	public static final String HEIGHT_MSG = "//label[contains(@beetranslate,'height')]/span";
	
	public static final String POST_SUCESS_MSG = "//p[contains(@beetranslate,'postSuccess')]/span";
	
	public static final String VIEW_LIST_BTN = "//button[contains(@beetranslate,'viewList')]/span";
	
	public static final String PRODUCT_NAME_LBL = "//div[contains(@class,'content-desc')]/p[@class='pro-name']";
	public static final String PRODUCT_NAME_LBL_2 = "//div[contains(@class,'content-desc')]/p[contains(text(),'{productname}')]";
	
	public static final String VIEW_EDIT_DETAIL_BTN = "//a[contains(@beetranslate,'detail.viewEdit')]";
	
	public static final String DEL_BTN = "//div[contains(@class,'mrgt20')]/button[contains(@beetranslate,'delete')]";
	
	public static final String DEL_CONFIRM_BTN = "//div[contains(@id,'delete-pro')]//button[contains(@beetranslate,'delete')]";
	
	public static final String SKU_TXT = "//input[@id='org-sku']";
	
	public static final String DISCOUNT_TXT = "//input[@formcontrolname='discount']";
	
	public static final String DYNAMIC_MSG = "//label[@class='invalid']/span";
}
