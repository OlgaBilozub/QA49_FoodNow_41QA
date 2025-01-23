package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.UserProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickLogo();
        new UserProfilePage(driver).clickLoginPage().enterUserData("tl49@gmx.com", "TestProba1$").clickLoginButton();
    }

    @Test
    public void addProductPositiveTest() {
        new UserProfilePage(driver).clickFoodNow()
                .clickKhinkali()
                .addKhikaliToCart();
    }

    @Test
    public void addProductCartTest() {
        new UserProfilePage(driver).clickLogoCart()
                .clickGoShopping()
                .addCrabLeg();

    }
}
