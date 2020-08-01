package page;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BasePage {
        private WebDriver driver = DriverSingleton.getDriver();

        protected WebElement lookForElement(By by) {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            return driver.findElement(by);
        }

        public void open(String pageURL) {
            driver.get(pageURL);
        }
}

