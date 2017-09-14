package com.dsobko.credible.test.steps;

import com.dsobko.credible.test.CucumberStep;
import com.dsobko.credible.test.service.CredibleService;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

@CucumberStep
public final class CredibleSteps {

    private final CredibleService credibleService;

    public CredibleSteps(@Autowired CredibleService credibleService) {
        this.credibleService = credibleService;
    }

    @Given("^Credible home page is opened$")
    public final void openCredibleStartPage() {
        this.credibleService.openHomePage();
    }

    @Given("^I proceed to personal loans page and enter loan amount$")
    public final void enterLoanAmountOnPersonalLoansPage() {
        this.credibleService.openPersonalLoansPage();
    }

    @And("^I enter personal loan request data$")
    public final void enterPersonalLoanRequestData() {
        this.credibleService.openPersonalLoansRequestPage();
        this.credibleService.enterPersonalLoanRequestData();
    }

    @Then("^I enter profile loan request data$")
    public final void enterProfileLoanRequestData() {
        this.credibleService.openProfileLoansRequestPage();
        this.credibleService.enterProfileLoanRequestData();
    }

    @Then("^I submit loan request$")
    public final void submitRequestForLoan() {
        this.credibleService.submitRequestForLoan();
    }


}
