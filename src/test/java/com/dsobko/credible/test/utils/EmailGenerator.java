package com.dsobko.credible.test.utils;

import org.slf4j.Logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDateTime.now;
import static java.util.Locale.US;
import static org.slf4j.LoggerFactory.getLogger;

public final class EmailGenerator {

    static {
        new EmailGenerator();
    }

    private EmailGenerator() {
        INSTANCE = this;
        log = getLogger(this.getClass());
    }

    private static Logger log;
    public static EmailGenerator INSTANCE;

    public final String generateEmail() {
        LocalDateTime currentDate = now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMdd", US);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HHmm");
        String email = "dsobko+" + dateFormatter.format(currentDate) + "+" + timeFormatter.format(currentDate) + "@domain.com";
        log.info("Generated email = " + email);
        return email;
    }


}