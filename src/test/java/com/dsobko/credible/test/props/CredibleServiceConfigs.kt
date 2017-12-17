package com.dsobko.credible.test.props

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "credible.service")
class CredibleServiceConfigs {

    lateinit var host: String

}