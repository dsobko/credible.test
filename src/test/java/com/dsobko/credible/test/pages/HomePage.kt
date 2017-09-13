package com.dsobko.credible.test.pages

import com.codeborne.selenide.Selenide.`$`


class HomePage {

    val personalLoansLink = `$`("a[data-ga-action='Personal Loan']")!!

}