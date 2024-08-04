package Pages;

import Utils.ElementUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    ElementUtil elementUtil = new ElementUtil();

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "et_pb_menu__logo")
    private WebElement headerLogo;

    @FindBy(id = "idExample")
    private WebElement buttonID;

    @FindBy(linkText = "Click me using this link text!")
    private WebElement buttonLink;

    @FindBy(className = "buttonClass")
    private WebElement buttonClass;
    @FindBy(name = "button1")
    private WebElement buttonName;


    public void clickButtonWithID() {
        elementUtil.doClick(buttonID);
        System.out.println("button with id is clicked");
    }

    public void clickButtonWithLinkText() {
        elementUtil.doClick(buttonLink);
        System.out.println("button with Link is clicked");
    }
    public void navigateToHomePage() {
        driver.navigate().back();
    }



}
