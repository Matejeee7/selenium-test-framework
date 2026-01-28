package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver, wait);
        SecureAreaPage securePage = new SecureAreaPage(driver, wait);

        loginPage.navigateToLogin();
        loginPage.login("tomsmith", "SuperSecretPassword!");

        Assert.assertTrue(securePage.isOnSecurePage(), "Should be on secure page after valid login");
        Assert.assertTrue(securePage.getSuccessMessage().contains("You logged into a secure area!"),
                "Success message should be displayed");
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver, wait);

        loginPage.navigateToLogin();
        loginPage.login("tomsmith", "wrongpassword");

        Assert.assertTrue(loginPage.getErrorMessage().contains("Your password is invalid!"),
                "Error message should be displayed for invalid password");
    }
}
