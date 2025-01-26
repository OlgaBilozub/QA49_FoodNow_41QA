package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.RegistrationPage;
import com.foodnow.pages.UserProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPositiveTest extends TestBase {
    RegistrationPage registrationPage;

    @BeforeMethod
    public void precondition() {
        registrationPage = new RegistrationPage(driver);
        new HomePage(driver).clickOnUserIcon();
        new UserProfilePage(driver).clickRegisterPage();
    }

    @DataProvider(name = "addNewUsertWithCvs")
    public Object[][] provideNegativeRegistrationData() {
        return new Object[][]{
                //First user
                {"Marina", "Karam", "mf@gm.com", "456458", "+49123567125"},
                //Second user
                {"Marina2", "Karam", "mr@gm.com", "887785", "+49456345238"}
        };
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

    @Test(dataProvider = "addNewUsertWithCvs")
    public void registrationPositiveTest(String firstName, String lastName, String email, String password, String phone) {
        registerAndVerify(firstName, lastName, email, password, phone);
    }

}