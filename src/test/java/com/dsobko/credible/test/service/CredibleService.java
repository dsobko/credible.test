package com.dsobko.credible.test.service;

import com.dsobko.credible.test.assertions.HomePageAssertion;
import com.dsobko.credible.test.assertions.PersonalLoansPageAssertion;
import com.dsobko.credible.test.assertions.PersonalLoansRequestPageAssertion;
import com.dsobko.credible.test.assertions.ProfileLoansRequestPageAssertion;
import com.dsobko.credible.test.context.CommonProperties;
import com.dsobko.credible.test.pages.HomePage;
import com.dsobko.credible.test.pages.PersonalLoansPage;
import com.dsobko.credible.test.pages.PersonalLoansRequestPage;
import com.dsobko.credible.test.pages.ProfileLoansRequestPage;
import com.dsobko.credible.test.props.CredibleServiceConfigs;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.slf4j.LoggerFactory.getLogger;

@Service
public final class CredibleService {

    private final Logger log = getLogger(this.getClass());

    private HomePage homePage;
    private PersonalLoansPage personalLoansPage;
    private PersonalLoansRequestPage personalLoansRequestPage;
    private ProfileLoansRequestPage profileLoansRequestPage;
    private final CredibleServiceConfigs credibleServiceConfigs;
    private final CommonProperties commonProperties;


    public CredibleService(@Autowired CredibleServiceConfigs credibleServiceConfigs,
                           @Autowired CommonProperties commonProperties) {
        this.credibleServiceConfigs = credibleServiceConfigs;
        this.commonProperties = commonProperties;
    }

    public final void openHomePage() {
        String url = credibleServiceConfigs.host;
        log.info("Opening Credible home page: " + url);

        homePage = open(url, HomePage.class);
        homePage.getPersonalLoansLink().shouldBe(visible);

        HomePageAssertion assertion = new HomePageAssertion(homePage);
        assertion.assertHomePage();
    }

    public final void openPersonalLoansPage() {
        log.info("Opening personal loans page");

        homePage.getPersonalLoansLink().click();
        personalLoansPage = new PersonalLoansPage();

        PersonalLoansPageAssertion assertion = new PersonalLoansPageAssertion(personalLoansPage);
        assertion.assertPersonalLoansPage();
    }

    public final void openPersonalLoansRequestPage() {
        String loanAmount = commonProperties.amountToLoan;
        log.info("Entering loan amount " + loanAmount);

        personalLoansPage.getLoanAmountField().setValue(loanAmount).pressEnter();
        log.info("Navigating to the PersonalLoansRequest page");

        personalLoansRequestPage = new PersonalLoansRequestPage();
        personalLoansRequestPage.waitForLoading();

        PersonalLoansRequestPageAssertion assertion = new PersonalLoansRequestPageAssertion(personalLoansRequestPage);
        assertion.assertHeader().assertPersonalLoansRequestPage().assertTooltips();
    }

    public final void enterPersonalLoanRequestData() {
        PersonalLoanDataSubmitter submitter = new PersonalLoanDataSubmitter(personalLoansRequestPage, commonProperties);
        submitter.submitPersonalLoanData();
    }

    public final void openProfileLoansRequestPage() {
        personalLoansRequestPage.getContinueButton().click();
        log.info("Navigating to the ProfileLoansRequest page");

        profileLoansRequestPage = new ProfileLoansRequestPage();
        profileLoansRequestPage.waitForLoading();

        ProfileLoansRequestPageAssertion assertion = new ProfileLoansRequestPageAssertion(profileLoansRequestPage);
        assertion.assertHeader().assertProfileLoansRequestPage().assertTooltips();
    }

    public final void enterProfileLoanRequestData() {
        ProfileLoanDataSubmitter submitter = new ProfileLoanDataSubmitter(profileLoansRequestPage);
        submitter.submitProfileLoanData();
    }

    public final void submitRequestForLoan() {
        log.info("Submitting loan request");
        profileLoansRequestPage.getAgreeButton().shouldBe(enabled);
        profileLoansRequestPage.getAgreeButton().click();
        log.info("Loan request was submitted successfully");
    }

}