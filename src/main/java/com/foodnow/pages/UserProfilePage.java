package com.foodnow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserProfilePage extends BasePage {
    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'login \uD83D\uDC48')]")
    WebElement login;

    public LoginPage clickLoginPage() {
        click(login);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")
    WebElement userLogo;

    public UserProfilePage verifyUserName(String text) {
        Assert.assertTrue(userLogo.getText().contains(text));
        return this;
    }

    @FindBy(css = "div.css-12xi1o5 main.css-1lri2aw div.css-1e2zfm3 div.css-1wo8pw5 > a:nth-child(4)")
    WebElement register;

    public RegistrationPage clickRegisterPage() {
        click(register);
        return new RegistrationPage(driver);
    }

    @FindBy(className = "css-rbpvgo")
    WebElement foodNowLogo;

    public HomePage clickFoodNow() {
        waitAndClick(foodNowLogo);
        return new HomePage(driver);
    }


    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")
   // @FindBy(xpath = "//div[@id='1']/div/div[2]")
    WebElement logOut;

    public UserProfilePage clickLogOut() {
        click(logOut);
        return new UserProfilePage(driver);
    }

    @FindBy(className = "css-13s0wde")
    WebElement logoCart;

    public UserProfilePage clickIconCart() {
        click(logoCart);
        return new UserProfilePage(driver);
    }

    @FindBy(css = ".MuiButton-root")
    WebElement shopping;

    public CartPage clickGoShopping() {
        click(shopping);
        return new CartPage(driver);
    }
@FindBy(className = "Toastify__toast-body")
WebElement errorMessage;
    public UserProfilePage verifyErrorMessage() {
        Assert.assertTrue(errorMessage.getText().contains("Login or email is invalid.Try again"));
        return this;
    }
@FindBy(xpath = "//h4[contains(text(),'Oops! \uD83D\uDE25')]")
WebElement userLogOut;
    public UserProfilePage verifyUserLogOut() {
        Assert.assertTrue(userLogOut.getText().contains("Oops!"));
        return this;
    }
    @FindBy(css = "div.css-14fou1a:nth-child(5)")
WebElement confirmed;
    public UserProfilePage clickConfirmed() {
        click(confirmed);
        return new UserProfilePage(driver);
    }
@FindBy(css = ".MuiStack-root:nth-child(1) ")
WebElement cancel;
    public UserProfilePage selectCancelOeder() {
        click(cancel);
        return new UserProfilePage(driver);
    }
//@FindBy(css = ".MuiDialog-root:nth-child(8) ")
        @FindBy(id = "alert-dialog-slide-description")
WebElement buttonCancel;
    public UserProfilePage clickButtonCancel() {
        click(buttonCancel);
         return new UserProfilePage(driver);
    }
@FindBy(css = "Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter")
WebElement cancelMessage;
    public UserProfilePage verifyCancelMessage() {
        Assert.assertTrue(cancelMessage.getText().contains("Order with id: 751 was successfully cancelled"));
        return this;
    }
}

