package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.RegistrationPage;
import com.foodnow.pages.UserProfilePage;
import com.utils.DataProviders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickLogo();
        new UserProfilePage(driver).clickRegisterPage();
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "addNewUsertWithCvs")
    public void registrationPositiveTest(String firstName,String lastName,String email,String password,String phone) {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.enterFirstname(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .enterPassword(password)
                .enterPhone(phone)
                .clickRegistrationButton();

    }

        @Test
        public void registrationWithEmptyEmailTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("Amir")
                    .enterLastName("Amir2")
                    .enterEmail("")
                    .enterPassword("123456")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }

        @Test
        public void registrationWithNumberInEmailTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("Amir")
                    .enterLastName("Amir2")
                    .enterEmail("1234user@test.com")
                    .enterPassword("123456")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }

        @Test
        public void registrationWithSQLInjectionInNameTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("John'; DROP TABLE users;--")
                    .enterLastName("Amir2")
                    .enterEmail("123@gm.com")
                    .enterPassword("123456")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }

        @Test
        public void registrationWithExistingEmailTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("Amir")
                    .enterLastName("Amir2")
                    .enterEmail("123@gm.com")
                    .enterPassword("12345")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }

        @Test
        public void registrationWithShortEmailTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("Amir")
                    .enterLastName("Amir2")
                    .enterEmail("1@")
                    .enterPassword("123456")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }

        @Test
        public void registrationWithShortPasswordTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("Amir")
                    .enterLastName("Amir2")
                    .enterEmail("123@gm.com")
                    .enterPassword("123")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }

        @Test
        public void registrationWithShortPhoneNumberTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("Amir")
                    .enterLastName("Amir2")
                    .enterEmail("123@gm.com")
                    .enterPassword("123456")
                    .enterPhone("+49")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }

        @Test
        public void registrationWithEmptyLastNameTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("Amir")
                    .enterLastName("")
                    .enterEmail("123@gm.com")
                    .enterPassword("123456")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }

        @Test
        public void registrationWithEmptyFirstNameTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("")
                    .enterLastName("Amir2")
                    .enterEmail("123@gm.com")
                    .enterPassword("123456")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }


        @Test
        public void registrationWithLongFirstNameTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("AmirAmirAmirAmirAmirAmirAmirAmirAmir")
                    .enterLastName("Amir2")
                    .enterEmail("123@gm.com")
                    .enterPassword("123456")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }

        @Test
        public void registrationWithLongLastNameTest() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstname("Amir")
                    .enterLastName("AmirAmirAmirAmirAmirAmirAmirAmirAmir")
                    .enterEmail("123@gm.com")
                    .enterPassword("123456")
                    .enterPhone("+491231231234")
                    .verifyErrorMessage("")
                    .clickRegistrationButton();
        }
    }


