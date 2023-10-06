package stepDefinitions;


import base.BaseTests;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

@Test(groups = "addToCart")

public class addToCartSteps extends BaseTests {


    @Before
    public void beforeScenario() throws IOException {
        initializeDriver();
    }

    @Given("User is logged In")
    public void user_is_logged_in() {
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @When("Click on add to cart option")
    public void click_on_add_to_cart_option() {
        homePage.addToCart();
    }

    @Then("product added to cart successfully")
    public void product_added_to_cart_successfully() {
        String text = homePage.verifyAddCart();
        Assert.assertEquals(text, "Remove");
    }

    @Then("Click on Cart")
    public void click_on_cart() {
        homePage.clickCart();
    }

    @Then("Item should be shown in cart")
    public void item_should_be_shown_in_cart() {

        Assert.assertTrue(homePage.verifyCartPageitem());

    }

    @After
    public void afterScenario() {

        tearDown();
    }


}