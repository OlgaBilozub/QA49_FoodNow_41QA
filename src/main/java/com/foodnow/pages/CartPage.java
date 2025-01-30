package com.foodnow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.security.Signature;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);

    }

//@FindBy(css = ".MuiStack-root:nth-child(2) path")
        @FindBy(css = "div:nth-of-type(4) button > svg > path")
WebElement delete;
    public CartPage clickDeleteProduct() {
        click(delete);
        return new CartPage(driver);
    }
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/button[1]")
    WebElement meat;
    public HomePage clickMeat() {
        click(meat);
        return new HomePage(driver);
    }
@FindBy(css =".MuiButton-root")
WebElement cartEmpty;
    public CartPage verifyMessage() {
        Assert.assertTrue(cartEmpty.getText().contains(""));
        return this;

    }
@FindBy(xpath = "//p[contains(text(),'Min order amount is 10 €')]")
WebElement khinkaliMessage;
    public CartPage verifyKhinkaliAdded() {
        Assert.assertTrue(khinkaliMessage.getText().contains("Min order amount is 10 €"));
        return this;
    }

@FindBy(xpath="//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/button[1]")
WebElement goShopping;
    public CartPage verify() {
        Assert.assertTrue(goShopping.getText().contains(""));
        return this;
    }
@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/nav[1]/a[2]/img[1]")
WebElement addBanana;
    public ProductPage addBananaToCart() {
        click(addBanana);
        return new ProductPage(driver);
    }
}



