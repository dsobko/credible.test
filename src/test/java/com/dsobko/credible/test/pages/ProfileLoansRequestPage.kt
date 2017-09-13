package com.dsobko.credible.test.pages

import com.codeborne.selenide.Selenide.`$$`
import com.codeborne.selenide.Selenide.`$`
import org.openqa.selenium.By

class ProfileLoansRequestPage {

    val firstName = `$`(By.name("borrower_first_name"))!!

    val lastName = `$`(By.name("borrower_last_name"))!!

    val phoneNumber = `$`(By.name("borrower_phone"))!!

    val housingStatus = `$$`(By.className("select2-drop select2-display-none bootstrap-dropdown-items select2-with-searchbox select2-drop-active"))[0]!!

    val currentAddress = `$`(By.name("current_address_full_address"))!!

    val citizenshipStatus = `$$`(By.className("select2-drop select2-display-none bootstrap-dropdown-items select2-with-searchbox select2-drop-active"))[1]!!

    val borrowerSsn = `$`(By.name("borrower_ssn"))!!

    val email = `$`(By.name("email"))!!

    val agreeButton = `$`(By.className("send-submission"))!!

}