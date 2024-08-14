package Constants;

import Utils.CommonUtil;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Report {
    static CommonUtil cu = new CommonUtil();

    public static final String REPORT_FOLDER = "Reports/ExtentReport.html" + cu.getCurrentDateTime();

    public static final String REPORT_TITLE = "Ultimate QA Automation Report";

    public static final String REPORT_NAME = "Regression Report";

    public static final Theme DEFAULT_THEME = Theme.DARK;
}
