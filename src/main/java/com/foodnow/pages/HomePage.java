package com.foodnow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

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

    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[8]/div[3]/div[2]/div[2]/div[1]/button[1]/img[1]")
    WebElement banana;

    public HomePage addBananas() {
        click(banana);
        return new HomePage(driver);
    }

    @FindBy(css = "div.MuiDialog-root.MuiModal-root.css-1egf66k:nth-child(3) div.MuiDialog-container.MuiDialog-scrollPaper.css-8azq84:nth-child(3) div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation24.MuiDialog-paper.MuiDialog-paperScrollPaper.MuiDialog-paperWidthSm.css-si425x div.MuiDialogActions-root.MuiDialogActions-spacing.css-8mwzdy div.MuiStack-root.css-jj2ztu > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-colorPrimary.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-colorPrimary.css-ghr9bt")
    WebElement login;

    public LoginPage clickLogin() {
        click(login);
        return new LoginPage(driver);
    }
@FindBy(css = ".css-x5lyyw")
WebElement allProducts;

    public HomePage clickAllProducts() {
        click(allProducts);
        return new HomePage(driver);
    }
}
