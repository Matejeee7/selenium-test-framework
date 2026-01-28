package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage extends BasePage {
    private final By startButton = By.xpath("//button[text()='Start']");
    private final By loadingIndicator = By.id("loading");
    private final By finishedText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void navigateToDynamicLoading() {
        driver.get(driver.getCurrentUrl() + "/dynamic_loading/2");
    }

    public void clickStart() {
        click(startButton);
    }

    public String waitForFinishedText() {
        // Wait for loading to disappear and finished text to appear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));
        return getText(finishedText);
    }
}
