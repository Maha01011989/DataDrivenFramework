package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
    static ExtentReports report;
    static ExtentTest test;
    static public ExtentSparkReporter extentSparkReporter;

    public static ExtentReports getExtentReportInstance() {
        if (report == null) {
            report = new ExtentReports();
            extentSparkReporter = new ExtentSparkReporter("Reports/ExtentReport.html");
            report.attachReporter(extentSparkReporter);
            extentSparkReporter.config().setDocumentTitle("Automation Report");
            extentSparkReporter.config().setReportName("Regression Report");
            extentSparkReporter.config().setTheme(Theme.STANDARD);
            extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        }
        return report;
    }

    public static ExtentTest setTest(String result) {
        test = report.createTest(result);
        return test;
    }

    public static ExtentTest getTest() {
        return test;
    }


    public static void endReport() {
        report.flush();
    }
}
