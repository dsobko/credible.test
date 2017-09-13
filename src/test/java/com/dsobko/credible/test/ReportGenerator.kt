package com.dsobko.credible.test

import net.masterthought.cucumber.Configuration
import net.masterthought.cucumber.ReportBuilder

import java.io.File
import java.util.ArrayList

object ReportGenerator {

    fun generateReport() {
        val reportOutputDirectory = File("build/cucumber-report")
        val jsonFiles = ArrayList<String>()
        jsonFiles.add("build/cucumber.json")

        val buildNumber = "1"
        val projectName = "Credible functional tests"
        val skippedFails = true
        val pendingFails = false
        val undefinedFails = true
        val missingFails = true
        val parallelTesting = false

        val configuration = Configuration(reportOutputDirectory, projectName)
        // optionally only if you need
        configuration.setStatusFlags(skippedFails, pendingFails, undefinedFails, missingFails)
        configuration.isParallelTesting = parallelTesting
        configuration.buildNumber = buildNumber

        val reportBuilder = ReportBuilder(jsonFiles, configuration)
        reportBuilder.generateReports()
    }
}
