import Utils.ReportUtil;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    ReportUtil reportUtil=new ReportUtil();
    @Test
    public void clickButtonWithID() throws InterruptedException {
        hm.clickButtonWithID();
        hm.navigateToHomePage();
        Thread.sleep(5000);
        test.log(Status.PASS, "Clicked the ID button successfully");
    }

    @Test
    public void clickButtonWithLink() {
        hm.clickButtonWithLinkText();
    }
}
