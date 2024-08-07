package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public WebDriver driver;

    public WebDriver launchBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                return driver;
            case "firefox":
                driver = new FirefoxDriver();
                return driver;
            case "edge":
                driver = new EdgeDriver();
                return driver;
        }
        return driver;
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.close();
        } else {
            System.out.println("driver is null");
        }
    }

    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        } else {
            System.out.println("driver is null");
        }
    }
}
