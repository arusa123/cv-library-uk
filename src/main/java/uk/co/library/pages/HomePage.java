package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customelisteners.CustomListeners;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
    WebElement clickOnAccept;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;
    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;
    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-distance form__select']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salarymin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salarymax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    public void acceptAll(){
        clickOnElement(clickOnAccept);
    }

    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter job title " + jobTitle + "in Job Title field" + jobTitleField.toString());
        sendTextToElement(jobTitleField, jobTitle);
       // CustomListeners.test.log(Status.PASS, "Entered job title is  " + jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Enter Location " + location + "in location field" + locationField.toString());
        sendTextToElement(locationField, location);
        CustomListeners.test.log(Status.PASS, "Entered location is  " + locationField);
    }

    public void selectDistance(String distance) {
        Reporter.log("Distance should be " + distance + "in location field" + jobTitleField.toString());
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        CustomListeners.test.log(Status.PASS, "Distance should be " + locationField);
    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("click on more search link" + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS, "click on more search link " + moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Min salary" + salarymin.toString());
        sendTextToElement(salarymin, minSalary);
        CustomListeners.test.log(Status.PASS, "Min salary " + minSalary + "in min salary field " + salarymin);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Maximum salary" + maxSalary + "in the maximum salary field" + salarymax.toString());
        sendTextToElement(salarymax, maxSalary);
        CustomListeners.test.log(Status.PASS, "Maximum salary" + maxSalary);
    }

    public void selectSalaryType(String sType) {
        Reporter.log("Salary type" + sType + "from salary drop down" + salaryTypeDropDown);
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
        CustomListeners.test.log(Status.PASS, "Salary type" + salaryTypeDropDown);
    }

    public void selectJobType(String jobType) {
        Reporter.log("Job Type" + jobType + "from drop down" + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        CustomListeners.test.log(Status.PASS, "Job type from drop down" + jobTypeDropDown.toString());
    }

    public void clickOnFindJobsButton() {
        Reporter.log("click on fin job button" + findJobsBtn);
        clickOnElement(findJobsBtn);
        CustomListeners.test.log(Status.PASS, "click on find job button");
    }
}

