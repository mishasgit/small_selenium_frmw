package setup.pages;

import setup.core.BaseSetup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseSetup {

    private static final Logger logger = LogManager.getLogger(SignUpPage.class);
    @FindBy(id="input-36")
    WebElement emailInput;
    @FindBy(css="button[class^='v-btn--primary mt-10']>span")
    WebElement continueBtn;
    @FindBy(id="input-47") WebElement passInput;
    @FindBy(css="button[class^='v-btn--primary mt-4']>span") WebElement signUpToBeginShopBtn;

    public SignUpPage(){
        PageFactory.initElements(driver, this);
    }

    public ShoppingPage singUpWithEmailAndPass(String email, String pass){
        logger.info("type in email "+email+" to email input field");
        emailInput.sendKeys(email);
        logger.info("click on Continue btn");
        continueBtn.click();
        logger.info("type in pass "+pass+" to password input field");
        passInput.sendKeys(pass);
        logger.info("click on Set Pass btn");
        signUpToBeginShopBtn.click();
        return new ShoppingPage();
    }
}
