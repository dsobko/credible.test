package com.dsobko.credible.test.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "credible.service")
public final class CredibleServiceConfigs {

    public String host;

    public final String getHost() {
        return host;
    }

    public final void setHost(String host) {
        this.host = host;
    }
}