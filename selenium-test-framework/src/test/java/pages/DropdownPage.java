package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownPage extends BasePage {
    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void navigateToDropdown() {
        driver.get(driver.getCurrentUrl() + "/dropdown");
    }

    public void selectOptionByText(String optionText) {
        Select select = new Select(wait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(dropdown)));
        select.selectByVisibleText(optionText);
    }

    public String getSelectedOption() {
        Select select = new Select(wait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(dropdown)));
        return select.getFirstSelectedOption().getText();
    }
}
