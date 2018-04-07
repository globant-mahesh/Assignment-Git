package com.cleartrip.testsuite;

import com.corejava.assignments.Config;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverConfiguration {
    protected static ThreadLocal<RemoteWebDriver> driverThreadLocal = new ThreadLocal<RemoteWebDriver>();
    protected RemoteWebDriver driverRemote = null;
    protected WebDriver driver;

    public WebDriver driverConfig() {
        DesiredCapabilities capability = new DesiredCapabilities().chrome();
        ChromeOptions options = new ChromeOptions();
//        Map<String, Object> prefs = new HashMap<String, Object>();
//        prefs.put("profile.default_content_setting_values.notifications", 2);
//        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--start-maximized");
        options.addArguments("disable-popup-blocking");
        options.addArguments("--disable-plugins");
        options.addArguments("--disable-notifications");
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WINDOWS);
        capability.setCapability(ChromeOptions.CAPABILITY, options);
        try {
            driverRemote = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        setWebDriver(driverRemote);
        driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(Config.getImplicitWaitTime()), TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    public void setWebDriver(RemoteWebDriver driver) {
        driverThreadLocal.set(driver);
    }
}
