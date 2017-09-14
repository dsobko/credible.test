package com.dsobko.credible.test.pages

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$$`
import com.codeborne.selenide.Selenide.`$`
import org.openqa.selenium.By
import org.openqa.selenium.By.*

class PersonalLoansRequestPage {

    val personalLoanHeader = `$$`(className("big-title"))!![0]

    val loanAmountField = `$`(name("loan_amount"))!!

    val loanPurposeDropdown =`$$`("*[class^='select2-container']")[0]!!

    val loanPurpose = `$`(id("select2-results-1")!!)

    val highestLevelOfCompletionDropdown = `$$`("*[class^='select2-container']")[1]!!

    val completedEducation = `$`(id("select2-results-2")!!)

    val currentEmploymentStatusDropdown = `$$`("*[class^='select2-container']")[2]!!

    val currentEmploymentStatus = `$`(id("select2-results-3")!!)

    val dateOfbirth = `$`(name("borrower_dob"))!!

    val employmentIncome = `$`(name("employment_income_yearly"))!!

    val employmentIncomeTooltip = `$$`(className("tooltip-text"))!![0]

    val employmentIncomeTooltipText = `$$`(className("tooltip-text"))!![0].getAttribute("data-original-title")

    val creditScoreDropdown = `$$`("*[class^='select2-container']")[3]!!

    val creditScore = `$`(id("select2-results-4")!!)

    val continueButton = `$`(className("next-step"))!!

    fun waitForLoading() {
        personalLoanHeader.shouldBe(Condition.visible)
    }

}
