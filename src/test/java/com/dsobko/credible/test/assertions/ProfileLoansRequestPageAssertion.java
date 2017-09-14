package com.dsobko.credible.test.assertions;

import com.dsobko.credible.test.pages.ProfileLoansRequestPage;
import org.fest.assertions.AssertExtension;
import org.slf4j.Logger;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public final class ProfileLoansRequestPageAssertion implements AssertExtension {

    private final Logger log;
    private final ProfileLoansRequestPage profileLoansRequestPage;

    public ProfileLoansRequestPageAssertion(ProfileLoansRequestPage profileLoansRequestPage) {
        super();
        this.profileLoansRequestPage = profileLoansRequestPage;
        this.log = getLogger(this.getClass());
    }

    public final ProfileLoansRequestPageAssertion assertProfileLoansRequestPage() {
        log.info("Asserting profile loans request page elements");
        assertThat(profileLoansRequestPage.getFirstName().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getLastName().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getPhoneNumber().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getHousingStatusDropdown().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getCurrentAddressToManualMode().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getCitizenshipStatusDropdown().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getBorrowerSsn().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getEmail().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getAgreeButton().isDisplayed()).isTrue();
        return this;
    }

    public final ProfileLoansRequestPageAssertion assertHeader() {
        log.info("Asserting profile loans request page header");
        assertThat(profileLoansRequestPage.getProfileHeader().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getProfileHeader().getText())
                .isEqualTo("Create your free account to see rates");
        return this;
    }

    public final ProfileLoansRequestPageAssertion assertTooltips() {
        log.info("Asserting profile loans request page tooltips");
        assertThat(profileLoansRequestPage.getPhoneNumberTooltip().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getPhoneNumberTooltipText())
                .isEqualTo("This helps our Client Success team provide more personalized service." +
                        " We hate telemarketing calls, so we never sell or rent your information." +
                        " Learn more about our privacy policies <a href='/privacy' target='_blank'>here</a>.");
        assertThat(profileLoansRequestPage.getCitizenshipStatusTooltip().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getCitizenshipStatusTooltipText())
                .isEqualTo("Providers require this information to determine eligibility" +
                        " for their products, and to comply with the USA PATRIOT Act");
        assertThat(profileLoansRequestPage.getBorrowerSsnTooltip().isDisplayed()).isTrue();
        assertThat(profileLoansRequestPage.getBorrowerSsnTooltipText())
                .isEqualTo("This is required by lenders to verify your identity and" +
                        " assess your credit history. Your SSN is always encrypted when" +
                        " stored and transmitted. You can learn more about" +
                        " our security <a href='/security' target='_blank'>here</a>.");
        return this;
    }


}