package page.signinPage;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;
import static page.signinPage.SigninPageLocators.*;

public class SigninPage extends BasePage {
    String pageURL = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
            + "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true";

    public void clearLogin() {
        lookForElement(USERNAME_INPUT).clear();
    }

    public void insertLogin(String login) {
        lookForElement(USERNAME_INPUT).sendKeys(login);
    }

    public void clearPassword() {
        lookForElement(PASSWORD_INPUT).clear();
    }

    public void insertPassword(String password) {
        lookForElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickLoginButton() {
        lookForElement(SINGNIN_IN_BUTTON).click();
    }

    public void open() {
        super.open(pageURL);

    }


}
