package driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utills.WebDriverListener;


public class DriverSingleton {
    static Logger log = Logger.getRootLogger();
    private static EventFiringWebDriver driver;

    private DriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Egor\\Downloads\\chromedriver.exe");
            driver = new EventFiringWebDriver(new ChromeDriver());
            driver.register(new WebDriverListener());
        }
        log.info("Get driver");
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            log.info("Close driver");
            driver = null;
        }
    }
}

