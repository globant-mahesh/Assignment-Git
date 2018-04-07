package com.cleartrip.testsuite;

import com.cleartrip.pageobjects.HomePage;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TestInstance extends TestNgBase{
    HomePage home;
    String typeofSearch;
    String fromPlace;
    String toPlace;
    String date;
    String numberOfAdults;

    public TestInstance(String typeofSearch, String fromPlace, String toPlace, String date, String numberOfAdults) {
        this.typeofSearch = typeofSearch;
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
        this.date = date;
        this.numberOfAdults = numberOfAdults;
    }

    @Test(enabled = true, timeOut = 100000, groups = {"search", "home"})
    public void searchPackage() throws IOException {
//        home = new HomePage(driver);
        logger.debug("Page is initialised.");
        logger.trace("Searching City Name.");
//        assertThat(driver.getCurrentUrl(), containsString("cleartrip"));
//        home.search(typeofSearch, fromPlace, toPlace, date, numberOfAdults);
    }
}
