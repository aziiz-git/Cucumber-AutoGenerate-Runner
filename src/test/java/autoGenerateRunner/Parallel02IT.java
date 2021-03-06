import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/DELL/git/Cucumber-AutoGenerate-Runner/src/test/resources/features/MultiplyNumbers.feature"},
        plugin = {"json:C:/Users/DELL/git/Cucumber-AutoGenerate-Runner/target/cucumber-parallel/json/2.json"},
        monochrome = true,
        tags = {"@MultiplyNumbers,@AddNumbers"},
        glue = {"stepDefinition"})
public class Parallel02IT {
}
