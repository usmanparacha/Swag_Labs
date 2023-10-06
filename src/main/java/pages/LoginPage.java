package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {

    protected WebDriver driver;
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String username) {
        WebElement usernameFieldElement = driver.findElement(usernameField);
        usernameFieldElement.sendKeys(username);
    }

    public void setPassword(String password) {
        WebElement passwordFieldElement = driver.findElement(passwordField);
        passwordFieldElement.sendKeys(password);
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    public void verifyUserIsOnLoginPage() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.saucedemo.com/");
    }

    public void verifyUserIsOnHomePage() {

        String homePageURL = driver.getCurrentUrl();
        Assert.assertEquals(homePageURL, "https://www.saucedemo.com/inventory.html");
    }

    public void clearAll() {
        driver.findElement(usernameField).clear();
        driver.findElement(passwordField).clear();
    }
}

