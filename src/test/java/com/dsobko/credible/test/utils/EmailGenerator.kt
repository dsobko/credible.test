package com.dsobko.credible.test.utils

import org.slf4j.LoggerFactory
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

object EmailGenerator {

    private val log = LoggerFactory.getLogger(this.javaClass)

    fun generateEmail(): String {
        val currentDate = LocalDateTime.now()

        val dateFormatter = DateTimeFormatter.ofPattern("MMMdd", Locale.US)
        val timeFormatter = DateTimeFormatter.ofPattern("HHmm")

        val email = "dsobko+${dateFormatter.format(currentDate)}+${timeFormatter.format(currentDate)}@domain.com"

        log.info("Generated email = $email")

        return email
    }
}