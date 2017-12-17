package com.dsobko.credible.test.assertions

import com.dsobko.credible.test.pages.PersonalLoansPage
import org.fest.assertions.AssertExtension
import org.fest.assertions.api.Assertions.assertThat
import org.slf4j.LoggerFactory

class PersonalLoansPageAssertion(private val personalLoansPage: PersonalLoansPage) : AssertExtension {

    private val log = LoggerFactory.getLogger(this.javaClass)

    fun assertPersonalLoansPage(): PersonalLoansPageAssertion {
        log.info("Asserting personal loans page elements")
        personalLoansPage.apply {
            assertThat(title.isDisplayed).isTrue
            assertThat(title.text).isEqualTo("Personal loans to get you" +
                    " one step ahead\nRates from 4.99% APR in just 2 minutes")
            assertThat(loanAmountField.isDisplayed).isTrue
        }
        return this
    }



}