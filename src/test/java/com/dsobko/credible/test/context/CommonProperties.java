package com.dsobko.credible.test.context;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "common.properties")
public final class CommonProperties {

    public String amountToLoan;

    public final String getAmountToLoan() {
        return amountToLoan;
    }

    public final void setAmountToLoan(String amountToLoan) {
        this.amountToLoan = amountToLoan;
    }
}
