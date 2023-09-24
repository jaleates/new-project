package openmrs.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;
import utils.configReader;

public class HookOpenMRS {

    WebDriver driver= DriverHelper.getDriver();
    @Before
    public void setup(){
        driver.get(configReader.readProperty("QA_OpenMRS_Url"));
    }
    @After
    public void tearDown(){
        //driver.quit();
    }

}
