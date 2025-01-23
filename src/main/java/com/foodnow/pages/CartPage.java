package com.foodnow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);

    }

@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/button[7]")
WebElement seafood;
    public UserProfilePage clickSeafood() {
        click(seafood);
        return new UserProfilePage(driver);
    }

@FindBy(css = ".MuiStack-root:nth-child(2) path")
WebElement delete;
    public CartPage clickDeleteProduct() {
        click(delete);
        return new CartPage(driver);
    }
}


