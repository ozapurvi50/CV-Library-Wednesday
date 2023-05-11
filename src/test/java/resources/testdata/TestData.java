package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Data set
 *
 * |jobTitle|location|distance|salaryMin|salaryMax|salaryType|jobType|result|
 * |Tester|Harrow| up to 5 miles|30000|500000|Per annum| Permanent|Permanent Tester jobs in Harrow on the Hill|
 */
public class TestData {

    @DataProvider(name = "Register details")
    public Object[][] getData(){
        Object[][]data = new Object[][]{
                {"Tester","Harrow, Greater London "," up to 5 miles","30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow"},
                {"Tester","Bexley, Greater London"," up to 5 miles","25000", "400000", "Per annum", "Permanent", "Permanent Tester jobs in Bexley"},
                {"Tester","London"," up to 5 miles","20000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in London"},
                {"Tester","Leicester, City of Leicester"," up to 5 miles","30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Leicester"},
                {"Tester","Kent"," up to 5 miles","30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Kent"},
                {"Tester","Ilford, Greater London"," up to 5 miles","20000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Ilford"},
                {"Tester","South East"," up to 5 miles","25000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in South East"},

        };
        return data;
    }
}
