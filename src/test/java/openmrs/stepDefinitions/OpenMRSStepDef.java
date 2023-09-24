package openmrs.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import openmrs.pages.LoginPage;
import openmrs.pages.MainPage;
import openmrs.pages.RegisterInformation;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;
import utils.configReader;

public class OpenMRSStepDef {
WebDriver driver= DriverHelper.getDriver();
LoginPage loginPage=new LoginPage(driver);
MainPage mainPage=new MainPage(driver);
RegisterInformation registerInformation=new RegisterInformation(driver);

    @Given("user provides valid username and password")
    public void user_provides_valid_username_and_password() {
       loginPage.loginInformation(configReader.readProperty("QA_username"),
                         configReader.readProperty("QA_password"));
    }
    @When("user choose laboratory location")
    public void user_choose_laboratory_location() {
       loginPage.clickLocation();
    }
    @Then("user clicks login button")
    public void user_clicks_login_button() {
       loginPage.clickLoginButton();
    }



    @When("User provides username and password")
    public void userProvidesUsernameAndPassword() {
        loginPage.loginInformation(configReader.readProperty("QA_username"),
                configReader.readProperty("QA_password"));
    }
    @When("User chooses location laboratory and clicks login button")
    public void userChoosesLocationLaboratoryAndClicksLoginButton() {
       loginPage.clickLocation();
       loginPage.clickLoginButton();
    }
    @When("User click Register a patient Icon")
    public void userClickRegisterAPatientIcon() throws InterruptedException {

        mainPage.clickRegisterButton(driver);
    }
    @Then("User provide firstName {string} and lastName {string}")
    public void userProvideFirstNameAndLastName(String name, String lastName) throws InterruptedException {

        registerInformation.PatientNameandFamilyName(name,lastName);


    }
    @Then("the user clicks the next button")
    public void theUserClicksTheNextButton() {
       registerInformation.clickNextButton();
    }
    @Then("an error message should be displayed {string}")
    public void anErrorMessageShouldBeDisplayed(String string) {
        Assert.assertEquals(string,registerInformation.validationlastName());

    }




}
