package com.orangehrm.www.cucumber.stepdefs;

import com.orangehrm.www.pages.HomePage;
import com.orangehrm.www.pages.WelcomeAdminPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

/* Created
 * by Lamee*/
public class LoginStepdefs {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new HomePage().enterUsernameField(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new HomePage().enterPasswordField(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickonLoginBtn();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
       Assert.assertTrue(new HomePage().getWelcomeAdminText().contains("Welcome Admin"));
    }



//    @When("^I enter username,password$")
//    public void iEnterUsernamePassword(DataTable dataTable) {
//        List<String> credential=dataTable.asList(String.class);
//        String username=credential.get(0);
//        String password=credential.get(1);
//    }
//    @Then("^I should not login successfully$")
//    public void iShouldNotLoginSuccessfully() {
//
//        Assert.assertTrue(new HomePage().getLoginErrorMessage().contains("Invalid credentials"));
//    }
}
