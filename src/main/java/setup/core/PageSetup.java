package setup.core;

import org.openqa.selenium.WebDriver;

public class PageSetup {

    protected static WebDriver driver;

    public PageSetup(WebDriver driver) {
        DriverFactory factory = new DriverFactory();
//        String baseUrl = System.getProperty("env").length()>0?System.getProperty("env"):env;
//        String browser = System.getProperty("browser").length()>0?System.getProperty("browser"):chrome;
//        String url = BaseUrl.valueOf(baseUrl).getUrl();
//        this.driver = factory.getDriver(BrowserType.getBrowserType(browser));
        this.driver = null;

    }

}
