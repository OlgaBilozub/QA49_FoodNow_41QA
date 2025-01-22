package com.foodnow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/nav[1]/a[1]/img[1]")
    WebElement logo;

    public UserProfilePage clickLogo() {
        click(logo);
        return new UserProfilePage(driver);
    }

@FindBy(xpath = "//button[contains(text(),'KHINKALI')]")
WebElement khinkali;
    public HomePage clickKhinkali() {
        click(khinkali);
        return new HomePage(driver);
    }
@FindBy(className = "css-n4f4vi")
WebElement cart;
    public ProductPage addKhikaliToCart() {
        click(cart);
        return new ProductPage(driver);
    }
}
