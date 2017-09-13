package com.dsobko.credible.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.dsobko.credible.test"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigurationProperties
public class MainConfiguration implements CommandLineRunner {


    public void run(String... args) {
        System.setProperty("webdriver.chrome.driver", "C:/Temp/chromedriver_win32/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
    }
}

