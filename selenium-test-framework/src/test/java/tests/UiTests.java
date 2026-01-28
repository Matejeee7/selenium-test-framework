package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import pages.DropdownPage;
import pages.UploadPage;

public class UiTests extends BaseTest {

    @Test
    public void testCheckboxes() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver, wait);

        checkboxesPage.navigateToCheckboxes();

        // Initially first checkbox is unchecked, second is checked
        boolean initialFirstState = checkboxesPage.isFirstCheckboxSelected();
        boolean initialSecondState = checkboxesPage.isSecondCheckboxSelected();

        // Toggle both checkboxes
        checkboxesPage.clickFirstCheckbox();
        checkboxesPage.clickSecondCheckbox();

        // Verify states changed
        Assert.assertNotEquals(checkboxesPage.isFirstCheckboxSelected(), initialFirstState,
                "First checkbox state should change after click");
        Assert.assertNotEquals(checkboxesPage.isSecondCheckboxSelected(), initialSecondState,
                "Second checkbox state should change after click");
    }

    @Test
    public void testDropdown() {
        DropdownPage dropdownPage = new DropdownPage(driver, wait);

        dropdownPage.navigateToDropdown();
        dropdownPage.selectOptionByText("Option 1");

        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 1",
                "Selected option should be 'Option 1'");
    }

    @Test
    public void testFileUpload() {
        UploadPage uploadPage = new UploadPage(driver, wait);

        uploadPage.navigateToUpload();
        uploadPage.uploadFile("src/test/resources/test-file.txt");

        Assert.assertEquals(uploadPage.getUploadedFileName(), "test-file.txt",
                "Uploaded file name should match");
    }
}
