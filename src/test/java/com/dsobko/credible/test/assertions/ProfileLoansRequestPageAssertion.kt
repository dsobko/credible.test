package com.dsobko.credible.test.assertions

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import com.dsobko.credible.test.pages.ProfileLoansRequestPage
import org.fest.assertions.AssertExtension
import org.fest.assertions.api.Assertions.assertThat
import org.openqa.selenium.By
import org.slf4j.LoggerFactory

class ProfileLoansRequestPageAssertion(private val profileLoansRequestPage: ProfileLoansRequestPage) : AssertExtension {

    private val log = LoggerFactory.getLogger(this.javaClass)

    fun assertProfileLoansRequestPage(): ProfileLoansRequestPageAssertion {
        log.info("Asserting profile loans request page elements")
        profileLoansRequestPage.apply {
            assertThat(profileHeader.isDisplayed).isTrue
            assertThat(profileHeader.text).isEqualTo("Create your free account to see rates")
            assertThat(firstName.isDisplayed).isTrue
            assertThat(lastName.isDisplayed).isTrue
            assertThat(phoneNumber.isDisplayed).isTrue
            assertThat(housingStatusDropdown.isDisplayed).isTrue
            assertThat(currentAddressToManualMode.isDisplayed).isTrue
            assertThat(citizenshipStatusDropdown.isDisplayed).isTrue
            assertThat(borrowerSsn.isDisplayed).isTrue
            assertThat(email.isDisplayed).isTrue
            assertThat(agreeButton.isDisplayed).isTrue
        }
        return this
    }

}


