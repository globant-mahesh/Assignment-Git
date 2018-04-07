package com.corejava.assignments;//import com.pm.automation.webdriver.Browser;

import java.io.IOException;
import java.util.Properties;

public class Config {

//    Properties file needs to be placed in src/main/resources & Config class i.e. this class must be placed in the package i.e.
    private static Properties config = loadProperties("config.properties");
//    private static Browser browser = null;

    public static Properties loadProperties(String fileName) {
        Properties newProperties = new Properties();
        try {
            newProperties.load(Config.class.getClassLoader().getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newProperties;
    }

    public static Properties loadProperties() {
        return config;
    }

    public static String getApplicationUrl() {
        return config.getProperty("app.url");
    }

//    public static Browser getBrowserType() {
//        String browserType = config.getProperty("browser.type").toLowerCase();
//
//        switch (browserType) {
//            case "chrome":
//                browser = Browser.CHROME;
//                break;
//
//            case "firefox":
//                browser = Browser.FIREFOX;
//                break;
//
//            case "ie":
//                browser = Browser.IE;
//                break;
//
//            case "chrome_grid":
//                browser = Browser.CHROME_GRID;
//                break;
//        }
//        return browser;
//
//    }

    public static String getBrowserName() {
        return config.getProperty("browser");
    }

    public static String getSuiteName() {
        return config.getProperty("testngXml");
    }

    public static String getProxy() {
        return config.getProperty("proxy");
    }

    public static String getPort() {
        return config.getProperty("port");
    }

    public static String getImplicitWaitTime() {
        return config.getProperty("implicitWaitTimeOut");
    }

    public static String getPageLoadTimeOut() {
        return config.getProperty("pageLoadTimeOut");
    }

    public static String getScriptTimeOut() {
        return config.getProperty("scriptTimeOut");
    }

    public static String getExplicitWaitTimeOut() {
        return config.getProperty("explicitWaitTimeOut");
    }

    public static String getSeleniumGridUrl() {
        return config.getProperty("seleniumGridUrl");
    }

    public static String getCronUrl() {
        return config.getProperty("cron.url");
    }

    public static String getExternalAppUrl() {
        return config.getProperty("extApp.url");
    }

    public static String getPremLibUrl() {
        return config.getProperty("premLib.url");
    }

    public static String getTimeStamp() {
        return config.getProperty("timeStamp");
    }
}
