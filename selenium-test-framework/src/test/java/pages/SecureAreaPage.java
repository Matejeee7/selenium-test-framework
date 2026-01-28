package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureAreaPage extends BasePage {
    private final By successMessage = By.id("flash");
    private final By logoutButton = By.xpath("//a[@href='/logout']");

    public SecureAreaPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public String getSuccessMessage() {
        return getText(successMessage);
    }

    public boolean isLogoutButtonVisible() {
        return isElementVisible(logoutButton);
    }

    public boolean isOnSecurePage() {
        return driver.getCurrentUrl().contains("/secure");
    }
}
