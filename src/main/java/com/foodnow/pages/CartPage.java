package com.foodnow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = ".css-n4f4vi")
    WebElement crabLeg;

    public HomePage addCrabLeg() {
        //  click(crabLeg);
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(crabLeg)).click();
        return new HomePage(driver);
    }
}


