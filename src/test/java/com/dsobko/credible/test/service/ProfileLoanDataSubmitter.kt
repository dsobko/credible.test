package com.dsobko.credible.test.service

import com.codeborne.selenide.Condition
import com.dsobko.credible.test.pages.ProfileLoansRequestPage
import com.dsobko.credible.test.utils.EmailGenerator

class ProfileLoanDataSubmitter(private val profileLoansRequestPage: ProfileLoansRequestPage) {

    fun submitProfileLoanData() {
        profileLoansRequestPage.apply {
            firstName.value = "AAAAAAA"
            lastName.value = "BBBBBBB"
            phoneNumber.value = "0123456789"
            housingStatusDropdown.click()
            housingStatus.click()
            currentAddressToManualMode.click()
            currentAddressStreet.value = "650 Montgomery street"
            currentAddressCity.value = "Kiev"
            currentAddressStateDropdown.click()
            currentAddressState.click()
            currentAddressZipcode.value = "94111"
            citizenshipStatusDropdown.click()
            citizenshipStatus.click()
            borrowerSsn.value = "0123456789"
            email.value = EmailGenerator.generateEmail()
            password.shouldBe(Condition.visible)
            password.value = "12345678Aa"
        }
    }
}