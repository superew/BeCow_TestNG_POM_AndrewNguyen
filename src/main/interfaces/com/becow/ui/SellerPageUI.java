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
	public static final String CAT_MSG = "//label[contains(@beetranslate,'error.category')]/span";
	
	public static final String DES_TXT = "//label[contains(@beetranslate,'description')]/following-sibling::div//p";
	public static final String DES_MSG = "//label[contains(@beetranslate,'description')]/span";
	
	public static final String QTY_TXT = "//input[@formcontrolname='totalItem']";
	public static final String QTY_MSG = "//label[contains(@beetranslate,'itemQty')]/span";
	
	public static final String PRICE_TXT = "//input[@formcontrolname='orgPrice']";
	public static final String PRICE_MSG = "//label[contains(@beetranslate,'price')]/span";
	
	public static final String WEIGHT_TXT = "//input[@formcontrolname='weight']";
	public static final String WEIGHT_MSG = "//label[contains(@beetranslate,'shipping.require')]/span";
	
	public static final String WIDTH_TXT = "//input[@formcontrolname='width']";
	public static final String WIDTH_MSG = "//label[contains(@beetranslate,'width')]/span";
	
	public static final String LENGTH_TXT = "//input[@formcontrolname='length']";
	public static final String LENGTH_MSG = "//label[contains(@beetranslate,'length')]/span";
	
	public static final String HEIGHT_TXT = "//input[@formcontrolname='height']";
	public static final String HEIGHT_MSG = "//label[contains(@beetranslate,'height')]/span";
	
	
	
	
	public static final String DYNAMIC_MSG = "//label[@class='invalid']/span";
}
