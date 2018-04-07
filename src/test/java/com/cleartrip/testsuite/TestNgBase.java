package com.cleartrip.testsuite;

import org.testng.annotations.DataProvider;

/**
 * Created by maheshb on 6/20/17.
 */
public class TestNgBase extends BaseTest {

    @DataProvider(name="data-provider")
    public Object[][] dataProvider() {
        //It is an array of array of object so inner curly braces represents array of object & outer braces therefore array of array of Object
        return new Object[][]{{"one way", "Mumbai", "Pune", "17/01/2019", "2"}, {"one way", "Pune", "Bangalore", "17/01/2019", "1"}};
    }
}
