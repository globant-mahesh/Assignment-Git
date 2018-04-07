package com.apitwitter.twitterapitest;

import com.apitwitter.baselineurl.TwitterBaseUri;
import com.apitwitter.restassurredresuablemethods.ReusableApiMethods;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

/**
 * This classed is created
 * as the setup class for
 * all tests used for the
 * twitter tests
 */
public class TwitterTestSetUp {

    protected ReusableApiMethods twitter = new ReusableApiMethods();
    protected String tweet;

    @BeforeClass
    public void setUpTwitterBaseUri() {
        RestAssured.baseURI = TwitterBaseUri.getTwitterBaseUrL();
    }
}
