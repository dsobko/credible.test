package com.dsobko.credible.test.steps

import com.dsobko.credible.test.CucumberStep
import com.dsobko.credible.test.service.CredibleService
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then


@CucumberStep
class CredibleSteps(private val credibleService: CredibleService) {


    @Given("^Credible home page is opened$")
    fun openCredibleStartPage() {
        credibleService.openHomePage()
    }

    @Given("^I proceed to personal loans page and enter loan amount$")
    fun enterLoanAmountOnPersonalLoansPage() {
        credibleService.openPersonalLoansPage()
    }

    @And("^I enter personal loan request data$")
    fun enterPersonalLoanRequestData() {
        credibleService.openPersonalLoansRequestPage()
        credibleService.enterPersonalLoanRequestData()
    }

    @Then("^I enter profile loan request data$")
    fun enterProfileLoanRequestData() {
        credibleService.openProfileLoansRequestPage()
        credibleService.enterProfileLoanRequestData()
    }

    @Then("^I submit loan request$")
    fun submitRequestForLoan() {
        credibleService.submitRequestForLoan()
    }


}