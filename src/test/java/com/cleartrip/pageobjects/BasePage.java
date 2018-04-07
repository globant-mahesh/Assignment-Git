package com.cleartrip.pageobjects;

import com.corejava.assignments.Config;
import com.cleartrip.commonutilities.LogConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

public class BasePage {

    protected WebDriver driver = null;
    public static Logger logger;

    public BasePage() {
        logger = LogConfig.getLogger();

    }

    public void wait(By by) {
        new WebDriverWait(driver, Integer.parseInt(Config.getExplicitWaitTimeOut())).until(ExpectedConditions.elementToBeClickable(by));
    }

    public void wait(WebElement element) {
        new WebDriverWait(driver, Integer.parseInt(Config.getExplicitWaitTimeOut())).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void clickOnElement(By by) {
        wait(by);
        driver.findElement(by).click();
    }

    protected void clickOnElement(WebElement element) {
        wait(element);
        element.click();
    }

    public void closeDriver() {
        driver.close();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
