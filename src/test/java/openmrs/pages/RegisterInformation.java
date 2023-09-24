package openmrs.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class RegisterInformation {
    public RegisterInformation(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='givenName']")
    private WebElement givenName;

    @FindBy(xpath = "//input[@name='familyName']")
    private WebElement familyName;

    @FindBy(xpath = "//button[@id='next-button']")
    private WebElement nextButton;

    @FindBy(xpath = "//span[@id='fr4400']")
    private WebElement errormessage1;
    @FindBy(xpath = "//span[.='Required']")
    private WebElement errormessage2;

    public void PatientNameandFamilyName(String firstName,String lastName) throws InterruptedException {
Thread.sleep(3000);
        givenName.sendKeys(firstName);
        familyName.sendKeys(lastName);

    }
    public void clickNextButton(){nextButton.click();}


    public String validationFirstName(){
        System.out.println(BrowserUtils.getText(errormessage1));
return BrowserUtils.getText(errormessage1);
    }
    public String validationlastName(){
        System.out.println(BrowserUtils.getText(errormessage2));
        return BrowserUtils.getText(errormessage2);

    }

}
