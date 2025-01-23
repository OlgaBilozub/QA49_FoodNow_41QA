package com.foodnow.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email-id")
    WebElement userField;

    @FindBy(id = "password-id")
    WebElement passwordField;

    public LoginPage enterUserData(String userName, String password) {
        type(userField, userName);
        type(passwordField, password);
        return this;
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    public UserProfilePage clickLoginButton() {
        click(loginButton);
        return new UserProfilePage(driver);
    }

    @FindBy(id = "email-id")
    WebElement emailType;

    public LoginPage enterEmail(String email) {
        type(emailType, email);
        return this;
    }

    @FindBy(id = "password-id")
    WebElement passwordType;

    public LoginPage enterPassword(String password) {
        type(passwordType, password);
        return this;
    }
        public LoginPage verifyErrorMessage () {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String script = "return Array.from(document.querySelectorAll('*')).map(el => el.textContent).filter(text => text.includes('Invalid email'))";
            Object result = js.executeScript(script);
            System.out.println(result);
            return this;
        }
}

