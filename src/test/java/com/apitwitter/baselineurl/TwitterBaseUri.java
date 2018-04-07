package com.apitwitter.baselineurl;

/**
 * This class is created to
 * handle and return the twitter
 * Base URL required for the tests.
 */
public abstract class TwitterBaseUri {

    static final String TWITTERBASEURL = "https://api.twitter.com/1.1/statuses";

    public static String getTwitterBaseUrL() {
        return  TWITTERBASEURL;
    }

}
