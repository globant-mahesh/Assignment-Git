package com.cleartrip.stepdefs;

import com.cleartrip.commonutilities.LogConfig;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.slf4j.Logger;

/**
 * Created by @author maheshb
 */
public class ServiceHooks {
    public static Logger logger;

    @Before
    public void initializeTest() {
        logger = LogConfig.getLogger();
        logger.info("Starting a new cucumber test.");
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails)
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
