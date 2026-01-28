package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class DynamicLoadingTests extends BaseTest {

    @Test
    public void testDynamicLoading() {
        DynamicLoadingPage dynamicPage = new DynamicLoadingPage(driver, wait);

        dynamicPage.navigateToDynamicLoading();
        dynamicPage.clickStart();

        String finishedText = dynamicPage.waitForFinishedText();

        Assert.assertEquals(finishedText, "Hello World!",
                "Finished text should be 'Hello World!' after dynamic loading");
    }
}
