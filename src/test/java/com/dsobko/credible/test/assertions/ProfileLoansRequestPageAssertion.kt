package com.dsobko.credible.test.assertions

import com.dsobko.credible.test.pages.ProfileLoansRequestPage
import org.fest.assertions.AssertExtension
import org.fest.assertions.api.Assertions.assertThat
import org.slf4j.LoggerFactory

class ProfileLoansRequestPageAssertion(private val profileLoansRequestPage: ProfileLoansRequestPage) : AssertExtension {

    private val log = LoggerFactory.getLogger(this.javaClass)

    fun assertProfileLoansRequestPage(): ProfileLoansRequestPageAssertion {
        log.info("Asserting profile loans request page elements")
        profileLoansRequestPage.apply {
            assertThat(firstName.isDisplayed).isTrue
            assertThat(lastName.isDisplayed).isTrue
            assertThat(phoneNumber.isDisplayed).isTrue
//            assertThat(housingStatusDropdown.isDisplayed).isTrue
//            assertThat(currentAddress.isDisplayed).isTrue
//            assertThat(citizenshipStatusDropdown.isDisplayed).isTrue
            assertThat(borrowerSsn.isDisplayed).isTrue
            assertThat(email.isDisplayed).isTrue
            assertThat(agreeButton.isDisplayed).isTrue
        }
        return this
    }

}