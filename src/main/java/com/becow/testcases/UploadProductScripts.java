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

public class UploadProductScripts extends CommonTestCase{
	WebDriver driver;
	HomePage homePage;
	SellerPage sellerPage;
	String userCorrect, passCorrect;
	String imgUploadMsg, nameProdMsg, catProdMsg, desProdMsg, qtyProdMsg, priceProdMsg;
	String weightProdMsg, requiredMsg, productName;
	String pathDataImage;
	
	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void beforeClass(String browser, String version, String url) throws InterruptedException {
		driver = openMultiBrowser(browser, version, url);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickLoginMenu();
		
		userCorrect = "genymotionios@gmail.com";
		passCorrect = "1234@abcd";
		productName = "Test Product" + randomEmail();
		
		pathDataImage = "C:\\Users\\dunghvnguyen\\Desktop\\linh tinh\\test1.jpg";
		
		homePage.inputUsername(userCorrect);
		homePage.inputPass(passCorrect);
		homePage.clickLoginBTN();
		Thread.sleep(1000);
		sellerPage = homePage.clickSellerPage();
		
		imgUploadMsg 	= "Hãy chọn hình ảnh cho sản phẩm";
		nameProdMsg 	= "Hãy điền tên sản phẩm";
		catProdMsg		= "Hãy chọn danh mục.";
		desProdMsg		= "Hãy mô tả sản phẩm.";
		qtyProdMsg		= "Nhập số lượng.";
		priceProdMsg	= "Hãy điền giá.";
		weightProdMsg	= "Hãy điền cân nặng sản phẩm.";
		requiredMsg		= "Bắt buộc";
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		sellerPage.clickUploadProduct();
	}
	
//	@Test
//	public void TC_008() {
//		verifyEqual(driver.getCurrentUrl(), "https://www.beecow.com/page/upload-product");
//	}
//	
//	@Test
//	public void TC_009() {
//		sellerPage.clickPostProductBTN();
//		verifyEqual(SellerPageUI.IMG_MSG, imgUploadMsg);
//		verifyEqual(SellerPageUI.PROD_NAME_MSG, nameProdMsg);
//		verifyEqual(SellerPageUI.CAT_MSG, catProdMsg);
//		verifyEqual(SellerPageUI.DES_MSG, desProdMsg);
//		verifyEqual(SellerPageUI.QTY_MSG, qtyProdMsg);
//		verifyEqual(SellerPageUI.PRICE_MSG, priceProdMsg);
//		verifyEqual(SellerPageUI.WEIGHT_MSG, weightProdMsg);
//		verifyEqual(SellerPageUI.WIDTH_MSG, requiredMsg);
//		verifyEqual(SellerPageUI.LENGTH_MSG, requiredMsg);
//		verifyEqual(SellerPageUI.HEIGHT_MSG, requiredMsg);
//	}
//	
//	@Test
//	public void TC_010() {
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.clickPostProductBTN();
//		verifyEqual(SellerPageUI.PROD_NAME_MSG, nameProdMsg);
//		verifyEqual(SellerPageUI.CAT_MSG, catProdMsg);
//		verifyEqual(SellerPageUI.DES_MSG, desProdMsg);
//		verifyEqual(SellerPageUI.QTY_MSG, qtyProdMsg);
//		verifyEqual(SellerPageUI.PRICE_MSG, priceProdMsg);
//		verifyEqual(SellerPageUI.WEIGHT_MSG, weightProdMsg);
//		verifyEqual(SellerPageUI.WIDTH_MSG, requiredMsg);
//		verifyEqual(SellerPageUI.LENGTH_MSG, requiredMsg);
//		verifyEqual(SellerPageUI.HEIGHT_MSG, requiredMsg);
//	}
	
	@Test
	public void TC_011() {
//		sellerPage.clickUpLoadIMG();
//		sellerPage.uploadIMG(pathDataImage);
		sellerPage.inputProductName(productName);
		sellerPage.clickPostProductBTN();
		verifyEqual(SellerPageUI.CAT_MSG, catProdMsg);
		verifyEqual(SellerPageUI.DES_MSG, desProdMsg);
		verifyEqual(SellerPageUI.QTY_MSG, qtyProdMsg);
		verifyEqual(SellerPageUI.PRICE_MSG, priceProdMsg);
		verifyEqual(SellerPageUI.WEIGHT_MSG, weightProdMsg);
		verifyEqual(SellerPageUI.WIDTH_MSG, requiredMsg);
		verifyEqual(SellerPageUI.LENGTH_MSG, requiredMsg);
		verifyEqual(SellerPageUI.HEIGHT_MSG, requiredMsg);
	}
//	
//	@Test
//	public void TC_012() {
//		sellerPage.clickUpLoadIMG();
//		sellerPage.uploadIMG(pathDataImage);
//		sellerPage.inputProductName(productName);
//		
//		
//		
//		sellerPage.clickPostProductBTN();
//		verifyEqual(SellerPageUI.PROD_NAME_MSG, nameProdMsg);
//		verifyEqual(SellerPageUI.CAT_MSG, catProdMsg);
//		verifyEqual(SellerPageUI.DES_MSG, desProdMsg);
//		verifyEqual(SellerPageUI.QTY_MSG, qtyProdMsg);
//		verifyEqual(SellerPageUI.PRICE_MSG, priceProdMsg);
//		verifyEqual(SellerPageUI.WEIGHT_MSG, weightProdMsg);
//		verifyEqual(SellerPageUI.WIDTH_MSG, requiredMsg);
//		verifyEqual(SellerPageUI.LENGTH_MSG, requiredMsg);
//		verifyEqual(SellerPageUI.HEIGHT_MSG, requiredMsg);
//	}
	
	
	@AfterClass
	public void afterClass() {
		closeBrowser();
	}

}
