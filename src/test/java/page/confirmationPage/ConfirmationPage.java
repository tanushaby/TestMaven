package page.confirmationPage;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

import static page.confirmationPage.ConfirmationPageLocators.CONFIRMATION_WINDOW;

public class ConfirmationPage extends BasePage {
    public WebElement lookForElement(By by) {
        return super.lookForElement(by);
    }

    public boolean isDisplayed() {
        boolean displayed = lookForElement(CONFIRMATION_WINDOW).isDisplayed();
        return displayed;

    }
}