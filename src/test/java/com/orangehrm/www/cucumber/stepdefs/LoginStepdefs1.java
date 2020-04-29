package com.orangehrm.www.cucumber.stepdefs;

import com.orangehrm.www.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/* Created
 * by Lamee */
public class LoginStepdefs1 {
    @Given("^User is login scenario$")
    public void userIsLoginScenario() {
    }

    @When("^User enter the below credentials$")
    public void userEnterTheBelowCredentials(DataTable dataTable) {

        List<String>credentials=dataTable.asList(String.class);
        String username=credentials.get(0);
        String password=credentials.get(1);
        new HomePage().enterUsernameField(username);
        new HomePage().enterPasswordField(password);
    }

    @And("^User click on login button$")
    public void userClickOnLoginButton() {
        new HomePage().clickonLoginBtn();
    }

    @Then("^User should not login successfully$")
    public void userShouldNotLoginSuccessfully() {
        new HomePage().getSpanMessage();
    }
}
