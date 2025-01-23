package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).clickAllProducts();
    }
    @Test
    public void homePageTest(){
        new HomePage(driver).addBananas().clickLogin();
    }
}
