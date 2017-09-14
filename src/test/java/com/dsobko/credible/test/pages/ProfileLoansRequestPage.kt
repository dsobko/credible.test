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

    val phoneNumberTooltip = `$$`(By.className("tooltip-text"))!![1]

    val phoneNumberTooltipText = `$$`(By.className("tooltip-text"))!![1].getAttribute("data-original-title")

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

    val citizenshipStatusTooltip = `$$`(By.className("tooltip-text"))!![2]

    val citizenshipStatusTooltipText = `$$`(By.className("tooltip-text"))!![2].getAttribute("data-original-title")

    val borrowerSsn = `$`(By.name("borrower_ssn"))!!

    val borrowerSsnTooltip = `$$`(By.className("tooltip-text"))!![3]

    val borrowerSsnTooltipText = `$$`(By.className("tooltip-text"))!![3].getAttribute("data-original-title")

    val email = `$`(By.name("email"))!!

    val agreeButton = `$`(By.className("send-submission"))!!


    fun waitForLoading() {
        profileHeader.shouldBe(Condition.visible)
    }

}