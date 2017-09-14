package com.dsobko.credible.test.service;

import com.codeborne.selenide.Condition;
import com.dsobko.credible.test.pages.ProfileLoansRequestPage;
import com.dsobko.credible.test.utils.EmailGenerator;

final class ProfileLoanDataSubmitter {
    
    private final ProfileLoansRequestPage profileLoansRequestPage;

    ProfileLoanDataSubmitter(ProfileLoansRequestPage profileLoansRequestPage) {
        this.profileLoansRequestPage = profileLoansRequestPage;
    }

    final void submitProfileLoanData() {
        profileLoansRequestPage.getFirstName().setValue("AAAAAAA");
        profileLoansRequestPage.getLastName().setValue("BBBBBBB");
        profileLoansRequestPage.getPhoneNumber().setValue("0123456789");
        profileLoansRequestPage.getHousingStatusDropdown().click();
        profileLoansRequestPage.getHousingStatus().click();
        profileLoansRequestPage.getCurrentAddressToManualMode().click();
        profileLoansRequestPage.getCurrentAddressStreet().setValue("650 Montgomery street");
        profileLoansRequestPage.getCurrentAddressCity().setValue("Kiev");
        profileLoansRequestPage.getCurrentAddressStateDropdown().click();
        profileLoansRequestPage.getCurrentAddressState().click();
        profileLoansRequestPage.getCurrentAddressZipcode().setValue("94111");
        profileLoansRequestPage.getCitizenshipStatusDropdown().click();
        profileLoansRequestPage.getCitizenshipStatus().click();
        profileLoansRequestPage.getBorrowerSsn().setValue("0123456789");
        profileLoansRequestPage.getEmail().setValue(EmailGenerator.INSTANCE.generateEmail());
        profileLoansRequestPage.getPassword().shouldBe(Condition.visible);
        profileLoansRequestPage.getPassword().setValue("12345678Aa");
    }

}
