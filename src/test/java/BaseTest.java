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

    //ExtentReportManager erm;
    ExtentReports extentReports;

    ExtentTest extentTest;

    @BeforeMethod
    public void initSetUp(ITestResult result) throws IOException {
        p = new Prop();
        d = new Driver();
        driver = d.launchBrowser(p.getBrowserValue());
        driver.get(p.getAppUrl(Environment.DEV));
        hm = new HomePage(driver);
        extentReports = ExtentReportManager.getExtentReportInstance();
        extentTest = ExtentReportManager.setTest(result.getMethod().getMethodName());
        System.out.println("BeforeMethod is successfully executed");
    }

    @AfterMethod
    public void tearDown() {
        d.closeBrowser();
        System.out.println("AfterMethod is successfully executed");
    }

    @AfterSuite
    public void flushReport() {
        ExtentReportManager.endReport();
        System.out.println("AfterSuite is successfully executed");
    }
}
