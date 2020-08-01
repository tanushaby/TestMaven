package page.errorMessagePage;

import page.BasePage;

import static page.errorMessagePage.ErrorMessagePageLocator.ERROR_LOGIN_MESSAGE;

public class ErrorMessagePage extends BasePage {
    public boolean isDispalyed() {
        return lookForElement(ERROR_LOGIN_MESSAGE).isDisplayed();
    }

}