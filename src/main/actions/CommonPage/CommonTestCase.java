package CommonPage;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class CommonTestCase {
	WebDriver driver;
	ExtentHtmlReporter htmlReport;
	ExtentReports extent;
	ExtentTest test;

	public WebDriver openMultiBrowser(String browser, String version, String url) {
		if (browser.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriverManager.getInstance().version(version).setup();
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().window().maximize();

		} else if (browser.equals("firefox")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			FirefoxDriverManager.getInstance().version(version).setup();
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		return driver;
	}

	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is " + result.getName(), ExtentColor.RED));
			test.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed is " + result.getThrowable(), ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is " + result.getName(), ExtentColor.GREEN));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel("Test Case Skipped is " + result.getName(), ExtentColor.ORANGE));
		}
	}

	public void logTestCase(String name) {
		test = extent.createTest(name);
	}

	public void exportReport() {
		extent.flush();
//		extent.close();
	}

	public void initialReport(String report) {
		htmlReport = new ExtentHtmlReporter(
				System.getProperty("user.dir").concat("/test-output/ExtendReport/" + report));
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		htmlReport.config().setReportName("Regression Testing");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTestViewChartLocation(ChartLocation.TOP);
	}

	public String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public String randomEmail() {
		Random rand = new Random();
		int n = rand.nextInt(9999999);
		return String.valueOf(n);
	}

	public void verifyEqual(String actual, String expected) {
		assertEquals(actual, expected);
	}

	public void verifyEqual(int actual, int expected) {
		assertEquals(actual, expected);
	}

	public void closeBrowser() {
		driver.quit();
	}

	public void refreshBrowser() {
		refreshBrowser();
	}

//	public JsonData getDataJson(String JsonFile) {
//		String json = readFile(JsonFile);
//		return new Gson().fromJson(json, JsonData.class);
//	}

	public String readFile(String filename) {
		String result = "";
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			result = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
