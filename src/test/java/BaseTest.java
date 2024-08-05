import Constants.Environment;
import DriverFactory.Driver;
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

    ExtentReports report;
    ExtentTest test;

    public ExtentSparkReporter extentSparkReporter;

    @BeforeTest
    public void startReporter() {
        report = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter("Reports/ExtentReport.html");
        report.attachReporter(extentSparkReporter);
        extentSparkReporter.config().setDocumentTitle("Automation Report");
        extentSparkReporter.config().setReportName("Regression Report");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        test = report.createTest("Test Case 1");
    }


    @BeforeMethod
    public void initSetUp() throws IOException {
        p = new Prop();
        d = new Driver();
        driver = d.launchBrowser(p.getBrowserValue());
        driver.get(p.getAppUrl(Environment.DEV));
        hm = new HomePage(driver);
        System.out.println("BeforeMethod is successfully executed");
    }

    @AfterMethod
    public void tearDown() {
        d.closeBrowser();

        System.out.println("BeforeMethod is successfully executed");
    }

    @AfterClass
    public void reportFlush()
    {
        report.flush();
    }
}
