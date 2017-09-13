package com.dsobko.credible.test.assertions

import com.dsobko.credible.test.pages.PersonalLoansRequestPage
import org.fest.assertions.AssertExtension
import org.fest.assertions.api.Assertions.assertThat
import org.slf4j.LoggerFactory

class PersonalLoansRequestPageAssertion(private val personalLoansRequestPage: PersonalLoansRequestPage) : AssertExtension {

    private val log = LoggerFactory.getLogger(this.javaClass)

    fun assertPersonalLoansRequestPage(): PersonalLoansRequestPageAssertion {
        log.info("Asserting personal loans request page elements")
        personalLoansRequestPage.apply {
            assertThat(loanAmountField.isDisplayed).isTrue
//            assertThat(loanPurpose.).isTrue
            assertThat(highestLevelOfCompletionDropdown.isDisplayed).isTrue
//            assertThat(currentEmploymentStatus.isDisplayed).isTrue
            assertThat(dateOfbirth.isDisplayed).isTrue
            assertThat(employmentIncome.isDisplayed).isTrue
            assertThat(employmentIncomeTooltipText.isDisplayed).isTrue
//            assertThat(creditScore.isDisplayed).isTrue
            assertThat(continueButton.isDisplayed).isTrue
        }
        return this
    }

}