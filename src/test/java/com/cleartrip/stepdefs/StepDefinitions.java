package com.cleartrip.stepdefs;

import com.cleartrip.pageobjects.HomePage;
import com.cleartrip.commonutilities.LogConfig;
import com.cleartrip.testsuite.BaseTest;
import com.cleartrip.testsuite.DriverConfiguration;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import test.inheritance.testng739.BaseClass;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * @author maheshb
 */
public class StepDefinitions extends DriverConfiguration {

    public static WebDriver driver;
    private HomePage home;
    public static Logger logger;

    public StepDefinitions() {
        logger = LogConfig.getLogger();
    }

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        home =  new HomePage(driver);
        new BaseTest().driverConfig();
    }

    @When("^user searches for \"([^\"]*)\" package$")
    public void user_searches_package(String typeofSearch) throws Throwable {
        logger.debug("Started Test.");
        home = new HomePage(driver);
        logger.debug("Page is initialised.");
        home.searchPackage(typeofSearch);
    }

    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
        String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
        String actual = driver.findElement(By.cssSelector(".info-account")).getText();
        assertThat("Failed!", exp_message, is(equalTo(actual)));
        driver.quit();
    }

    @Given("^I am on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
    public void i_am_on_the_page_on_URL(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the \"([^\"]*)\" button$")
    public void i_should_see_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
