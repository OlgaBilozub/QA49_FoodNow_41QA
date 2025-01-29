package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOnLogoPage();
    }
    @Test
    public void HomePageTest(){
        new HomePage(driver).clickDairy();
    }

}
