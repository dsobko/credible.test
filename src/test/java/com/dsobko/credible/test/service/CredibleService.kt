package com.dsobko.credible.test.service

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.open
import com.dsobko.credible.test.assertions.HomePageAssertion
import com.dsobko.credible.test.assertions.PersonalLoansPageAssertion
import com.dsobko.credible.test.assertions.PersonalLoansRequestPageAssertion
import com.dsobko.credible.test.assertions.ProfileLoansRequestPageAssertion
import com.dsobko.credible.test.pages.HomePage
import com.dsobko.credible.test.pages.PersonalLoansPage
import com.dsobko.credible.test.pages.PersonalLoansRequestPage
import com.dsobko.credible.test.pages.ProfileLoansRequestPage
import com.dsobko.credible.test.props.CredibleServiceConfigs
import org.slf4j.LoggerFactory.getLogger
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@Service
class CredibleService(private val credibleServiceConfigs: CredibleServiceConfigs) {

    private val log = getLogger(this.javaClass)

    private var homePage: HomePage? = null

    private var personalLoansPage: PersonalLoansPage? = null

    private var personalLoansRequestPage: PersonalLoansRequestPage? = null

    private var profileLoansRequestPage: ProfileLoansRequestPage? = null

    fun openHomePage() {
        val url = credibleServiceConfigs.host
        log.info("Opening Credible home page: $url")

        homePage = open(url, HomePage::class.java)
        homePage!!.personalLoansLink.shouldBe(Condition.visible)

        HomePageAssertion(homePage!!).assertHomePage()
    }

    fun openPersonalLoansPage() {
        log.info("Opening personal loans page")
        homePage!!.personalLoansLink.click()

        personalLoansPage = PersonalLoansPage()

        PersonalLoansPageAssertion(personalLoansPage!!).assertPersonalLoansPage()
    }

    fun openPersonalLoansRequestPage() {
        val loanAmount = "15000"
        log.info("Entering loan amount $loanAmount")

        personalLoansPage!!.loanAmountField.setValue(loanAmount).pressEnter()

        log.info("Navigating to the PersonalLoansRequest page")

        personalLoansRequestPage = PersonalLoansRequestPage()

        personalLoansRequestPage!!.waitForLoading()


        PersonalLoansRequestPageAssertion(personalLoansRequestPage!!).assertPersonalLoansRequestPage()
    }

    fun enterPersonalLoanRequestData() {
        personalLoansRequestPage!!.apply {
            loanAmountField.value = "15000"
            loanPurposeDropdown.click()
            loanPurpose.click()
            highestLevelOfCompletionDropdown.click()
            completedEducation.click()
            currentEmploymentStatusDropdown.click()
            currentEmploymentStatus.click()
            dateOfbirth.value = "01011980"
            employmentIncome.value = "15000"
            creditScoreDropdown.click()
            creditScore.click()
        }
    }

    fun openProfileLoansRequestPage() {
        personalLoansRequestPage!!.continueButton.click()

        log.info("Navigating to the ProfileLoansRequest page")

        profileLoansRequestPage = ProfileLoansRequestPage()

        profileLoansRequestPage!!.waitForLoading()

        ProfileLoansRequestPageAssertion(profileLoansRequestPage!!).assertProfileLoansRequestPage()
    }

    fun enterProfileLoanRequestData() {
        profileLoansRequestPage!!.apply {
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
            email.value = generateEmail()
            agreeButton.click()
        }
    }

    private fun generateEmail(): String {
        val currentDate = LocalDateTime.now()

        val dateFormatter = DateTimeFormatter.ofPattern("MMdd")
        val timeFormatter = DateTimeFormatter.ofPattern("HHmm")

        return "dsobko${dateFormatter.format(currentDate)}${timeFormatter.format(currentDate)}@domain.com"
    }

    fun submitRequestForLoan() {
        profileLoansRequestPage!!.agreeButton.click()
    }


}
