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
            assertThat(housingStatusDropdown.isDisplayed).isTrue
            assertThat(currentAddressToManualMode.isDisplayed).isTrue
            assertThat(citizenshipStatusDropdown.isDisplayed).isTrue
            assertThat(borrowerSsn.isDisplayed).isTrue
            assertThat(email.isDisplayed).isTrue
            assertThat(agreeButton.isDisplayed).isTrue
        }
        return this
    }

    fun assertHeader(): ProfileLoansRequestPageAssertion {
        log.info("Asserting profile loans request page header")
        profileLoansRequestPage.apply {
            assertThat(profileHeader.isDisplayed).isTrue
            assertThat(profileHeader.text).isEqualTo("Create your free account to see rates")
        }
        return this
    }

    fun assertTooltips(): ProfileLoansRequestPageAssertion {
        log.info("Asserting profile loans request page tooltips")
        profileLoansRequestPage.apply {
            assertThat(phoneNumberTooltip.isDisplayed).isTrue
            assertThat(phoneNumberTooltipText).isEqualTo("This helps our Client Success team provide" +
                    " more personalized service. We hate telemarketing calls," +
                    " so we never sell or rent your information. Learn more about our privacy" +
                    " policies <a href='/privacy' target='_blank'>here</a>.")
            assertThat(citizenshipStatusTooltip.isDisplayed).isTrue
            assertThat(citizenshipStatusTooltipText).isEqualTo("Providers require this information to" +
                    " determine eligibility for their products, and to comply with the USA PATRIOT Act")
            assertThat(borrowerSsnTooltip.isDisplayed).isTrue
            assertThat(borrowerSsnTooltipText).isEqualTo("This is required by lenders" +
                    " to verify your identity and assess your credit history." +
                    " Your SSN is always encrypted when stored and transmitted." +
                    " You can learn more about our security <a href='/security' target='_blank'>here</a>.")
        }
        return this
    }

}


