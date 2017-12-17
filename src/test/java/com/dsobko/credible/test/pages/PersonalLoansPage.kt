package com.dsobko.credible.test.pages

import com.codeborne.selenide.Selenide.`$`
import org.openqa.selenium.By

class PersonalLoansPage {

    val title = `$`(By.className("top-title"))!!
    val loanAmountField = `$`(By.name("loan_amount"))!!

}