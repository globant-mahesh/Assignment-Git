package com.cleartrip.testsuite;

import com.cleartrip.commonutilities.LogConfig;
import com.cleartrip.pageobjects.HomePage;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by maheshb
 */
public class TestNgFactoryRunner extends BaseTest {

    HomePage home;
    Logger logger;
    String url, typeofSearch, fromPlace, toPlace, date, numberOfAdults;

    public TestNgFactoryRunner(String url, String typeofSearch, String fromPlace, String toPlace, String date, String numberOfAdults) {
        this.url = url;
        this.typeofSearch = typeofSearch;
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
        this.date = date;
        this.numberOfAdults = numberOfAdults;
        this.logger = LogConfig.getLogger();
    }

    @Test(enabled = true, timeOut = 100000, groups = {"search", "home"})
    public synchronized void searchPackage() throws IOException {
            home = new HomePage(driver);
            logger.debug("Page is initialised.");
            logger.trace("Searching City Name.");
            assertThat(driver.getCurrentUrl(), containsString(url));
            home.search(typeofSearch, fromPlace, toPlace, date, String.valueOf(Integer.parseInt(numberOfAdults)));
    }

}
