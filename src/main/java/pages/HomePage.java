package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final By addToCartBackPack = By.id("add-to-cart-sauce-labs-backpack");
    private final By removeButton = By.id("remove-sauce-labs-backpack");
    private final By shoppingCart = By.id("shopping_cart_container");
    private final By cartItem = By.className("cart_item");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartBackPack).click();
    }

    public String verifyAddCart() {
        String verifyCartProduct = driver.findElement(removeButton).getText();
        return verifyCartProduct;

    }

    public void clickCart() {
        driver.findElement(shoppingCart).click();

    }

    public Boolean verifyCartPageitem() {
        if (driver.findElement(cartItem).isDisplayed())
            return true;
        return false;
    }
}

