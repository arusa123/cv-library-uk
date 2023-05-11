package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uk.co.library.customelisteners.CustomListeners;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public void verifyTheResults(String expected) {
        String actualText = resultText.getText();
       // Reporter.log("verify result" + expected + resultText);
        Assert.assertEquals(actualText, expected, "Error");
        CustomListeners.test.log(Status.PASS, "The result is " + actualText);
    }

}
