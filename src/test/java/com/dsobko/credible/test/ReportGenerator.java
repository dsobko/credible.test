package com.dsobko.credible.test;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class ReportGenerator {

    static void generateReport() {
        File reportOutputDirectory = new File("build/cucumber-report");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("build/cucumber.json");

        String buildNumber = "1";
        String projectName = "Credible functional tests";
        boolean skippedFails = true;
        boolean pendingFails = false;
        boolean undefinedFails = true;
        boolean missingFails = true;
        boolean parallelTesting = false;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        // optionally only if you need
        configuration.setStatusFlags(skippedFails, pendingFails, undefinedFails, missingFails);
        configuration.setParallelTesting(parallelTesting);
        configuration.setBuildNumber(buildNumber);


        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
