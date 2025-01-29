package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.LoginPage;
import com.foodnow.pages.UserProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPositiveTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOnUserIcon();
        new UserProfilePage(driver).clickLoginPage();

    }

    @Test
    public void loginPositiveTest() {
        new LoginPage(driver).enterUserData("tl49@gmx.com", "TestProba1$")
                .clickLoginButton();
        new UserProfilePage(driver).verifyUserName("tl49@gmx.com");
    }
}
