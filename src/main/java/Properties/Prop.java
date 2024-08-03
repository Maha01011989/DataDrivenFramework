package Properties;

import Constants.Config;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {
    FileInputStream fis;
    Properties prop;

    public Prop() throws IOException {
        fis = new FileInputStream(Config.configPropertiesFilePath);
        prop = new Properties();
        prop.load(fis);
    }

    public String getBrowserValue() {
        String browserValue;
        browserValue = prop.getProperty(Config.BROWSER);
        return browserValue;
    }

    public String getAppUrl(String env) {
        String getAppUrl;
        getAppUrl = prop.getProperty("App"+env+"Url");
        return getAppUrl;
    }
}
