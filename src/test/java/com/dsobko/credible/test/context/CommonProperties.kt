package com.dsobko.credible.test.context

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "common.properties")
class CommonProperties {

    lateinit var amountToLoan: String

}