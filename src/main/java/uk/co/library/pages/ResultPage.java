package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

/**
 * ResultPage
 *   Locators - resultText
 *   Method - verifyTheResults(String expected)
 */
public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement getMessage;

    public String getMessage(){
        Reporter.log("Verify text ");
        CustomListeners.test.log(Status.PASS, "Verify Text ");
        return getTextFromElement(getMessage);

    }


}
