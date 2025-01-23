package com.foodnow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

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
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(foodNowLogo)).click();
        return new HomePage(driver);
    }
@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")
WebElement logOut;
    public UserProfilePage clickLogOut() {
        click(logOut);
        return new UserProfilePage(driver);
    }
@FindBy(className = "css-13s0wde")
WebElement logoCart;
    public UserProfilePage clickLogoCart() {
        click(logoCart);
        return new UserProfilePage(driver);
    }
@FindBy(css = ".MuiButton-root")
WebElement shopping;
    public CartPage clickGoShopping() {
        click(shopping);
        return new CartPage(driver);
    }
}

