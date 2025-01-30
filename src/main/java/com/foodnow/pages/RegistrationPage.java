package com.foodnow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = "#firstName-id")
    WebElement firstName;

    public RegistrationPage enterFirstname(String text) {
        type(firstName, text);
        return this;
    }

    @FindBy(xpath = "//input[@id='lastName-id']")
    WebElement lastName;

    public RegistrationPage enterLastName(String text) {
        type(lastName, text);
        return this;
    }

    @FindBy(xpath = "//input[@id='email-id']")
    WebElement emailId;

    public RegistrationPage enterEmail(String email) {
        type(emailId, email);
        return this;
    }

    @FindBy(xpath = "//input[@id='password-id']")
    WebElement passwordId;

    public RegistrationPage enterPassword(String password) {
        type(passwordId, password);
        return this;
    }

    @FindBy(xpath = "//input[@id='phoneNumber-id']")
    WebElement phone;

    public RegistrationPage enterPhone(String number) {
        type(phone, number);
        return this;
    }

    @FindBy(tagName = "button")
    WebElement registrationButton;

    public RegistrationPage clickRegistrationButton() {
        waitAndClick(registrationButton);
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'Registration successful')]")
    WebElement successMessage;

    public RegistrationPage verifySuccessMessage() {
        waitAndClick(successMessage);
        Assert.assertTrue(successMessage.getText().contains("Registration successful"));
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'Email is required')]")
    WebElement emptyEmail;

    public RegistrationPage verifyEmptyEmailErrorMessage() {
        Assert.assertTrue(emptyEmail.getText().contains("Email is required"));
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'Email is not valid')]")
    WebElement numberInEmail;

    public RegistrationPage verifyNumberInEmailErrorMessage() {
        Assert.assertTrue(numberInEmail.getText().contains("Email is not valid"));
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'First name field should contain maximum 20 symbols')]")
    WebElement sqlName;

    public RegistrationPage verifySQLErrorMessage() {
        Assert.assertTrue(sqlName.getText().contains("First name field should contain maximum 20 symbols"));
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'Password field should contain minimum 6 symbols')]")
    WebElement shortPassword;

    public RegistrationPage verifyShortPasswordErrorMessage() {
        Assert.assertTrue(shortPassword.getText().contains("Password field should contain minimum 6 symbols"));
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'Email is not valid')]")
    WebElement shortEmail;

    public RegistrationPage verifyShortEmailErrorMessage() {
        Assert.assertTrue(shortEmail.getText().contains("Email is not valid"));
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'Phone number is not valid')]")
    WebElement shortPhone;

    public RegistrationPage verifyShortPhoneErrorMessage() {
        Assert.assertTrue(shortPhone.getText().contains("Phone number is not valid"));
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'Last name field is required')]")
    WebElement emptyLastName;

    public RegistrationPage verifyEmptyLastNameErrorMessage() {
        Assert.assertTrue(emptyLastName.getText().contains("Last name field is required"));
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'First name field is required')]")
    WebElement emptyFirstName;

    public RegistrationPage verifyEmptyFirstNameErrorMessage() {
        Assert.assertTrue(emptyFirstName.getText().contains("First name field is required"));
        return this;
    }

    @FindBy(xpath = "//div[contains(text(),'First name field should contain maximum 20 symbols')]")
    WebElement longFirstName;

    public RegistrationPage verifyLongFirstNameErrorMessage() {
        Assert.assertTrue(longFirstName.getText().contains("First name field should contain maximum 20 symbols"));
        return this;
    }

    @FindBy(css = ".css-1jibmi3:nth-child(2) > .css-j1mlt7")
    WebElement errorLastName;

    public RegistrationPage verifyLastNameErrorMessage() {

        Assert.assertTrue(errorLastName.getText()
                .contains("Last name field should contain maximum 20 symbols"));
        return this;
    }
}

