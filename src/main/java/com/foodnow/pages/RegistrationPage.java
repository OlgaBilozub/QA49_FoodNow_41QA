package com.foodnow.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

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

    public Object clickRegistrationButton() {
        registrationButton.click();
        return this;
    }

    public RegistrationPage verifyErrorMessage(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return Array.from(document.querySelectorAll('*'))" +
                ".map(el => el.textContent.trim())" +
                ".filter(text => text.includes(arguments[0]));";
        try {
            wait.until(driver -> {
                Object result = js.executeScript(script, expectedMessage);
                return result != null && !((ArrayList<?>) result).isEmpty();
            });
        } catch (TimeoutException e) {
            throw new AssertionError("Error message not found: " + expectedMessage);
        }
        return this;
    }

    }



