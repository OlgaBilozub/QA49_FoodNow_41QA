package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.LoginPage;
import com.foodnow.pages.UserProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginNegativeTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOnUserIcon();
        new UserProfilePage(driver).clickLoginPage();

    }

    @Test
    public void loginWithInvalidEmailTest() {
        new LoginPage(driver).enterEmail("tl49@gmx.c")
                .enterPassword("TestProba1$")
                .clickLoginButton();
        new LoginPage(driver).verifyErrorMessage();

    }

    @Test
    public void loginWithInvalidPasswordTest() {
        new LoginPage(driver).enterEmail("tl49@gmx.com")
                .enterPassword("TestProba1")
                .clickLoginButton();
        new LoginPage(driver).verifyErrorMessage();
    }

    @Test
    public void loginWithEmailWithoutSpecialSymbolTest() {
        new LoginPage(driver).enterEmail("tl49gmx.com")
                .enterPassword("TestProba1$")
                .clickLoginButton();
        new LoginPage(driver).verifyErrorMessage();
    }

    @Test
    public void loginWithEmptyPasswordTest() {
        new LoginPage(driver).enterEmail("tl49@gmx.com")
                .enterPassword("")
                .clickLoginButton();
        new LoginPage(driver).verifyErrorMessage();
    }

    @Test
    public void loginWithEmptyEmailTest() {
        new LoginPage(driver).enterEmail("")
                .enterPassword("TestProba1$")
                .clickLoginButton();
        new LoginPage(driver).verifyErrorMessage();
    }
}
