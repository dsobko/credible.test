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
            assertThat(loanPurposeDropdown.isDisplayed).isTrue
            assertThat(highestLevelOfCompletionDropdown.isDisplayed).isTrue
            assertThat(currentEmploymentStatusDropdown.isDisplayed).isTrue
            assertThat(dateOfbirth.isDisplayed).isTrue
            assertThat(employmentIncome.isDisplayed).isTrue
            assertThat(creditScoreDropdown.isDisplayed).isTrue
            assertThat(continueButton.isDisplayed).isTrue
        }
        return this
    }

    fun assertHeader(): PersonalLoansRequestPageAssertion {
        log.info("Asserting personal loans request page header")
        personalLoansRequestPage.apply {
            assertThat(personalLoanHeader.isDisplayed).isTrue
            assertThat(personalLoanHeader.text).isEqualTo("Compare personal loan rates from multiple providers" +
                    " in 2 minutes")
        }
        return this
    }

    fun assertTooltips(): PersonalLoansRequestPageAssertion {
        log.info("Asserting personal loans request page tooltips")
        personalLoansRequestPage.apply {
            assertThat(employmentIncomeTooltip.isDisplayed).isTrue
            assertThat(employmentIncomeTooltipText).isEqualTo("This should be your individual income." +
                    " Do not include income from your spouse or other household members." +
                    " Alimony, child support or separate maintenance income need not be" +
                    " disclosed unless you want them considered as a basis for repaying this loan.")
        }
        return this
    }

}