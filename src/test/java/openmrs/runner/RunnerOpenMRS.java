package openmrs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/openmrs",
        glue = "openmrs/stepDefinitions",
        dryRun =false,
        tags = "@Regression",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt","json:target/cucumber-reports/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunnerOpenMRS {
}
