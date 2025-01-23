package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.LoginPage;
import com.foodnow.pages.UserProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOnUserIcon();
        new UserProfilePage(driver).clickLoginPage();
        new LoginPage(driver).enterUserData("tl49@gmx.com", "TestProba1$")
                .clickLoginButton();
    }
    @Test
    public void logOutTest(){
        new UserProfilePage(driver).clickLogOut();
    }
}
