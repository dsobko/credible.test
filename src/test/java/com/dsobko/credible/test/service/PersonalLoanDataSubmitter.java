package com.dsobko.credible.test.service;

import com.dsobko.credible.test.context.CommonProperties;
import com.dsobko.credible.test.pages.PersonalLoansRequestPage;

final class PersonalLoanDataSubmitter {

    private final PersonalLoansRequestPage personalLoansRequestPage;
    private final CommonProperties commonProperties;

    PersonalLoanDataSubmitter(PersonalLoansRequestPage personalLoansRequestPage, CommonProperties commonProperties) {
        this.personalLoansRequestPage = personalLoansRequestPage;
        this.commonProperties = commonProperties;
    }

    final void submitPersonalLoanData() {
        personalLoansRequestPage.getLoanAmountField().setValue(commonProperties.amountToLoan);
        personalLoansRequestPage.getLoanPurposeDropdown().click();
        personalLoansRequestPage.getLoanPurpose().click();
        personalLoansRequestPage.getHighestLevelOfCompletionDropdown().click();
        personalLoansRequestPage.getCompletedEducation().click();
        personalLoansRequestPage.getCurrentEmploymentStatusDropdown().click();
        personalLoansRequestPage.getCurrentEmploymentStatus().click();
        personalLoansRequestPage.getDateOfBirth().setValue("01011980");
        personalLoansRequestPage.getEmploymentIncome().setValue("150000");
        personalLoansRequestPage.getCreditScoreDropdown().click();
        personalLoansRequestPage.getCreditScore().click();
    }


}
