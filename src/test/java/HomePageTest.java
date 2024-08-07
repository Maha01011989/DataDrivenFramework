import ExtentReport.ExtentReportManager;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    @Test(testName = "Click Button with ID")
    public void clickButtonWithID() throws InterruptedException {
        try {
            hm.clickButtonWithID();
            ExtentReportManager.getTest().log(Status.PASS, "Button with ID clicked successfully");
            hm.navigateToHomePage();
            ExtentReportManager.getTest().log(Status.INFO, "Navigated back to Home page");
        } catch (Exception e) {
            ExtentReportManager.getTest().log(Status.FAIL, "Button with ID clicked unsuccessfully");
            ExtentReportManager.getTest().log(Status.FAIL, e.getMessage());
        }
    }


    @Test(testName = "Click Button with link")
    public void clickButtonWithLink() {
        try {
            hm.clickButtonWithLinkText();
            ExtentReportManager.getTest().log(Status.PASS, "Button with link clicked successfully");
        } catch (Exception e) {
            ExtentReportManager.getTest().log(Status.FAIL, "Button with link clicked unsuccessfully");
            ExtentReportManager.getTest().log(Status.FAIL, e.getMessage());
        }
    }
}
