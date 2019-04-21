package com.becow.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.becow.actions.HomePage;
import com.becow.actions.SellerPage;
import com.becow.ui.SellerPageUI;

import CommonPage.CommonTestCase;

public class UploadProductScripts extends CommonTestCase {
	WebDriver driver;
	HomePage homePage;
	SellerPage sellerPage;
	String userCorrect, passCorrect;
	String imgUploadMsg;
	String nameProdMsg, productName;
	String catProdMsg;
	String desProdMsg, description_txt;
	String qtyProdMsg, quantity_txt;
	String priceProdMsg, price_txt;
	String weightProdMsg, weight_txt, requiredMsg, weight49_txt, weight10001_txt, weightOutRangeMsg, weight50_txt;
	String width1_txt, width2_txt, widthOutRange1_txt, widthOutRange2_txt, widthOutRangeMsg;
	String length_txt, lengthOutRange1_txt, lengthOutRange2_txt, lengthOutRangeMsg, length1_txt, length2_txt;
	String height50_txt, height0_txt, height51_txt, height1_txt, heightOutRangeMsg;
	String pathDataImage;
	String sku_txt, discount_txt, post_sucess_msg;

	@Parameters({ "browser", "version", "url" })

	@BeforeClass
	public void beforeClass(String browser, String version, String url) throws InterruptedException {
		driver = openMultiBrowser(browser, version, url);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickLoginMenu();

		userCorrect = "genymotionios@gmail.com";
		passCorrect = "1234@abcd";

		description_txt = "Description product";
		sku_txt = "SKUShirt";
		quantity_txt = "10";
		price_txt = "8";
		discount_txt = "10";
		weight_txt = "10000";
		weight50_txt = "10000";
		weight49_txt = "49";
		weight10001_txt = "10001";
		width1_txt = "50";
		width2_txt = "1";
		widthOutRange1_txt = "0";
		widthOutRange2_txt = "51";
		lengthOutRange1_txt = "0";
		lengthOutRange2_txt = "31";
		length1_txt = "1";
		length2_txt = "30";
		height50_txt = "50";
		height0_txt = "0";
		height51_txt = "51";
		height1_txt = "1";

		pathDataImage = "C:\\Users\\dunghvnguyen\\Desktop\\linh tinh\\test1.jpg";

		homePage.inputUsername(userCorrect);
		homePage.inputPass(passCorrect);
		homePage.clickLoginBTN();
		Thread.sleep(1000);
		sellerPage = homePage.clickSellerPage();
		Thread.sleep(1000);
//		sellerPage.clickUploadProduct();

		imgUploadMsg = "Hãy chọn hình ảnh cho sản phẩm";
		nameProdMsg = "Hãy điền tên sản phẩm";
		catProdMsg = "Hãy chọn danh mục.";
		desProdMsg = "Hãy mô tả sản phẩm.";
		qtyProdMsg = "Nhập số lượng.";
		priceProdMsg = "Hãy điền giá.";
		weightProdMsg = "Hãy điền cân nặng sản phẩm.";
		weightOutRangeMsg = "Cân nặng từ 50g đến 10000g.";
		widthOutRangeMsg = "Từ 1cm tới 50cm";
		heightOutRangeMsg = "Từ 1cm tới 50cm";
		lengthOutRangeMsg = "Từ 1cm tới 30cm";
		requiredMsg = "Bắt buộc";
		post_sucess_msg = "Bạn đã đăng thành công sản phẩm này";

	}
	
	public void inputInfo() {
		sellerPage.uploadIMG(pathDataImage);
		sellerPage.inputProductName(productName);
		sellerPage.clickRandomCat1();
		sellerPage.clickRandomCat2();
		sellerPage.clickRandomCat3();
	}

	public void inputInfo_Not_Other() {
		sellerPage.uploadIMG(pathDataImage);
		sellerPage.inputProductName(productName);
//		sellerPage.clickRandomCat1();
//		sellerPage.clickRandomCat2();
		sellerPage.clickRandomCat2_Not_Other();
		sellerPage.clickRandomCat3();
	}

	public void inputInfo_Other() {
		sellerPage.uploadIMG(pathDataImage);
		sellerPage.inputProductName(productName);
//		sellerPage.clickRandomCat1();
//		sellerPage.clickRandomCat2();
		sellerPage.clickRandomCat2_Other();
	}
	
	public void clickViewDetail() {
	String abc = SellerPageUI.VIEW_EDIT_DETAIL2_BTN.replace("{productname}", productName);
	sellerPage.click(abc);
	}

	public void delProd() {
		clickViewDetail();
		sellerPage.clickDelProduct();
		sellerPage.clickDelProduct_Confirm();
	}

