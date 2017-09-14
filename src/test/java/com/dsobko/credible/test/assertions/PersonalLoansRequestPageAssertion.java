package com.dsobko.credible.test.assertions;

import com.dsobko.credible.test.pages.PersonalLoansRequestPage;
import org.fest.assertions.AssertExtension;
import org.slf4j.Logger;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public final class PersonalLoansRequestPageAssertion implements AssertExtension {
    
    private final Logger log;
    private final PersonalLoansRequestPage personalLoansRequestPage;

    public PersonalLoansRequestPageAssertion(PersonalLoansRequestPage personalLoansRequestPage) {
        super();
        this.personalLoansRequestPage = personalLoansRequestPage;
        this.log = getLogger(this.getClass());
    }

    public final PersonalLoansRequestPageAssertion assertPersonalLoansRequestPage() {
        log.info("Asserting personal loans request page elements");
        assertThat(personalLoansRequestPage.getLoanAmountField().isDisplayed()).isTrue();
        assertThat(personalLoansRequestPage.getLoanPurposeDropdown().isDisplayed()).isTrue();
        assertThat(personalLoansRequestPage.getHighestLevelOfCompletionDropdown().isDisplayed()).isTrue();
        assertThat(personalLoansRequestPage.getCurrentEmploymentStatusDropdown().isDisplayed()).isTrue();
        assertThat(personalLoansRequestPage.getDateOfBirth().isDisplayed()).isTrue();
        assertThat(personalLoansRequestPage.getEmploymentIncome().isDisplayed()).isTrue();
        assertThat(personalLoansRequestPage.getCreditScoreDropdown().isDisplayed()).isTrue();
        assertThat(personalLoansRequestPage.getContinueButton().isDisplayed()).isTrue();
        return this;
    }

    public final PersonalLoansRequestPageAssertion assertHeader() {
        log.info("Asserting personal loans request page header");
        assertThat(personalLoansRequestPage.getPersonalLoanHeader().isDisplayed()).isTrue();
        assertThat(personalLoansRequestPage.getPersonalLoanHeader().getText())
                .isEqualTo("Compare personal loan rates from multiple providers in 2 minutes");
        return this;
    }

    public final PersonalLoansRequestPageAssertion assertTooltips() {
        log.info("Asserting personal loans request page tooltips");
        assertThat(personalLoansRequestPage.getEmploymentIncomeTooltip().isDisplayed()).isTrue();
        assertThat(personalLoansRequestPage.getEmploymentIncomeTooltipText())
                .isEqualTo("This should be your individual income. Do not include" +
                        " income from your spouse or other household members. Alimony," +
                        " child support or separate maintenance income need not be disclosed" +
                        " unless you want them considered as a basis for repaying this loan.");
        return this;
    }

   
}
