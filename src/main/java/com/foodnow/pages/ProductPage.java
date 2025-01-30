package com.foodnow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/button[1]")
    WebElement addToCart;
    public ProductPage addCart() {
        click(addToCart);
        return new ProductPage(driver);
    }
@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/nav[1]/a[1]/img[1]")
WebElement iconCart;
    public CartPage clickIconCart() {
        click(iconCart);
        return new CartPage(driver);
    }
    @FindBy(css=".MuiStack-root:nth-child(2) path")
    WebElement deleteBananas;
    public CartPage deleteBanana() {
        click(deleteBananas);
        return new CartPage(driver);

    }
}
