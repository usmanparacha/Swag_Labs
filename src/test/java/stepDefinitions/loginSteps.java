package stepDefinitions;


import base.BaseTests;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;

import java.io.IOException;

@Test(groups = "login")

public class loginSteps extends BaseTests {

    @Before
    public void beforeScenario() throws IOException {
        initializeDriver();

    }

    @Given("User is on saucedemoLogin page")
    public void user_is_on_saucedemo_login_page() {
        loginPage.verifyUserIsOnLoginPage();

    }

    @When("I enter the username")
    public void i_enter_the_username() {

        loginPage.setUserName("standard_user");

    }

    @And("I enter the password")
    public void i_enter_the_password() {

        loginPage.setPassword("secret_sauce");
    }

    @When("I click on the login button")
    public void click_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        loginPage.verifyUserIsOnHomePage();

    }

    @After
    public void afterScenario() {

        tearDown();
    }

}
