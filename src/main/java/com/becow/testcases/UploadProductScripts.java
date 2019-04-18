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
	String imgUploadMsg, nameProdMsg, catProdMsg, desProdMsg, qtyProdMsg, priceProdMsg;
	String weightProdMsg, requiredMsg, productName;
	String pathDataImage;
	String description_txt, sku_txt, quantity_txt, price_txt, discount_txt, weight_txt, width_txt, length_txt, height_txt;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void beforeClass(String browser, String version, String url) throws InterruptedException {
		driver = openMultiBrowser(browser, version, url);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickLoginMenu();

		userCorrect = "genymotionios@gmail.com";
		passCorrect = "1234@abcd";
		productName = "Test Product" + randomEmail();
		description_txt = "Description product";
		sku_txt			= "SKUShirt";
		quantity_txt	= "10";
		price_txt 		= "8";
		discount_txt	= "10";
		weight_txt		= "10000";
		width_txt		= "50";
		length_txt		= "30";
		height_txt		= "50";


		pathDataImage = "C:\\Users\\dunghvnguyen\\Desktop\\linh tinh\\test1.jpg";

		homePage.inputUsername(userCorrect);
		homePage.inputPass(passCorrect);
		homePage.clickLoginBTN();
		Thread.sleep(1000);
		sellerPage = homePage.clickSellerPage();
		Thread.sleep(1000);
		sellerPage.clickUploadProduct();

		imgUploadMsg = "Hãy chọn hình ảnh cho sản phẩm";
		nameProdMsg = "Hãy điền tên sản phẩm";
		catProdMsg = "Hãy chọn danh mục.";
		desProdMsg = "Hãy mô tả sản phẩm.";
		qtyProdMsg = "Nhập số lượng.";
		priceProdMsg = "Hãy điền giá.";
		weightProdMsg = "Hãy điền cân nặng sản phẩm.";
		requiredMsg = "Bắt buộc";

	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.beecow.com/page/upload-product");
		
	}

//	@Test
//	public void TC_008() {
//		verifyEqual(driver.getCurrentUrl(), "https://www.beecow.com/page/upload-product");
//	}
//	
//	@Test
//	public void TC_009() {
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.IMG_MSG, imgUploadMsg);
//	verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
//	verifyEqual(sellerPage.getTextProductNameMSG(), desProdMsg);
//	verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//	verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//	verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//	verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//	verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//	verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_010() {
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.clickPostProductBTN();
//	verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
//	verifyEqual(sellerPage.getTextProductNameMSG(), desProdMsg);
//	verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//	verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//	verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//	verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//	verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//	verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_011() {
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.inputProductName(productName);
//		sellerPage.clickPostProductBTN();
//	verifyEqual(sellerPage.getTextCatMSG(), catProdMsg);
//	verifyEqual(sellerPage.getTextProductNameMSG(), desProdMsg);
//	verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//	verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//	verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//	verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//	verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//	verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}

	@Test
	public void TC_012() {
		sellerPage.uploadIMG(pathDataImage);
		sellerPage.inputProductName(productName);
		sellerPage.clickCat1();
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
	
//	@Test
//	public void TC_013() {
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.inputProductName(productName);
//		sellerPage.clickCat1();
//		sellerPage.clickRandomCat1();
//		sellerPage.clickCat2();
//		sellerPage.clickRandomCat2();
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextQtyMSG(), qtyProdMsg);
//		verifyEqual(sellerPage.getTextDesMSG(), catProdMsg);
//		verifyEqual(sellerPage.getTextPriceMSG(), priceProdMsg);
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}
//	
//	@Test
//	public void TC_014() {
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.inputProductName(productName);
//		sellerPage.clickCat1();
//		sellerPage.clickRandomCat1();
//		sellerPage.clickCat2();
//		sellerPage.clickRandomCat2();
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
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.inputProductName(productName);
//		sellerPage.clickCat1();
//		sellerPage.clickRandomCat1();
//		sellerPage.clickCat2();
//		sellerPage.clickRandomCat2();
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
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.inputProductName(productName);
//		sellerPage.clickCat1();
//		sellerPage.clickRandomCat1();
//		sellerPage.clickCat2();
//		sellerPage.clickRandomCat2();
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
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.inputProductName(productName);
//		sellerPage.clickCat1();
//		sellerPage.clickRandomCat1();
//		sellerPage.clickCat2();
//		sellerPage.clickRandomCat2();
//		sellerPage.inputDes(description_txt);
//		sellerPage.inputQty(quantity_txt);
//		sellerPage.inputPrice(price_txt);
//		sellerPage.inputWeight(weight_txt);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(sellerPage.getTextWeightMSG(), weightProdMsg);
//		verifyEqual(sellerPage.getTextWidthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextLengthMSG(), requiredMsg);
//		verifyEqual(sellerPage.getTextHeightMSG(), requiredMsg);
//	}

//	@AfterClass
	public void afterClass() {
		closeBrowser();
	}

}
