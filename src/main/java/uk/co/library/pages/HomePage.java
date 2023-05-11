package uk.co.library.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

/**
 * HomePage -
 * Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
 * Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
 * enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
 * clickOnFindJobsButton().
 */
public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-nav__link'][normalize-space()='Search Jobs']")
    WebElement search;

    @CacheLookup
    @FindBy(css = "#more-search-options")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobRef;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location1;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance_adv']")
    WebElement distanceDropdown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='sal-min']")
    WebElement minSal;

    @CacheLookup
    @FindBy(xpath = "//input[@id='sal-max']")
    WebElement maxsal;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sal-type']")
    WebElement salaryType;

    @CacheLookup
    @FindBy(xpath = "//select[@id='job-type']")
    WebElement jobType1;

    @CacheLookup
    @FindBy(xpath = "//button[@id='adv-search-btn']")
    WebElement findJobs;

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;


    public void clickOnSearchJobTab() {
        Reporter.log("Click on search Button ");
        clickOnElement(search);
        CustomListeners.test.log(Status.PASS, "Click on search button ");
    }

    public void clickOnMoreSearchOption() {
        Reporter.log("Click on more search Button ");
        clickOnElement(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS, "Click on more search button ");
    }

    public void enterJobTitle(String jobTitle) {
        Reporter.log("Send text to Jobtitle field");
        sendTextToElement(jobRef, jobTitle);
        CustomListeners.test.log(Status.PASS, "Send text to Jobtitle field");
    }

    public void enterLocation(String location) {
        Reporter.log("Send text to Locaton field");
        sendTextToElement(location1, location);
        CustomListeners.test.log(Status.PASS, "Send text to Location field");
    }

    public void selectDropdown(String distance) {
        Reporter.log("Select text from dropdown ");
        selectByVisibleTextFromDropDown(distanceDropdown, distance);
        CustomListeners.test.log(Status.PASS, "Select text from dropdown ");
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Send text to Minimum Salary field");
        sendTextToElement(minSal, minSalary);
        CustomListeners.test.log(Status.PASS, "Send text to Minimum Salary field");
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Send text to Locaton ");
        sendTextToElement(maxsal, maxSalary);
        CustomListeners.test.log(Status.PASS, "Send text to Location");
    }

    public void selectSalaryType(String sType) {
        Reporter.log("Select Salary Type from dropdown ");
        selectByVisibleTextFromDropDown(salaryType, sType);
        CustomListeners.test.log(Status.PASS, "Select Salary Type from dropdown ");
    }

    public void selectJobType(String jobType) {
        Reporter.log("Select Job Type from dropdown ");
        selectByVisibleTextFromDropDown(jobType1, jobType);
        CustomListeners.test.log(Status.PASS, "Select Job Type from dropdown ");
    }

    public void clickOnFindJobsButton() {
        Reporter.log("Click on Search Button ");
        clickOnElement(findJobs);
        CustomListeners.test.log(Status.PASS, "Click on Search Button ");

    }


    public void acceptAllCookies() {
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }
}