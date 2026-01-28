package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxesPage extends BasePage {
    private final By firstCheckbox = By.xpath("//input[@type='checkbox'][1]");
    private final By secondCheckbox = By.xpath("//input[@type='checkbox'][2]");

    public CheckboxesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void navigateToCheckboxes() {
        driver.get(driver.getCurrentUrl() + "/checkboxes");
    }

    public void clickFirstCheckbox() {
        click(firstCheckbox);
    }

    public void clickSecondCheckbox() {
        click(secondCheckbox);
    }

    public boolean isFirstCheckboxSelected() {
        return isElementSelected(firstCheckbox);
    }

    public boolean isSecondCheckboxSelected() {
        return isElementSelected(secondCheckbox);
    }
}
