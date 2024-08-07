package ExtentReport;

import Constants.Report;
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
            extentSparkReporter = new ExtentSparkReporter(Report.REPORT_FOLDER);
            report.attachReporter(extentSparkReporter);
            extentSparkReporter.config().setDocumentTitle(Report.REPORT_TITLE);
            extentSparkReporter.config().setReportName(Report.REPORT_NAME);
            extentSparkReporter.config().setTheme(Report.DEFAULT_THEME);
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
