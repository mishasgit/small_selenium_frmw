package setup.core;

import setup.core.enums.BaseUrl;
import setup.core.enums.BrowserType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseSetup {

    private static final Logger logger = LogManager.getLogger(BaseSetup.class);
    protected static WebDriver driver;
    private static final String CHROME = "CHROME";
    private static final String ENV = "PROD";

    @BeforeEach
    public void setup(){
        DriverFactory factory = new DriverFactory();
        logger.info("getting system property to setup tests");
        String browser = null != System.getProperty("browser")?System.getProperty("browser"): CHROME;
        String env = null != System.getProperty("env")?System.getProperty("env"): ENV;
        String url = BaseUrl.valueOf(env).getUrl();
        logger.info("starting test on "+env+" env");
        driver = factory.getDriver(BrowserType.getBrowserType(browser));
        logger.info("open "+url);
        driver.get(url);
    }

    @AfterEach
    public void close(){
        logger.info("closing browser");
//        driver.quit();
    }
}
