package com.infoshare.bug_busters.pageObject;

import com.infoshare.bug_busters.utils.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    @FindBy (xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement textShoppingCart;

    private WebDriver driver;
    private Waits waits;

    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);

        // Remember to use this! If you use HomePage.class you will get memory leak!
        PageFactory.initElements(driver, this);
    }

    public String getTextShippingCart() {
        waits.waitForElementToBeVisible(textShoppingCart);
        return textShoppingCart.getText();
    }
}
