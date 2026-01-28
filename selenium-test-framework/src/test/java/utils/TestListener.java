package utils;

import base.BaseTest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        System.out.println("Test failed: " + testName);

        if (BaseTest.getDriver() != null) {
            String screenshotPath = ScreenshotUtil.takeScreenshot(BaseTest.getDriver(), testName);
            if (screenshotPath != null) {
                System.out.println("Screenshot saved: " + screenshotPath);
            }
        }
    }
}
