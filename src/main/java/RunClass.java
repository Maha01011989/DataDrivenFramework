
import Constants.Environment;
import DriverFactory.Driver;
import Properties.Prop;
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
        RunClass r = new RunClass();
        driver.get(p.getAppUrl(Environment.DEV));
        d.closeBrowser();
    }
}
