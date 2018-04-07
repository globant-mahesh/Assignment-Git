package com.cleartrip.testsuite.factory;

import com.cleartrip.testsuite.TestNgFactoryRunner;

/**
 * Created by maheshb
 * Factory: A factory will execute all the test methods present inside a test class using a separate instance of the respective class.
 */
public class Factory extends DataProviderFactory {

    @org.testng.annotations.Factory(dataProvider = "DataProviderFactory")
//    The parameters of the below method will get the outputted parameters of the dataprovider
//    Following method will be executed number of times equal to number of rows OR first dimension of the Object[][] from dataProvider
    public Object[] factoryMethod(String url, String typeofSearch, String fromPlace, String toPlace, String date, String numberOfAdults) {
        return new Object[]{new TestNgFactoryRunner(url, typeofSearch, fromPlace, toPlace, date, numberOfAdults)};
    }
}
