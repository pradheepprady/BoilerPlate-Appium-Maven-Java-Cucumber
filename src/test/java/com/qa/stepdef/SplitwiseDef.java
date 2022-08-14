package com.qa.stepdef;

import com.qa.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SplitwiseDef {

//    @Given("I launch the app")
//    public void iLaunchTheApp() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @When("I click login button")
    public void iClickLoginButton() {
        new SplitwiseLoginPage().pressFirstLoginBtn();
    }
    @When("I enter {string} and {string}")
    public void iEnterAnd(String string, String string2) throws InterruptedException {
        new SplitwiseLoginPage().login(string, string2);
    }

    @When("I swipe through the welcome page sliders")
    public void iSwipeThroughTheWelcomePageSliders() throws Exception {
       new SplitwiseSwipePage().swipeTheWelcomeSlider();
    }
    @When("I select {string} fo adding expenses")
    public void iSelectFoAddingExpenses(String groupName) throws Exception {
        SplitwiseGroupPage groupPage = new SplitwiseGroupPage().selectTheGroup(groupName);
        groupPage.tapAddExpensesButton();

    }
    @When("I add {string} euro expenses with description {string}")
    public void iAddEuroExpensesWithDescription(String amount, String description) {
        new SplitwiseAddExpensesPage().addExpenses(description, amount);
    }
    @When("I navigate to activity screen")
    public void iNavigateToActivityScreen() throws Exception {
       new SplitwiseActivityPage().navigateToActivityPage();
    }
    @Then("I should see my added expenses {string}")
    public void iShouldSeeMyAddedExpenses(String description) {
        Assert.assertTrue(new SplitwiseActivityPage().textDisplayedInFirstPlace().contains(description));
    }

}