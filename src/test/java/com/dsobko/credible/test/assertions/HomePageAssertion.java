package com.dsobko.credible.test.assertions;

import com.dsobko.credible.test.pages.HomePage;
import org.fest.assertions.AssertExtension;
import org.slf4j.Logger;
import static org.fest.assertions.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public final class HomePageAssertion implements AssertExtension {

    private final Logger log;
    private final HomePage homepage;

    public HomePageAssertion(HomePage homepage) {
        super();
        this.homepage = homepage;
        this.log = getLogger(this.getClass());
    }

    public final HomePageAssertion assertHomePage() {
        this.log.info("Asserting home page elements");
        assertThat(homepage.getPersonalLoansLink().isDisplayed()).isTrue();
        return this;
    }

}
