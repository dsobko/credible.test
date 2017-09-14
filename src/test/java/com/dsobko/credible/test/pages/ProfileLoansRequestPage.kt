package com.dsobko.credible.test.pages

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$$`
import com.codeborne.selenide.Selenide.`$`
import org.openqa.selenium.By

class ProfileLoansRequestPage {

    val profileHeader = `$$`(By.className("big-title"))!![1]

    val firstName = `$`(By.name("borrower_first_name"))!!

    val lastName = `$`(By.name("borrower_last_name"))!!

    val phoneNumber = `$`(By.name("borrower_phone"))!!

    val housingStatusDropdown = `$$`("*[class^='select2-container']")[4]!!

    val housingStatus = `$`(By.id("select2-results-5")!!)

    val currentAddressToManualMode = `$`(By.className("to-manual-mode"))!!

    val currentAddressStreet = `$`(By.name("current_address_street"))!!

    val currentAddressCity = `$`(By.name("current_address_city"))!!

    val currentAddressStateDropdown = `$$`("*[class^='select2-container']")[5]!!

    val currentAddressState = `$`(By.id("select2-results-6")!!)

    val currentAddressZipcode = `$`(By.name("current_address_zipcode"))!!

    val citizenshipStatusDropdown = `$$`("*[class^='select2-container']")[6]!!

    val citizenshipStatus = `$`(By.id("select2-results-7")!!)

    val borrowerSsn = `$`(By.name("borrower_ssn"))!!

    val email = `$`(By.name("email"))!!

    val agreeButton = `$`(By.className("send-submission"))!!


    fun waitForLoading() {
        profileHeader.shouldBe(Condition.visible)
    }

}