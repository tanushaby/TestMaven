package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.confirmationPage.ConfirmationPage;
import page.errorMessagePage.ErrorMessagePage;
import page.signinPage.SigninPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    SigninPage signinPage;
    ConfirmationPage confirmationPage;
    ErrorMessagePage errorMessagePage;

    @BeforeMethod
    public void setUp() {
        signinPage = new SigninPage();
        confirmationPage = new ConfirmationPage();
        errorMessagePage = new ErrorMessagePage();
        signinPage.open();
        signinPage.clearLogin();
        signinPage.clearPassword();
    }

    @Test(description = "Все поля валидные")
    public void successfulLoginTest() {
        signinPage.insertLogin("demo");
        signinPage.insertPassword("demo");
        signinPage.clickLoginButton();

        Assert.assertTrue(confirmationPage.isDisplayed());
    }

    @Test(description = "Все поля пустые")
    public void emptyFields() {
        signinPage.clickLoginButton();

        Assert.assertTrue(errorMessagePage.isDispalyed());
    }

    @Test(description = "Поле пороль пустьое")
    public void oneEmptyFields() {
        signinPage.insertLogin("demo");
        signinPage.clickLoginButton();

        Assert.assertTrue(errorMessagePage.isDispalyed());
    }

    @Test(description = "Невалидные логин и пороль")
    public void notValidLoginAndPassword() {
        signinPage.insertLogin("0000");
        signinPage.insertPassword("0000");
        signinPage.clickLoginButton();

        Assert.assertTrue(errorMessagePage.isDispalyed());
    }

    @Override
    @AfterTest
    public void tearDown() {
        super.tearDown();
        signinPage = null;
        confirmationPage = null;
        errorMessagePage = null;
    }
}
