package com.becow.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.becow.actions.HomePage;
import com.becow.actions.SellerPage;

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
	String priceProdMsg;
	int price_txt, discount_txt;
	String weightProdMsg, weight_txt, requiredMsg, weight49_txt, weight10001_txt, weightOutRangeMsg, weight50_txt;
	String width1_txt, width2_txt, widthOutRange1_txt, widthOutRange2_txt, widthOutRangeMsg;
	String length_txt, lengthOutRange1_txt, lengthOutRange2_txt, lengthOutRangeMsg, length1_txt, length2_txt;
	String height50_txt, height0_txt, height51_txt, height1_txt, heightOutRangeMsg;
	String pathDataImage;
	String sku_txt, post_sucess_msg, update_sucess_msg, sold_out_msg;

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
		price_txt = 8;
		discount_txt = 10;
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

		homePage.inputUsername(userCorrect);
		homePage.inputPass(passCorrect);
		homePage.clickLoginBTN();
		Thread.sleep(2000);
		sellerPage = homePage.clickSellerPage();
		Thread.sleep(2000);

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
		update_sucess_msg = "Bạn đã cập nhật thành công sản phẩm này";
		sold_out_msg = "Hết hàng";

		String userPath = System.getProperty("user.dir");
		pathDataImage = userPath.concat("\\Data\\test1.jpg");

