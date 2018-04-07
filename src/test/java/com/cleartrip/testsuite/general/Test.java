package com.cleartrip.testsuite.general;

import com.cleartrip.pageobjects.HomePage;
import com.cleartrip.testsuite.WebDriverListener;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by maheshb
 */
public class Test {

    HomePage home;
    WebDriver stDriver;
    EventFiringWebDriver driver;
    Logger logger;

    public Test() {
        stDriver = new FirefoxDriver();
        driver = new EventFiringWebDriver(stDriver);
        WebDriverListener webDriverListener = new WebDriverListener();
        driver.register(webDriverListener);
    }

    public void test() throws InterruptedException, IOException {
        home = PageFactory.initElements(driver, HomePage.class);
        logger.debug("Page is initialised");
        searchPackage();
    }

    private void searchPackage() throws InterruptedException, IOException {
        logger.trace("Searching City Name");
        assertThat(driver.getCurrentUrl(), containsString("cleartrip"));
        home.search("one way", "Mumbai", "Pune","17/01/2019", "2");
    }
}
