
import Constants.Environment;
import DriverFactory.Driver;
import Listener.CustomListener;
import Pages.HomePage;
import Properties.Prop;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class RunClass {
    static WebDriver driver;
    static Prop p;
    static Driver d;

    RunClass() throws IOException {
        p = new Prop();
        d = new Driver();
        driver = d.launchBrowser(p.getBrowserValue());
    }


    public static void main(String[] args) throws IOException {
       // RunClass r = new RunClass();

//        ExtentReports report =new ExtentReports();
//
//        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("Reports/ExtentReport.html");;
//        report.attachReporter(extentSparkReporter);
//        extentSparkReporter.config().setDocumentTitle("Automation Report");
//        extentSparkReporter.config().setReportName("Regression Report");
//        extentSparkReporter.config().setTheme(Theme.STANDARD);
//        extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//        ExtentTest test=report.createTest("ExtentDemo");
//        test.log(Status.PASS,"Test Case is passed successfully in Demo");
//        report.flush();

//        CustomListener cL=new CustomListener();
//        cL.onTestStart();

//        driver.get(p.getAppUrl(Environment.DEV));
//        HomePage hm = new HomePage(driver);
//        hm.clickButtonWithID();
//        d.closeBrowser();
    }
}
