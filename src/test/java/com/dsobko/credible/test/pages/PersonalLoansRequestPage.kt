package com.dsobko.credible.test.pages

import com.codeborne.selenide.Selenide.`$$`
import com.codeborne.selenide.Selenide.`$`
import org.openqa.selenium.By

class PersonalLoansRequestPage {

    val loanAmountField = `$`(By.name("loan_amount"))!!

    val loanPurposeFocusser =`$$`("*[class^='select2-container']")[0]!!

    val loanPurpose = `$`(By.name("loan_purpose")!!)

    val highestLevelOfCompletion = `$$`("*[class^='select2-container']")[1]!!

    val currentEmploymentStatus = `$$`("*[class^='select2-container']")[2]!!

    val dateOfbirth = `$`(By.name("borrower_dob"))!!

    val employmentIncome = `$`(By.name("employment_income_yearly"))!!

    val employmentIncomeTooltipText = `$`(By.className("tooltip-text"))!!

    val creditScore = `$$`("*[class^='select2-container']")[3]!!

    val continueButton = `$`(By.className("next-step"))!!

}