	public void verifyProductName() {
		String abc = SellerPageUI.PRODUCT_NAME_LBL_2.replace("{productname}", productName);
		sellerPage.waitVisible(abc);
		verifyEqual(sellerPage.getText(abc), productName);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.beecow.com/page/upload-product");
		productName = "Test Product " + randomEmail();

	}

//	@Test
//	public void TC_008() {
//		verifyEqual(driver.getCurrentUrl(), "https://www.beecow.com/page/upload-product");
//	}
//
//	@Test
//	public void TC_009() {
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextImgMSG(), imgUploadMsg);
//		verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
//		verifyEqual(sellerPage.getTextProductNameMSG(), nameProdMsg);
//		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
//		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//
//	@Test
//	public void TC_010() throws InterruptedException {
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
//		verifyEqual(sellerPage.getTextProductNameMSG(), nameProdMsg);
//		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
//		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//
//	@Test
//	public void TC_011() throws InterruptedException {
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.inputProductName(productName);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
//		verifyEqual(sellerPage.getTextProductNameMSG(), nameProdMsg);
//		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
//		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}

//	@Test
//	public void TC_012() throws InterruptedException {
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.inputProductName(productName);
//		sellerPage.clickCat1();
//		sellerPage.clickRandomCat1();
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
//		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
//		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_013() throws InterruptedException {
//		inputInfo_Not_Other();
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
//		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}

//	@Test
//	public void TC_014() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//
//	@Test
//	public void TC_015() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//
//	@Test
//	public void TC_016() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//
//	@Test
//	public void TC_017() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight49_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextWeightMSG(), weightOutRangeMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//
//	@Test
//	public void TC_018() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight10001_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextWeightMSG(), weightOutRangeMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_019() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight50_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_020() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_021() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(widthOutRange1_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextWidthMSG(), widthOutRangeMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_022() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(widthOutRange2_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextWidthMSG(), widthOutRangeMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_023() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width2_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_024() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_025() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.inputLength(lengthOutRange1_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextLengthMSG(), lengthOutRangeMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_026() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.inputLength(lengthOutRange2_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextLengthMSG(), lengthOutRangeMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_027() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.inputLength(length1_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_028() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.inputLength(length2_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_029() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.inputLength(length2_txt);
//		sellerPage.inputHeight(height0_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextHeightMSG(), heightOutRangeMsg);
//	}
//	
//	@Test
//	public void TC_030() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.inputLength(length2_txt);
//		sellerPage.inputHeight(height51_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextHeightMSG(), heightOutRangeMsg);
//	}
//
//	@Test
//	public void TC_031() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.inputLength(length2_txt);
//		sellerPage.inputHeight(height1_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextPostSucessMSG(), post_sucess_msg);
//		sellerPage.clickViewList();
//		String abc = SellerPageUI.PRODUCT_NAME_LBL_2.replace("{productname}", productName);
//		sellerPage.waitVisible(abc);
//		verifyEqual(sellerPage.getText(abc), productName);
//		delProd();
//	}
//
	@Test
	public void TC_032() {
		inputInfo();
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(length2_txt);
		sellerPage.inputHeight(height50_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextPostSucessMSG(), post_sucess_msg);
		sellerPage.clickViewList();
		String abc = SellerPageUI.PRODUCT_NAME_LBL_2.replace("{productname}", productName);
		sellerPage.waitVisible(abc);
		verifyEqual(sellerPage.getText(abc), productName);

	}
//
//	@Test
//	public void TC_033() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputSku(sku_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputDiscount(discount_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.inputLength(length2_txt);
//		sellerPage.inputHeight(height50_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextPostSucessMSG(), post_sucess_msg);
//		sellerPage.clickViewList();
//		String abc = SellerPageUI.PRODUCT_NAME_LBL_2.replace("{productname}", productName);
//		sellerPage.waitVisible(abc);
//		verifyEqual(sellerPage.getText(abc), productName);
//		clickViewDetail();
//		
//	}
//	
//	@Test
//	public void TC_034() {
//		inputInfo_Not_Other();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputSku(sku_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputDiscount(discount_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.inputWidth(width1_txt);
//		sellerPage.inputLength(length2_txt);
//		sellerPage.inputHeight(height50_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextPostSucessMSG(), post_sucess_msg);
//		sellerPage.clickViewList();
//		String abc = SellerPageUI.PRODUCT_NAME_LBL_2.replace("{productname}", productName);
//		sellerPage.waitVisible(abc);
//		verifyEqual(sellerPage.getText(abc), productName);
//		sellerPage.click(abc);
//		
//	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
	}

}
