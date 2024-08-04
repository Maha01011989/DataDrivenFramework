import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    @Test
    public void clickButtonWithID() {
        hm.clickButtonWithID();
    }

    @Test
    public void clickButtonWithLink() {
        hm.clickButtonWithLinkText();
    }
}
