package com.dsobko.credible.test;

import com.dsobko.credible.test.context.SharedContext;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import static org.slf4j.LoggerFactory.getLogger;

@SuppressWarnings("SpringJavaAutowiringInspection")
@CucumberStep
public class SetupSteps {

    private Logger log = getLogger(SetupSteps.class);

    @Autowired
    private SharedContext sharedContext;

    public void setSharedContext(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
    }

    @Before
    public void putScenarioNameToMDCContextMap(Scenario scenario) {
        String scenarioName = scenario.getName();
//        MDC.put("scenarioName", scenarioName);  Comment out, to have scenario name as part of MDC context
        log.info("Scenario \"" + scenarioName + "\" started");
        sharedContext.setScenarioName(scenarioName);
    }


}
