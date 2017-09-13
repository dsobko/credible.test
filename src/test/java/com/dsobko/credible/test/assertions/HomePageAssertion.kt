package com.dsobko.credible.test.assertions

import com.dsobko.credible.test.pages.HomePage
import org.fest.assertions.AssertExtension
import org.fest.assertions.api.Assertions.assertThat
import org.slf4j.LoggerFactory.getLogger


class HomePageAssertion(private val homepage: HomePage) : AssertExtension {

    private val log = getLogger(this.javaClass)

    fun assertHomePage(): HomePageAssertion {
        log.info("Asserting home page elements")
        homepage.apply {
            assertThat(personalLoansLink.isDisplayed).isTrue
        }
        return this
    }



}