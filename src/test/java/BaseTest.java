import Constants.Environment;
import DriverFactory.Driver;
import ExtentReport.ExtentReportManager;
import Pages.HomePage;
import Properties.Prop;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import junit.framework.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest {
    WebDriver driver;
    Prop p;
    Driver d;
    HomePage hm;
    ExtentReports extentReports;
    ExtentTest extentTest;

    @BeforeSuite
    public void Test() {
        System.out.println("Before suite is executed successfully");
    }

    @BeforeTest
    public void Test1() {
        System.out.println("Before test is executed successfully");
    }

    @AfterTest
    public void Test2() {
        System.out.println("After test is executed successfully");
    }

    @BeforeClass
    public void initSetUp() throws IOException {
        p = new Prop();
        d = new Driver();
        extentReports = ExtentReportManager.getExtentReportInstance();
        driver = d.launchBrowser(p.getBrowserValue());
        driver.get(p.getAppUrl(Environment.DEV));
        hm = new HomePage(driver);
        System.out.println("Before class is executed");
    }

    @BeforeMethod
    public void initSetUp(ITestResult result) {
        extentTest = ExtentReportManager.setTest(result.getMethod().getMethodName());
        System.out.println("BeforeMethod is successfully executed");
    }

    @AfterMethod
    public void Test3() {
        System.out.println("AfterMethod is successfully executed");
    }

    @AfterClass
    public void tearDown() {
        d.closeBrowser();
        System.out.println("AfterClass is successfully executed");
    }

    @AfterSuite
    public void flushReport() {
        ExtentReportManager.endReport();
        d.quitBrowser();
        System.out.println("AfterSuite is successfully executed");
    }
}
