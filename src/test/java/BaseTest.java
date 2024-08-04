import Constants.Environment;
import DriverFactory.Driver;
import Pages.HomePage;
import Properties.Prop;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.io.IOException;

public class BaseTest {
    WebDriver driver;
    Prop p;
    Driver d;
    HomePage hm;

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
        System.out.println("AfterMethod is successfully executed");
    }
}
