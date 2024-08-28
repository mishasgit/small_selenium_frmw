package setup.pages;

import setup.core.BaseSetup;
import setup.core.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingPage extends BaseSetup {

    private static final Logger logger = LogManager.getLogger(ShoppingPage.class);
    @FindBy(css="div[class*='row ltk-list']")
    WebElement listOfProfiles;

    public ShoppingPage(){
        PageFactory.initElements(driver, this);
    }

    public ShoppingPage listOfProfilesPresent(){
        logger.info("check if list of profiles is present");
        Utils.waitFor(()->
            listOfProfiles.isDisplayed()
        , 10,500,1000);
        return this;
    }

    public void checkIfOnShoppingPage(String url){
        logger.info("check if current url contains "+url);
        assertTrue(driver.getCurrentUrl().contains(url));
    }
}
