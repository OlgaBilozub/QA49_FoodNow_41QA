package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.UserProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteCartTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOnUserIcon();
        new UserProfilePage(driver).clickLoginPage().enterUserData("tl49@gmx.com", "TestProba1$").clickLoginButton();
    }

    @Test
    public void deleteProductTest() {
        new UserProfilePage(driver).clickFoodNow()
                .clickKhinkali()
                .addKhikaliToCart()
                .clickIconCart()
                .clickDeleteProduct()
                .verifyMessage();
    }
}
