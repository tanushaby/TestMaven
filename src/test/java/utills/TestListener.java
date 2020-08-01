package utills;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    static Logger log = Logger.getRootLogger();

    @Override
    public void onFinish(ITestContext arg0) {

    }

    @Override
    public void onStart(ITestContext arg0) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        log.error(arg0.getName()+" TEST CASE FAILED");
        ScreenShotServise.saveScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        log.info(arg0.getName()+" test case SKIPPED");

    }

    @Override
    public void onTestStart(ITestResult arg0) {
        log.info(arg0.getName()+" test case STARTED");

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        log.info(arg0.getName()+" test case SUCCESS");

    }
}


