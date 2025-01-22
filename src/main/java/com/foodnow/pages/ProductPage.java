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
}
