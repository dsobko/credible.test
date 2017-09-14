package com.dsobko.credible.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.dsobko.credible.test"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "chromedriver")
public class MainConfiguration implements CommandLineRunner {

    private String path;

    public void run(String... args) {
        System.setProperty("webdriver.chrome.driver", getPath());
        System.setProperty("selenide.browser", "Chrome");
    }

    private String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}

