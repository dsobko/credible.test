package com.dsobko.credible.test

import com.djdch.log4j.StaticShutdownCallbackRegistry
import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import cucumber.runtime.Runtime
import cucumber.runtime.RuntimeOptions
import cucumber.runtime.io.MultiLoader
import cucumber.runtime.io.ResourceLoaderClassFinder
import org.junit.BeforeClass
import org.junit.runner.RunWith
import java.io.IOException
import java.lang.Runtime.getRuntime
import java.util.ArrayList
import java.util.Arrays.asList

@RunWith(Cucumber::class)
@CucumberOptions(monochrome = true,
        features = arrayOf("src/test/resources/features"),
        glue = arrayOf("com.dsobko.credible.test"),
        plugin = arrayOf("pretty", "html:build/cucumber-report", "json:build/cucumber.json"),
        tags = arrayOf("@Ready", "~@NotReady", "~@Bug", "~@Issue", "~@NotImplemented"))
object CucumberFeaturesRunner {

    init {
        System.setProperty("log4j.shutdownCallbackRegistry", "com.djdch.log4j.StaticShutdownCallbackRegistry")
    }

    @JvmStatic
    @BeforeClass
    fun before() {
        getRuntime().addShutdownHook(Thread {
            try {
                ReportGenerator.generateReport()
            } finally {
                // Shutdown Log4j 2 manually
                StaticShutdownCallbackRegistry.invoke()
            }
        })
    }

    @JvmStatic fun main(argv: Array<String>) {
        before()
        val exitStatus = run(argv, Thread.currentThread().contextClassLoader)
        System.exit(exitStatus.toInt())
    }

    /**
     * Launches the Cucumber-JVM command line.
     * @param argv runtime options. See details in the `cucumber.api.cli.Usage.txt` resource.
     * @param classLoader classloader used to load the runtime
     * @return 0 if execution was successful, 1 if it was not (test failures)
     * @throws IOException if resources couldn't be loaded during the run.
     */
    fun run(argv: Array<String>, classLoader: ClassLoader): Byte {
        val runtimeOptions = RuntimeOptions(ArrayList(asList(*argv)))

        val resourceLoader = MultiLoader(classLoader)
        val classFinder = ResourceLoaderClassFinder(resourceLoader, classLoader)
        val runtime = Runtime(resourceLoader, classFinder, classLoader, runtimeOptions)
        runtime.run()
        return runtime.exitStatus()
    }
}
