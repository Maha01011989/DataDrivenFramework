import Utils.ReportUtil;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    @Test(testName = "Click Button with ID")
    public void clickButtonWithID() throws InterruptedException {
        try {
            hm.clickButtonWithID();
            test.log(Status.PASS, "Clicked the ID button successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Button is not clicked successfully");
            test.log(Status.INFO, "An exception occurred ");
        }

    }

    @Test(testName = "Click Button with link")
    public void clickButtonWithLink() {
        try {
            hm.clickButtonWithLinkText();
            test.log(Status.PASS, "Clicked the link successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "Button link is not clicked successfully");
            test.log(Status.INFO, "An exception occurred ");
            //test.log(Status.INFO, e.printStackTrace());
        }


    }
}
