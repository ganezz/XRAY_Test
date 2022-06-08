package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features =  "src/test/resources/Login/feature",
        glue = {"Definitions"}
)

public class TestRunner {

}
