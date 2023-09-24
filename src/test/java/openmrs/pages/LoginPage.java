package openmrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@id='username']")
    private  WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(css = "#Laboratory")
   private WebElement location;

    @FindBy(xpath = "//input[@id='loginButton']")
    private WebElement loginButton;

    public void loginInformation(String username,String Password){
        userName.sendKeys(username);
        password.sendKeys(Password);
    }

    public void clickLocation(){
        location.click();
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
