package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

import java.util.List;

public class ApplicantPage {
    WebDriver driver;
    public ApplicantPage(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "txtUsername")
    public WebElement userNameInput;

    @FindBy(id = "txtPassword")
    public WebElement passwordInput;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pImTab;

    @FindBy(id = "menu_pim_viewApplicantList")
    public WebElement applicantTab;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr")
    public List<WebElement> applicantRecords;

    @FindBy(id="resultTable")
    public WebElement applicantTable;

    @FindBy(id="menu_pim_addApplicant")
    public WebElement addApplicantTab;

    @FindBy(id="firstName")
    public WebElement firstNameInput;

    @FindBy(id="lastName")
    public WebElement lastNameInput;

    @FindBy(id="middleName")
    public WebElement middleNameInput;

    @FindBy(id="photofile")
    public WebElement uploadApplicantPicBtn;

    @FindBy(id="btnSave")
    public WebElement saveApplicantBtn;

    @FindBy(id="personal_txtEmpFirstName")
    public WebElement viewFirstNameField;

}
