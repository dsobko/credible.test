package com.dsobko.credible.test.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.className;

public final class PersonalLoansRequestPage {

    private final SelenideElement personalLoanHeader;
    private final SelenideElement loanAmountField;
    private final SelenideElement loanPurposeDropdown;
    private final SelenideElement loanPurpose;
    private final SelenideElement highestLevelOfCompletionDropdown;
    private final SelenideElement completedEducation;
    private final SelenideElement currentEmploymentStatusDropdown;
    private final SelenideElement currentEmploymentStatus;
    private final SelenideElement dateOfBirth;
    private final SelenideElement employmentIncome;
    private final SelenideElement employmentIncomeTooltip;
    private final String employmentIncomeTooltipText;
    private final SelenideElement creditScoreDropdown;
    private final SelenideElement creditScore;
    private final SelenideElement continueButton;

    public PersonalLoansRequestPage() {
        this.personalLoanHeader = $$(className("big-title")).get(0);
        this.loanAmountField = $(By.name("loan_amount"));;
        this.loanPurposeDropdown = $$("*[class^='select2-container']").get(0);
        this.loanPurpose = $(By.id("select2-results-1"));
        this.highestLevelOfCompletionDropdown = $$("*[class^='select2-container']").get(1);
        this.completedEducation = $(By.id("select2-results-2"));
        this.currentEmploymentStatusDropdown = $$("*[class^='select2-container']").get(2);
        this.currentEmploymentStatus = $(By.id("select2-results-3"));
        this.dateOfBirth = $(By.name("borrower_dob"));
        this.employmentIncome = $(By.name("employment_income_yearly"));
        this.employmentIncomeTooltip = $$(className("tooltip-text")).get(0);
        this.employmentIncomeTooltipText = $$(className("tooltip-text")).get(0).getAttribute("data-original-title");
        this.creditScoreDropdown = $$("*[class^='select2-container']").get(3);
        this.creditScore = $(By.id("select2-results-4"));
        this.continueButton = $(className("next-step"));
    }

    public final SelenideElement getPersonalLoanHeader() {
        return this.personalLoanHeader;
    }

    public final SelenideElement getLoanAmountField() {
        return this.loanAmountField;
    }

   
    public final SelenideElement getLoanPurposeDropdown() {
        return this.loanPurposeDropdown;
    }

    public final SelenideElement getLoanPurpose() {
        return this.loanPurpose;
    }

   
    public final SelenideElement getHighestLevelOfCompletionDropdown() {
        return this.highestLevelOfCompletionDropdown;
    }

    public final SelenideElement getCompletedEducation() {
        return this.completedEducation;
    }

   
    public final SelenideElement getCurrentEmploymentStatusDropdown() {
        return this.currentEmploymentStatusDropdown;
    }

    public final SelenideElement getCurrentEmploymentStatus() {
        return this.currentEmploymentStatus;
    }

   
    public final SelenideElement getDateOfBirth() {
        return this.dateOfBirth;
    }

   
    public final SelenideElement getEmploymentIncome() {
        return this.employmentIncome;
    }

    public final SelenideElement getEmploymentIncomeTooltip() {
        return this.employmentIncomeTooltip;
    }

    public final String getEmploymentIncomeTooltipText() {
        return this.employmentIncomeTooltipText;
    }

   
    public final SelenideElement getCreditScoreDropdown() {
        return this.creditScoreDropdown;
    }

    public final SelenideElement getCreditScore() {
        return this.creditScore;
    }

   
    public final SelenideElement getContinueButton() {
        return this.continueButton;
    }

    public final void waitForLoading() {
        this.personalLoanHeader.shouldBe(visible);
    }


}