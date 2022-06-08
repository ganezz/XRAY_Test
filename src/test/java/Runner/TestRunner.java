package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features =  "src/test/resources/Login.feature",
        glue = {"Definitions"},
        plugin = {
                "pretty",
                "json:target/cucumber-json-report.json","html:target/cucumber-ui-reports.html",
                "rerun:target/failedrerun.txt"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests{

}
