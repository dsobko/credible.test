package com.dsobko.credible.test.steps

import com.dsobko.credible.test.CucumberStep
import com.dsobko.credible.test.service.CredibleService
import cucumber.api.java.en.Given


@CucumberStep
class CredibleSteps(private val credibleService: CredibleService) {


    @Given("^Credible home page is opened$")
    fun openCredibleStartPage() {
        credibleService.openHomePage()
    }

    @Given("^I proceed to personal loans page and enter loan amount$")
    fun enterLoanAmountOnPersonalLoansPage() {
        credibleService.openPersonalLoansPage()
        credibleService.enterLoanAmount()
    }

    @Given("^I enter personal loan request data$")
    fun enterPersonalLoanRequestData() {
        credibleService.enterPersonalLoanRequestData()
    }


}