package setup.core;

import setup.core.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class DriverFactory {

    private static final Logger logger = LogManager.getLogger(DriverFactory.class);
    WebDriver driver;

    public WebDriver getDriver(BrowserType type){
        logger.info("Setup webdriver for "+type.getValue()+" browser");
        WebDriverManager.getInstance(DriverManagerType.valueOf(type.getValue().toUpperCase())).setup();
        switch (type){
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case CHROME:
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return this.driver;
    }
}
