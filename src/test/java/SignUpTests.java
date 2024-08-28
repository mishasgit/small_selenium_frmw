import setup.core.BaseSetup;
import setup.core.enums.Dictionary;
import setup.core.utils.Utils;
import setup.pages.MainPage;
import org.junit.jupiter.api.Test;

public class SignUpTests extends BaseSetup {

    private final String url = "/home/for-you";
    private final String emailSuffix = "@gmail.com";

    @Test
    public void signUpTest(){
        MainPage mainPage = new MainPage();
        String str = Utils.randomAlphanumericStringGenerator(10, Dictionary.ALPHANUMERIC);
        String email = str+emailSuffix;
        mainPage
                .clickSignUpBtn()
                .singUpWithEmailAndPass(email,str)
                .listOfProfilesPresent()
                .checkIfOnShoppingPage(url);
    }

}
