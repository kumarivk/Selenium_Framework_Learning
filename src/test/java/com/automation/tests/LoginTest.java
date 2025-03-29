package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;
import com.automation.utils.TestDataReader;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        String username = TestDataReader.getValue("loginData", "validUser", "username");
        String password = TestDataReader.getValue("loginData", "validUser", "password");
        String baseUrl = TestDataReader.getValue("urls", "baseUrl");

        driver.get(baseUrl);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        // Add assertions here
    }

    @Test
    public void invalidLoginTest() {
        String username = TestDataReader.getValue("loginData", "invalidUser", "username");
        String password = TestDataReader.getValue("loginData", "invalidUser", "password");
        String baseUrl = TestDataReader.getValue("urls", "baseUrl");

        driver.get(baseUrl);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        // Add assertions here
    }
}
