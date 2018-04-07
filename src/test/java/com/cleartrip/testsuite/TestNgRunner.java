package com.cleartrip.testsuite;

import com.cleartrip.pageobjects.HomePage;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by maheshb
 */
//@Test(groups = {"default-group"})
public class TestNgRunner {

    @DataProvider(name="data-provider")
    public Object[][] dataProvider() {
        //It is an array of array of object so inner curly braces represents array of object & outer braces therefore array of array of Object
        return new Object[][]{{"one way", "Mumbai", "Pune", "17/01/2019", "2"}, {"one way", "Pune", "Bangalore", "17/01/2019", "1"}};
    }

    @Factory (dataProvider = "data-provider")
    public static Object[] produce(String typeofSearch, String fromPlace, String toPlace, String date, String numberOfAdults) {
        return new Object[]{
                new TestInstance(typeofSearch, fromPlace, toPlace, date, numberOfAdults),
                new TestInstance(typeofSearch, fromPlace, toPlace, date, numberOfAdults)
        };
    }

}