//		pathDataImage = "C:\\Users\\dunghvnguyen\\Desktop\\linh tinh\\test1.jpg";

	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.beecow.com/page/upload-product");
		productName = "Test Product " + randomEmail();

	}

	@Test
	public void TC_008() {
		verifyEqual(driver.getCurrentUrl(), "https://www.beecow.com/page/upload-product");
	}

	@Test
	public void TC_009() {
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextImgMSG(), imgUploadMsg);
		verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
		verifyEqual(sellerPage.getTextProductNameMSG(), nameProdMsg);
		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}

	@Test
	public void TC_010() throws InterruptedException {
		sellerPage.uploadIMG(pathDataImage);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
		verifyEqual(sellerPage.getTextProductNameMSG(), nameProdMsg);
		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}

	@Test
	public void TC_011() throws InterruptedException {
		sellerPage.uploadIMG(pathDataImage);
		sellerPage.inputProductName(productName);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
//		verifyEqual(sellerPage.getTextProductNameMSG(), nameProdMsg);
		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}

	@Test
	public void TC_012() throws InterruptedException {
		sellerPage.uploadIMG(pathDataImage);
		sellerPage.inputProductName(productName);
		sellerPage.clickRandomCat1();
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_013() throws InterruptedException {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
		verifyEqual(sellerPage.getTextDesMSG(), desProdMsg);
		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}

	@Test
	public void TC_014() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}

	@Test
	public void TC_015() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}

	@Test
	public void TC_016() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}

	@Test
	public void TC_017() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight49_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextWeightOutRangeMSG(), weightOutRangeMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}

	@Test
	public void TC_018() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight10001_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextWeightOutRangeMSG(), weightOutRangeMsg);
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_019() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight50_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_020() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_021() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(widthOutRange1_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextWidthMSG(), widthOutRangeMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_022() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(widthOutRange2_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextWidthMSG(), widthOutRangeMsg);
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_023() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width2_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_024() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_025() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(lengthOutRange1_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextLengthMSG(), lengthOutRangeMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_026() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(lengthOutRange2_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextLengthMSG(), lengthOutRangeMsg);
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_027() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(length1_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_028() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(length2_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
	}
	
	@Test
	public void TC_029() {
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(length2_txt);
		sellerPage.inputHeight(height0_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextHeightMSG(), heightOutRangeMsg);
	}
	
	@Test
	public void TC_030() {
		System.out.println("Start TC 30");
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(length2_txt);
		sellerPage.inputHeight(height51_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextHeightMSG(), heightOutRangeMsg);
	}

	@Test
	public void TC_031() throws InterruptedException {
		System.out.println("Start TC 31 with Product name = " + productName);
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(length2_txt);
		sellerPage.inputHeight(height1_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextPostSucessMSG(), post_sucess_msg);
		sellerPage.clickViewList();
		String aaa = sellerPage.getProductName(productName);
		verifyEqual(aaa, productName);
		sellerPage.delProd(productName);
	}

	@Test
	public void TC_032() throws InterruptedException {
		System.out.println("Start TC 32 with Product name = " + productName);
		sellerPage.inputInfo(pathDataImage, productName);
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
		
		String aaa = sellerPage.getProductName(productName);
		verifyEqual(aaa, productName);
		
		sellerPage.delProd(productName);
	}

	@Test
	public void TC_033() throws Exception {
		System.out.println("Start TC 33 with Product name = " + productName);
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputSku(sku_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputDiscount(discount_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(length2_txt);
		sellerPage.inputHeight(height50_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextPostSucessMSG(), post_sucess_msg);
		sellerPage.clickViewList();

		String aaa = sellerPage.getProductName(productName);
		verifyEqual(aaa, productName);

		sellerPage.clickViewDetailAfterCreate(productName);

		String textProName = sellerPage.getTextDynamicJquery("return $('#name').val()");
		String textDes = sellerPage.getTextDesEdit();
		String textSku = sellerPage.getTextDynamicJquery("return $('#org-sku').val()");
		String textQty = sellerPage.getTextDynamicJquery("return $('input[formcontrolname=\"totalItem\"]').val()");

		String textPrice = sellerPage.getTextDynamicJquery("return $('#original-price').val()");
		String textPrice2 = textPrice.replace(",", "");
		int priceToNum = Integer.parseInt(textPrice2);

		String textDiscount = sellerPage.getTextDynamicJquery("return $('input[formcontrolname=\"discount\"]').val()");
		int discountToNum = Integer.parseInt(textDiscount);

		String textNewPrice = sellerPage.getTextDynamicJquery("return $('input[formcontrolname=\"newPrice\"]').val()");
		String textNewPrice2 = textNewPrice.replace(",", "");
		int newPriceToNum = Integer.parseInt(textNewPrice2);

		int newprice = (price_txt * 1000) - ((price_txt * 1000) * discount_txt / 100);

		String textWeight = sellerPage.getTextDynamicJquery("return $('input[formcontrolname*=\"weight\"]').val()");
		String textWidth = sellerPage.getTextDynamicJquery("return $('input[formcontrolname*=\"width\"]').val()");
		String textLength = sellerPage.getTextDynamicJquery("return $('input[formcontrolname*=\"length\"]').val()");
		String textHeight = sellerPage.getTextDynamicJquery("return $('input[formcontrolname*=\"height\"]').val()");

		verifyEqual(textProName, productName);
		verifyEqual(textDes, description_txt);
		verifyEqual(textSku, sku_txt);
		verifyEqual(textQty, quantity_txt);
		verifyEqual(priceToNum, price_txt * 1000);
		verifyEqual(discountToNum, discount_txt);
		verifyEqual(newPriceToNum, newprice);
		verifyEqual(textWeight, weight_txt);
		verifyEqual(textWidth, width1_txt);
		verifyEqual(textLength, length2_txt);
		verifyEqual(textHeight, height50_txt);
		sellerPage.delProd(productName);
	}

	@Test
	public void TC_034() throws InterruptedException {
		System.out.println("Start TC 34 with Product name = " + productName);
		sellerPage.inputInfo(pathDataImage, productName);
		sellerPage.inputDes(description_txt);
		sellerPage.inputSku(sku_txt);
		sellerPage.inputQty(quantity_txt);
		sellerPage.inputPrice(price_txt);
		sellerPage.inputDiscount(discount_txt);
		sellerPage.inputWeight(weight_txt);
		sellerPage.inputWidth(width1_txt);
		sellerPage.inputLength(length2_txt);
		sellerPage.inputHeight(height50_txt);
		sellerPage.clickPostProductBTN();
		verifyEqual(sellerPage.getTextPostSucessMSG(), post_sucess_msg);
		sellerPage.clickViewList();

		String aaa = sellerPage.getProductName(productName);
		verifyEqual(aaa, productName);

		sellerPage.clickViewDetailAfterCreate(productName);
		sellerPage.clickEditQty();
		sellerPage.inputQtyEdit("0");
		sellerPage.clickConfirmQty();
		sellerPage.clickUpdateProduct();
		verifyEqual(sellerPage.getTextUpdateSucessMSG(), update_sucess_msg);
		sellerPage.clickViewDetailProduct();
		verifyEqual(sellerPage.gettextDetailSoldout(), sold_out_msg);
		sellerPage.delProd(productName);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		getResult(result);
	}

	@AfterClass
	public void afterClass() {
		exportReport();
		closeBrowser();
	}

}
