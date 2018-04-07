/**
 * To instantiate the webelements declared in the pageobject class, the page must have been loaded before the creation of the object
 * driver must be initialised in the constructor
 */
package com.cleartrip.pageobjects;

import com.corejava.assignments.Config;
import org.apache.commons.io.FileUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomePage extends BasePage {

    @FindBy(how = How.CSS, using = "input#OneWay")
    WebElement oneWayRadioButton;

    @FindBy(how = How.CSS, using = "input#RoundTrip")
    WebElement roundTripRadioButton;

    @FindBy(how = How.CSS, using = "input#MultiCity")
    WebElement multiCityRadioButton;

    @FindBy(how = How.CSS, using = "input#FromTag")
    WebElement fromPlaceTextBox;

    @FindBy(how = How.CSS, using = "input#ToTag")
    WebElement toPlaceTextBox;

    @FindBy(how = How.CSS, using = "input#SearchBtn")
    WebElement searchFlightButton;

    @FindBy(how = How.CSS, using = "input.depart_date")
    WebElement dateTextBox;

    @FindBy(how = How.CSS, using = "select#Adults")
    WebElement selectAdults;

    @FindBy(how = How.CSS, using = "div.last table.calendar td.undefined, div.last table.calendar td:not([class*='disabled']):nth-of-type(1)")
    WebElement nextMonthDate;

    @FindBy(how = How.CSS, using = "div.last table.calendar td.undefined, div.last table.calendar td:not([class*='disabled']):nth-of-type(2)")
    WebElement nextMonthReturnDate;

    By byNextMonthReturnDate = By.cssSelector("div.last table.calendar td.undefined, div.last table.calendar td:not([class*='disabled']):nth-of-type(2)");

    //    This is the constructor used by the initElement method of PageFactory class by default
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(Config.getApplicationUrl());
        PageFactory.initElements(driver, this);
    }

    public void search(String typeOfSearch, String fromPlace, String toPlace, String date, String numberOfAdults) throws IOException {
        if ("one way".equals(typeOfSearch)) {
            oneWayRadioButton.click();
        } else if ("round trip".equals(typeOfSearch)) {
            roundTripRadioButton.click();
        } else if ("multi city".equals(typeOfSearch)) {
            multiCityRadioButton.click();
        } else {
            oneWayRadioButton.click();
        }

        fromPlaceTextBox.sendKeys(fromPlace);
        toPlaceTextBox.sendKeys(toPlace);
        dateTextBox.click();
        nextMonthDate.click();
        if (typeOfSearch.equals("round trip")) {
            clickOnElement(byNextMonthReturnDate);
        }
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File f1 = new File("~/screenshot.png");
        FileUtils.copyFile(f, f1);
        new Select(selectAdults).selectByValue(numberOfAdults);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchFlightButton.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void searchPackage(String typeofSearch) throws IOException {
        logger.debug("Page is initialised.");
        logger.trace("Searching City Name.");
        assertThat(this.getCurrentUrl(), Matchers.containsString("cleartrip"));
        search(typeofSearch, "Mumbai", "Pune", "17/01/2019", "2");
    }
}