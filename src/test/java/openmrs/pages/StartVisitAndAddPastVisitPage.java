package openmrs.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartVisitAndAddPastVisitPage {
    public StartVisitAndAddPastVisitPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@placeholder='Search by ID or Name']")
    private WebElement searchBox;

    @FindBy(xpath = "//td[contains(text(),'100L7U')]")
    private WebElement tableRow;

    public void searchBoxInformation(String patientsName){
        searchBox.sendKeys(patientsName, Keys.ENTER);
        tableRow.click();
    }
}
