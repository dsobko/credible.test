package com.dsobko.credible.test.service

import com.dsobko.credible.test.context.CommonProperties
import com.dsobko.credible.test.pages.PersonalLoansRequestPage

class PersonalLoanDataSubmitter(private val personalLoansRequestPage: PersonalLoansRequestPage,
                                private val commonProperties: CommonProperties) {

    fun submitPersonalLoanData() {
        personalLoansRequestPage.apply {
            loanAmountField.value = commonProperties.amountToLoan
            loanPurposeDropdown.click()
            loanPurpose.click()
            highestLevelOfCompletionDropdown.click()
            completedEducation.click()
            currentEmploymentStatusDropdown.click()
            currentEmploymentStatus.click()
            dateOfbirth.value = "01011980"
            employmentIncome.value = "150000"
            creditScoreDropdown.click()
            creditScore.click()
        }
    }
}