package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class UploadPage extends BasePage {
    private final By fileInput = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFilesText = By.id("uploaded-files");

    public UploadPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void navigateToUpload() {
        driver.get(driver.getCurrentUrl() + "/upload");
    }

    public void uploadFile(String filePath) {
        File file = new File(filePath);
        driver.findElement(fileInput).sendKeys(file.getAbsolutePath());
        click(uploadButton);
    }

    public String getUploadedFileName() {
        return getText(uploadedFilesText);
    }
}
