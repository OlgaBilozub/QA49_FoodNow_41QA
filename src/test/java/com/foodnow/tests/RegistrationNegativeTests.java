package com.foodnow.tests;

import com.foodnow.pages.HomePage;
import com.foodnow.pages.RegistrationPage;
import com.foodnow.pages.UserProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationNegativeTests extends TestBase {
    private RegistrationPage registrationPage;

    @BeforeMethod
    public void precondition() {
        registrationPage = new RegistrationPage(driver);
        new HomePage(driver).clickOnUserIcon();
        new UserProfilePage(driver).clickRegisterPage();
    }

    @DataProvider(name = "negativeRegistrationData")
    public Object[][] provideNegativeRegistrationData() {
        return new Object[][]{
                // Empty email
                {"Amir", "Amir2", "", "123456", "+491231231234", "verifyEmptyEmailErrorMessage"},
                //Invalid email (numbers)
                {"Amir", "Amir2", "1111111111111111111", "123456", "+491231231234", "verifyNumberInEmailErrorMessage"},
                //SQL injection in first name
                {"Amir'; DROP TABLE users;--", "Amir2", "123@gm.com", "123456", "+491231231234", "verifySQLErrorMessage"},
                //Short email
                {"Amir", "Amir2", "1@", "123456", "+491231231234", "verifyShortEmailErrorMessage"},
                //Short password
                {"Amir", "Amir2", "123@gm.com", "123", "+491231231234", "verifyShortPasswordErrorMessage"},
                //Short phone
                {"Amir", "Amir2", "123@gm.com", "123456", "+49", "verifyShortPhoneErrorMessage"},
                //Empty last name
                {"Amir", "", "123@gm.com", "123456", "+491231231234", "verifyEmptyLastNameErrorMessage"},
                //Empty first name
                {"", "Amir2", "123@gm.com", "123456", "+491231231234", "verifyEmptyFirstNameErrorMessage"},
                //Long first name
                {"AmirAmirAmirAmirAmirAmirAmirAmirAmir", "Amir2", "123@gm.com", "123456", "+491231231234", "verifyLongFirstNameErrorMessage"},
                //Long last name
                {"Amir", "AmirAmirAmirAmirAmirAmirAmirAmirAmir", "123@gm.com", "123456", "+491231231234", "verifyLastNameErrorMessage"}
        };
    }

    @Test(dataProvider = "negativeRegistrationData")
    public void registrationNegativeTests(String firstName, String lastName, String email, String password, String phone, String verificationMethod) {
        registrationPage.enterFirstname(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .enterPassword(password)
                .enterPhone(phone)
                .clickRegistrationButton();

        switch (verificationMethod) {
            case "verifyEmptyEmailErrorMessage":
                registrationPage.verifyEmptyEmailErrorMessage();
                break;
            case "verifyNumberInEmailErrorMessage":
                registrationPage.verifyNumberInEmailErrorMessage();
                break;
            case "verifySQLErrorMessage":
                registrationPage.verifySQLErrorMessage();
                break;
            case "verifyShortEmailErrorMessage":
                registrationPage.verifyShortEmailErrorMessage();
                break;
            case "verifyShortPasswordErrorMessage":
                registrationPage.verifyShortPasswordErrorMessage();
                break;
            case "verifyShortPhoneErrorMessage":
                registrationPage.verifyShortPhoneErrorMessage();
                break;
            case "verifyEmptyLastNameErrorMessage":
                registrationPage.
                        verifyEmptyLastNameErrorMessage();
                break;
            case "verifyEmptyFirstNameErrorMessage":
                registrationPage.verifyEmptyFirstNameErrorMessage();
                break;
            case "verifyLongFirstNameErrorMessage":
                registrationPage.verifyLongFirstNameErrorMessage();
                break;
            case "verifyLastNameErrorMessage":
                registrationPage.verifyLastNameErrorMessage();
                break;
            default:
                throw new IllegalArgumentException("Verification method: " + verificationMethod);
        }
    }
}




