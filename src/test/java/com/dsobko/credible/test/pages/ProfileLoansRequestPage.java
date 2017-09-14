package com.dsobko.credible.test.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.className;

public final class ProfileLoansRequestPage {

    private final SelenideElement profileHeader;
    private final SelenideElement firstName;
    private final SelenideElement lastName;
    private final SelenideElement phoneNumber;
    private final SelenideElement phoneNumberTooltip;
    private final String phoneNumberTooltipText;
    private final SelenideElement housingStatusDropdown;
    private final SelenideElement housingStatus;
    private final SelenideElement currentAddressToManualMode;
    private final SelenideElement currentAddressStreet;
    private final SelenideElement currentAddressCity;
    private final SelenideElement currentAddressStateDropdown;
    private final SelenideElement currentAddressState;
    private final SelenideElement currentAddressZipcode;
    private final SelenideElement citizenshipStatusDropdown;
    private final SelenideElement citizenshipStatus;
    private final SelenideElement citizenshipStatusTooltip;
    private final String citizenshipStatusTooltipText;
    private final SelenideElement borrowerSsn;
    private final SelenideElement borrowerSsnTooltip;
    private final String borrowerSsnTooltipText;
    private final SelenideElement email;
    private final SelenideElement password;
    private final SelenideElement agreeButton;

    public ProfileLoansRequestPage() {
        this.profileHeader = $$(className("big-title")).get(1);
        this.firstName = $(By.name("borrower_first_name"));
        this.lastName = $(By.name("borrower_last_name"));
        this.phoneNumber = $(By.name("borrower_phone"));
        this.phoneNumberTooltip = $$(className("tooltip-text")).get(1);
        this.phoneNumberTooltipText = $$(className("tooltip-text")).get(1).getAttribute("data-original-title");
        this.housingStatusDropdown = $$("*[class^='select2-container']").get(4);
        this.housingStatus = $(By.id("select2-results-5"));
        this.currentAddressToManualMode = $(className("to-manual-mode"));
        this.currentAddressStreet = $(By.name("current_address_street"));
        this.currentAddressCity = $(By.name("current_address_city"));
        this.currentAddressStateDropdown = $$("*[class^='select2-container']").get(5);
        this.currentAddressState = $(By.id("select2-results-6"));
        this.currentAddressZipcode = $(By.name("current_address_zipcode"));
        this.citizenshipStatusDropdown = $$("*[class^='select2-container']").get(6);
        this.citizenshipStatus = $(By.id("select2-results-7"));
        this.citizenshipStatusTooltip = $$(className("tooltip-text")).get(2);
        this.citizenshipStatusTooltipText = $$(className("tooltip-text")).get(2).getAttribute("data-original-title");
        this.borrowerSsn = $(By.name("borrower_ssn"));
        this.borrowerSsnTooltip = $$(className("tooltip-text")).get(3);
        this.borrowerSsnTooltipText = $$(className("tooltip-text")).get(3).getAttribute("data-original-title");
        this.email = $(By.name("email"));
        this.password = $(By.name("password"));
        this.agreeButton = $(className("send-submission"));
    }

    public final SelenideElement getProfileHeader() {
        return this.profileHeader;
    }

    public final SelenideElement getFirstName() {
        return this.firstName;
    }

    public final SelenideElement getLastName() {
        return this.lastName;
    }

    public final SelenideElement getPhoneNumber() {
        return this.phoneNumber;
    }

    public final SelenideElement getPhoneNumberTooltip() {
        return this.phoneNumberTooltip;
    }

    public final String getPhoneNumberTooltipText() {
        return this.phoneNumberTooltipText;
    }

    public final SelenideElement getHousingStatusDropdown() {
        return this.housingStatusDropdown;
    }

    public final SelenideElement getHousingStatus() {
        return this.housingStatus;
    }

    public final SelenideElement getCurrentAddressToManualMode() {
        return this.currentAddressToManualMode;
    }

    public final SelenideElement getCurrentAddressStreet() {
        return this.currentAddressStreet;
    }

    public final SelenideElement getCurrentAddressCity() {
        return this.currentAddressCity;
    }

    public final SelenideElement getCurrentAddressStateDropdown() {
        return this.currentAddressStateDropdown;
    }

    public final SelenideElement getCurrentAddressState() {
        return this.currentAddressState;
    }

    public final SelenideElement getCurrentAddressZipcode() {
        return this.currentAddressZipcode;
    }

    public final SelenideElement getCitizenshipStatusDropdown() {
        return this.citizenshipStatusDropdown;
    }

    public final SelenideElement getCitizenshipStatus() {
        return this.citizenshipStatus;
    }

    public final SelenideElement getCitizenshipStatusTooltip() {
        return this.citizenshipStatusTooltip;
    }

    public final String getCitizenshipStatusTooltipText() {
        return this.citizenshipStatusTooltipText;
    }

    public final SelenideElement getBorrowerSsn() {
        return this.borrowerSsn;
    }

    public final SelenideElement getBorrowerSsnTooltip() {
        return this.borrowerSsnTooltip;
    }

    public final String getBorrowerSsnTooltipText() {
        return this.borrowerSsnTooltipText;
    }

    public final SelenideElement getEmail() {
        return this.email;
    }

    public final SelenideElement getPassword() {
        return this.password;
    }

    public final SelenideElement getAgreeButton() {
        return this.agreeButton;
    }

    public final void waitForLoading() {
        this.profileHeader.shouldBe(visible);
    }

}