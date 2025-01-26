package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.UserProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartPositiveTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOnUserIcon();
        new UserProfilePage(driver).clickLoginPage().enterUserData("tl49@gmx.com", "TestProba1$").clickLoginButton();
    }

    @Test
    public void addKhinkaliPositiveTest() {
        new UserProfilePage(driver).clickFoodNow()
                .clickKhinkali()
                .addKhikaliToCart()
                .clickIconCart()
                .verifyKhinkaliAdded();
    }

    @Test
    public void addSteakPositiveTest() {
        new UserProfilePage(driver).clickIconCart()
                .clickGoShopping()
                .clickMeat()
                .clickAddSteak()
                .verifySteakIsAdded();

    }
    @Test
    public void confirmedOrderTest(){
        new UserProfilePage(driver).clickConfirmed()
                .selectCancelOeder()
                .clickButtonCancel()
                .verifyCancelMessage();
    }
}
