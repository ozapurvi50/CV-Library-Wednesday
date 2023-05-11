package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

import java.time.Duration;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(groups = {"regression"}, dataProvider = "Register details", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) throws InterruptedException {

        homePage.acceptAllCookies();
        //  Click on Search Jobs tab
        homePage.clickOnSearchJobTab();
        //  Click on more search options
        //  enter job title 'jobTitle'
        homePage.enterJobTitle(jobTitle); //Tester
        //  enter Location 'location'
        homePage.enterLocation(location); //"Ruislip"
        //  select distance 'distance'
        homePage.selectDropdown(distance);//" up to 5 miles"
        //  enter salaryMin 'salaryMin'
        homePage.enterMinSalary(salaryMin); //"30000"
        //  enter salaryMax 'salaryMax'
        homePage.enterMaxSalary(salaryMax); //"500000"
        //  select salaryType 'salaryType'
        homePage.selectSalaryType(salaryType); //"Per annum"
        Thread.sleep(5000);
        //  homePage.clickOnMoreSearchOption();
        homePage.clickOnMoreSearchOption();
        //  select jobType 'jobType'
        homePage.selectJobType(jobType); //"Permanent"
        //  click on 'Find Jobs' button
        homePage.clickOnFindJobsButton();
        //  verify the result 'result'
        Assert.assertEquals(resultPage.getMessage(),result, "Error message");

    }
}
