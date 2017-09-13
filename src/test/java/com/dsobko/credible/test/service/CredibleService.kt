package com.dsobko.credible.test.service

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.open
import com.dsobko.credible.test.assertions.HomePageAssertion
import com.dsobko.credible.test.assertions.PersonalLoansPageAssertion
import com.dsobko.credible.test.pages.HomePage
import com.dsobko.credible.test.pages.PersonalLoansPage
import com.dsobko.credible.test.pages.PersonalLoansRequestPage
import com.dsobko.credible.test.props.CredibleServiceConfigs
import org.openqa.selenium.By
import org.slf4j.LoggerFactory.getLogger
import org.springframework.stereotype.Service


@Service
class CredibleService(private val credibleServiceConfigs: CredibleServiceConfigs) {

    private val log = getLogger(this.javaClass)

    private var homePage: HomePage? = null

    private var personalLoansPage: PersonalLoansPage? = null

    private var personalLoansRequestPage: PersonalLoansRequestPage? = null

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

    fun enterLoanAmount() {
        val loanAmount = "15000"
        log.info("Entering loan amount $loanAmount")

        personalLoansPage!!.loanAmountField.setValue(loanAmount).pressEnter()

        personalLoansRequestPage = PersonalLoansRequestPage()
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
            continueButton.click()
        }
    }


}
