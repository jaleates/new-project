package openmrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(@id,'registerPatient')]")
    WebElement register;

    @FindBy(xpath = "//i[@class='icon-search']")
    private WebElement findPatientRecordButton;




    public void clickRegisterButton(WebDriver driver) throws InterruptedException {
Thread.sleep(2000);
        BrowserUtils.switchById(driver);
        register.click();}

    public void findPatientRecordButton(){
        findPatientRecordButton.click();
    }
}
