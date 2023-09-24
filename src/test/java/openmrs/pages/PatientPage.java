package openmrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class PatientPage {
    public PatientPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='PersonName-givenName']")
    private WebElement fistName;
    @FindBy(xpath = "//span[@class='PersonName-familyName']")
    private WebElement lastName;

    @FindBy(xpath = "//div[@class='float-sm-right']//span")
    private WebElement patientId;

    @FindBy(xpath = "//div[contains(text(),'Start')]")
    private WebElement startVistButton;

    @FindBy(xpath = "//button[@id='start-visit-with-visittype-confirm']")
    private WebElement confirmStartVisitButton;

    @FindBy(xpath = "//div[@class='actions dropdown actioncog']")
    private WebElement actionButton;



    public String validatingFirstName(){
       return BrowserUtils.getText(fistName);

    }
    public String validatingLastName(){
      return  BrowserUtils.getText(lastName);
    }

    public String validatingId(){
       return BrowserUtils.getText(patientId);
    }

    public void clickstartvisitandconfirmButton(){
        startVistButton.click();
        confirmStartVisitButton.click();
    }


}
