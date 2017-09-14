package com.dsobko.credible.test.assertions

import com.codeborne.selenide.Selenide
import com.dsobko.credible.test.pages.PersonalLoansRequestPage
import org.fest.assertions.AssertExtension
import org.fest.assertions.api.Assertions.assertThat
import org.openqa.selenium.By
import org.slf4j.LoggerFactory

class PersonalLoansRequestPageAssertion(private val personalLoansRequestPage: PersonalLoansRequestPage) : AssertExtension {

    private val log = LoggerFactory.getLogger(this.javaClass)

    fun assertPersonalLoansRequestPage(): PersonalLoansRequestPageAssertion {
        log.info("Asserting personal loans request page elements")
        personalLoansRequestPage.apply {
            assertThat(personalLoanHeader.isDisplayed).isTrue
            assertThat(personalLoanHeader.text).isEqualTo("Compare personal loan rates from multiple providers in 2 minutes")
            assertThat(loanAmountField.isDisplayed).isTrue
            assertThat(loanPurposeDropdown.isDisplayed).isTrue
            assertThat(highestLevelOfCompletionDropdown.isDisplayed).isTrue
            assertThat(currentEmploymentStatusDropdown.isDisplayed).isTrue
            assertThat(dateOfbirth.isDisplayed).isTrue
            assertThat(employmentIncome.isDisplayed).isTrue
            assertThat(employmentIncomeTooltipText.isDisplayed).isTrue
            assertThat(creditScoreDropdown.isDisplayed).isTrue
            assertThat(continueButton.isDisplayed).isTrue
        }
        return this
    }

}