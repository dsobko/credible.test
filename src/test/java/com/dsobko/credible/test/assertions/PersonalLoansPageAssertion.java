package com.dsobko.credible.test.assertions;

import com.dsobko.credible.test.pages.PersonalLoansPage;
import org.fest.assertions.AssertExtension;
import org.slf4j.Logger;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public final class PersonalLoansPageAssertion implements AssertExtension {

    private final Logger log;
    private final PersonalLoansPage personalLoansPage;

    public PersonalLoansPageAssertion(PersonalLoansPage personalLoansPage) {
        super();
        this.personalLoansPage = personalLoansPage;
        this.log = getLogger(this.getClass());
    }

    public final PersonalLoansPageAssertion assertPersonalLoansPage() {
        log.info("Asserting personal loans page elements");
        assertThat(personalLoansPage.getTitle().isDisplayed()).isTrue();
        assertThat(personalLoansPage.getTitle().getText())
                .isEqualTo("Personal loans to get you one step ahead\nRates from 4.99% APR in just 2 minutes");
        assertThat(personalLoansPage.getLoanAmountField().isDisplayed()).isTrue();
        return this;
    }
}
