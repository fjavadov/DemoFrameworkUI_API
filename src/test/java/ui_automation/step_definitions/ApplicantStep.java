package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import ui_automation.pages.ApplicantPage;
import ui_automation.utilities.*;
public class ApplicantStep {
    ApplicantPage applicantPage = new ApplicantPage();

    String firstName = "UI";
    String lastName = "Test";
    String middleName="M";

    public static final Logger oLog = LogManager.getLogger(SelectHelper.class);

    @Given("I'm on logged in to website as admin")
    public void i_m_on_logged_in_to_Website_as_admin() {
        //Go to URL
        Driver.getInstance().getDriver().get(ConfigurationReader.getProperty("ui-config.properties","***"));
        applicantPage.userNameInput.sendKeys(ConfigurationReader.getProperty("ui-config.properties","***username"));
        applicantPage.passwordInput.sendKeys(ConfigurationReader.getProperty("ui-config.properties","***.password"));
        applicantPage.loginBtn.click();
        oLog.info("I have entered login information and then clicked on login button");
    }
    @Given("I click on the Applicant List")
    public void i_click_on_the_Applicant_List() {
       applicantPage.applicantTab.click();
    }
    @Then("I see applicant list table")
    public void iSeeApplicantListTable() {
        Assert.assertTrue(applicantPage.applicantTable.isDisplayed());
    }

    @Then("I click on the Add applicant Tab")
    public void iClickOnTheAddapplicantTab() throws InterruptedException {
        Helper.hover(applicantPage.pImTab);
        Thread.sleep(1000);
        applicantPage.addApplicantTab.click();
        oLog.info("Clicked on the applicant tab");
    }

    @Then("I fill out applicant information")
    public void iFillOutApplicantInformation() {
        applicantPage.firstNameInput.sendKeys(firstName);
        applicantPage.middleNameInput.sendKeys(middleName);
        applicantPage.lastNameInput.sendKeys(lastName);
        oLog.warn("entered full name details");
    }

    @And("I upload an applicant image")
    public void iUploadAnApplicantImage() {
        String filePath = "";
        applicantPage.uploadApplicantPicBtn.sendKeys(filePath);
    }

    @Then("I click on Save applicant button")
    public void iClickOnSaveApplicantButton() {
        applicantPage.saveApplicantBtn.click();
    }

    @And("I see applicant information saved successfully")
    public void iSeeApplicantInformationSavedSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(firstName, applicantPage.viewFirstNameField.getAttribute("value"));
    }
}
