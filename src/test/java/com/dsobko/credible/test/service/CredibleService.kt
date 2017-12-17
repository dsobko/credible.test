package com.dsobko.credible.test.service

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.open
import com.dsobko.credible.test.assertions.HomePageAssertion
import com.dsobko.credible.test.assertions.PersonalLoansPageAssertion
import com.dsobko.credible.test.assertions.PersonalLoansRequestPageAssertion
import com.dsobko.credible.test.assertions.ProfileLoansRequestPageAssertion
import com.dsobko.credible.test.context.CommonProperties
import com.dsobko.credible.test.pages.HomePage
import com.dsobko.credible.test.pages.PersonalLoansPage
import com.dsobko.credible.test.pages.PersonalLoansRequestPage
import com.dsobko.credible.test.pages.ProfileLoansRequestPage
import com.dsobko.credible.test.props.CredibleServiceConfigs
import org.slf4j.LoggerFactory.getLogger
import org.springframework.stereotype.Service


@Service
class CredibleService(private val credibleServiceConfigs: CredibleServiceConfigs,
                      private val commonProperties: CommonProperties) {

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
        val loanAmount = commonProperties.amountToLoan
        log.info("Entering loan amount $loanAmount")

        personalLoansPage!!.loanAmountField.setValue(loanAmount).pressEnter()

        log.info("Navigating to the PersonalLoansRequest page")
        personalLoansRequestPage = PersonalLoansRequestPage()
        personalLoansRequestPage!!.waitForLoading()

        PersonalLoansRequestPageAssertion(personalLoansRequestPage!!)
                .assertHeader()
                .assertPersonalLoansRequestPage()
                .assertTooltips()
    }

    fun enterPersonalLoanRequestData() {
        PersonalLoanDataSubmitter(personalLoansRequestPage!!, commonProperties).submitPersonalLoanData()
    }

    fun openProfileLoansRequestPage() {
        personalLoansRequestPage!!.continueButton.click()

        log.info("Navigating to the ProfileLoansRequest page")
        profileLoansRequestPage = ProfileLoansRequestPage()
        profileLoansRequestPage!!.waitForLoading()

        ProfileLoansRequestPageAssertion(profileLoansRequestPage!!)
                .assertHeader()
                .assertProfileLoansRequestPage()
                .assertTooltips()
    }

    fun enterProfileLoanRequestData() {
        ProfileLoanDataSubmitter(profileLoansRequestPage!!).submitProfileLoanData()
    }

    fun submitRequestForLoan() {
        log.info("Submitting loan request")
        profileLoansRequestPage!!.apply {
            agreeButton.shouldBe(Condition.enabled)
            agreeButton.click()
        }
        log.info("Loan request was submitted successfully")
    }


}
