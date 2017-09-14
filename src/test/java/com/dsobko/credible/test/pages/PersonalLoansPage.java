package com.dsobko.credible.test.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.name;

public final class PersonalLoansPage {

    private final SelenideElement title;
    private final SelenideElement loanAmountField;

    public PersonalLoansPage() {
        this.title = $(className("top-title"));
        this.loanAmountField = $(name("loan_amount"));
    }

    public final SelenideElement getTitle() {
        return title;
    }

    public final SelenideElement getLoanAmountField() {
        return loanAmountField;
    }


}

