package openmrs.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import openmrs.pages.MainPage;
import openmrs.pages.PatientPage;
import openmrs.pages.StartVisitAndAddPastVisitPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class StartVisitAndAddPastVisitStepDef {
    WebDriver driver= DriverHelper.getDriver();
    MainPage mainPage=new MainPage(driver);
    StartVisitAndAddPastVisitPage startVist=new StartVisitAndAddPastVisitPage(driver);
    PatientPage patientPage=new PatientPage(driver);


    @Given("User clicks find patient record icon and searches for the patient {string} and clicks it")
    public void userClicksFindPatientRecordIconAndSearchesForThePatientAndClicksIt(String patientName) {
        mainPage.findPatientRecordButton();
        startVist.searchBoxInformation(patientName);
    }
    @When("User validates patient {string}, {string} and patient {string}")
    public void userValidatesPatientAndPatient(String firstName, String lastName, String id) {
        Assert.assertEquals(firstName,patientPage.validatingFirstName());
        Assert.assertEquals(lastName,patientPage.validatingLastName());
        Assert.assertEquals(id,patientPage.validatingId());
    }
    @Then("User clicks start visit button from patients file, and click confirm button")
    public void userClicksStartVisitButtonFromPatientsFileAndClickConfirmButton() {
      patientPage.clickstartvisitandconfirmButton();
    }
    @Then("User havor over action button and selects add past vist from drop down list")
    public void userHavorOverActionButtonAndSelectsAddPastVistFromDropDownList() {

    }
    @Then("User chooses start date and end date for the patient and clicks confirm button")
    public void userChoosesStartDateAndEndDateForThePatientAndClicksConfirmButton() {

    }
    @Then("User validates the timestamp message")
    public void userValidatesTheTimestampMessage() {

    }
}
