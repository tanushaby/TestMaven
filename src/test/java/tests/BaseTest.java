package tests;

import driver.DriverSingleton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import utills.TestListener;


@Listeners(TestListener.class)
public class BaseTest {

    @AfterMethod
    public void tearDown() {
        DriverSingleton.closeDriver();
    }
}
