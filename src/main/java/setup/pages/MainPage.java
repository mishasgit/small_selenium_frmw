package setup.pages;

import setup.core.BaseSetup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSetup {

    private static final Logger logger = LogManager.getLogger(MainPage.class);

    @FindBy(css = "header[class*='ltk-header'] a[class*='v-btn--secondary']")
    WebElement signUpBtn;

    public MainPage(){
        PageFactory.initElements(driver, this);
    }


    public SignUpPage clickSignUpBtn(){
        logger.info("clicking on SingUp btn on Main Page");
        signUpBtn.click();
        return new SignUpPage();
    }
}
