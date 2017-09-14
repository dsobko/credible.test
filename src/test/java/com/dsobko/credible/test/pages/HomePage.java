package com.dsobko.credible.test.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public final class HomePage {

    private final SelenideElement personalLoansLink;

    public HomePage() {
        this.personalLoansLink = $("a[data-ga-action='Personal Loan']");
    }

    public final SelenideElement getPersonalLoansLink() {
        return personalLoansLink;
    }


}
