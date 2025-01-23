package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.RegistrationPage;
import com.foodnow.pages.UserProfilePage;
import com.utils.DataProviders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {
    RegistrationPage registrationPage;

    @BeforeMethod
    public void precondition() {
        registrationPage = new RegistrationPage(driver);
        new HomePage(driver).clickOnUserIcon();
        new UserProfilePage(driver).clickRegisterPage();
    }

    public void registerAndVerify(String firstName, String lastName, String email, String password, String phone, Runnable verification) {
        registrationPage.enterFirstname(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .enterPassword(password)
                .enterPhone(phone)
                .clickRegistrationButton();
        if (verification != null) {
            verification.run();
        }
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addNewUsertWithCvs")
    public void registrationPositiveTest(String firstName, String lastName, String email, String password, String phone) {
        registerAndVerify(firstName, lastName, email, password, phone, null);
    }

    @Test
    public void registrationWithEmptyEmailTest() {
        registerAndVerify("Amir", "Amir2", "", "123456", "+491231231234",
                registrationPage::verifyEmptyEmailErrorMessage);
    }

    @Test
    public void registrationWithNumberInEmailTest() {
        registerAndVerify("Amir", "Amir2", "1111111111111111111", "123456", "+491231231234",
                registrationPage::verifyNumberInEmailErrorMessage);
    }

    @Test
    public void registrationWithSQLInjectionInNameTest() {
        registerAndVerify("Amir'; DROP TABLE users;--", "Amir2", "123@gm.com", "123456", "+491231231234",
                registrationPage::verifySQLErrorMessage);
    }

    @Test
    public void registrationWithExistingEmailTest() {
        registerAndVerify("Amir", "Amir2", "123@gm.com", "123456", "+491231231234",
                registrationPage::verifyExistingEmailErrorMessage);
    }

    @Test
    public void registrationWithShortEmailTest() {
        registerAndVerify("Amir", "Amir2", "1@", "123456", "+491231231234",
                registrationPage::verifyShortEmailErrorMessage);
    }

    @Test
    public void registrationWithShortPasswordTest() {
        registerAndVerify("Amir", "Amir2", "123@gm.com", "123", "+491231231234",
                registrationPage::verifyShortPasswordErrorMessage);
    }

    @Test
    public void registrationWithShortPhoneNumberTest() {
        registerAndVerify("Amir", "Amir2", "123@gm.com", "123456", "+49",
                registrationPage::verifyShortPhoneErrorMessage);
    }

    @Test
    public void registrationWithEmptyLastNameTest() {
        registerAndVerify("Amir", "", "123@gm.com", "123456", "+491231231234",
                registrationPage::verifyEmptyLastNameErrorMessage);
    }

    @Test
    public void registrationWithEmptyFirstNameTest() {
        registerAndVerify("", "Amir2", "123@gm.com", "123456", "+491231231234",
                registrationPage::verifyEmptyFirstNameErrorMessage);
    }

    @Test
    public void registrationWithLongFirstNameTest() {
        registerAndVerify("AmirAmirAmirAmirAmirAmirAmirAmirAmir", "Amir2", "123@gm.com", "123456", "+491231231234",
                registrationPage::verifyLongFirstNameErrorMessage);
    }

    @Test
    public void registrationWithLongLastNameTest() {
        registerAndVerify("Amir", "AmirAmirAmirAmirAmirAmirAmirAmirAmir", "123@gm.com", "123456", "+491231231234",
                registrationPage::verifyLastNameErrorMessage);
    }
}
