package com.cleartrip.testsuite;

import com.cleartrip.commonutilities.LogConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

/**
 * Created by maheshb
 */

public class BaseTest extends DriverConfiguration {

    public static Logger logger;

    public BaseTest() {
        logger = LogConfig.getLogger();
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        logger.debug("In a suite class: " + this.getClass().getName());
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        logger.debug("Done with suite class: " + this.getClass().getName());
    }

    @BeforeTest(alwaysRun = true)
    public void setUp() {
        driver = driverConfig();
        logger.debug("Starting new Test Suite Execution.");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        logger.debug("Finished executing Test Suite!");
    }

}
