package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.RegistrationPage;
import com.foodnow.pages.UserProfilePage;
import com.utils.DataProviders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationPositiveTest extends TestBase {
    RegistrationPage registrationPage;

    @BeforeMethod
    public void precondition() {
        registrationPage = new RegistrationPage(driver);
        new HomePage(driver).clickOnUserIcon();
        new UserProfilePage(driver).clickRegisterPage();
    }


    public void registerAndVerify(String firstName, String lastName, String email, String password, String phone) {
        registrationPage.enterFirstname(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .enterPassword(password)
                .enterPhone(phone)
                .clickRegistrationButton()
                .verifySuccessMessage();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addNewUserWithCvs")
    public void registrationPositiveTest(String firstName, String lastName, String email, String password, String phone) {
        registerAndVerify(firstName, lastName, email, password, phone);
    }
}