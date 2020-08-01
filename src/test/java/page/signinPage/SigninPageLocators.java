package page.signinPage;

import org.openqa.selenium.By;

public class SigninPageLocators {
    protected static final By USERNAME_INPUT = By.xpath("//*[@id=\"login-form\"]/div[1]/input");
    protected static final By PASSWORD_INPUT = By.xpath("//*[@id=\"login-form\"]/div[2]/input");
    protected static final By SINGNIN_IN_BUTTON = By.cssSelector("#login-button");

}
